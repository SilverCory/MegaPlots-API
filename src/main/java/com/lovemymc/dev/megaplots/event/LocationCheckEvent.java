package com.lovemymc.dev.megaplots.event;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.Location;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * @author Cory Redmond
 *         Created by acech_000 on 16/04/2015.
 */
public class LocationCheckEvent extends Event
{

	public static HandlerList handlers = new HandlerList();

	@Getter
	private final Location blockLocation;

	@Getter
	private final Location checkLocation;

	@Getter
	@Setter
	private boolean allowed = false;

	public LocationCheckEvent( Location blockLocation, Location checkLocation )
	{
		this.blockLocation = blockLocation;
		this.checkLocation = checkLocation;
	}

	public static HandlerList getHandlerList()
	{
		return handlers;
	}

	@Override public HandlerList getHandlers()
	{
		return handlers;
	}

}
