package projekat2;

public class Player extends GameObject {
	
	private String ime;
	private int health;
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
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
	public Player(int x, int y, int width, int height, String ime, int health) {
		super(x, y, width, height);
		this.ime = ime;
		this.health = health;
	}
	@Override
	public String toString() {
		return "Player [ime=" + ime + ", health=" + health + ", X=" + getX() + ", Y=" + getY()
				+ ", Width=" + getWidth() + ", Height=" + getHeight() + "]";
	}
	
	
	
	
	

}
