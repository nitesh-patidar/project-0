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

import in.co.rays.proj0.dto.RoleDTO;
import in.co.rays.proj0.dto.UserDTO;
import in.co.rays.proj0.exception.DuplicateRecordException;
import in.co.rays.proj0.service.RoleServiceInt;
import in.co.rays.proj0.service.UserServiceInt;

// TODO: Auto-generated Javadoc
/**
 * The Class UserTest.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration("file:src/main/webapp/WEB-INF/Dispatcher-servlet.xml")
public class UserTest {
	
	/** The role service. */
	@Autowired
	RoleServiceInt roleService;
	
	/** The user service. */
	@Autowired
	UserServiceInt userService;
	
	/**
	 * Adds the.
	 *
	 * @throws ParseException the parse exception
	 */
	@Ignore
	public void add() throws ParseException{
		UserDTO dto=new UserDTO();
		dto.setFirstName("Sourabh");
		dto.setLastName("Gupta");
		dto.setEmailId("Sourabh@gmail.com");
		dto.setGender("Male");
		dto.setDob(new SimpleDateFormat("dd/MM/yyyy").parse("10/01/1992"));
		dto.setPassword("Abc123@");
		dto.setConfirmPassword("Abc123@");
		dto.setCreatedBy("Sourabh@gmail.com");
		dto.setMobileNo("6574839670");
		dto.setModifiedBy("Sourabh@gmail.com");
		dto.setCreatedDateTime(new Timestamp(System.currentTimeMillis()));
		dto.setModifiedDateTime(dto.getModifiedDateTime());
		dto.setRoleId(1);
	/*	
		RoleDTO rdto=roleService.findById(dto.getRoleId());
		dto.setRoleName(rdto.getName());*/
		try {
		long pk=userService.add(dto);
		System.out.println("User Add Sucess ID="+pk);
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
	@Test
	public void update() throws ParseException{
		UserDTO dto=new UserDTO();
	dto.setId(3);
		dto.setFirstName("Ankit");
		dto.setLastName("Pandey");
		dto.setEmailId("Ankit@gmail.com");
		dto.setGender("Male");
		dto.setDob(new SimpleDateFormat("dd/MM/yyyy").parse("05/05/1995"));
		dto.setPassword("cs12345");
		dto.setConfirmPassword("cs12345");
		dto.setCreatedBy("root");
		dto.setMobileNo("8435725286");
		dto.setModifiedBy("root");
		dto.setCreatedDateTime(new Timestamp(System.currentTimeMillis()));
		dto.setModifiedDateTime(dto.getModifiedDateTime());
		dto.setRoleId(1);
		
		RoleDTO rdto=roleService.findById(dto.getRoleId());
		dto.setRoleName(rdto.getName());
		try {
			userService.update(dto);
		
			System.out.println("User Update Success");
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
UserDTO dto=userService.findByPK(1);
System.out.println("User FindBy Pk Success="+dto.getFirstName());
}

/**
 * Find by email.
 */
@Ignore
public void findByEmail(){
	UserDTO dto=userService.findByLogin("mdnkhan007@gmail.com");
	
	System.out.println("User Find by Login Success="+dto.getFirstName());
}

/**
 * Search.
 */
@Ignore
public void search(){
	UserDTO dto=new UserDTO();
List l=userService.search(dto);	
System.out.println("User Search Success="+l.size());
}

/**
 * Search pagination.
 */
@Ignore
public void searchPagination(){
	UserDTO dto=new UserDTO();
	//dto.setId(1);
	//dto.setFirstName("n");
	//dto.setLastName("k");
List l=userService.search(dto,1,10);	
System.out.println("User Search Paginaion Success="+l.size());
}

/**
 * Delete.
 */
@Test
public void delete(){
	userService.delete(4);
	System.out.println("User Delete success");
}
}
