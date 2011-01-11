/**
 * 
 */
package org.se.pamtex;

import java.util.Vector;

/**
 * @author sricharanya
 *
 */
public class IREntry {
	private String ID;
	private String tag;
	private Integer startLine;
	private Integer endLine;
	private Structure parent;
	private Vector<String> parentFile;
	/**
	 * @param iD the iD to set
	 */
	public void setID(String iD) {
		this.ID = iD;
	}
	/**
	 * @return the iD
	 */
	public String getID() {
		return ID;
	}
	/**
	 * @param tag the tag to set
	 */
	public void setTag(String tag) {
		this.tag = tag;
	}
	/**
	 * @return the tag
	 */
	public String getTag() {
		return tag;
	}
	/**
	 * @param startLine the startLine to set
	 */
	public void setStartLine(Integer startLine) {
		this.startLine = startLine;
	}
	/**
	 * @return the startLine
	 */
	public Integer getStartLine() {
		return startLine;
	}
	/**
	 * @param endLine the endLine to set
	 */
	public void setEndLine(Integer endLine) {
		this.endLine = endLine;
	}
	/**
	 * @return the endLine
	 */
	public Integer getEndLine() {
		return endLine;
	}
	/**
	 * @param parent the parent to set
	 */
	public void setParent(Structure parent) {
		this.parent = parent;
	}
	/**
	 * @return the parent
	 */
	public Structure getParent() {
		return parent;
	}
	/**
	 * @param parentFile the parentFile to set
	 */
	public void setParentFile(Vector<String> parentFile) {
		this.parentFile = parentFile;
	}
	/**
	 * @return the parentFile
	 */
	public Vector<String> getParentFile() {
		return parentFile;
	}
}
