import java.util.Random;

/**
 * This class represents a wizard for
 * a D&D type game.
 * 
 * @author rkelley
 * @version 1.0 
 * CS131Lab2_LHS
 * Fall/2021
 */

public class Wizard implements Lockable {
	private Random generator = new Random(); // For setting key.
	private String name; // The wizard's name.
	private int health; // Numerical indication of the wizard's health.
	private int key; // Numerical key to lock and unlock the wizard's
			// takeDamage method.
	private boolean locked; // True if the takeDamage method is locked, false
			// if unlocked.
	
	/**
	 * Empty-argument constructor to put object into consistent state
	 */
	public Wizard() {
		this.name = "";
		this.health = 0;
		this.key = 0;
		this.locked = false;
	}//end empty-argument constructor
	
	/**
	 * Constructor to create object with common
	 * usage. This is the preferred constructor.
	 * @param name the Wizard's name
	 */
	public Wizard(String name) {
		setName(name);
		// Start Wizard with a health of 100.
		setHealth(100);
		// Set key to random number between 1000 and 10000 inclusive.
		setKey(generator.nextInt(9001) + 1000); 
		// Wizard can take damage on start.
		this.locked = false;
	}//end preferred constructor
	
	/**
	 * This method processes the
	 * damage to the object when 
	 * it is hit by other objects
	 * (e.g. weapons, lightening, etc.)
	 * @param power the amount of damage taken
	 */
	public void takeDamage(int power) {
		if (!isLocked())
			health -= power;
		if (health <= 0) {
			System.out.println(name+" is out of power and is now locked.");
			lock(key);
		}
	}//end takeDamage
	
	/**
	 * This method locks the Wizard's takeDamage method
	 * @param key the key that was set for the Wizard
	 */
	@Override
	public void lock(int key) {
		if (key == this.key)
			locked = true;
		else
			System.out.println("Lock failed.");
	}//end lock
	
	/**
	 * This method unlocks the Wizard's takeDamage method
	 * @param key the key that was set for the Wizard
	 */
	@Override
	public void unlock(int key) {
		if (key == this.key)
			locked = false;
		else
			System.out.println("Unlock failed.");
	}//end unlock
	
	/**
	 * Boolean method to check the Wizard's lock status
	 * @return the Wizard's lock status
	 */
	@Override
	public boolean isLocked() {
		return locked;
	}//end isLocked
	
	/**
	 * Getter for name
	 * @return the current value for name
	 */
	public String getName() {
		return name;
	}//end getName
	
	/**
	 * Setter for name
	 * @param name the value of name to be set
	 */
	public void setName(String name) {
		this.name = name;
	}//end setName
	
	/**																																
	 * Getter for health
	 * @return the current value for the health parameter
	 */
	public int getHealth() {
		return health;
	}//end getHealth
	
	/**
	 * Setter for health
	 * @param health the value of the health parameter to be set
	 */
	public void setHealth(int health) {
		this.health = health;
	}//end setHealth
	
	/**
	 * Getter for the key
	 * @return the current value of the key
	 */
	public int getKey() {
		return key;
	}//end getKey
	
	/**
	 * Setter for the key
	 * @param key the value of the key to be set
	 */
	@Override
	public void setKey(int key) {
		if (key > 0 && this.key <= 0) {
			this.key = key;
		}
	}//end setKey

	@Override
	public String toString() {
		return "Wizard [name=" + name + ", health=" + health + ", key=" + key + ", locked=" + locked + "]";
	}//end toString
	
}//end class
