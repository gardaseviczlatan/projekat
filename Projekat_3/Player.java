package Projekat_3;

public class Player extends GameObject {
	
	private final String name;
	private int health;
	
	public String getName() {
		return name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		if (health < 0 || health > 100)
            throw new IllegalArgumentException("Health mora biti od 0 do 100");
        this.health = health;
	}
	public Player(int x, int y, Collidable collider, String name, int health) {
		super(x, y, collider);
		if(name == null || name.trim().isEmpty()) {
			throw new IllegalArgumentException("Ime ne smije biti prazno");
		}
		if (!Character.isUpperCase(name.charAt(0))) {
			throw new IllegalArgumentException("Ime mora poceti velikim slovom.");
		}
		if (health < 0 || health > 100) {
			throw new IllegalArgumentException("Health mora biti od 0 do 100");
		}
		this.name = name;
		this.health = health;
	}
	@Override
	public String getDisplayName() {
		return name;
	}
	
	
	
}
