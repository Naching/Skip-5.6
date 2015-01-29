package org.usfirst.frc.team3467.subsystems.DriveBase;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class turnToAngle extends Command {
	int turnAngle;
	boolean atAngle;

    public turnToAngle(int angle) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	turnAngle = angle;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	atAngle = false;
    	DriveBase.turnToAngle(turnAngle);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return atAngle;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
