package com.lovemymc.dev.megaplots.cooldown;

import org.bukkit.Location;

/**
 * @author Cory Redmond
 *         Created by acech_000 on 18/04/2015.
 */
public interface ICooldownHandler
{

	/**
	 * @param loc The location of the block to check.
	 * @return Is the block at the supplied location in cooldown
	 */
	public boolean isCooldown( Location loc );

	/**
	 * Add the block at the supplied location to cooldown.
	 * @param loc The location of the block to add to cooldown.
	 */
	public void cooldown( Location loc );

	/**
	 * Clear the cooldown list. Be careful.
	 */
	public void clear();

	/**
	 * @return The message to send to commandblocks if they're in cooldown.
	 */
	public String getMessage();

	/**
	 * Set the message to send to commandblocks if they're in cooldown.
	 * @param message The message.
	 */
	public void setMessage( String message );

	/**
	 * @return The current cooldown time in Milliseconds.
	 */
	public long getCooldownTime();

	/**
	 * @param time The new cooldown time in Milliseconds.
	 */
	public void setCooldownTime( long time );

}
