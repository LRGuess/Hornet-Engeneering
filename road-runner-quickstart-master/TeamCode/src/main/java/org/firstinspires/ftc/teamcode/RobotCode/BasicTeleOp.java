package org.firstinspires.ftc.teamcode.RobotCode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name="Basic TeleOp")
public class BasicTeleOp extends OpMode {

    private DcMotor leftDrive;
    private DcMotor rightDrive;
    private Servo grabberServo;
    @Override
    public void init() {
        leftDrive  = hardwareMap.get(DcMotor.class, "motorL");
        rightDrive = hardwareMap.get(DcMotor.class, "motorR");
        grabberServo = hardwareMap.get(Servo.class, "grabberServo");

        leftDrive.setDirection(DcMotor.Direction.REVERSE);
        rightDrive.setDirection(DcMotor.Direction.FORWARD);
    }

    @Override
    public void loop() {
        leftDrive.setPower(gamepad1.left_stick_y);
        rightDrive.setPower(gamepad1.right_stick_y);

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
}
