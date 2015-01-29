package org.usfirst.frc.team3467.subsystems.DriveBase;

import org.usfirst.frc.team3467.robot.*;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class AutoDriveCommandMec extends Command {

    public static double x;
    public static double y;
    public static double z;
    boolean fieldOriented;

	public AutoDriveCommandMec(double x, double y, double z, boolean fieldOriented) {
    	this.x = x;
    	this.y = y;
    	this.z = z;
    	this.fieldOriented = fieldOriented;
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.driveBase);

    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	DriveBase.mecanumInputDrive(x, y, z, fieldOriented);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;

    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
