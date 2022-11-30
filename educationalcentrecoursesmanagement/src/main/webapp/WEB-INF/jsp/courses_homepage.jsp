<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Global Education Centre</title>
 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
    <a href="AddCourse" class="btn btn-sm btn-primary">AddCourse</a>
    <div align="center">
    

        <table class="table table-bordered table-stripped">
            <thead>
            <tr>
                <th>CourseId</th>
                <th>CourseName</th>
                <th>Fees</th>
                <th>Duration</th>
            </tr>
            </thead>
            <tbody>
                   
                     <c:forEach var="course" items="${courselist}"> 
                         <tr>
                             <td> ${course.courseId}</td>
                             <td> ${course.courseName}</td>
                             <td> ${course.fees}</td>
                             <td> ${course.duration}</td>
                              <td>
                                 <a href="remove-the-course?CourseId=${course.courseId}" >remove</a>
                                 |
                                 <a href="update-the-course?CourseId=${course.courseId}">Update</a>                                              
                          </td> 
                        
                         </tr>
                     </c:forEach>
                    </tbody>
        </table> 

    </div>
</body>
</html>