package com.bridgelabz.indianstatescensusanalyzertest;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.indianstatescensusanalyzer.StatesCensusAnalyzer;
import com.bridgelabz.indianstatescensusanalyzer.StatesCensusException;

public class IndianStatesCensusAnalyzerTest {

	@Test
	public void givenCSVFile_loadFile_ReturnFileSize()throws IOException, StatesCensusException {
		StatesCensusAnalyzer analyzer=new StatesCensusAnalyzer();
		
			int result=analyzer.loadStatesdata();
		Assert.assertEquals(29,result);
		
	}
	@Test
	public void givenCSVFile_whenFileIsIncorrect_throwException() {
		StatesCensusAnalyzer analyzer=new StatesCensusAnalyzer();
		try {
			Assert.assertEquals("file not found", analyzer.checkFile());
		} catch (StatesCensusException e) {
			
			e.printStackTrace();
		}
	}
	@Test
	public void givenCSVFile_whenFileIscorrect_ButTypeIsIncorrect_throwException() {
		StatesCensusAnalyzer analyzer=new StatesCensusAnalyzer();
		try {
			Assert.assertEquals(56, analyzer.checkFile());
		} catch (Exception e) {
			
			e.getMessage();
		}
	}
	
}
