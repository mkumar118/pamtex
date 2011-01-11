/**
 * 
 */
package org.se.pamtex;

import java.io.File;

/**
 * @author sricharanya
 *
 */
public class FileIO {
	
	private String inputFileName;
	private String outputFileName;
	private String logFileName;
	
	private static FileIO instance = null;
	protected FileIO() {
	      // This method exists only to defeat instantiation.
	   }
	public static FileIO getInstance() {
		if(instance == null) {
	         instance = new FileIO();
		}
	    return instance;
	}
	
	/**
	 * @param inputFileName the inputFileName to set
	 */
	public void setInputFileName(String inputFileName) {
		this.inputFileName = inputFileName;
	}
	/**
	 * @return the inputFileName
	 */
	public String getInputFileName() {
		return inputFileName;
	}
	public void openFile(File file){
		
	}
	public void readLine(File file){
		
	}
	public void writeLine(File file){
		
	}
	public void writeOutputFile(){
		
	}
	public void closeFile(File file){
	}
	/**
	 * @param outputFileName the outputFileName to set
	 */
	public void setOutputFileName(String outputFileName) {
		this.outputFileName = outputFileName;
	}
	/**
	 * @return the outputFileName
	 */
	public String getOutputFileName() {
		return outputFileName;
	}
	/**
	 * @param logFileName the logFileName to set
	 */
	public void setLogFileName(String logFileName) {
		this.logFileName = logFileName;
	}
	/**
	 * @return the logFileName
	 */
	public String getLogFileName() {
		return logFileName;
	}
}
