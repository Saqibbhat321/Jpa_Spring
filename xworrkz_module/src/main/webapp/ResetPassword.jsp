<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Reset Password</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
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
                            <a class="nav-link custom-radius gap-right" href="Login.jsp">Login</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="SignUp.jsp">Signup</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
         <div class="container">
        <h2 class="mt-5">Reset Password</h2>
        <c:if test="${not empty resetPwdMessage}">
            <div class="alert alert-success">${resetPwdMessage}</div>
        </c:if>
        <form action="resetPassword" method="post" class="mt-3">
            <div class="form-group">
                <label for="email">Email</label>
                <input type="email" class="form-control" id="email" name="email" placeholder="Enter email" required>
            </div>
            <div class="form-group">
                <label for="newPassword">New Password</label>
                <input type="password" class="form-control" id="newPassword" name="newPassword" placeholder="Enter new password" required>
            </div>
            <button type="submit" class="btn btn-primary">Reset Password</button>
        </form>
    </div>
</body>
</html>
