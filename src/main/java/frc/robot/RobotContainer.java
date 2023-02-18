package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.Arm.setArmSpeed;
import frc.robot.commands.Drivetrain.ArcadeDrive;
import frc.robot.commands.Pivot.setPivotSpeed;
import frc.robot.subsystems.Arm;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Manipulator;
import frc.robot.subsystems.Pivot;

public class RobotContainer {

  private final Drivetrain drivetrain = new Drivetrain();
  private final Pivot pivot = new Pivot();
  private final Arm arm = new Arm();
  private final Manipulator manipulator = new Manipulator();

  private final Joystick driver = new Joystick(0);
  private final Joystick operator = new Joystick(1);

  public RobotContainer() {
    configureBindings();
    pivot.setDefaultCommand(new setPivotSpeed(() -> operator.getRawAxis(1), pivot));
    // arm.setDefaultCommand(new setArmSpeed(() -> operator.getRawAxis(5), arm));
    // drivetrain.setDefaultCommand(new ArcadeDrive(() -> -driver.getRawAxis(1), () -> -driver.getRawAxis(2), drivetrain));
  }

  private void configureBindings() {
    // JoystickButton openPincher = new JoystickButton(operator, 1);
    // JoystickButton closePincher = new JoystickButton(operator, 3);

    // openPincher.onTrue(new InstantCommand(() -> manipulator.openPincher()));
    // closePincher.onTrue(new InstantCommand(() -> manipulator.closePincher()));
  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
