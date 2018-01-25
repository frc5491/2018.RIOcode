/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team5491.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.drive.MecanumDrive;

public class Robot extends IterativeRobot {
	private static final int kFrontLeftChannel = 2;
	private static final int kRearLeftChannel = 3;
	private static final int kFrontRightChannel = 1;
	private static final int kRearRightChannel = 0;

	private static final int kJoystickChannel = 0;

	private MecanumDrive m_robotDrive;
	private Joystick m_stick;

	@Override
	public void robotInit() {
		
		/* Mecanum Drive Motor Code */
		
		Spark frontLeft = new Spark(kFrontLeftChannel);
		Spark rearLeft = new Spark(kRearLeftChannel);
		Spark frontRight = new Spark(kFrontRightChannel);
		Spark rearRight = new Spark(kRearRightChannel);

		// Invert the left side motors.
		// You may need to change or remove this to match your robot.
		frontLeft.setInverted(true);
		rearLeft.setInverted(true);

		m_robotDrive = new MecanumDrive(frontLeft, rearLeft, frontRight, rearRight);

		m_stick = new Joystick(kJoystickChannel);
		
		/* Gripper Intake Motor Code */
		
		/* Pneumatic Scissor Lift Code */
		
		/* Pneumatic Gripper Code */
		
		/* Vision System (HUD) Code */
		
		/* Driver Station (HMI) Code */
		
		/* Field Data (FMS) Code */
		
		
	}

	@Override
	public void autonomousPeriodic() {
		
		/* Team strategy illustrated a need to have multiple startup modes that may be selected
		 * by a selector switch before the beginning of every match. Alliance strategy sessions 
		 * would determine which of the tactics need to be employed.
		 */
		
		/* Get data to invoke logic...
		 * FMS Data: starting field position, autonomous start, alliance, field config, game clock
		 * Selector Knob: position
		 */
		
		/* Tactic 1A (position 1, tactic A): cross the baseline (left side), move to wall (safezone) */
		
		/* Tactic 1B (position 1, tactic B): deliver cube to SCALE from left, retreat to switch wall (safezone) */
		
		/* Tactic 1C (position 1, tactic C): deliver cube to SWITCH from left, escape to baseline */
		
		/* Tactic 2A (position 2, tactic A): strafe left to cross the baseline, move to wall (safezone) */
		
		/* Tactic 2B (position 2, tactic B): strafe right to cross the baseline, move to wall (safezone) */
		
		/* Tactic 2C (position 2, tactic C): deliver cube to SWITCH from position 2, escape to baseline */
		
		/* Tactic 2D (position 2, tactic D): deliver cube to SCALE from position 2, strafe left, retreat to switch wall (safezone) */
		
		/* Tactic 2E (position 2, tactic E): deliver cube to SCALE from position 2, strafe right, retreat to switch wall (safezone) */
		
		/* Tactic 3A (position 3, tactic A): cross the baseline (left side), move to wall (safezone) */
		
		/* Tactic 3B (position 3, tactic B): deliver cube to SCALE from right, retreat to switch wall (safezone) */
		
		/* Tactic 3C (position 3, tactic C): deliver cube to SWITCH from right, escape to baseline */
	
	}
	
	@Override
	public void teleopPeriodic() {
		// Use the joystick X axis for lateral movement, Y axis for forward
		// movement, and Z axis for rotation.
		m_robotDrive.driveCartesian(m_stick.getX(), m_stick.getY(),	m_stick.getZ(), 0.0);
		
		/* Manually move scissor lift up/down */
		
		/* Manually engage intake to grab/drop (forward/reverse) cubes */
		
		/* Manually open/close grip fingers */
		
		/* Manually deploy/retrieve gripper assembly */
		
		/* Move scissor to pre-programmed SWITCH height */
		
		/* Move scissor to pre-programmed SCALE lower limit */
		
		/* Move scissor to pre-programmed SCALE upper limit */
		
		/* Move scissor to pre-programmed CLIMBING height */
		
	}
	@Override
	public void testPeriodic() {
		
	}
}
