// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3467.Robot2015;
    
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

import java.util.Vector;

import org.usfirst.frc3467.Robot2015.subsystems.DriveBase;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
@SuppressWarnings("unused")
public class RobotMap {
	

	//compressor
	public Compressor maincompressor;
	
	//Joysticks
	public static int stickOnePort = 0;
	public static int stickTwoPort = 1;
	
	
	
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveBaseSpeedController1;
    public static SpeedController driveBaseSpeedController2;
    public static SpeedController driveBaseSpeedController3;
    public static SpeedController driveBaseSpeedController4;
    public static RobotDrive driveBaseRobotDrive41;
    public static Gyro driveBaseGyro1;
    public static Compressor pneumaticsCompressor1;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveBaseSpeedController1 = new Jaguar(0);
        LiveWindow.addActuator("DriveBase", "Speed Controller 1", (Jaguar) driveBaseSpeedController1);
        
        driveBaseSpeedController2 = new Jaguar(1);
        LiveWindow.addActuator("DriveBase", "Speed Controller 2", (Jaguar) driveBaseSpeedController2);
        
        driveBaseSpeedController3 = new Jaguar(2);
        LiveWindow.addActuator("DriveBase", "Speed Controller 3", (Jaguar) driveBaseSpeedController3);
        
        driveBaseSpeedController4 = new Jaguar(3);
        LiveWindow.addActuator("DriveBase", "Speed Controller 4", (Jaguar) driveBaseSpeedController4);
        
        driveBaseRobotDrive41 = new RobotDrive(driveBaseSpeedController2, driveBaseSpeedController1,
              driveBaseSpeedController4, driveBaseSpeedController3);
        
        driveBaseRobotDrive41.setSafetyEnabled(true);
        driveBaseRobotDrive41.setExpiration(0.1);
        driveBaseRobotDrive41.setSensitivity(0.5);
        driveBaseRobotDrive41.setMaxOutput(1.0);
        driveBaseRobotDrive41.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, false);
        driveBaseRobotDrive41.setInvertedMotor(RobotDrive.MotorType.kRearLeft, false);
        driveBaseRobotDrive41.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
        driveBaseRobotDrive41.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);

        driveBaseGyro1 = new Gyro(0);
        LiveWindow.addSensor("DriveBase", "Gyro 1", driveBaseGyro1);
        driveBaseGyro1.setSensitivity(0.007);
        pneumaticsCompressor1 = new Compressor(1);
        
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}