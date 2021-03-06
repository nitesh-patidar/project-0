

package in.co.rays.proj0.Test;


import java.sql.Timestamp;
import java.util.Date;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import in.co.rays.proj0.dto.TimeTableDTO;
import in.co.rays.proj0.exception.DuplicateRecordException;
import in.co.rays.proj0.service.TimeTableServiceInt;

// TODO: Auto-generated Javadoc
/**
 * The Class TimeTableTest.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration("file:src/main/webapp/WEB-INF/Dispatcher-servlet.xml")
public class TimeTableTest {
	
	/** The service. */
	@Autowired
    TimeTableServiceInt service;
	
	/**
	 * Adds the.
	 */
	@Test
	public void add(){
		TimeTableDTO dto=new TimeTableDTO();
		dto.setCourseId(1);
		dto.setSubjectId(1);
		dto.setSemester("I");
		dto.setExamTime("9 am to 12 pm");
		dto.setExamDate(new Date());
		dto.setCreatedBy("root");
		dto.setModifiedBy("root");
		dto.setCreatedDateTime(new Timestamp(System.currentTimeMillis()));
		dto.setModifiedDateTime(dto.getCreatedDateTime());
		try {
			service.add(dto);
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
		TimeTableDTO dto=new TimeTableDTO();
		dto.setId(1);
		dto.setCourseId(1);
		dto.setSubjectId(1);
		dto.setSemester("I");
		dto.setExamTime("9 am to 12 pm");
		dto.setExamDate(new Date());
		dto.setCreatedBy("root");
		dto.setModifiedBy("root");
		dto.setCreatedDateTime(new Timestamp(System.currentTimeMillis()));
		dto.setModifiedDateTime(dto.getCreatedDateTime());
		
			try {
				service.update(dto);
				System.out.println("Update successs===========");
			} catch (DuplicateRecordException e) {
				System.out.println("Update "+e.getMessage());
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}
}
