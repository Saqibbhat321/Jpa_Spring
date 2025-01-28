<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet">
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
                        <a class="nav-link" href="SignUp.jsp">Signup</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
    <div class="container center-form">
        <div class="form-container">
            <h2 class="text-center">Login</h2>
            <c:if test="${not empty error}"> <p style="color: red;">${error}</p> </c:if>
            <c:if test="${not empty msg}"> <p style ="color: red;">${msg}</p> </c:if>
            <c:if test="${not empty locked}"> <p style ="color: red;">${locked}</p> </c:if>
            <c:if test="${not empty changePwd}"> <p style ="color: green;">${changePwd}</p> </c:if>
            <form action="login" method="post">

                <div class="mb-3">
                    <label for="email" class="form-label">Email</label>
                    <input type="email" class="form-control" id="email" name="email" required>
                </div>
                <div class="mb-3">
                    <label for="password" class="form-label">Password</label>
                    <input type="password" class="form-control" id="password" name="password" required>
                </div>
                <input type="submit" class="btn btn-primary w-100" value="Login">
                <div class="mt-3">
                    <a href="ResetPassword.jsp">Forgot your password? Reset it here.</a>
                </div>
            </form>
        </div>
    </div>

    </script>
</body>
</html>
