package model;

public class Tractor extends Vehicle{
	// variables, getters, setters, both constructors, toString + other functions(if necessary)
	private String additionalTechniques;
	private boolean isOnlyLargeTires;
	public String getAdditionalTechniques() {
		return additionalTechniques;
	}
	public boolean isOnlyLargeTires() {
		return isOnlyLargeTires;
	}
	
	public void setAdditionalTechniques(String inputAdditionalTechniques) {
		if(inputAdditionalTechniques != null) {
			additionalTechniques = inputAdditionalTechniques;
		}
		else
		{
			additionalTechniques = "cultivator";
		}
	}
	
	public void setIsOnlyLargeTires(boolean inputIsOnlyLargeTires) {
		isOnlyLargeTires = inputIsOnlyLargeTires;
	}
	

}
