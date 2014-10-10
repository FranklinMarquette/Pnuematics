/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.LFRobotics2014.commands;

/**
 *
 * @author Franklin Marquette
 */
public class ExtendSolenoid2 extends CommandBase {
    
    public ExtendSolenoid2() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(solenoid2);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        solenoid2.EXTEND();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
        solenoid2.OFF();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
