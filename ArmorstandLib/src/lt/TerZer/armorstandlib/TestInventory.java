package lt.TerZer.armorstandlib;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.material.MaterialData;

import lt.TerZer.inventorylib.ItemMenu;

public class TestInventory extends ItemMenu {

	private static String title = "CUSTOM TITLE";
	private static int size = 9*3;
	private static int background_data = 7;
	
	//Using my old library
	public TestInventory() {
		super(title, size, background_data);
	}
	
	@SuppressWarnings("deprecation")
	@Override
	protected void construct(Player player) {
		item(2, new MaterialData(Material.BIRCH_WOOD), ChatColor.translateAlternateColorCodes('&', "&cClick on me"), context -> {
			context.getPlayer().sendMessage("Uhh, you clicked 1");
		});
		
		item(5, new MaterialData(Material.BIRCH_WOOD), ChatColor.translateAlternateColorCodes('&', "&cClick on me"), context -> {
			context.getPlayer().sendMessage("Uhh, you clicked 2");
		});
		
		item(8, new MaterialData(Material.BIRCH_WOOD), ChatColor.translateAlternateColorCodes('&', "&cClick on me"), context -> {
			context.getPlayer().sendMessage("Uhh, you clicked 3");
		});
	}

	
	
}
