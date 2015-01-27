package org.usfirst.frc3467.Robot2015.AutonomousCommands;

import org.usfirst.frc3467.Robot2015.Robot;
import org.usfirst.frc3467.Robot2015.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class AutoOne extends Command {
    boolean done = false;
	public AutoOne(){
		requires(Robot.driveBase);

	}
	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		RobotMap.driveBaseGyro1.reset();
        RobotMap.driveBaseRobotDrive41.setSafetyEnabled(false);
        done = false;

	}

	@Override
	protected void execute() {
		while(!done){
		RobotMap.driveBaseSpeedController2.set(1);
		RobotMap.driveBaseSpeedController1.set(1);
		RobotMap.driveBaseSpeedController3.set(-1);
		RobotMap.driveBaseSpeedController4.set(-1);
		try {
			  Thread.sleep(1000);
			} catch (InterruptedException ie) {
			    //Handle exception
			}
		RobotMap.driveBaseRobotDrive41.drive(0, 0);
		try {
			  Thread.sleep(1000);
			} catch (InterruptedException ie) {
			    //Handle exception
			}
		RobotMap.driveBaseSpeedController2.set(-1);
		RobotMap.driveBaseSpeedController1.set(-1);
		RobotMap.driveBaseSpeedController3.set(1);
		RobotMap.driveBaseSpeedController4.set(1);
		try {
			  Thread.sleep(1000);
			} catch (InterruptedException ie) {
			    //Handle exception
			}
		RobotMap.driveBaseRobotDrive41.drive(0, 0);
		
		done = true;
		}
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub

	}

}
