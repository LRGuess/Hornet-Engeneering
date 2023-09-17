
package org.firstinspires.ftc.teamcode.RobotCode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.teamcode.util.BaseMovement;

public class TankDriveCommands {

    //private DcMotor leftMotor;
    //private DcMotor rightMotor;

//    public TankDriveCommands(DcMotor leftMotor, DcMotor rightMotor){
//        this.leftMotor = leftMotor;
//        this.rightMotor = rightMotor;
//    }

    public void moveForward(int ticks, DcMotor leftMotor, DcMotor rightMotor) {
        leftMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        rightMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        leftMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        rightMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        leftMotor.setDirection(DcMotorSimple.Direction.FORWARD);
        rightMotor.setDirection(DcMotorSimple.Direction.FORWARD);

        leftMotor.setTargetPosition(ticks);
        rightMotor.setTargetPosition(ticks);

        leftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        rightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    }


    public void moveBackward(int ticks, DcMotor leftMotor, DcMotor rightMotor){
        leftMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        rightMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        leftMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        rightMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        leftMotor.setDirection(DcMotorSimple.Direction.FORWARD);
        rightMotor.setDirection(DcMotorSimple.Direction.FORWARD);

        leftMotor.setTargetPosition(-ticks);
        rightMotor.setTargetPosition(-ticks);

        leftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        rightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    }
    public void turnLeft(int ticks, DcMotor leftMotor, DcMotor rightMotor){
        rightMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        rightMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        rightMotor.setDirection(DcMotorSimple.Direction.FORWARD);

        rightMotor.setTargetPosition(ticks);

        rightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    }
    public void turnRight(int ticks, DcMotor leftMotor, DcMotor rightMotor){
        leftMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        leftMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        leftMotor.setDirection(DcMotorSimple.Direction.FORWARD);

        leftMotor.setTargetPosition(ticks);

        leftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    }
    public void rotateLeft(int ticks, DcMotor leftMotor, DcMotor rightMotor){
        leftMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        rightMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        leftMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        rightMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        leftMotor.setDirection(DcMotorSimple.Direction.FORWARD);
        rightMotor.setDirection(DcMotorSimple.Direction.FORWARD);

        leftMotor.setTargetPosition(-ticks);
        rightMotor.setTargetPosition(ticks);

        leftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        rightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    }
    public void rotateRight(int ticks, DcMotor leftMotor, DcMotor rightMotor){
        leftMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        rightMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        leftMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        rightMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        leftMotor.setDirection(DcMotorSimple.Direction.FORWARD);
        rightMotor.setDirection(DcMotorSimple.Direction.FORWARD);

        leftMotor.setTargetPosition(ticks);
        rightMotor.setTargetPosition(-ticks);

        leftMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        rightMotor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
    }

    public void grabPixel(Servo grabberServo){
        grabberServo.setPosition(0);
    }
    public void leavePixel(Servo grabberServo){
        grabberServo.setPosition(0.1);
    }
}