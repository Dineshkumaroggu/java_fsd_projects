<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>

  <center> <h1> Admin Login </h1>  
    <form action="AdminControllerServlet" method="POST">  
        	<input type="hidden" name="command" value="LOGIN" />
            <label>Username : </label>   
            <input type="text" placeholder="Enter Username" name="username" required>  
                       <br/> <br/>
            <label>Password : </label> 
            <input type="password" placeholder="Enter Password" name="password" required>  
            <br/> <br/>
            <button type="submit">Login</button>   
            <br/>
    </form>     
    </center>  


</body>
</html>