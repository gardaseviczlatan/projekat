package projekat2;

public class BossEnemy extends Enemy {
	private int modifikator;
	

	public int getModifikator() {
		return modifikator;
	}

	public void setModifikator(int modifikator) {
		this.modifikator = modifikator;
	}

	public BossEnemy(int x, int y, int width, int height, String type, int damage, int health, int modifikator) {
		super(x, y, width, height, type, damage, health);
		this.modifikator = 2;

	}
	public void damage() {
		this.setDamage(getDamage() * modifikator);
	}
	
	
	
	
}
