package com.lovemymc.dev.megaplots.api;

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
	@Deprecated
	public static void setInstance( IMPAPI mpapi )
	{
		if ( instance != null ) throw new IllegalStateException( "Setting the MegaPlots API isn't allowed!" );
		instance = mpapi;
	}

}
