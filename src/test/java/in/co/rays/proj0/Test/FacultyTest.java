package in.co.rays.proj0.Test;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import in.co.rays.proj0.dto.FacultyDTO;
import in.co.rays.proj0.exception.DuplicateRecordException;
import in.co.rays.proj0.service.FacultyServiceInt;

// TODO: Auto-generated Javadoc
/**
 * The Class FacultyTest.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration("file:src/main/webapp/WEB-INF/Dispatcher-servlet.xml")
public class FacultyTest {
	
	/** The service. */
	@Autowired
	FacultyServiceInt service;
	
	/**
	 * Adds the.
	 *
	 * @throws ParseException the parse exception
	 */
	@Ignore
    public void add() throws ParseException{
	    FacultyDTO dto=new FacultyDTO();
		
		 dto.setCollegeId(1); 
		 dto.setSubjectId(1); 
		 dto.setCourseId(1);
		 dto.setFirstName("Ajay"); 
		 dto.setLastName("Sharma");
	     dto.setEmailId("Ajay@gmail.com"); 
	     dto.setGender("Male"); 
	     dto.setDob(new SimpleDateFormat("dd/MM/yyyy").parse("05/05/1990"));
		 dto.setMobileNo("9845376208"); 
		
		 dto.setCreatedBy("root"); dto.setModifiedBy("root");
		 dto.setCreatedDateTime(new Timestamp(System.currentTimeMillis()));
		 dto.setModifiedDateTime(dto.getCreatedDateTime()); try { service.add(dto); 
		 }
		 catch (DuplicateRecordException e) { 
			 // TODO Auto-generated catch block
		     e.printStackTrace(); 
		 }
		 
		 	
}
	
	/**
	 * Update.
	 *
	 * @throws ParseException the parse exception
	 */
	@Test
	public void update() throws ParseException{
		FacultyDTO dto=new FacultyDTO();
		dto.setId(3);
		dto.setCollegeId(2);
		dto.setSubjectId(2);
		dto.setCourseId(2);
		dto.setFirstName("Rahul");
		dto.setLastName("Meena");
		dto.setEmailId("Rahul@gmail.com");
		dto.setGender("Male");
		dto.setDob(new SimpleDateFormat("dd/MM/yyyy").parse("25/12/1980"));
	    dto.setMobileNo("8766586432"); 
	    
	    dto.setCreatedBy("root");
		dto.setModifiedBy("root");
		dto.setCreatedDateTime(new Timestamp(System.currentTimeMillis()));
		dto.setModifiedDateTime(dto.getCreatedDateTime());
try {
	service.update(dto);
} catch (DuplicateRecordException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}		
		
	}

/**
 * Find by pk.
 */
@Ignore
	public void findByPk(){
	FacultyDTO dto= service.findByPK(1);
System.out.println("find By Pk==="+dto.getId());
}	

/**
 * Find by email.
 */
@Ignore
public void findByEmail(){
	FacultyDTO dto= service.findByEmail("manish@gmail.com");
			System.out.println("find By email==="+dto.getId());
}

/**
 * Delete.
 */
@Ignore
public void delete(){
	service.delete(1);
	System.out.println("delete success");
}

}
