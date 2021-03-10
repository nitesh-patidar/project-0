package in.co.rays.proj0.Test;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import in.co.rays.proj0.dto.StudentDTO;
import in.co.rays.proj0.exception.DuplicateRecordException;
import in.co.rays.proj0.service.StudentServiceInt;

// TODO: Auto-generated Javadoc
/**
 * The Class StudentTest.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration("file:src/main/webapp/WEB-INF/Dispatcher-servlet.xml")
public class StudentTest {
    
    /** The service. */
    @Autowired
	StudentServiceInt service;
	
    /**
     * Adds the.
     *
     * @throws ParseException the parse exception
     */
    @Ignore
  public void  add() throws ParseException{
	StudentDTO dto=new StudentDTO();
	dto.setFirstName("Piyush");
	dto.setLastName("Jaiswal");
	dto.setCollegeId(1l);
	dto.setGender("Male");
	dto.setMobileNo("7875999477");
	dto.setDob(new SimpleDateFormat("dd/MM/yyyy").parse("28/04/1990"));
	dto.setEmail("Piyush@gmail.com");
	dto.setCreatedBy("root");
	dto.setModifiedBy("root");
	dto.setCreatedDateTime(new Timestamp(System.currentTimeMillis()));
	dto.setModifiedDateTime(dto.getCreatedDateTime());
	try {
		long pk=service.add(dto);
		System.out.println("Add Success="+pk);
	} catch (DuplicateRecordException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

/**
 * Update.
 *
 * @throws ParseException the parse exception
 */
@Ignore
public void  update() throws ParseException{
	
	StudentDTO dto=new StudentDTO();
	dto.setFirstName("yesh");
	dto.setId(3);
	dto.setLastName("Kumar");
	dto.setCollegeId(1l);
	dto.setGender("Male");
	dto.setMobileNo("8635986535");
	dto.setDob(new SimpleDateFormat("dd/MM/yyyy").parse("12/05/1997"));
	dto.setEmail("yesh@gmail.com");
	dto.setCreatedBy("root");
	dto.setModifiedBy("root");
	dto.setCreatedDateTime(new Timestamp(System.currentTimeMillis()));
	dto.setModifiedDateTime(dto.getCreatedDateTime());
try {
	service.update(dto);
	System.out.println("Update Success");
} catch (DuplicateRecordException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

}

/**
 * Delete.
 */
@Test
public void  delete(){
	service.delete(4);
	System.out.println("Data Deleted SuccessFully");
}

/**
 * Find by pk.
 */
@Ignore
public void  findByPk(){
	StudentDTO dto=	service.findById(1);
System.out.println("find by pk Success "+dto.getFirstName());
}

/**
 * Find by email.
 */
@Ignore
public void  findByEmail(){
	
	StudentDTO dto=service.findByEmail("raj@gmail.com");
System.out.println("Find by Email Success "+dto.getFirstName());
}

/**
 * Search pagination.
 */
@Ignore
public void  searchPagination(){
	StudentDTO dto=new StudentDTO();
	//dto.setId(1);
	dto.setCollegeId(1l);
	//dto.setFirstName("raj");
	//dto.setLastName("Kumar");
	
List<StudentDTO> list=	service.search(dto, 1, 10);
System.out.println("Search pagination success "+list.size());
	
}

/**
 * Search.
 */
@Ignore
public void  search(){
	StudentDTO dto=new StudentDTO();
	
List<StudentDTO> list=	service.search(dto);
System.out.println("Search  success "+list.size());
}

}
