package com.lovemymc.dev.megaplots.event;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.block.CommandBlock;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * @author Cory Redmond
 *         Created by acech_000 on 16/04/2015.
 */
public class CommandCheckEvent extends Event
{

	public static HandlerList handlers = new HandlerList();
	@Getter
	private final CommandBlock commandTile;
	@Getter
	@Setter
	private String command;
	@Getter
	@Setter
	private String[] args;
	@Getter
	@Setter
	private boolean allowed = false;

	@Getter
	@Setter
	private String disallowedMessage = "&cThat command isn't allowed.";

	public CommandCheckEvent( String command, String[] args, CommandBlock commandTile )
	{
		this.command = command;
		this.args = args;
		this.commandTile = commandTile;
	}

	public static HandlerList getHandlerList()
	{
		return handlers;
	}

	@Override public HandlerList getHandlers()
	{
		return handlers;
	}

	public String getFinalCommandString()
	{

		StringBuilder arguments = new StringBuilder();
		for ( String str : getArgs() ) arguments.append( " " ).append( str );

		if ( getCommand().contains( " " ) ) setCommand( getCommand().replace( " ", "" ) );

		return new StringBuilder( getCommand() ).append( arguments ).toString();

	}

}
