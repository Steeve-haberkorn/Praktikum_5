package de.hfu;
import static org.hamcrest.MatcherAssert.assertThat ; 
import static org.hamcrest.Matchers.* ;
import static org.easymock.EasyMock.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.Test; 

public class BaseResidentServiceEasyMockTest {

	@Test
	public void test() throws ResidentServiceException {
		Resident resident1 = new Resident("Otto","Jean", "4 Straße...", "Furtwangen", new Date(2002,12,25));
		Resident resident2 = new Resident("Karl","Frank", "15 Straße...", "Freiburg", new Date(2015,6,10));
		Resident resident3 = new Resident("Frank","Sally", "30 Straße...", "Colmar", new Date(206,9,31));
		ArrayList<Resident> test_array1 = new ArrayList<Resident>();
		test_array1.add(resident1);
		BaseResidentService serviceMock = createMock(BaseResidentService.class);
		expect(serviceMock.getUniqueResident(resident1)).andReturn(resident1);
		expect(serviceMock.getFilteredResidentsList(resident1)).andReturn(test_array1);
		replay(serviceMock);
	}
	
}
