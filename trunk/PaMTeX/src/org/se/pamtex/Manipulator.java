/**
 * 
 */
package org.se.pamtex;

/**
 * @author sricharanya
 *
 */
public class Manipulator {

	private static Manipulator instance = null;
	protected Manipulator() {
	      // This method exists only to defeat instantiation.
	   }
	public static Manipulator getInstance() {
		if(instance == null) {
	         instance = new Manipulator();
		}
	    return instance;
	}
	public void scanAndUpdateDefinitions(){
		
	}
	public void scanAndUpdateReferenceTags(){
		
	}
	public void writeToConsole(){
		//probably not needed
	}
	public void writeToLog(){
		//probably not needed
	}
}
