package projekat2;
import java.util.ArrayList;

import Projekat_2.Enemy;
import Projekat_2.Player;
public class Game {
	
	private Player player;
	private ArrayList<Enemy> listaEnemy;
	private ArrayList<String> dnevnik;
	
	public boolean checkCollision(Player p, Enemy e) {
        if (p.getX() + p.getWidth() <= e.getX()) {
            return false;
        }
        if (e.getX() + e.getWidth() <= p.getX()) {
            return false; 
        }
        if (p.getY() + p.getHeight() <= e.getY()) {
            return false;
        }
        if (e.getY() + e.getHeight() <= p.getY()) {
            return false;
        }
        return true;
    }
	
	public void decreaseHealth(Player p, Enemy e) {
		int stariHealth = p.getHealth();
		int noviHealth = stariHealth - e.getDamage();
		if( noviHealth == 0) {
			noviHealth = 0;
		}
		p.setHealth(noviHealth);
		dnevnik.add("HIT: " + p.getName() + " by" + e.getType() + " for" + e.getDamage() + ". " + "Old HP: "
		            + stariHealth + ", New HP: " + noviHealth);
	}
	
	public void addEnemy(Enemy e) {
		listaEnemy.add(e);
		dnevnik.add("Added: " e.toString());
	}
	
	
	public static void main(String[] args) {
		
		
		
		
		
		
		
		
	}

}
