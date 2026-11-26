package Projekat_3;

public class MeleeEnemy extends Enemy {

	public MeleeEnemy(int x, int y, Collidable collider, String type, int damage, int health) {
		super(x, y, collider, type, damage, health);
	}
	@Override
	public int attack() {
		return getDamage();
	}
	
	
	
	
}
