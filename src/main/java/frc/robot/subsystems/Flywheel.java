// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.VictorSP;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Flywheel extends SubsystemBase {
  private VictorSP top_Shooter = new VictorSP(5);
  private VictorSP btm_Shooter = new VictorSP(4);

  /** Creates a new Flywheel. */
  public Flywheel() {
    top_Shooter.addFollower(btm_Shooter);
    inverts();
  }
  private void inverts(){
    btm_Shooter.setInverted(true);
  }
  public void move(double speed){
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
