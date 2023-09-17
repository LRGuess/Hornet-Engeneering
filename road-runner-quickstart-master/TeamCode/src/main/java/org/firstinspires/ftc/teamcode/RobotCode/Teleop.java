package org.firstinspires.ftc.teamcode.RobotCode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name="MotorSpin")
public class Teleop extends OpMode {

    private DcMotor leftDrive;
    private DcMotor rightDrive;
    private Servo drone;
    private Servo grabberServo;
    private double speed = 0.5;
    @Override
    public void init() {
        leftDrive  = hardwareMap.get(DcMotor.class, "motorL");
        rightDrive = hardwareMap.get(DcMotor.class, "motorR");
        drone = hardwareMap.get(Servo.class, "droneServo");
        grabberServo = hardwareMap.get(Servo.class, "grabberServo");

        leftDrive.setDirection(DcMotor.Direction.REVERSE);
        rightDrive.setDirection(DcMotor.Direction.FORWARD);
    }

    @Override
    public void loop() {
        leftDrive.setPower(gamepad1.left_stick_y * speed);
        rightDrive.setPower(gamepad1.right_stick_y * speed);

        if(gamepad1.left_trigger == 1 && gamepad1.right_trigger == 1 && gamepad1.a){
            drone.setPosition(10.0);
            drone.setPosition(0.0);
        }

        CheckSpeed();
        GrabberMovement();
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
