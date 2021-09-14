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
	
	
	public static void main(String[] args) throws IOException {
		StatesCensusAnalyzer ana=new StatesCensusAnalyzer();
		ana.loadStatesdata();
	}
	public  int loadStatesdata() throws IOException{
		try (
			FileReader reader=new FileReader("IndiaStateCensusData.csv");
		    CSVReader csvReader=new CSVReader (reader);
		){
			List<String[]>records=csvReader.readAll();
			records.stream().forEach(n->{
			Iterator<String> iterator=Arrays.stream(n).iterator();
			 
				String state=iterator.next();
				String population=iterator.next();
				String areainSqKm=iterator.next();
				String densityperSqKm=iterator.next();
				
			if(!population.equals("Population"))
				states.add(new CVSStateCensus(state, Long.parseLong(population), Long.parseLong(areainSqKm), Integer.parseInt(densityperSqKm)));
			});
		}catch(IOException e) {
			e.printStackTrace();
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
