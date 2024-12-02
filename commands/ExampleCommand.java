// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.EngineWatcher;
import frc.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj2.command.Command;

/** An example command that uses an example subsystem. */
public class ExampleCommand extends Command {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final EngineWatcher m_subsystem;

  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public ExampleCommand(EngineWatcher subsystem) {
    m_subsystem = subsystem;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(subsystem);
  }

  EngineWatcher sparkMaxCommand = new EngineWatcher();
  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    sparkMaxCommand.FullSpeed(); //when the robot starts set intake to full speed

  }  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    sparkMaxCommand.SaveLogs();  
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    sparkMaxCommand.stopIntake();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
