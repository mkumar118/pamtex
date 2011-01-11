/**
 * 
 */
package org.se.pamtex;

import java.util.Vector;

/**
 * @author sricharanya
 *
 */
public class Preamble extends IREntry{
	private Vector<String> packages;
	private Vector<String> preambleContent;
	
	private static Preamble instance = null;
	protected Preamble() {
	      // This method exists only to defeat instantiation.
	   }
	public static Preamble getInstance() {
		if(instance == null) {
	         instance = new Preamble();
		}
	    return instance;
	}
	/**
	 * @param packages the packages to set
	 */
	public void setPackages(Vector<String> packages) {
		this.packages = packages;
	}
	/**
	 * @return the packages
	 */
	public Vector<String> getPackages() {
		return packages;
	}
	/**
	 * @param preambleContent the preambleContent to set
	 */
	public void setPreambleContent(Vector<String> preambleContent) {
		this.preambleContent = preambleContent;
	}
	/**
	 * @return the preambleContent
	 */
	public Vector<String> getPreambleContent() {
		return preambleContent;
	}
}
