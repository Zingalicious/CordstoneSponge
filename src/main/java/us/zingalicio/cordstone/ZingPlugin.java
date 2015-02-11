package us.zingalicio.cordstone;

import java.io.File;
import java.io.IOException;

import ninja.leaping.configurate.ConfigurationNode;
import ninja.leaping.configurate.hocon.HoconConfigurationLoader;
import ninja.leaping.configurate.loader.ConfigurationLoader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.api.Game;
import org.spongepowered.api.event.state.PreInitializationEvent;
import org.spongepowered.api.event.state.ServerStartingEvent;
import org.spongepowered.api.service.config.ConfigDir;
import org.spongepowered.api.text.format.TextColor;
import org.spongepowered.api.text.format.TextColors;

import com.google.inject.Inject;

public abstract class ZingPlugin 
{	
	@Inject
	@ConfigDir(sharedRoot = false)
	protected File configDirectory;
	
	protected File configFile;
	protected ConfigurationLoader configManager;
	protected ConfigurationNode config = null;
	
	protected static Game game;
	protected static Logger logger;
	protected static ZingPlugin instance;
	
	public TextColor nameColour = TextColors.GOLD;
	public TextColor textColour = TextColors.YELLOW;
	
	protected void commonInitialize(PreInitializationEvent event)
	{
		setGame(event.getGame());
		setLogger(LoggerFactory.getLogger(getClass()));
		setInstance(this);
	}
	
	protected void commonStart(ServerStartingEvent event)
	{
		configFile = new File(configDirectory.getAbsolutePath() + "/config.hocon");
		configManager = HoconConfigurationLoader.builder().setFile(configFile).build();
		
		try
		{
			if (!configDirectory.exists())
			{
				configDirectory.mkdirs();
			}
		}
		catch (SecurityException exception)
		{
			logger.error("Could not create configuration directory.");
		}
		
		try 
		{
			if (!configFile.exists())
			{
				configFile.createNewFile();
				config = configManager.load();
				config.getNode("version").setValue("DEBUG");
				configManager.save(config);
			}
			config = configManager.load();
		}
		catch (IOException exception) 
		{
			logger.error("Default configuration could not be loaded or created!");
		}
	}
	
	public ConfigurationNode getConfig()
	{
		return config;
	}
	
	protected static void setGame(Game g)
	{
		game = g;
	}
	
	public static Game getGame()
	{
		return game;
	}
	
	protected static void setLogger(Logger l)
	{
		logger = l;
	}
	
	public static Logger getLogger()
	{
		return logger;
	}
	
	protected static void setInstance(ZingPlugin plugin)
	{
		instance = plugin;
	}
	
	public static ZingPlugin getInstance()
	{
		return instance;
	}
}
