/**
 * 
 */
package org.se.pamtex;

/**
 * @author sricharanya
 *
 */
public class Interface {

	private String[] cmdLineArgs;
	
	private static Interface instance = null;
	protected Interface() {
	      // This method exists only to defeat instantiation.
	}
	public static Interface getInstance() {
		if(instance == null) {
	         instance = new Interface();
		}
	    return instance;
	}
	/**
	 * @param cmdLineArgs the cmdLineArgs to set
	 */
	public void setCmdLineArgs(String[] cmdLineArgs) {
		this.cmdLineArgs = cmdLineArgs;
	}

	/**
	 * @return the cmdLineArgs
	 */
	public String[] getCmdLineArgs() {
		return cmdLineArgs;
	}
	public void parseCmdLineArgs(){
		
	}
	public void updateFileIO(){
		
	}
	public void writeToConsole(){
		
	}
}
