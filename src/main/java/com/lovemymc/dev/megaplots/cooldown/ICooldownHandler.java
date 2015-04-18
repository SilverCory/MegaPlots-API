package com.lovemymc.dev.megaplots.cooldown;

import org.bukkit.Location;

/**
 * @author Cory Redmond
 *         Created by acech_000 on 18/04/2015.
 */
public interface ICooldownHandler
{

	public boolean isCooldown( Location loc );

	public void cooldown( Location loc );

	public void clear();

	public String getMessage();

	public void setMessage( String message );

	public long getCooldownTime();

	public void setCooldownTime( long time );

}
