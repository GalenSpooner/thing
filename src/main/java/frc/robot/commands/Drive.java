// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.DriveTrain;
<<<<<<< HEAD
import edu.wpi.first.math.filter.SlewRateLimiter;
=======


>>>>>>> 88b64ec614beaaf9416054e8264e345b29aa8f7d
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.Subsystem;

/** An example command that uses an example subsystem. */
public class Drive extends CommandBase {
  @SuppressWarnings({ "PMD.UnusedPrivateField", "PMD.SingularField" })
  private final DriveTrain m_drivetrain;
  private final Joystick m_joystick;
  private SlewRateLimiter acc_lim;

  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public Drive(DriveTrain dt, Joystick j) {
    m_drivetrain = dt;
    m_joystick = j;
    acc_lim = new SlewRateLimiter(2);
    addRequirements(dt);
    // Use addRequirements() here to declare subsystem dependencies.
    
  }
  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_drivetrain.ArcadeDrive(acc_lim.calculate(m_joystick.getX()),m_joystick.getY());
    
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
