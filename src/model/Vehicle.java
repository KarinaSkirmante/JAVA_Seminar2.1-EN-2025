package model;

public class Vehicle {
	//1. variables
	private int id;
	
	private String title;
	private String vehicleCode;
	private float price;
	private EnergyType eType;
	
	private static int counter = 0;
	//2.getters
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public String getVehicleCode() {
		return vehicleCode;
	}
	public float getPrice() {
		return price;
	}
	public EnergyType geteType() {
		return eType;
	}
	
	//3. setters
	
	public void setId()
	{
		id = counter++;
	}
	
	public void setTitle(String inputTitle) {
		if(inputTitle != null && inputTitle.matches("[A-Za-z ]{3,20}")) {
			title = inputTitle;
		}
		else
		{
			title = "No title";
		}
	}
	
	public void setVehicleCode() {
		vehicleCode = id + "_" + title;
	}
	
	
	public void setPrice(float inputPrice) {
		if(inputPrice > 0 && inputPrice < 100000) {
			price  = inputPrice;
		}
		else
		{
			price = 100;
		}
	}
	
	public void setEnergyType(EnergyType inputEnergyType) {
		if(inputEnergyType != null) {
			eType = inputEnergyType;
		}
		else
		{
			eType = EnergyType.not_specified;
		}
	}
	
	//4. no arg. constr.
	public Vehicle()
	{
		setId();
		setTitle("Test Vehicle");
		setPrice(100);
		setVehicleCode();
		setEnergyType(EnergyType.other);
	}
	//5. arg. constr.
	public Vehicle(String inputTitle, float inputPrice, EnergyType inputEnergyType ) {
		setId();
		setTitle(inputTitle);
		setPrice(inputPrice);
		setVehicleCode();
		setEnergyType(inputEnergyType);
	}
	//6. toString
	public String toString() {
		return id + ": " + title + ", " + price + " eur (" + vehicleCode + "), " + eType; 
	}

}
