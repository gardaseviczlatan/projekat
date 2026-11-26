package Projekat_3;

public class Enemy extends GameObject implements Attacker {
	
	private final String type;
	private final int damage;
	private int health;
	public Enemy(int x, int y, Collidable collider, String type, int damage, int health) {
		super(x, y, collider);
		if (type == null || type.trim().isEmpty()) {
			throw new IllegalArgumentException("Ne smije biti prazno");
		}
		if (damage < 0) {
			throw new IllegalArgumentException("Damage ne smije biti negativan.");
		}
        if (health < 0 || health > 100) {
        	throw new IllegalArgumentException("Health mora biti u opsegu [0, 100].");
        }
		this.type = type;
		this.damage = damage;
		this.health = health;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public String getType() {
		return type;
	}
	public int getDamage() {
		return damage;
	}
	
	@Override 
	public String getDisplayName() {
		return type;
	}
	
	
	
	
}
