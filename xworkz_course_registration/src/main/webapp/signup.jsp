<%@page isELIgnored="false"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Page Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>

<br>
<br>

<br>

<br>

    <h3> ${hello}</h3>
    <div class="container mt-5">
        <form action="register" method="post">
            <div class="mt-3">
                <input type="text" class="form-control" name="name" placeholder="Enter name">
            </div>
            <div class="mt-3">
                <input type="text" class="form-control" name="age" placeholder="Enter age">
            </div>
            <div class="mt-3">
                <input type="text" class="form-control" name="phNo" placeholder="Enter phone number">
            </div>
            <div class="mt-3">
                <input type="text" class="form-control" name="email" placeholder="Enter email">
            </div>
            <div class="mt-3">
                <input type="password" class="form-control" name="password" placeholder="Enter password">
            </div>
            <div class="mt-3">
                <input type="password" class="form-control" name="confirmPassword" placeholder="Confirm your password">
            </div>
            <input type="submit" class="btn btn-primary mt-3" name="submit">
        </form>

    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>
