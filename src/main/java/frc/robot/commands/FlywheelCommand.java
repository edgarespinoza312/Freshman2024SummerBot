// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Flywheel;

public class FlywheelCommand extends Command {
  Flywheel FlywheelSub;
  double speed;
  public FlywheelCommand(double speed2, Flywheel FlywheelSub2){
    this.FlywheelSub = FlywheelSub2;
   this.speed = speed2;
  
    addRequirements(FlywheelSub);
  }
  
  
    // Use addRequirements() here to declare subsystem dependencies.

  public FlywheelCommand() {
    //TODO Auto-generated constructor stub
  }


  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    FlywheelSub.move(speed);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    FlywheelSub.move(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
