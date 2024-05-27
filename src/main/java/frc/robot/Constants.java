// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import java.security.PublicKey;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }
  public static class MotorsID {
    //DriveBase
    public static int 
    leftFrontID = 3, rightFrontID = 0,
    leftBackID = 2,  rightBackID = 1;

    //Intake
    public static int
    IntakeID = 6;

    //Shooter
    public static int
    TopShooterID = 5,
    BottomShooterID = 4;

    public static int
    TalonID = 5;

    //speed
    public static double
    leftSide = 1, rightSide = 1;
  }
  public static class Input{
    public static int
    leftAxis = 1, rightAxis = 5,
    driver = 0;
    public static int 
    L1 = 5, R1 = 6;
  }


  
}
