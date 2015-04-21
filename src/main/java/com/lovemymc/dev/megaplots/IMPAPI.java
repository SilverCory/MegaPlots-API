package com.lovemymc.dev.megaplots;

import com.lovemymc.dev.megaplots.cooldown.ICooldownHandler;

/**
 * @author Cory Redmond
 *         Created by acech_000 on 18/04/2015.
 */
public interface IMPAPI
{

	/**
	 * @return The cooldown handler that is being used.
	 */
	public ICooldownHandler getCooldown();

}
