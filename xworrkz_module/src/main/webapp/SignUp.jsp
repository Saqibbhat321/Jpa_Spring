<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Centered Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
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
        }
    </style>
</head>
<body>
    <div class="container center-form">
        <div class="form-container">
            <form action="submit" method="post">
                <div class="mb-3">
                    <label for="name" class="form-label">Name</label>
                    <input type="text" class="form-control" id="name" onChange="onName()" name="name" required>
                    <span id="displayName"></span>

                </div>
                <div class="mb-3">
                    <label for="email" class="form-label">Email</label>
                    <input type="email" class="form-control" id="email"  onChange="onEmail()" name="email" required>
                    <span id="displayEmail"></span>
                </div>
                <div class="mb-3">
                    <label for="alterEmail" class="form-label">Alternate Email</label>
                    <input type="email" class="form-control" id="alterEmail" onChange="onAlterEmail()" name="alterEmail">
                   <span id="displayAlterEmail"></span>

                </div>
                <div class="mb-3">
                    <label for="phNo" class="form-label">Phone Number</label>
                    <input type="text" class="form-control" id="phNo" onChange="onPhoneNum()" name="phNo" required>
                                        <span id="displayPhone"></span>

                </div>
                <div class="mb-3">
                    <label for="alterPhNo" class="form-label">Alternate Phone Number</label>
                    <input type="text" class="form-control" id="alterPhNo" onChange="onAlterPhoneNum()" name="alterPhNo">
                                        <span id="displayAlterPhone"></span>

                </div>
                <div class="mb-3">
                    <label for="location" class="form-label">Location</label>
                    <input type="text" class="form-control" id="location"  onChange="onLocation()" name="location" required>
                </div>
                <input type="submit" class="btn btn-primary" value="submit">
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
                          console.log(this.responseText)
                          document.getElementById("displayName").innerHTML = this.responseText;
                          }
        }


        function onEmail()
        {
            console.log("email field entered");
            var emailValue =document.getElementById('email').value;
            var xhttp = new XMLHttpRequest();

            xhttp.open("GET","http://localhost:8080/xworrkz_module/emailValue/"+emailValue)
            xhttp.send();
            xhttp.onload = function(){
                            console.log(this.responseText)
                            document.getElementById("displayEmail").innerHTML = this.responseText;
           }
        }
                function onAltEmailChange() {
                    var altEmail = document.getElementById('alterEmail').value;
                    var xhttp = new XMLHttpRequest();
                    xhttp.open("GET", "http://localhost:8080/xworrkz_module/altEmail/" + altEmail, true);
                    xhttp.send();
                    xhttp.onload = function(){
                                                console.log(this.responseText)
                                                document.getElementById("displayAlterEmail").innerHTML = this.responseText;
                                                }
                }

                function onPhoneChange() {
                    var phone = document.getElementById('phone').value;
                    var xhttp = new XMLHttpRequest();
                    xhttp.open("GET", "http://localhost:8080/xworrkz_module/phone/" + phone, true);
                    xhttp.send();
                    xhttp.onload = function(){
                                                console.log(this.responseText)
                                                document.getElementById("displayPhone").innerHTML = this.responseText;
                                                }
                }

                function onAltPhoneChange() {
                    var altPhone = document.getElementById('altPhone').value;
                    var xhttp = new XMLHttpRequest();
                    xhttp.open("GET", "http://localhost:8080/xworrkz_module/altPhone/" + altPhone, true);
                    xhttp.send();
                    xhttp.onload = function(){
                                                console.log(this.responseText)
                                                document.getElementById("displayAlterPhone").innerHTML = this.responseText;
                                                }
                }

     </script>
</body>
</html>
