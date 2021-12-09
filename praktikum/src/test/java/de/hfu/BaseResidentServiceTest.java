package de.hfu;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.Test;

public class BaseResidentServiceTest {

	@Test
	public void test_filtered_Resident_List() {
		Resident resident1 = new Resident("Otto","Jean", "4 Straße...", "Furtwangen", new Date(2002,12,25));
		Resident resident2 = new Resident("Karl","Frank", "15 Straße...", "Freiburg", new Date(2015,6,10));
		Resident resident3 = new Resident("Frank","Sally", "30 Straße...", "Colmar", new Date(206,9,31));
		ResidentRepositoryStub stub1 = new ResidentRepositoryStub();
		stub1.neueResident(resident1);
		stub1.neueResident(resident2);
		stub1.neueResident(resident3);
		
		BaseResidentService service = new BaseResidentService();
		service.setResidentRepository(stub1);
		ArrayList<Resident> test_array1 = new ArrayList<Resident>();
		test_array1.add(resident1);
		for(int i = 0 ; i < test_array1.size(); i++) {
			assert(test_array1.get(i) == service.getFilteredResidentsList(resident1).get(i));
		}
		
		ArrayList<Resident> test_array2 = new ArrayList<Resident>();
		test_array2.add(resident2);
		for(int i = 0 ; i < test_array2.size(); i++) {
			assert(test_array2.get(i) == service.getFilteredResidentsList(resident2).get(i));
		}
		
		
		ResidentRepositoryStub stub2 = new ResidentRepositoryStub();
		stub2.neueResident(resident1);
		stub2.neueResident(resident1);
		stub2.neueResident(resident1);
		service.setResidentRepository(stub2);
		ArrayList<Resident> test_array3 = new ArrayList<Resident>();
		test_array3.add(resident1);
		test_array3.add(resident1);
		test_array3.add(resident1);
		for(int i = 0 ; i < test_array3.size(); i++) {
			assert(test_array3.get(i) == service.getFilteredResidentsList(resident1).get(i));
		}
		
		
	}
	
	
	@Test
	public void test_unique_resident() throws ResidentServiceException {
		Resident resident1 = new Resident("Otto","Jean", "4 Straße...", "Furtwangen", new Date(2002,12,25));
		Resident resident2 = new Resident("Karl","Frank", "15 Straße...", "Freiburg", new Date(2015,6,10));
		Resident resident3 = new Resident("Frank","Sally", "30 Straße...", "Colmar", new Date(206,9,31));
		ResidentRepositoryStub stub1 = new ResidentRepositoryStub();
		stub1.neueResident(resident1);
		stub1.neueResident(resident2);
		stub1.neueResident(resident3);
		
		BaseResidentService service = new BaseResidentService();
		service.setResidentRepository(stub1);
		assert(resident1 == service.getUniqueResident(resident1));
		assert(resident2 == service.getUniqueResident(resident2));
		assert(resident3 == service.getUniqueResident(resident3));
		
		
	}
}
