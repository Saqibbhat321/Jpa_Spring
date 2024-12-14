<%@page isELIgnored="false"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Page Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <style>
           body { font-family: Arial, sans-serif; }
           .navbar { display: flex;
           justify-content: space-between;
           align-items: center;
           background-color: #333;
            padding: 10px;
            }
            .navbar .brand img { width: 40px; height: auto; }
             .navbar .auth-links { display: flex; list-style: none; margin: 0; padding: 0; } .navbar .auth-links li { margin-left: 20px; } .navbar .auth-links a { color: white; text-decoration: none; padding: 5px 10px; transition: background-color 0.3s; } .navbar .auth-links a:hover { background-color: #575757;
            border-radius: 5px; }

        </style>
</head>
<body>
    <nav class="navbar">
        <div class="brand">
            <img src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png" alt="Brand Icon">
        </div>
        <ul class="auth-links">
            <li><a href="signup.jsp">Signup</a></li> <br>
            <li><a href="login.jsp">Login</a></li>
        </ul>
    </nav>

</body>
</html>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>
