package me.EssexIO;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;

public class HitForDiamond
  implements Listener
{
  @EventHandler
  public void onHit(EntityDamageByEntityEvent e)
  {
    if (((e.getEntity() instanceof Player)) && 
      ((e.getDamager() instanceof Player)))
    {
      Player h = (Player)e.getDamager();
      double d = Math.random();
      if (d < 0.7D) {
        h.getInventory().addItem(new ItemStack(Material.DIAMOND, 1,(short) 1));
      } else {}
    }
  }
}
