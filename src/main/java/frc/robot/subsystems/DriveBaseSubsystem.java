// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.
 
package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.PWMVictorSPX;

public class DriveBaseSubsystem extends SubsystemBase {
  
  //leader
  final PWMVictorSPX frontleft = new PWMVictorSPX(Constants.MotorsID.leftFrontID);
  final PWMVictorSPX frontRight = new PWMVictorSPX(Constants.MotorsID.rightFrontID);

  final PWMVictorSPX backLeft  = new PWMVictorSPX(Constants.MotorsID.leftBackID);
  final PWMVictorSPX backRight = new PWMVictorSPX(Constants.MotorsID.rightBackID);
  final DifferentialDrive drive = new DifferentialDrive(frontleft, frontRight);
  
  public DriveBaseSubsystem() {
    frontleft.addFollower(backLeft);  
    frontRight.addFollower(backRight);
  }
  public void move(Double leftSide, Double rightSide) {
      drive.tankDrive(leftSide, rightSide);
    }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
