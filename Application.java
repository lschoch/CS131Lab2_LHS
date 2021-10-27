
/**
 * Driver class to test the Wizard class and
 * the Lockable interface.
 * 
 * @author lschoch
 * @version 1.0 
 * CS131Lab2_LHS
 * Fall/2021
 */

public class Application {
	/**
	 * Main method for the Application class
	 * @param args this method does not use command line arguments
	 */

	public static void main(String[] args) {
		
		// Test the empty-argument constructor
		Wizard wiz = new Wizard();
		System.out.println("Testing empty-argument constructor:");
		System.out.println(wiz.toString()+"\n");
		
		// Test the getters/setters
		wiz.setName("setterName");
		wiz.setHealth(1000);
		wiz.setKey(1234);
		System.out.println("Testing getters/setters:");
		System.out.println("getName returns: "+wiz.getName()+"\n"
				+"getHealth returns: "+wiz.getHealth()+"\n"
				+"getKey returns: "+wiz.getKey()+"\n"
				+"iaLocked returns: "+wiz.isLocked()+"\n");
		
		// Test the preferred constructor
		Wizard wizPreferred = new Wizard("Larzard");
		System.out.println("Testing preferred constructor: ");
		System.out.println(wizPreferred.toString()+"\n");
		
		// Test the remaining interface methods (setKey already tested).
		System.out.println("Testing isLocked method:");
		System.out.println("isLocked: "+wiz.isLocked());
		System.out.println("Testing lock method:");
		wiz.lock(wiz.getKey());
		System.out.println("isLocked: "+wiz.isLocked());
		System.out.println("Testing unlock method:");
		wiz.unlock(wiz.getKey());
		System.out.println("isLocked: "+wiz.isLocked());
		
		
		
		
	}

}
