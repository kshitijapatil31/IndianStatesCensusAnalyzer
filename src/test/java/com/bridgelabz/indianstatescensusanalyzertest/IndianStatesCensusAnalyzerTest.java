package com.bridgelabz.indianstatescensusanalyzertest;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.indianstatescensusanalyzer.StatesCensusAnalyzer;

public class IndianStatesCensusAnalyzerTest {

	@Test
	public void givenCSVFile_loadFile_ReturnFileSize()throws IOException {
		StatesCensusAnalyzer analyzer=new StatesCensusAnalyzer();
		
			int result=analyzer.loadStatesdata();
		Assert.assertEquals(29,result);
		
	}
}
