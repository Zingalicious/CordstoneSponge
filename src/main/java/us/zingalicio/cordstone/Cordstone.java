package us.zingalicio.cordstone;

import java.io.File;
import java.io.IOException;

import ninja.leaping.configurate.ConfigurationNode;
import ninja.leaping.configurate.hocon.HoconConfigurationLoader;
import ninja.leaping.configurate.loader.ConfigurationLoader;

import org.spongepowered.api.event.state.PreInitializationEvent;
import org.spongepowered.api.event.state.ServerStartingEvent;
import org.spongepowered.api.plugin.Plugin;
import org.spongepowered.api.util.event.Subscribe;

@Plugin(id = "Cordstone", name = "Cordstone", version = "0.0.1")
public class Cordstone extends ZingPlugin
{	
	private File messageFile;
	private ConfigurationLoader messageManager;
	private ConfigurationNode messages = null;
	
	@Subscribe
	public void onInitialize(PreInitializationEvent event)
	{
		commonInitialize(event);
	}
	
	@Subscribe
	public void onStart(ServerStartingEvent event)
	{
		commonStart(event);
		messageFile = new File(configDirectory.getAbsolutePath() + "/messages.hocon");
		messageManager = HoconConfigurationLoader.builder().setFile(messageFile).build();
		
		try 
		{
			if (!messageFile.exists())
			{
				messageFile.createNewFile();
				messages = messageManager.load();
				messages.getNode("playerJoin").setValue("%player% has joined the game!");
				messageManager.save(messages);
			}
			messages = messageManager.load();
		}
		catch (IOException exception) 
		{
			logger.error("Default configuration could not be loaded or created!");
		}
	}
	
	public ConfigurationNode getMessages()
	{
		return messages;
	}
}
