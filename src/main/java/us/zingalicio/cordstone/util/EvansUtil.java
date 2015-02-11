package us.zingalicio.cordstone.util;

import org.spongepowered.api.Game;
import org.spongepowered.api.entity.player.Player;
import org.spongepowered.api.world.Location;

import us.zingalicio.cordstone.Cordstone;

import com.google.common.base.Optional;

public class EvansUtil 
{
	public static Player getEvans()
	{
		Game x = Cordstone.getGame();
		Optional<Player> evans = x.getServer().get().getPlayer("masterlink0");
		if (evans.isPresent())
		{
			return evans.get();
		}
		else
		{
			return null;
		}
	}
	
	public static void removeEvans()
	{
		getEvans().remove();
	}
	
	public static void putEvans(Location loc)
	{
		Player evans = getEvans();
		evans.setLocation(loc);
	}
}
