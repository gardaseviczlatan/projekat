package projekat2;

public class Enemy extends GameObject {
	
	private String type;
	private int damage;
	private int health;
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		if(type == null) {
			System.out.println("Ne smije biti prazno");
		}this.type = type;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		if(damage < 0) {
			System.out.println("Damage ne moze biti 0");
			this.damage = 0;
		}else if(damage > 100) {
			System.out.println("Damage ne moze biti 100");
			this.damage = 100;
			}else {
				this.damage = damage;
		}
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		if(health < 0) {
			System.out.println("Health ne moze biti 0");
			this.health = 0;
		}else if(health > 100) {
			System.out.println("Health ne moze biti 100");
			this.health = 100;
			}else {
				this.health = health;
		}
	}
	public Enemy(int x, int y, int width, int height, String type, int damage, int health) {
		super(x, y, width, height);
		this.type = type;
		this.damage = damage;
		this.health = health;
	}
	@Override
	public String toString() {
		return "Enemy [type=" + type + ", damage=" + damage + ", health=" + health + ", X=" + getX() + ", )="
				+ getY() + ", Width=" + getWidth() + ", Height=" + getHeight() + "]";
	}
	
	
	
	
}
