package org.usfirst.frc.team3467.subsystems.DriveBase;

import org.usfirst.frc.team3467.robot.OI;
import org.usfirst.frc.team3467.robot.Robot;
import org.usfirst.frc.team3467.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveBase extends Subsystem {
    
    public static void fieldMecanumJoystickDrive(){
    	RobotMap.driveBaseRobotDrive41.mecanumDrive_Cartesian(-(OI.stick1.getX()), (OI.stick1.getY()), (OI.stick1.getZ())*Math.abs((OI.stick1.getZ())) / (2), -(RobotMap.driveBaseGyro1.getAngle()) );
    }
    
    public static void lowSpeedFieldMecanumJoystickDrive(){
    	RobotMap.driveBaseRobotDrive41.mecanumDrive_Cartesian(-(OI.stick1.getX()) * .25, (OI.stick1.getY()) * 0.25, (OI.stick1.getZ())*Math.abs((OI.stick1.getZ())) / (2) * 0.25, -(RobotMap.driveBaseGyro1.getAngle()) );
    }
    public static void mecanumInputDrive(double x, double y, double z, boolean fieldOrientation){
    	if(fieldOrientation){
        	RobotMap.driveBaseRobotDrive41.mecanumDrive_Cartesian(x, y, z, RobotMap.driveBaseGyro1.getAngle());
        	}else{
            	RobotMap.driveBaseRobotDrive41.mecanumDrive_Cartesian(x, y, z, 0);
        	}
    }
    public static void turnToAngle(int angle){
    	
    }

    public void initDefaultCommand() {
    	setDefaultCommand(new FieldOrientedDrive());
    }
}

