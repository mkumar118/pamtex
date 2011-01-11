/**
 * 
 */
package org.se.pamtex;

import java.util.Vector;

/**
 * @author sricharanya
 *
 */
public class DefinitionBlock extends IREntry{

	private Vector<String> names;
	private Vector<String> defnContent;
	/**
	 * @param names the names to set
	 */
	public void setNames(Vector<String> names) {
		this.names = names;
	}
	/**
	 * @return the names
	 */
	public Vector<String> getNames() {
		return names;
	}
	/**
	 * @param defnContent the defnContent to set
	 */
	public void setDefnContent(Vector<String> defnContent) {
		this.defnContent = defnContent;
	}
	/**
	 * @return the defnContent
	 */
	public Vector<String> getDefnContent() {
		return defnContent;
	}
}
