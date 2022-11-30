<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>index</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css">

</head>
<body class="container">

<div class="display-1"> Add a New Course</div>
<hr/>

<div class="row">
    <div class="col-6">
        <div class="card">
            <div class="card-header">Add a New Course Here</div>
            <div class="card-body">
                <form:form action="/save" method="post" modelAttribute="courseform">
                    <div class="form-group">
                        <label class="form-control-label" >CourseID</label>
                        <form:input path="courseId" />
                        
                    </div>
                    <div class="form-group">
                        <label class="form-control-label" >CourseName</label>
                        <form:input path="courseName"/>
                    </div>
                    <div class="form-group">
                        <label class="form-control-label" >Fees</label>
                        <form:input path="fees"/>
                    </div>
                    <div class="form-group">
                        <label class="form-control-label" >Duration</label>
                        <form:input path="duration"/>
                    </div>
                    <hr/>
                    <button type="submit" class="btn btn-primary">Submit Course</button>
                </form:form>
            </div>
        </div>
    </div>
</body>
</html>