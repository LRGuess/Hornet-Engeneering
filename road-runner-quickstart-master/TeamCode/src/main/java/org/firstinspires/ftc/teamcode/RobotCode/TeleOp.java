package org.firstinspires.ftc.teamcode.RobotCode;

import static org.firstinspires.ftc.teamcode.util.LogFiles.log;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.DcMotor;

@com.qualcomm.robotcore.eventloop.opmode.TeleOp(name="MotorSpin")
public class TeleOp extends OpMode {

    private DcMotor leftDrive;
    private DcMotor rightDrive;
    private DcMotor spinner;
    private DcMotor arm;
    //private double speed = 2.0;

    @Override
    public void init() {
        leftDrive  = hardwareMap.get(DcMotor.class, "motorL");
        rightDrive = hardwareMap.get(DcMotor.class, "motorR");
        spinner = hardwareMap.get(DcMotor.class, "spinnerMotor");
        arm = hardwareMap.get(DcMotor.class, "armMotor");

        leftDrive.setDirection(DcMotor.Direction.REVERSE);
        rightDrive.setDirection(DcMotor.Direction.FORWARD);
    }

    @Override
    public void loop() {
        double velocityL = gamepad1.left_stick_y / 3;
        double velocityR = gamepad1.right_stick_y / 3;

        leftDrive.setPower(velocityL);
        rightDrive.setPower(velocityR);

        if(gamepad1.dpad_right) {
            spinner.setPower(1);
        } else if (gamepad1.dpad_left){
            spinner.setPower(-1);
        } else {
            spinner.setPower(0);
        }

        if(gamepad1.dpad_up) {
            arm.setPower(1);
        } else if (gamepad1.dpad_down){
            arm.setPower(-1);
        } else {
            arm.setPower(0);
        }
    }
}
