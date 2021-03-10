
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@page import="in.co.rays.proj0.dto.*" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ page isELIgnored="false"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

  <meta charset="utf-8">
  
  <meta name="viewport" content="width=device-width, initial-scale=1">
 
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
 
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
 
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  
 
  <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <script src="https://code.jquery.com//jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <script type="text/javascript" src="<c:url value="/resources/js/Checkbox11.js"></c:url>"></script>

</head>
<body>

 <nav class="navbar navbar-expand-xl  navbar-dark" style="background-color: rgba(227, 242, 253,0.8);height: 60px;">
  
  <a href="">
  <img src='<c:url value="/resources/img/logo.jpg"></c:url>' width="80px" height="30px">
  </a>
  
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
    <span class="navbar-toggler-icon"></span>
  </button>
  
  
   <div class="collapse navbar-collapse" id="collapsibleNavbar" style="font-size:14px">
    <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
    
    <li class="nav-item active">
    <a class="nav-link text-light " style="font-size: 20px;" href="<c:url value="/Welcome"></c:url>">
    <i class="fas fa-home" style="color: orange;"></i>
    </a>
    </li>
   
  	<c:if test="${not empty sessionScope.user}">
   
   <li class="nav-item text-nowrap">
      <a class="nav-link " href="<c:url value="/ctl/User/AddUser"/>" >
      <i class="fas fa-user" style="color: blue;"></i> 
      <span style="color:blue;"><s:message code="label.adduser" /></span>
      </a>
   </li>
   
   <li class="nav-item text-nowrap">
      <a class="nav-link " href="<c:url value="/ctl/Role/AddRole"/>" >
      <i class="fas fa-user-circle" style="color:blue;"></i> 
      <span style="color:blue;"><s:message code="label.addrole" /></span>
      </a>
   </li>
   
   <li class="nav-item text-nowrap">
      <a class="nav-link " href="<c:url value="/ctl/College/AddCollege"/>" >
      <i class="fas fa-university" style="color: blue;"></i> 
      <span style="color:blue;"><s:message code="label.addcollege" /></span>
      </a>
   </li>
   
   <li class="nav-item text-nowrap">
      <a class="nav-link " href="<c:url value="/ctl/Student/AddStudent"/>" >
      <i class="fas fa-user-graduate" style="color: blue;"></i> 
      <span style="color:blue;"><s:message code="label.addstudent" /></span>
      </a>
   </li>
   
   <li class="nav-item text-nowrap">
      <a class="nav-link " href="<c:url value="/ctl/Faculty/AddFaculty"/>" >
      <i class="fas fa-user-tie" style="color: blue;"></i> 
      <span style="color:blue;"><s:message code="label.addfaculty" /></span>
      </a>
   </li>
   
   <li class="nav-item text-nowrap">
      <a class="nav-link " href="<c:url value="/ctl/Course/AddCourse"/>" >
      <i class="fas fa-book" style="color: blue;"></i> 
      <span style="color:blue;"><s:message code="label.addcourse" /></span>
      </a>
   </li>
   
   <li class="nav-item text-nowrap">
      <a class="nav-link " href="<c:url value="/ctl/Subject/AddSubject"/>" >
      <i class="fas fa-copy" style="color: blue;"></i> 
      <span style="color:blue;"><s:message code="label.addsubject" /></span>
      </a>
   </li>
   
   <li class="nav-item text-nowrap">
      <a class="nav-link " href="<c:url value="/ctl/TimeTable/AddTimeTable"/>" >
      <i class="fas fa-server" style="color: blue;"></i> 
      <span style="color:blue;"><s:message code="label.addtimetable" /></span>
      </a>
   </li>

  <li class="nav-item dropdown text-nowrap">
     <a class="nav-link dropdown-toggle" data-toggle="dropdown" href=""
		role="button" aria-haspopup="true" aria-expanded="false"> 
	 <span><i class="fa fa-address-book" style="color:blue; font-size: 15px;"></i></span>
	 <span style="color:blue;"><s:message code="label.marksheet" /></span>
	 </a>

 <div class="dropdown-menu dropdown-menu-right" style="background-color: #cceeff;">
  <a class="dropdown-item" href="<c:url value="/ctl/Marksheet/AddMarksheet"/>">
  <i class="fa fa-arrow-circle-right" aria-hidden="true"></i> 
  <span style="color: #8A2BE2;"><s:message code="label.addmarksheet" /></span></a> 
  <a class="dropdown-item" href="<c:url value="/ctl/Marksheet/GetMarksheet"/>">
  <i class="fa fa-arrow-circle-right" aria-hidden="true"></i> 
  <span style="color: #8A2BE2;"><s:message code="label.getmarksheet" /></span></a> 
  <a class="dropdown-item" href="<c:url value="/ctl/Marksheet/MeritList"/>">
  <i class='fa fa-user-circle' style="color: #0f6810;"></i>
  <span style="color: #3fcc41;"> <span style="color: #8A2BE2;">
  <s:message code="label.marksheetmeritlist" /></span></span></a>
 </div>
 </li>
   
  </c:if>

				<li class="nav-item dropdown"></li>
			</ul>
			
			
			
		<div class="navbar nav-item dropdown  dropdown-menu-left">

			<a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" style="font-size: 15px;"
				role="button" aria-haspopup="true" aria-expanded="false"> 
		   <span><i class="fa fa-user-circle" style="color:;"></i></span>
		   <span style="color: blue;"> 
		           <c:if test="${not empty sessionScope.user}">
				   <c:set var="name" value="${sessionScope.user.firstName}" />
				   <c:set var="role" value='${sessionScope.user.roleName}' />
				   <c:out value="${name}(${role})"></c:out>
				   </c:if> <c:if test="${empty sessionScope.user}">
				   <s:message code="label.hiGuest"></s:message>
					</c:if>
			</span>
			</a>

			<div class="dropdown-menu dropdown-menu-right" 
			     style="font-size:16px;left:-10px;background-color: e6f7ff">
          
           <c:if test="${not empty sessionScope.user}">

		   <a class="dropdown-item" href="<c:url value="/ctl/User/MyProfileCtl" />">
		   <i class='fa fa-user-circle' style="color:;"></i>
		  <span style="color:orange"><span style="color:orange">
		   <s:message code="label.myprofile" /></span></span></a>

					
		   <a class="dropdown-item" href="<c:url value="/ctl/User/ChangePasswordCtl"/>">
		   <i class="fa fa-random" aria-hidden="true" style="color:;"></i>
           <span style="color:orange"><span style="color:orange">
           <s:message code="label.changepassword" /></span> </span>
           </a>

		  <a class="dropdown-item" target="blank" href="<c:url value="/resources/javadoc/index.html"/>">
		  <i class='fas fa-caret-square-right' style="color: ;"></i> 
		  <span style="color:orange"><span style="color:orange">
		  <s:message code="label.javadoc" /></span></span>
		  </a>
                           
                        
		  <a class="dropdown-item" href="<c:url value="/Login">
          <c:param name="signout" value="logout"></c:param>
          </c:url>">
          <i class='fas fa-caret-square-left' style="color:;"></i> 
          <span style="color:orange"><span style="color:orange">
          <s:message code="label.logout" /></span></span></a>

		  </c:if>

				<c:if test="${empty sessionScope.user}">

					<a class="dropdown-item" href="<c:url value="/Login"></c:url>"><i
						class="fa fa-arrow-circle-right" aria-hidden="true"></i> <span
						style="color: #3fcc41;"><s:message code="label.login" /></span></a>

					<a class="dropdown-item"
						href="<c:url value="/Registration"></c:url>"><i
						class="fa fa-arrow-circle-right" aria-hidden="true"></i> <span
						style="color: #3fcc41;"><s:message code="label.signup" /></span></a>

				</c:if>


			</div>

		</div>
			
		</div>


	</nav>
	<br>
&nbsp;<div class="btn-group" role="group" style="font-size: 10px;">
				<a class="btn btn-outline-primary" style="font-size: 10px;color: white;"
					href='<c:url value="?lang=en"></c:url>'><strong>English</strong></a>
				<a class="btn btn-outline-primary" style="font-size: 10px;color: white;"
					href='<c:url value="?lang=hi"></c:url>'><strong>हिन्दी</strong></a>
			</div>
			
   
 

</body>
</html>
