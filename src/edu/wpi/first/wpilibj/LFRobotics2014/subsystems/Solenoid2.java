/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.LFRobotics2014.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Franklin Marquette
 */
public class Solenoid2 extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    DoubleSolenoid solenoid = new DoubleSolenoid(3, 4);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void EXTEND() {
        solenoid.set(DoubleSolenoid.Value.kForward);//extends cylinder
    }
    public void RETRACT() {
        solenoid.set(DoubleSolenoid.Value.kReverse);//retracts cylinder
    }
    
    public void OFF(){
        solenoid.set(DoubleSolenoid.Value.kOff);//turns solenoid off
    }
}
