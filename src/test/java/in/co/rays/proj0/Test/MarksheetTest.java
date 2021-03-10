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

import in.co.rays.proj0.dto.MarksheetDTO;
import in.co.rays.proj0.dto.StudentDTO;
import in.co.rays.proj0.exception.DuplicateRecordException;
import in.co.rays.proj0.service.MarksheetServiceInt;

// TODO: Auto-generated Javadoc
/**
 * The Class MarksheetTest.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration("file:src/main/webapp/WEB-INF/Dispatcher-servlet.xml")
public class MarksheetTest {
	
	/** The service. */
	@Autowired
    MarksheetServiceInt service;
	
	/**
	 * Adds the.
	 */
	@Ignore
  public void add(){
	MarksheetDTO dto=new MarksheetDTO();
	dto.setRollNo("CS02");
	dto.setStudentId(2l);
	dto.setPhysics("67");
	dto.setChemistry("78");
	dto.setMaths("88");
	dto.setCreatedBy("root");
	dto.setModifiedBy(dto.getCreatedBy());
	dto.setModifiedDateTime(new Timestamp(System.currentTimeMillis()));
	dto.setModifiedDateTime(dto.getCreatedDateTime());
	
	try {
		long pk=service.add(dto);
		System.out.println("Add======"+pk);
	} catch (DuplicateRecordException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
	
	/**
	 * Update.
	 */
	@Ignore
	public void  update() {
		
		MarksheetDTO dto=new MarksheetDTO();
		dto.setId(3);
		dto.setRollNo("CS02");
		dto.setStudentId(3l);
		dto.setPhysics("60");
		dto.setChemistry("70");
		dto.setMaths("80");
		dto.setCreatedBy("root");
		dto.setModifiedBy(dto.getCreatedBy());
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
	@Ignore
	public void  delete(){
		service.delete(4);
		System.out.println("Deleted SuccessFully");
		
	}
	
	/**
	 * Find by pk.
	 */
	@Ignore
	public void  findByPk(){
		MarksheetDTO dto=	service.findById(1);
	System.out.println("find by pk Success "+dto.getName());
	}
	
	/**
	 * Search pagination.
	 */
	@Ignore
	public void  searchPagination(){
		MarksheetDTO dto=new MarksheetDTO();
		//dto.setId(1);
		dto.setId(1l);
		//dto.setFirstName("raj");
		//dto.setLastName("Kumar");
		
	List<MarksheetDTO> list=	service.search(dto, 1, 10);
	System.out.println("Search pagination success "+list.size());
		
	}
	
	/**
	 * Search.
	 */
	@Test
	public void  search(){
		MarksheetDTO dto=new MarksheetDTO();
		
	List<MarksheetDTO> list=service.search(dto);
	System.out.println("Search  success "+list.size());
	}
	
}
