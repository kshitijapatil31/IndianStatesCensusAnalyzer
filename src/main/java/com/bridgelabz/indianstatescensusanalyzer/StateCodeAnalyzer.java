package com.bridgelabz.indianstatescensusanalyzer;

import java.util.List;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import com.opencsv.CSVReader;

public class StateCodeAnalyzer {
	
	public static List<StateCode> states=new ArrayList<>();


	public static void main(String[] args) throws IOException {
		loadStatesdata();
	}
	public static void loadStatesdata() throws IOException{
		try (
			FileReader reader=new FileReader("StateCode.csv");
		    CSVReader csvReader=new CSVReader (reader);
		){
			List<String[]>records=csvReader.readAll();
			records.stream().forEach(n->{
			Iterator<String> iterator=Arrays.stream(n).iterator();

			String srNo=iterator.next();
				String stateName=iterator.next();
				String stateCode=iterator.next();
				

			if (!stateName.equals("State Name"))
				states.add(new StateCode(Integer.parseInt(srNo), stateName, stateCode));
			});
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}

