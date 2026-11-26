package Projekat_3;

public abstract class GameObject implements Collidable{
	
	private int x;
	private int y;
	private final Collidable collider;
	
	
	public GameObject(int x, int y, Collidable collider) {
		this.x=x;
		this.y=y;
		this.collider=collider;
		
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public Collidable getCollider() {
		return collider;
	}
	public abstract String getDisplayName();
	
	public boolean intersects(GameObject other) {
		return collider.intersects(x,y,other.collider,other.x,other.y);
	}
	
	
	
}
