
package edu.wpi.first.wpilibj.LFRobotics2014;

import edu.wpi.first.wpilibj.LFRobotics2014.commands.ExtendSolenoid1;
import edu.wpi.first.wpilibj.LFRobotics2014.commands.ExtendSolenoid2;
import edu.wpi.first.wpilibj.LFRobotics2014.commands.RetractSolenoid1;
import edu.wpi.first.wpilibj.LFRobotics2014.commands.RetractSolenoid2;
import edu.wpi.first.wpilibj.LFRobotics2014.subsystems.XBox;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // Another type of button you can create is a DigitalIOButton, which is
    // a button or switch hooked up to the cypress module. These are useful if
    // you want to build a customized operator interface.
    // Button button = new DigitalIOButton(1);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
    
    public XBox joystick = new XBox(1);
    
    private final Button extendSolenoid1 = new JoystickButton(joystick, XBox.A_BUTTON);
    private final Button retractSolenoid1 = new JoystickButton(joystick, XBox.B_BUTTON);
    
    private final Button extendSolenoid2 = new JoystickButton(joystick, XBox.Y_BUTTON);
    private final Button retractSolenoid2 = new JoystickButton(joystick, XBox.X_BUTTON);

    public OI(){
        
        extendSolenoid1.whenPressed(new ExtendSolenoid1());
        retractSolenoid1.whenPressed(new RetractSolenoid1());
        
        extendSolenoid2.whenPressed(new ExtendSolenoid2());
        retractSolenoid2.whenPressed(new RetractSolenoid2());
        
    }
}

