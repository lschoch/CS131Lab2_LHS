
/**
 * Interface to lock and unlock an object's methods. Allows a character 
 * (Wizard) to be locked so that it cannot take damage.
 *
 * @author lschoch
 * @version 1.0 
 * CS131Lab2_LHS
 * Fall/2021
 */

public interface Lockable {
	/**
	 * Sets the value of the Wizard object's key
	 * @param key the value of the key to be set
	 */
	public void setKey(int key); 
	
	/**
	 * Locks the Wizard object's takeDamage method
	 * @param key the value of the Wizard object's key
	 */
	public void lock(int key);
	
	/**
	 * Unlocks the Wizard object's takeDamage method
	 * @param key the value of the Wizard object's key
	 */
	public void unlock(int key);
	
	/**
	 * Gets the lock status of the Wizard object
	 * @return the Wizard object's lock status
	 */
	public boolean isLocked();

}//end interface
