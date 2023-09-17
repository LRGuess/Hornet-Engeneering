package org.firstinspires.ftc.teamcode.RobotCode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name="MotorSpin")
public class Teleop extends OpMode {

    private DcMotor leftDrive;
    private DcMotor rightDrive;
    @Override
    public void init() {
        leftDrive  = hardwareMap.get(DcMotor.class, "motorFL");
        rightDrive = hardwareMap.get(DcMotor.class, "motorFR");

        leftDrive.setDirection(DcMotor.Direction.REVERSE);
        rightDrive.setDirection(DcMotor.Direction.FORWARD);
    }

    @Override
    public void loop() {
        leftDrive.setPower(gamepad1.left_stick_y);
        rightDrive.setPower(gamepad1.right_stick_y);
    }
}
