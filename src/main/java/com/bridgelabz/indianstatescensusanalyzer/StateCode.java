package com.bridgelabz.indianstatescensusanalyzer;

public class StateCode {

	int srNo;
	String stateName;
	String stateCode;
	
	
	
	public StateCode(int srNo, String stateName, String stateCode) {
		super();
		this.srNo = srNo;
		this.stateName = stateName;
		this.stateCode = stateCode;
	}



	@Override
	public String toString() {
		return "StateCode [srNo=" + srNo + ", stateName=" + stateName + ", stateCode=" + stateCode + "]";
	}
	
	
	
}
