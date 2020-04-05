package lt.TerZer.armorstandlib.builders;

import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Player;

public class ArmorStandContext {

	private ArmorStand armorStand;
	private Player player;
	
	public ArmorStandContext(ArmorStand armorStand, Player player) {
		this.armorStand = armorStand;
		this.player = player;
	}
	
	public ArmorStand getArmorStand() {
		return armorStand;
	}
	
	public Player getPlayer() {
		return player;
	}
	
}
