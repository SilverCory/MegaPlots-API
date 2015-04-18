package com.lovemymc.dev.megaplots;

/**
 * @author Cory Redmond
 *         Created by acech_000 on 18/04/2015.
 */
public class MegaPlots
{

	private static IMPAPI instance;

	public static IMPAPI getAPI()
	{
		return instance;
	}

	static void setInstance( IMPAPI mpapi )
	{
		instance = mpapi;
	}

}
