package com.lovemymc.dev.megaplots.api.event;

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

	/**
	 * Bukkit requires this.
	 */
	public static HandlerList handlers = new HandlerList();

	/**
	 * The instance of the CommandBlock that the event is being called for.
	 */
	@Getter
	private final CommandBlock commandTile;

	/**
	 * The command that is to be processed.
	 */
	@Getter
	@Setter
	private String command;

	/**
	 * The arguments to be processed.
	 */
	@Getter
	@Setter
	private String[] args;

	/**
	 * The outcome of processing.
	 */
	@Getter
	@Setter
	private boolean allowed = false;

	/**
	 * The message to send the block if #allowed is false.
	 */
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

	@Override
	public HandlerList getHandlers()
	{
		return handlers;
	}

	/**
	 * @return The final command and arguments. Spaces will be stripped from the command.
	 */
	public String getFinalCommandString()
	{

		StringBuilder arguments = new StringBuilder();
		for ( String str : getArgs() ) arguments.append( " " ).append( str );

		if ( getCommand().contains( " " ) ) setCommand( getCommand().replace( " ", "" ) );

		return getCommand() + arguments;

	}

}
