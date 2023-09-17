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
    @Override
    public void init() {
        leftDrive  = hardwareMap.get(DcMotor.class, "motorL");
        rightDrive = hardwareMap.get(DcMotor.class, "motorR");
        drone = hardwareMap.get(Servo.class, "droneServo");

        leftDrive.setDirection(DcMotor.Direction.REVERSE);
        rightDrive.setDirection(DcMotor.Direction.FORWARD);
    }

    @Override
    public void loop() {
        leftDrive.setPower(gamepad1.left_stick_y);
        rightDrive.setPower(gamepad1.right_stick_y);

        if(gamepad1.left_trigger == 1 && gamepad1.right_trigger == 1 && gamepad1.a){
            drone.setPosition(10.0);
            drone.setPosition(0.0);
        }
    }
}
