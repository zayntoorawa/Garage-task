package vehiclesMain;

import java.util.List;
import java.util.ArrayList;

public class Garage {
	
	public List<VehicleMain> vehicle = new ArrayList<>();
	
	public void addVehicle(Car vehicle) {
		this.vehicle.add(vehicle);
	}
	
	public void removeVehicle(VehicleMain vehicle) {
		this.vehicle.remove(vehicle);
		
	
		
	}
	
	
	
	}
	
