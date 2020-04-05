package lt.TerZer.armorstandlib.builders;

import java.util.UUID;
import java.util.function.Consumer;

import org.bukkit.Location;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.EulerAngle;

import lt.TerZer.armorstandlib.Main;

public class ArmorStandBuilder {
	
    private Location location;
    private boolean isSmall;
    private boolean isMarker;
    private boolean isVisible;
    private boolean isInvulnerable;
    private boolean onFire;
    private boolean hasGravity;
    private boolean hasArms;
    private boolean hasPlate;
    private Entity passanger;
    private ItemStack helmet;
    private ItemStack chestplate;
    private ItemStack leggings;
    private ItemStack boots;
    private ItemStack mainHand;
    private ItemStack offHand;
    private double health;
    private EulerAngle bodyPose;
    private EulerAngle headPose;
    private EulerAngle leftArmPose;
    private EulerAngle rightArmPose;
    private EulerAngle leftLegPose;
    private EulerAngle rightLegPose;
    private String name;
    
    public ArmorStandBuilder(final Location location) {
        this.isSmall = false;
        this.isMarker = false;
        this.isVisible = true;
        this.isInvulnerable = false;
        this.hasGravity = true;
        this.hasArms = false;
        this.hasPlate = true;
        this.health = 20.0;
        this.bodyPose = EulerAngle.ZERO;
        this.headPose = EulerAngle.ZERO;
        this.leftArmPose = EulerAngle.ZERO;
        this.rightArmPose = EulerAngle.ZERO;
        this.leftLegPose = EulerAngle.ZERO;
        this.rightLegPose = EulerAngle.ZERO;
        this.name = null;
        this.location = location;
    }
    
    public static ArmorStandBuilder of(final Location location) {
        return new ArmorStandBuilder(location);
    }
    
    public static ArmorStandBuilder decorative(final Location location) {
        return new ArmorStandBuilder(location).invisible().marker().noGravity().invulnerable();
    }
    
    public ArmorStandBuilder marker(final boolean isMarker) {
        this.isMarker = isMarker;
        return this;
    }
    
    public ArmorStandBuilder name(final String name) {
        this.name = name;
        return this;
    }
    
    public ArmorStandBuilder mainItem(ItemStack item) {
        this.mainHand = item;
        return this;
    }
    
    public ArmorStandBuilder offItem(ItemStack item) {
        this.offHand = item;
        return this;
    }
    
    public ArmorStandBuilder marker() {
        return this.marker(true);
    }
    
    public ArmorStandBuilder visible(final boolean isVisible) {
        this.isVisible = isVisible;
        return this;
    }
    
    public ArmorStandBuilder onFire() {
    	this.onFire = true;
    	return this;
    }
    
    public ArmorStandBuilder visible() {
        return this.visible(true);
    }
    
    public ArmorStandBuilder invisible() {
        return this.visible(false);
    }
    
    public ArmorStandBuilder gravity(final boolean hasGravity) {
        this.hasGravity = hasGravity;
        return this;
    }
    
    public ArmorStandBuilder gravity() {
        return this.gravity(true);
    }
    
    public ArmorStandBuilder noGravity() {
        return this.gravity(false);
    }
    
    public ArmorStandBuilder invulnerable(final boolean isInvulnerable) {
        this.isInvulnerable = isInvulnerable;
        return this;
    }
    
    public ArmorStandBuilder invulnerable() {
        return this.invulnerable(true);
    }
    
    public ArmorStandBuilder vulnerable() {
        return this.invulnerable(false);
    }
    
    public ArmorStandBuilder small(final boolean isSmall) {
        this.isSmall = isSmall;
        return this;
    }
    
    public ArmorStandBuilder small() {
        return this.small(true);
    }
    
    public ArmorStandBuilder large() {
        return this.small(false);
    }
    
    public ArmorStandBuilder basePlate(final boolean hasPlate) {
        this.hasPlate = hasPlate;
        return this;
    }
    
    public ArmorStandBuilder noBasePlate() {
        return this.basePlate(false);
    }
    
    public ArmorStandBuilder arms(final boolean hasArms) {
        this.hasArms = hasArms;
        return this;
    }
    
    public ArmorStandBuilder arms() {
        return this.arms(true);
    }
    
    public ArmorStandBuilder passanger(final Entity passanger) {
        this.passanger = passanger;
        return this;
    }
    
    public ArmorStandBuilder helmet(final ItemStack helmet) {
        this.helmet = helmet;
        return this;
    }
    
    public ArmorStandBuilder chestplate(final ItemStack chestplate) {
        this.chestplate = chestplate;
        return this;
    }
    
    public ArmorStandBuilder leggings(final ItemStack leggings) {
        this.leggings = leggings;
        return this;
    }
    
    public ArmorStandBuilder boots(final ItemStack boots) {
        this.boots = boots;
        return this;
    }
    
    public ArmorStandBuilder health(final double health) {
        this.health = health;
        return this;
    }
    
    public ArmorStandBuilder bodyPose(final EulerAngle angles) {
        this.bodyPose = angles;
        return this;
    }
    
    public ArmorStandBuilder headPose(final EulerAngle angles) {
        this.headPose = angles;
        return this;
    }
    
    public ArmorStandBuilder leftArmPose(final EulerAngle angles) {
        this.leftArmPose = angles;
        return this;
    }
    
    public ArmorStandBuilder rightArmPose(final EulerAngle angles) {
        this.rightArmPose = angles;
        return this;
    }
    
    public ArmorStandBuilder leftLegPose(final EulerAngle angles) {
        this.leftLegPose = angles;
        return this;
    }
    
    public ArmorStandBuilder rightLegPose(final EulerAngle angles) {
        this.rightLegPose = angles;
        return this;
    }
    
    public ArmorStandBuilder bodyPose(final double x, final double y, final double z) {
        return this.bodyPose(new EulerAngle(x, y, z));
    }
    
    public ArmorStandBuilder headPose(final double x, final double y, final double z) {
        return this.headPose(new EulerAngle(x, y, z));
    }
    
    public ArmorStandBuilder leftArmPose(final double x, final double y, final double z) {
        return this.leftArmPose(new EulerAngle(x, y, z));
    }
    
    public ArmorStandBuilder rightArmPose(final double x, final double y, final double z) {
        return this.rightArmPose(new EulerAngle(x, y, z));
    }
    
    public ArmorStandBuilder leftLegPose(final double x, final double y, final double z) {
        return this.leftLegPose(new EulerAngle(x, y, z));
    }
    
    public ArmorStandBuilder rightLegPose(final double x, final double y, final double z) {
        return this.rightLegPose(new EulerAngle(x, y, z));
    }
    
    public ArmorStand build(Consumer<ArmorStandContext> consumer) {
        ArmorStand e = (ArmorStand)this.location.getWorld().spawn(this.location, ArmorStand.class, entity -> {
        	entity.setSmall(this.isSmall);
            entity.setMarker(this.isMarker);
            entity.setVisible(this.isVisible);
            entity.setInvulnerable(this.isInvulnerable);
            entity.setGravity(this.hasGravity);
            entity.setArms(this.hasArms);
            entity.setBasePlate(this.hasPlate);
            if (this.passanger != null) {
                entity.addPassenger(this.passanger);
            }
            if(this.onFire) {
            	entity.setFireTicks(9999999);
            }
            entity.getEquipment().setHelmet(this.helmet);
            entity.getEquipment().setChestplate(this.chestplate);
            entity.getEquipment().setLeggings(this.leggings);
            entity.getEquipment().setBoots(this.boots);
            entity.setHealth(this.health);
            entity.setBodyPose(this.bodyPose);
            entity.setHeadPose(this.headPose);
            entity.setLeftArmPose(this.leftArmPose);
            entity.setRightArmPose(this.rightArmPose);
            entity.setLeftLegPose(this.leftLegPose);
            entity.setRightLegPose(this.rightLegPose);
            entity.getEquipment().setItemInMainHand(this.mainHand);
            entity.getEquipment().setItemInOffHand(this.offHand);
            if (this.name != null) {
                entity.setCustomName(this.name);
                entity.setCustomNameVisible(true);
            }
        });
        Main.getInstance().getArmorStandHandler().register(e.getUniqueId(), consumer);
        return e;
    }
    
    public UUID buildUUID(Consumer<ArmorStandContext> consumer) {
        return this.build(consumer).getUniqueId();
    }
    
    public String buildUUIDString(Consumer<ArmorStandContext> consumer) {
        return this.build(consumer).getUniqueId().toString();
    }
}
