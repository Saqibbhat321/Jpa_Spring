<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Navbar with Icon</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        .navbar-custom {
            background-color: orange;
            border-bottom: 2px solid red;
        }
        .nav-link {
            color: blue;
        }
        .nav-link:hover {
            color: darkblue;
        }
        .card {
            background-color: orange;
            border: 1px solid #ddd;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }
        .card-title {
            font-size: 1.25rem;
            font-weight: bold;
            color: #ff5722;
        }
        .card-text {
            font-size: 1rem;
            color: #333;
        }
        .footer-custom {
         background-color: #f8f9fa;
         border-top: 2px solid #ddd;
         padding: 20px;
         text-align: center;
        }
        .footer-link {
         color: #007bff;
         text-decoration: none;
         }
         .footer-link:hover
         {
         text-decoration: underline;
         }
    </style>
</head>
<body>
    <!-- Navbar -->
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
                        <a class="nav-link" href="Login.jsp">Login</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="SignUp.jsp">Signup</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>


    <div class="container mt-5">
        <h1 class="text-center">Welcome to Xworks</h1>
        <p class="text-center">Explore our range of courses and embark on your learning journey with us!</p>

        <!-- Courses Section -->
        <div class="row mt-4">
            <div class="col-md-4">
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title">Java Development</h5>
                        <p class="card-text">Learn Java from scratch and become proficient in developing robust applications.</p>
                    </div>
                </div>
            </div>
            <div class="col-md-4">
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title">Data Analyst</h5>
                        <p class="card-text">Gain skills in data analysis, visualization, and handling big data to drive informed decisions.</p>
                    </div>
                </div>
            </div>
            <div class="col-md-4">
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title">AI & ML</h5>
                        <p class="card-text">Dive into the world of artificial intelligence and machine learning, and innovate with cutting-edge technologies.</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <footer class="footer-custom mt-5">
        <p>&copy; 2024 Xworkz. All rights reserved.</p>
        <p>Contact us: <a href="mailto:contact@xworkz.in" class="footer-link">contact@xworkz.in</a></p>
        <p>Phone: +91-123-456-7890</p>
    </footer>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
