package com.bridgelabz.indianstatescensusanalyzer;

public class CVSStateCensus {

	String StateName;
	long population;
	long areainSqKm;
	long densityperSqKm;
	
	
	CVSStateCensus(){
		
	}
	public CVSStateCensus(String stateName, long population, long areainSqKm, long densityperSqKm) {
		super();
		StateName = stateName;
		this.population = population;
		this.areainSqKm = areainSqKm;
		this.densityperSqKm = densityperSqKm;
	}
	public String getStateName() {
		return StateName;
	}
	public void setStateName(String stateName) {
		StateName = stateName;
	}
	public long getPopulation() {
		return population;
	}
	public void setPopulation(long population) {
		this.population = population;
	}
	public long getAreainSqKm() {
		return areainSqKm;
	}
	public void setAreainSqKm(long areainSqKm) {
		this.areainSqKm = areainSqKm;
	}
	public long getDensityperSqKm() {
		return densityperSqKm;
	}
	public void setDensityperSqKm(long densityperSqKm) {
		this.densityperSqKm = densityperSqKm;
	}
	@Override
	public String toString() {
		return "CVSStateCensus [StateName=" + StateName + ", population=" + population + ", areainSqKm=" + areainSqKm
				+ ", densityperSqKm=" + densityperSqKm + "]";
	}
	
	
	
}
