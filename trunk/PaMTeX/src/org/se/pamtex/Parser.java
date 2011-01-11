/**
 * 
 */
package org.se.pamtex;

import java.util.Vector;

/**
 * @author sricharanya
 *
 */
public class Parser {

	public static Vector<String> predefEnv;
	public static Vector<String> addedEnv;
	public static Vector<String> parentNames;
	public static Vector<String> packages;
	private Integer lineNum;
	private String content;
	private Structure parent;
	
	private static Parser instance = null;
	protected Parser() {
	      // This method exists only to defeat instantiation.
	   }
	public static Parser getInstance() {
		if(instance == null) {
	         instance = new Parser();
		}
	    return instance;
	}
	/**
	 * @param lineNum the lineNum to set
	 */
	public void setLineNum(Integer lineNum) {
		this.lineNum = lineNum;
	}
	/**
	 * @return the lineNum
	 */
	public Integer getLineNum() {
		return lineNum;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
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
	public void readLineFromInputFile(){
		
	}
	public void searchForRegexMatch(){
		
	}
	public void extractMetaData(String content){
		
	}
	public void createDefinitionBlockEntry(){
		
	}
	public void createEnvironmentEntry(){
		
	}
	public void updateLineNum(){
		
	}
	public void updateDefinitionBlockTable(DefinitionBlock entry){
		
	}
	public void updateLabelTable(Environment entry){
		
	}
	public void updateIR(IREntry entry){
		
	}
	public void addToReferenceTable(String ref){
		
	}
	public void addToDefinitionUsage(String defn){
		
	}
}
