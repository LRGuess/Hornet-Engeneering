package org.firstinspires.ftc.teamcode.util;

public class NonApplicableExeption extends Exception{
    public NonApplicableExeption(){
        super("You cannot use TurnLeft or TurnRight with kiwi or mechanum drive");
    }
}