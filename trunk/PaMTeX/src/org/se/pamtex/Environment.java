/**
 * 
 */
package org.se.pamtex;

import java.util.Vector;

/**
 * @author sricharanya
 *
 */
public class Environment extends IREntry{

	private String name;
	private String label;
	private Vector<String> envContent;
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param label the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}
	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}
	/**
	 * @param envContent the envContent to set
	 */
	public void setEnvContent(Vector<String> envContent) {
		this.envContent = envContent;
	}
	/**
	 * @return the envContent
	 */
	public Vector<String> getEnvContent() {
		return envContent;
	}
	
	
}
