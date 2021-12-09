package de.hfu;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ResidentRepositoryStub implements ResidentRepository{
	private  Resident resident1;
	private  Resident resident2;
	private  Resident resident3;
	
	public void neueResident(Resident resident) {
		if(resident1 ==null) {
			resident1 = resident;
		}
		else if(resident2 == null) {
			resident2 = resident;
		}
		else if(resident3 == null) {
			resident3 = resident;
		}
		
	}
	
	public List<Resident> getResidents() {
		List<Resident> list_Resident = new ArrayList<Resident>();
		list_Resident.add(resident1);
		list_Resident.add(resident2);
		list_Resident.add(resident3);
		return list_Resident;
	}

}
