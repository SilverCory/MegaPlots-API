package com.lovemymc.dev.megaplots;

import com.lovemymc.dev.megaplots.api.IMPAPI;

/**
 * @author Cory Redmond
 *         Created by acech_000 on 18/04/2015.
 */
public class MegaPlots
{

	/**
	 * The instance of the API.
	 */
	private static IMPAPI instance;

	/**
	 * @return Returns the api and potentially NULL.
	 */
	public static IMPAPI getAPI()
	{
		return instance;
	}

	/**
	 * Set the instance of the API.
	 * @param mpapi The API please!
	 */
	static void setInstance( IMPAPI mpapi )
	{
		instance = mpapi;
	}

}
