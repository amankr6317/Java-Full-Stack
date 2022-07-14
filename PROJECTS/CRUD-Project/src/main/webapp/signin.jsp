<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="ISO-8859-1">
    <title>SIGN IN</title>
    <link rel="stylesheet" href="css/indexstyle.css">
    <link rel="stylesheet" href="css/headerstyle.css">
    <link rel="stylesheet" href="css/all.css">
</head>

<body>
    <div class="employee-form">
        <div class="form-header">
            <h1>SIGN IN AS <span style="color: RED;">ADMIN</span> TO PERFORM CRUD OPERATIONS</h1>
        </div>
        <div class="employee-form-body">
            <form action="signin" method="post">
                <table>
                    <tr>
                        <td class="form-head-css">Email:</td>
                        <td><input type="email" name="email" class="form-input-css" required /></td>
                    </tr>
                    <tr>
                        <td class="form-head-css">Password:</td>
                        <td><input type="password" name="password" class="form-input-css" required /></td>
                    </tr>
                </table>
                <div class="form-footer">
                    <input type="submit" value="Sign In" class="form-button" />
                </div>
            </form>
        </div>
    </div>
</body>

</html>