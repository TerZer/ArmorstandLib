package lt.TerZer.armorstandlib;

import java.util.HashMap;
import java.util.UUID;
import java.util.function.Consumer;

import org.bukkit.Bukkit;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;

import lt.TerZer.armorstandlib.builders.ArmorStandContext;

public class ArmorStandHandler implements Listener {
	
	HashMap<UUID, Consumer<ArmorStandContext>> map = new HashMap<>();
	
	public ArmorStandHandler(Main plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}

	public void register(UUID uniqueId, Consumer<ArmorStandContext> consumer) {
		map.put(uniqueId, consumer);
	}
	
	public void removeAll() {
		for(UUID uuid : map.keySet()) {
			Entity en = Bukkit.getEntity(uuid);
			if(en != null && !en.isDead()) {
				en.remove();
			}
		}
		map.clear();
	}
	
	@EventHandler
	public void onPunch(EntityDamageByEntityEvent e) {
		if(e.isCancelled())
			return;
		
		if(map.containsKey(e.getEntity().getUniqueId())) {
			e.setCancelled(true);
		}
	}
	
	@EventHandler
	public void onInteract(PlayerInteractAtEntityEvent e) {
		if(e.isCancelled())
			return;
		
		if(e.getRightClicked() instanceof ArmorStand) {
			if(map.containsKey(e.getRightClicked().getUniqueId())) {
				map.get(e.getRightClicked().getUniqueId()).accept(new ArmorStandContext((ArmorStand) e.getRightClicked(), e.getPlayer()));
				e.setCancelled(true);
			}
		}
	}

}
