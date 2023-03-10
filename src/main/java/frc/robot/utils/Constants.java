package frc.robot.utils;

import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.math.geometry.Transform2d;
import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.kinematics.DifferentialDriveKinematics;
import edu.wpi.first.math.util.Units;

public class Constants {
    // Camera
    public static final String cameraName = "OV5647";
    /** The translation from the center of the robot, used in vision localization */
    //TODO: calculate transform once camera is mounted
    public static final Transform2d cameraTransform = new Transform2d(new Translation2d(Units.inchesToMeters(3), 0), Rotation2d.fromDegrees(0));

    public static class Drivetrain {
        public static final double throttleLimiter = 0.9;
        public static final double turnLimiter = 0.5;

        //TODO: calculate trackwidth
        public static final double trackWidthMeters = 0.65347;
        public static final double wheelDiameter = Units.inchesToMeters(6.25);
        private static final double countsPerRev = 42;
        // 11:62    18:34
        private static final double gearRatio = 10.64;   // 62(34/18)/11
        public static final double CountsPerMeter = (gearRatio * countsPerRev) / wheelDiameter * Math.PI;

        public static final DifferentialDriveKinematics driveKinematics = new DifferentialDriveKinematics(trackWidthMeters);
    }

    public static class Pivot {
        public static final double kG = 0.19;
        public static final double kP = 0.0;
        // public static final double kP = 0.08;
        public static final double degreesPerTick = 1.8;
    }

    public static class Manipulator {
        public static final int LEDLength = 17;
    }
}
