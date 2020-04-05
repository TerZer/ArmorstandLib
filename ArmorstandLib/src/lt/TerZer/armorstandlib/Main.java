package lt.TerZer.armorstandlib;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.plugin.java.JavaPlugin;

import lt.TerZer.inventorylib.InventoryAPI;

import lt.TerZer.armorstandlib.builders.ArmorStandBuilder;

public class Main extends JavaPlugin {

	private static Main INSTANCE;
	private ArmorStandHandler handler;
	
	public void onEnable() {
		INSTANCE = this;
		handler = new ArmorStandHandler(this);
		new ArmorStandBuilder(new Location(Bukkit.getWorld("world"), 175, 63, 183)).arms().noGravity().build(context -> new TestInventory().open(InventoryAPI.getHandler(), context.getPlayer()));
	}
	
	public void onDisable() {
		
	}

	public static Main getInstance() {
		return INSTANCE;
	}

	public ArmorStandHandler getArmorStandHandler() {
		return handler;
	}
	
}
