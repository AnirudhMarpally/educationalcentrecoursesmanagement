<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Update</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css">

</head>
<body class="container">

<div class="display-1">Update Courses details here</div>
<hr/>

<div class="row">
    <div class="col-6">
        <div class="card">
            <div class="card-header">Update Course</div>
            <div class="card-body">
                <form:form action="/update" method="post" modelAttribute="editform">
                  <div class="form-group">
                        <label class="form-control-label" >CourseID</label>
                        <form:input path="courseId" readonly="true" value="${editform.courseId }" />
                        
                    </div>
                    <div class="form-group">
                        <label class="form-control-label" >CourseName</label>
                        <form:input path="courseName" readonly="true" value="${editform.courseName }"/>
                    </div>
                    <div class="form-group">
                        <label class="form-control-label" >Fees</label>
                        <form:input path="fees" value="${editform.fees }"/>
                    </div>
                    <div class="form-group">
                        <label class="form-control-label" >Duration</label>
                        <form:input path="duration" value="${editform.duration }"/>
                    </div>
                    <hr/>
                
                  
                    
                    
                    <button type="submit" class="btn btn-primary">Submit Course</button>
                </form:form>
            </div>
        </div>
    </div>
</body>
</html>