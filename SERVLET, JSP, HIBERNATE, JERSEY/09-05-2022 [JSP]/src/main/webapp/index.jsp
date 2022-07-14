<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="ISO-8859-1">
    <!-- <meta charset="UTF-8"> -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/style.css" type="text/css">
    <!-- <script src="/09-05-2022/src/main/webapp/js/index.js"></script> -->
    <!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script> -->
    <title>REGISTRATION PAGE</title>
</head>
<body>
    <form id="registrationForm" method="post" action="otherPage.jsp">
        <div class="registration-form">
            <div class="form-header">
                <span class="form-head-text">Create Account</span>
            </div>
            <div class="form-body">
                <div class="form-info-1">
                    <div class="form-input-header-css-1">
                        <div class="form-input-header-css-2">First name *</div>
                        <input type="text" class="form-input-css-1" id="firstName" name="firstName" placeholder="enter your first name" required>
                    </div>
                    <div class="form-input-header-css-1">
                        <div class="form-input-header-css-2">Last name *</div>
                        <input type="text" class="form-input-css-1" id="lastName" name="lastName" placeholder="enter your last name">
                    </div>
                </div>     
                <div class="form-info-2">
                    <div class="form-input-header-css-2">Email *</div>
                    <input type="email" class="form-input-css-2" id="emailId" placeholder="enter your email">
                </div>
                <div class="form-info-1 form-info-2">
                    <div class="form-input-header-css-1">
                        <div class="form-input-header-css-2">Password *</div>
                        <input type="password" class="form-input-css-1" id="password" placeholder="enter your password">
                    </div>
                    <div class="form-input-header-css-1">
                        <div class="form-input-header-css-2">Confirm Password *</div>
                        <input type="password" class="form-input-css-1" id="confirmPassword" placeholder="enter your password">
                    </div>
                </div>
                <div class="form-info-1 form-info-2">
                    <div class="form-input-header-css-1">
                        <div class="form-input-header-css-2">Gender *</div>
                        <input type="radio" value="Male" id="Male" name="gender" checked><label for="Male" style="font-size: 1.2em;">Male</label>
                        <input type="radio" value="Female" id="Female" name="gender"><label for="Female" style="font-size: 1.2em;">Female</label>
                    </div>
                    <div class="form-input-header-css-1">
                        <div class="form-input-header-css-2">Hobbies *</div>
                        <input type="checkbox" value="Music" name="hobbie"><label for="Music" style="font-size: 1.2em;">Music</label>
                        <input type="checkbox" value="Sports" name="hobbie"><label for="Sports" style="font-size: 1.2em;">Sports</label>
                        <input type="checkbox" value="Travel" name="hobbie"><label for="Travel" style="font-size: 1.2em;">Travel</label>
                        <input type="checkbox" value="Movies" name="hobbie"><label for="Movies" style="font-size: 1.2em;">Movies</label>
                    </div>
                </div>
                <div class="form-info-1 form-info-2">
                    <div class="form-input-header-css-1">
                        <div class="form-input-header-css-2">Source of Income *</div>
                        <select class="form-input-css-1" style="font-size: 1.2em;" id="sourceOfIncome">
                            <option value="employed">Employed</option>
                            <option value="self employee">Self Employed</option>
                            <option value="other">Other</option>
                        </select>
                    </div>
                    <div class="form-input-header-css-1">
                        <div class="form-input-header-css-2">Income *</div>
                        <div class="form-info-1 form-info-2">
                            <input type="range" class="form-input-css-3" id="income" value="10000" min="10000" max="100000" oninput="this.nextElementSibling.value = this.value" >
                            <output class="form-input-css-4">10000</output>
                        </div>
                    </div>
                </div>
                <div class="form-info-1 form-info-2">
                    <div class="form-input-header-css-1">
                        <div class="form-input-header-css-2">Upload Profile Picture *</div>
                        <input type="file" class="form-input-css-5" id="fileUpload">
                    </div>
                    <div class="form-input-header-css-1">
                        <div class="form-input-header-css-2">Age *</div>
                        <input type="number" class="form-input-css-1" id="age" min="18" max="150">
                    </div>
                </div>
                <div class="form-info-2">
                    <div class="form-input-header-css-2">Bio *</div>
                    <textarea class="form-input-css-2" id="bio" style="height: 8em;" rows="4" cols="50"></textarea>
                </div>
            </div>
            <div class="form-footer">
                <!-- <button type="submit" class="form-button" onclick="myfunction()" disabled="disabled" id="submitBtn">Submit</button> -->
                <button type="submit" class="form-button" onclick="myfunction()" id="submitBtn">Submit</button>
            </div>
        </div>
    </form>
</body>
</html>