package org.firstinspires.ftc.teamcode.RobotCode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.TouchSensor;

import org.firstinspires.ftc.teamcode.trajectorysequence.TrajectorySequence;

@TeleOp(name="TeleOp")
public class Teleop extends LinearOpMode {
    private DcMotor leftDrive;
    private DcMotor rightDrive;
    private Servo drone;
    private Servo grabberServo;
    private double speed = 0.5;
    TankDriveCommands c = new TankDriveCommands();


    @Override
    public void runOpMode() {
        leftDrive  = hardwareMap.get(DcMotor.class, "motorL");
        rightDrive = hardwareMap.get(DcMotor.class, "motorR");
        drone = hardwareMap.get(Servo.class, "droneServo");
        grabberServo = hardwareMap.get(Servo.class, "grabberServo");

        leftDrive.setDirection(DcMotor.Direction.REVERSE);
        rightDrive.setDirection(DcMotor.Direction.FORWARD);

        waitForStart();
        while (opModeIsActive()) {
            leftDrive.setPower(gamepad1.right_stick_y * speed);
            rightDrive.setPower(gamepad1.left_stick_y * speed);

            if (gamepad1.right_bumper && gamepad1.b) {
                drone.setPosition(0.2);
                drone.setPosition(0.0);
            }
//            if (gamepad1.x) {
//                c.moveForward(100, leftDrive, rightDrive);
//            }

            CheckSpeed();
            GrabberMovement();
        }
    }
    private void GrabberMovement() {
        if (gamepad1.y){
            grabberServo.setPosition(0);
        }
        if (gamepad1.a){
            grabberServo.setPosition(0.1);
        }
    }

    /**
     * Changes speed
     *
     * Pushing left trigger all the way will make robot move at 1/4th speed (Good for precise movement)
     *
     * Pushing right trigger (DO NOT PUSH!
     *      Only for emergencies.
     *      Can and will destroy robot, playing field, other robots, and anything in its path
     * ) all the way will make robot move at full speed
     *
     * Anything else will make robot move at 1/2 speed.
     */
    private void CheckSpeed() {
        if(gamepad1.left_trigger == 1){
            speed = 0.25;
        }
        else if(gamepad1.right_trigger == 1){
            speed = 1;
        } else {
            speed = 0.5;
        }
    }

}
