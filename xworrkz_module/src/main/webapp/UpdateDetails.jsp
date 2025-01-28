<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Centered Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
              <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
    <style>
    .center-form {
                  display: flex;
                  align-items: center;
                  min-height: 100vh;
                  padding: 20px;
                  justify-content: center;
               /* align-items: center;  align item in center of screen horizontally */

            }
    .form-container {
            border: 1px solid #ccc;
            border-radius: 5px;
            padding: 20px;
            background-color: #f9f9f9;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            max-width: 50%;
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
           color: darkblue;
    }
    #heading{
    display: flex;
    color: seagreen;
    justify-content: center;
    align-items: center;
    }

    .input-group-text {
                background-color: transparent;
                border: none;
            }
            .form-control {
                border-left: none;
            }

    </style>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light navbar-custom">
        <div class="container-fluid">
            <a class="navbar-brand" href="index.jsp">
                <img src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png" alt="Icon" width="30" height="30" class="d-inline-block align-top">

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
                        <a class="nav-link" href="SignUp.jsp">Signup</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>

<div class="container center-form">
        <div class="form-container">
    <form action="updateDetails" method="post">
        <c:if test="${not empty detailUpdateMsg}">
            <div class="alert alert-success"> ${detailUpdateMsg}</div>
        </c:if>
        <div id="heading">
                <h1 >Update Details</h1>
        </div>
        <div class="mb-3">
            <label for="name">Name</label>
        <div class="input-group">
        <div class = "input-group-prepend" style="background-color: #f0f0f0;">
            <span class = "input-group-text"><i class="fas fa-user"></i></span>
        </div>
            <input type="text" class="form-control" id="name" name="name" placeholder="Enter name" required>
        </div>
        </div>
        <div class="mb-3">
            <label for="email" class="form-label">Email</label>
            <div class="input-group">
            <div class = "input-group-prepend" style="background-color: #f0f0f0;">
                <span class = "input-group-text"><i class="fas fa-envelope"></i></span>
               </div>
            <input type="text" class="form-control" name="email" required>
        </div>
        </div>
        <div class="mb-3">
            <label for="alterEmail" class="form-label">Alternate Email</label>
            <div class = "input-group">
            <div class="input-group-prepend" style="background-color: #f0f0f0;">
                            <span class="input-group-text"><i class="fas fa-envelope"></i></span>
                        </div>
            <input type="text" class="form-control" name="alterEmail" required>
        </div>
        </div>
        <div class="mb-3">
           <label for="phNo" class="form-label">Phone Number</label>
        <div class = "input-group">
         <div class="input-group-prepend">
            <span class="input-group-text"><i class="fas fa-phone"></i></span>
            </div>
                    <input type="text" class="form-control" name="phNo" required>
        </div>
        </div>
        <div class="mb-3">
                    <label for="alterPhNo" class="form-label">Alternate Phone Number</label>
                    <div class = "input-group">
                                <div class="input-group-prepend" style="background-color: #f0f0f0;">
                                                <span class="input-group-text"><i class="fas fa-envelope"></i></span>
                                            </div>
                    <input type="text" class="form-control" name="alterPhNo" required>
        </div>
        </div>
        <div class="mb-3">
                    <label for="location" class="form-label">Location</label>
                    <div class = "input-group">
                                <div class="input-group-prepend" style="background-color: #f0f0f0;">
                                                <span class="input-group-text"><i class="fas fa-map-marker-alt"></i></span>
                                            </div>
                    <input type="text" class="form-control" name="location" required>
        </div>
        <div class = "mb-3">
            <input type = "submit" value="Update Details" class= "btn btn-primary">
        </div>


    </form>
</div>
</div>
</body>


</script>
<script src="https://code.jquery.com/jquery-3.5.1.min.js"
        integrity="sha384-ZvpUoO/+Pp5Ga9V3ul5mcsMEQfDfWWZRm8vjaJkPcU5gBXN4t2Ttvm6w6P5jeA="
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdsl[_{{{CITATION{{{_1{](https://github.com/litposthinker/Tugas-aydin/tree/d488355075682b7260e2bc77502204a9221c1596/portofolio-gue%2Fdetail.php)[_{{{CITATION{{{_2{](https://github.com/Agilbay04/VLMS-JTI/tree/ac9dee3ecf421da62ff9cf5b76dee9de633b83de/bootstrap-4.6.0%2Fsite%2Fcontent%2Fdocs%2F4.6%2Fcomponents%2Fnavbar.md)[_{{{CITATION{{{_3{](https://github.com/gagas3113/uts_1402019041/tree/95f760ab6348f7119af08858f43580ca1bf172f1/uts_1402019041%2Findex.php)[_{{{CITATION{{{_4{](https://github.com/Pengkuh/rental-mobil/tree/1a5867a55871ff84a0d56dec98d7a42168f12d3c/carecar%2Forder%2Forder.php)[_{{{CITATION{{{_5{](https://github.com/aryxs3m/certgen/tree/bcc31b3ecdccfd7c065954c38dd45b65d96d16f9/resources%2Fviews%2Fwelcome.blade.php)[_{{{CITATION{{{_6{](https://github.com/lazaaq/k3rs/tree/3e2b0f446ef0bda0efdfe9ec962cb0d8a34e3aaf/resources%2Fviews%2Fdashboard%2Fapar%2Fcreate.blade.php)