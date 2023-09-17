package org.firstinspires.ftc.teamcode.util;

import org.firstinspires.ftc.teamcode.util.NonApplicableExeption;

public interface BaseMovement {
    void moveForward(int ticks);

    void moveBackward(int ticks);

    default void turnLeft(int ticks) throws Exception {
        throw new NonApplicableExeption();
    }

    default void turnRight(int ticks) throws Exception{
        throw new NonApplicableExeption();
    }

    void rotateLeft(int ticks);

    void rotateRight(int ticks);
}