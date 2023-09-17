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
    //private TouchSensor touchSensor;
    TankDriveCommands c = new TankDriveCommands();


    @Override
    public void runOpMode() {
        leftDrive  = hardwareMap.get(DcMotor.class, "motorL");
        rightDrive = hardwareMap.get(DcMotor.class, "motorR");
        drone = hardwareMap.get(Servo.class, "droneServo");
        grabberServo = hardwareMap.get(Servo.class, "grabberServo");
        //touchSensor = hardwareMap.get(TouchSensor.class, "touchSensor");

        leftDrive.setDirection(DcMotor.Direction.REVERSE);
        rightDrive.setDirection(DcMotor.Direction.FORWARD);

        waitForStart();
        while (opModeIsActive()) {
            leftDrive.setPower(gamepad1.right_stick_y * speed);
            rightDrive.setPower(gamepad1.left_stick_y * speed);

            if (gamepad1.right_trigger == 1 && gamepad1.b) {
                drone.setPosition(10.0);
                drone.setPosition(0.0);
            }
//            if (gamepad1.x) {
//                c.moveForward(100, leftDrive, rightDrive);
//            }

//        if(touchSensor.isPressed()){
//            drone.setPosition(10.0);
//            drone.setPosition(0.0);
//        }

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
