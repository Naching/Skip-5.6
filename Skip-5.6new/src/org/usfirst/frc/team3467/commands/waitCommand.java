package org.usfirst.frc.team3467.commands;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class waitCommand extends Command {
		int time;
		boolean done = false;
    public waitCommand(int milliseconds) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	time = milliseconds;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	while(!done){
    		try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
			}
    		done = true;
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if(done){
    		done = false;
    		return true;
    	}else{
        return false;
    	}
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
