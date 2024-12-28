<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Centered Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <style>
        .center-form {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .form-container {
            border: 1px solid #ccc;
            border-radius: 5px;
            padding: 20px;
            background-color: #f9f9f9;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            max-width: 500px;
            width: 100%;
        }
        .navbar-custom {
            background-color: orange; /* Navbar background color */
            border-bottom: 2px solid red; /* Optional: Bottom border */
        }
        .nav-link {
            color: blue; /* Login and signup button color */
        }
        .nav-link:hover {
            color: darkblue; /* Darker blue on hover */
        }
        .form-container form {
            display: flex;
            flex-direction: column;
        }
        .form-container form .mb-3 {
            margin-bottom: 15px;
        }
        .form-container form .form-label {
            margin-bottom: 5px;
        }
        .form-container form .form-control {
            padding: 10px;
            font-size: 16px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        .form-container form .btn {
            padding: 10px 15px;
            background-color: #007bff;
            color: #fff;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            font-size: 16px;
        }
        .form-container form .btn:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <nav class="navbar navbar-expand-lg navbar-light navbar-custom">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">
                <img src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png" alt="Icon" width="30" height="30" class="d-inline-block align-top">
                Brand
            </a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav ms-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="index.jsp">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="Login.jsp">Login</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
    <div class="container center-form">
        <div class="form-container">
            <form action="submit" method="post">
            <c:forEach item="${error}" var ="display">
            <span style="color:red">${display.message}</span>
            </c:forEach>
                <div class="mb-3">
                    <label for="name" class="form-label">Name</label>
                    <input type="text" class="form-control" id="name" onChange="onName()" name="name" required>
                    <span id="displayName"></span>
                </div>
                <div class="mb-3">
                    <label for="email" class="form-label">Email</label>
                    <input type="email" class="form-control" id="email" onChange="onEmail()" name="email" required>
                    <span id="displayEmail"></span>
                </div>
                <div class="mb-3">
                    <label for="alterEmail" class="form-label">Alternate Email</label>
                    <input type="email" class="form-control" id="alterEmail" onChange="onAlterEmail()" name="alterEmail">
                    <span id="errorAlterEmail"></span>
                </div>
                <div class="mb-3">
                    <label for="phNo" class="form-label">Phone Number</label>
                    <input type="text" class="form-control" id="phNo" onChange="onPhoneChange()" name="phNo" required>
                    <span id="displayPhone"></span>
                </div>
                <div class="mb-3">
                    <label for="alterPhNo" class="form-label">Alternate Phone Number</label>
                    <input type="text" class="form-control" id="alterPhNo" onChange="onAlterPhoneNum()" name="alterPhNo">
                    <span id="displayAlterPhone"></span>
                </div>
                <div class="mb-3">
                    <label for="location" class="form-label">Location</label>
                    <input type="text" class="form-control" id="location" name="location" required>
                </div>
                <input type="submit" class="btn btn-primary" value="Submit">
            </form>
        </div>
    </div>
    <script>
        function onName() {
            console.log('this is onName');
            var name = document.getElementById('name');
            var nameValue = name.value;
            console.log(nameValue);

            var xhttp = new XMLHttpRequest();
            xhttp.open("GET", "http://localhost:8080/xworrkz_module/name/" + nameValue);
            xhttp.send();
            xhttp.onload = function(){
                console.log(this.responseText);
                document.getElementById("displayName").innerHTML = this.responseText;
            }
        }

        function onEmail() {
            console.log("email field entered");
            var emailValue = document.getElementById('email').value;
            var xhttp = new XMLHttpRequest();

            xhttp.open("GET", "http://localhost:8080/xworrkz_module/emailValue/" + emailValue);
            xhttp.send();
            xhttp.onload = function(){
                console.log(this.responseText);
                document.getElementById("displayEmail").innerHTML = this.responseText;
            }
        }

        function onAlterEmail() {
            var altEmail = document.getElementById('alterEmail').value;
            console.log(altEmail);
            var userEmail = document.getElementById("email").value;
            if(userEmail === altEmail) {
                document.getElementById("errorAlterEmail").innerHTML = "<span style ='color:red'>User email and alternate email should be different</span>";
            }
            var xhttp = new XMLHttpRequest();
            xhttp.open("GET", "http://localhost:8080/xworrkz_module/altEmail/" + altEmail);
            xhttp.send();
        }

        function onPhoneChange() {
            var phone = document.getElementById('phNo').value;
            var xhttp = new XMLHttpRequest();
            xhttp.open("GET", "http://localhost:8080/xworrkz_module/phone/" + phone);
            xhttp.send();
            xhttp.onload = function(){
                console.log(this.responseText);
                document.getElementById("displayPhone").innerHTML = this.responseText;
            }
        }

        function onAlterPhoneNum() {
            var altPhone = document.getElementById('alterPhNo').value;
            var userPhone = document.getElementById("phNo").value;
            if(userPhone === altPhone) {
                            document.getElementById("displayAlterPhone").innerHTML = "<span style ='color:red'>Phone Number and alternate Phone Number should not be same</span>";
            }
            var xhttp = new XMLHttpRequest();
            xhttp.open("GET", "http://localhost:8080/xworrkz_module/altPhone/" +altPhone);
            xhttp.send();
        }

    </script>
    <script src="https://code.jquery.com/jquery-3.5.1.min.js" integrity="sha384-ZvpUoO/+Pp5Ga9V3ul5mcsMEQfDfWWZRm8vjaJkPcU5gBXN4t2Ttvm6w6P5jeA=" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>
