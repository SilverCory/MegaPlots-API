package com.lovemymc.dev.megaplots.api;

import com.lovemymc.dev.megaplots.api.cooldown.ICooldownHandler;

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
