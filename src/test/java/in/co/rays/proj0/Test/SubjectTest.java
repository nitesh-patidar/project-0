package in.co.rays.proj0.Test;

import java.sql.Timestamp;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import in.co.rays.proj0.dto.SubjectDTO;
import in.co.rays.proj0.exception.DuplicateRecordException;
import in.co.rays.proj0.service.SubjectServiceInt;

// TODO: Auto-generated Javadoc
/**
 * The Class SubjectTest.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration("file:src/main/webapp/WEB-INF/Dispatcher-servlet.xml")
public class SubjectTest {
	
	/** The service. */
	@Autowired
	SubjectServiceInt service;

	/**
	 * Adds the.
	 */
	@Test
	public void add(){
		SubjectDTO dto=new SubjectDTO();
		dto.setName("Machine");
		dto.setCourseId(2);
		
		dto.setDescription("Machine Design and engineering");
		dto.setCreatedBy("root");
		dto.setModifiedBy(dto.getCreatedBy());
		dto.setCreatedDateTime(new Timestamp(System.currentTimeMillis()));
		dto.setModifiedDateTime(dto.getCreatedDateTime());
	try {
		long pk=service.add(dto);
		System.out.println("=========Subject Add Success====== "+pk);
	} catch (DuplicateRecordException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	/**
	 * Update.
	 */
	@Ignore
	public void update(){
		SubjectDTO dto=new SubjectDTO();
		dto.setName("cse");
		dto.setId(1);
		dto.setCourseId(1);
		
		dto.setDescription("computer science and engineering");
		dto.setCreatedBy("Root");
		dto.setModifiedBy(dto.getCreatedBy());
		dto.setCreatedDateTime(new Timestamp(System.currentTimeMillis()));
		dto.setModifiedDateTime(dto.getCreatedDateTime());
		try {
			service.update(dto);
			System.out.println("=======Subject Update Success=========");
		} catch (DuplicateRecordException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
/**
 * Delete.
 */
public void delete(){
	}
	
	/**
	 * Find by pk.
	 */
	@Ignore
	public void findByPk(){
		SubjectDTO dto=service.findById(1);
		System.out.println("=======Subject findByPk success===="+dto.getName() );
	}
	
	/**
	 * Find by name.
	 */
	@Ignore
	public void findByName(){
		SubjectDTO dto=service.findByName("cse");
		System.out.println("=======Subject findByName Success======"+dto.getId());
	}
	
	/**
	 * Search.
	 */
	@Ignore
	public void search(){
		SubjectDTO dto=new SubjectDTO();
		List<SubjectDTO> l=service.search(dto);
		System.out.println("==========Subject search success====="+l.size());
	}
	
	/**
	 * Search page.
	 */
	@Ignore
	public void searchPage(){
		SubjectDTO dto=new SubjectDTO();
		//dto.setId(1);
	dto.setCourseId(1);
		//dto.setName("cse");
		List<SubjectDTO> l=service.search(dto,1,10);
		
	System.out.println("==========Subject searchPagination success====="+l.size());
	}
}
