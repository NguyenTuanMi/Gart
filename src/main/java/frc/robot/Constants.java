// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public final static class spin{
        public static final int Rightfollow = 1;
        public static final int Leftfollow = 2;
        public static final int Rightmaster = 3;
        public static final int Leftmaster = 4;
    }
    public final static class joystick{
        public static final int stick = 1;
    }
    public final static class speed{
        public static final double speed1 = 0.8;
        public static final double speed2 = 0.5;
    }
    public final static class suckerWheel {
        public static final int sucker = 1;
    }
    public static class ArrayConstant {
        public static WPI_TalonSRX [] wheel = new WPI_TalonSRX[9];
    }
    public static final class PID {
        public static final double kP = 1.0/180;
        public static final double kD = 1.0/180;
        public static final double kI = 1.0/180;
        public static final double kStraightConstant = 2/3;

        public static final double kToleranceDegress =  2.0f;                    //  Sai số giới hạn
        public static final double kToleranceAngularVelocity =  0.08f;                    //  Sai số giới hạn
        
    }

    
}
