package org.usfirst.frc.team3467.subsystems.Sensors;

import org.usfirst.frc.team3467.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Sensors extends Subsystem {
    
    public static void resetGyro(){
    	RobotMap.driveBaseGyro1.reset();
    }
    public static void updateSD(){
		SmartDashboard.putNumber("Gyro Angle", RobotMap.driveBaseGyro1.getAngle());
    }
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new updateSD());
    }
}

