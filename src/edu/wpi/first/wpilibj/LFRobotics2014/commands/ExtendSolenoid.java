/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.LFRobotics2014.commands;

import edu.wpi.first.wpilibj.LFRobotics2014.RobotMap;
import edu.wpi.first.wpilibj.Solenoid;



/**
 *
 * @author Franklin Marquette
 */
public class ExtendSolenoid extends CommandBase {
    
    private Solenoid s1;
    
    public ExtendSolenoid() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        s1 = new Solenoid(RobotMap.solenoid1);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        s1.set(true);
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
