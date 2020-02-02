package HistoWebsite;

import java.io.IOException;

import org.testng.annotations.Test;

public class TestCase extends HistoWebsiteCommon{
    
	
	@Test
	
	public void RunTestCase () throws InterruptedException, IOException {
		
		PatientPage PatObj = new PatientPage();
		
		PatObj.RunPatientDetails();
		
		DonorPage DonObj = new DonorPage();
		
		DonObj.closewebsite();
	
	
		
		

	}

}
