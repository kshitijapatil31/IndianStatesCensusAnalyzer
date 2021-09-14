package com.bridgelabz.indianstatescensusanalyzer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


import com.opencsv.CSVReader;

public class StatesCensusAnalyzer {
	
	public static List<CVSStateCensus> states=new ArrayList<>();
	 CVSStateCensus statecensus;
	
	public static void main(String[] args) throws IOException, StatesCensusException {
		StatesCensusAnalyzer ana=new StatesCensusAnalyzer();
		ana.loadStatesdata();
	}

	public  int loadStatesdata() throws IOException, StatesCensusException{
		
		FileReader reader=new FileReader("IndiaStateCensusData.csv");
	    CSVReader csvReader=new CSVReader (reader);
	    String []n;
	    n=csvReader.readNext();
	    while((n=csvReader.readNext())!=null) {
		List<String[]>records=csvReader.readAll();
		
		Iterator<String> iterator=Arrays.stream(n).iterator();
		 
			String state=iterator.next();
			String population=iterator.next();
			String areainSqKm=iterator.next();
			String densityperSqKm=iterator.next();
			try {
		
			statecensus=new CVSStateCensus(state, Long.parseLong(population), Long.parseLong(areainSqKm), Integer.parseInt(densityperSqKm));
			states.add(statecensus);
			}
		
		
	catch(Exception e) {
		throw new StatesCensusException("Type Mismatched");
	}
	    }
	return states.size();
}
	public boolean checkFile() throws StatesCensusException {
		File file=new File("IndiaStateCensusData.csv");
		if(file.exists()) {
			return true;
		}else {
			throw new StatesCensusException("file not found");
		}
	}

}
