<%@page isELIgnored="false"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Email and Password Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

</head>
<body>

<br>
<br>
<br>
<h3> ${nam}</h3>
    <div class="container mt-5">
        <h2>Email and Password Form</h2>
        <form action="search" method="post">
            <div class="mb-3">
                <label for="email" class="form-label">Email address</label>
                <input type="email" class="form-control" id="email" name="email" placeholder="Enter your email" required>
            </div>
            <div class="mb-3">
                <label for="password" class="form-label">Password</label>
                <input type="password" class="form-control" id="password" name="password" placeholder="Enter your password" required>
            </div>
            <input type="submit" class="btn btn-primary" value="search"/>
        </form>
    </div>
</body>
</html>
