<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@page import="ToDo.Bean.Task" %>
<!DOCTYPE html>
<html lang="en">

<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Update Task Page</title>
<style>
#forms {
background-color: #000000;
margin-left: 350px;
border: 50px;
padding: 50px;
width: 500px;
font-family: sans-serif;
font-size: 30px;
color: #ffffff;


}
#button0 {
background-color: #ffffff;

font-size: 38px;
}
#button {
font-size: 20px;
background-color: #ffffff;
font-family: 'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS', sans-serif;

}
#button1 {
font-size: 20px;
font-family: 'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS', sans-serif;

}

body {
background-image: url("https://www.elsetge.cat/myimg/f/51-515550_keyboard-memo-message-office-paper-reminder-sticky-sticky.jpg");
height: 120%;
margin-bottom: 250px;


background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
 
}

</style>


<%Task t=(Task)request.getAttribute("UpdateTask"); %>
<body>
<br>
<br>
<div style="font-size:60px">

</div>
<br>

<br>
<div id="button0"  align="center">

</div>
<br>
<div>
<br>
<br>
<div id="forms" >
<form action="UpdateTaskValues" method="get">
<caption>Update Task </caption>
<br>
<hr>

Task Name:<br>
 <input type="text" name="TaskName"   value="<%=session.getAttribute("name")%>" readonly>
<br>
<br>
Reminder Date:<br>
<input type="date" name="reminder date"    id="button1" value="<%=t.getDate()%>" required>
<br>
<br>
Reminder Time:<br>
<input type="time" name="reminder time"    id="button1" value="<%=t.getTime()%>" required>
<br>
<br>
<br>
<input type="submit" value="Update Reminder" id="button" >
                        <input type="reset" value="Cancel " id="button">
 </form>
</div>  
</body>
</html>

