package Projekat_3;

public interface Collidable {
	
	int getWidth();
	int getHeight();
	
	default boolean intersects(int x1, int y1, Collidable other, int x2, int y2) {
		return x1 < x2 + other.getWidth() && x2 < x1 + getWidth() && y1 < y2 + other.getHeight() && y2 < y1 + getHeight();
	}
	
}
