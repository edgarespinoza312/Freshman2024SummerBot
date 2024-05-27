// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.commands.FlywheelCommand;
import frc.robot.commands.IntakeCommand;
import frc.robot.subsystems.DriveBaseSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PS5Controller;

import frc.robot.subsystems.Intake;
import frc.robot.subsystems.Flywheel;


/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
public class RobotContainer {

  private PS5Controller driver = new PS5Controller(0);
  
  private JoystickButton Intakefwd = new JoystickButton(driver, 5);
  private JoystickButton Intakebwd = new JoystickButton(driver, 6);

  private Intake IntakeSub = new Intake();

  private JoystickButton Flywheelfwd = new JoystickButton(driver, 7);
  private JoystickButton Flywheelbwd = new JoystickButton(driver, 8);

  private Flywheel FlywheelSub = new Flywheel();

  // The robot's subsystems and commands are defined here...
  private final DriveBaseSubsystem driveSub = new DriveBaseSubsystem();

  private final Joystick saahil = new Joystick(Constants.Input.driver);
  private final float leftSpeed = -1, rightSpeed = 1;

  private RunCommand drivingCommand = new RunCommand(()-> driveSub.move(leftSpeed * saahil.getRawAxis(Constants.Input.leftAxis),
   rightSpeed * saahil.getRawAxis(Constants.Input.rightAxis) ), driveSub);


  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {

    driveSub.setDefaultCommand(drivingCommand);
    // Configure the trigger bindings
    configureBindings();
  }

  /**
   * Use this method to define your trigger->command mappings. Triggers can be created via the
   * {@link Trigger#Trigger(java.util.function.BooleanSupplier)} constructor with an arbitrary
   * predicate, or via the named factories in {@link
   * edu.wpi.first.wpilibj2.command.button.CommandGenericHID}'s subclasses for {@link
   * CommandXboxController Xbox}/{@link edu.wpi.first.wpilibj2.command.button.CommandPS4Controller
   * PS4} controllers or {@link edu.wpi.first.wpilibj2.command.button.CommandJoystick Flight
   * joysticks}.
   */
  private void configureBindings() {
    Intakefwd.whileTrue(new IntakeCommand(.7 , IntakeSub));
    Intakebwd.whileTrue(new IntakeCommand(-.7, IntakeSub));

    Flywheelfwd.whileTrue(new FlywheelCommand(.8 , FlywheelSub));
    Flywheelbwd.whileTrue(new FlywheelCommand(-.8, FlywheelSub));
      
    }
    // Schedule `ExampleCommand` when `exampleCondition` changes to `true`
 

    // Schedule `exampleMethodCommand` when the Xbox controller's B button is pressed,
    // cancelling on release.
  

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    return null;// An example command will be run in autonomous
  }
}