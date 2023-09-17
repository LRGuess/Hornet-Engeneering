package org.firstinspires.ftc.teamcode.RobotCode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

public class PreProgrammedThingies extends LinearOpMode {

    private DcMotor leftDrive;
    private DcMotor rightDrive;

    public void runOpMode(){

        leftDrive  = hardwareMap.get(DcMotor.class, "motorL");
        rightDrive = hardwareMap.get(DcMotor.class, "motorR");

        leftDrive.setDirection(DcMotor.Direction.REVERSE);
        rightDrive.setDirection(DcMotor.Direction.FORWARD);

        waitForStart();
        while (opModeIsActive()){
            if (gamepad1.y){

            }
        }
    }
}
