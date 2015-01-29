package org.usfirst.frc.team3467.AutonomousCommands;

import org.usfirst.frc.team3467.commands.waitCommand;
import org.usfirst.frc.team3467.robot.Robot;
import org.usfirst.frc.team3467.subsystems.DriveBase.AutoDriveCommandMec;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.WaitCommand;

/**
 *
 */
public class AutoTwo extends CommandGroup {
    
    public  AutoTwo() {
    	requires(Robot.driveBase);
       this.addSequential(new AutoDriveCommandMec(0,-1,0,false));
       this.addSequential(new WaitCommand(1.0));
       this.addSequential(new AutoDriveCommandMec(0,0,0,false));
       this.addSequential(new WaitCommand(1.0));
       this.addSequential(new AutoDriveCommandMec(0,1,0,false));
       this.addSequential(new WaitCommand(1.0));
       this.addSequential(new AutoDriveCommandMec(0,0,0,false));
       
    }
}
