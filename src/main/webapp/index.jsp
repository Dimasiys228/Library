
<%--<!DOCTYPE html>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>Log in you account</title>--%>
<%--    <style>--%>
<%--        body {--%>
<%--            background-color: #1E90FF;--%>
<%--            display: flex;--%>
<%--            flex-direction: column;--%>
<%--            align-items: center;--%>
<%--            justify-content: center;--%>
<%--            height: 100vh;--%>
<%--            background-image: url("https://i.pinimg.com/originals/76/ca/56/76ca56253145cafbd3f3300cb6efe256.jpg");--%>
<%--            background-size: cover;--%>
<%--            font-family: Times,serif;--%>
<%--        }--%>
<%--        form {--%>
<%--            display: flex;--%>
<%--            flex-direction: column;--%>
<%--            align-items: center;--%>
<%--        }--%>

<%--        form label {--%>
<%--            margin-bottom: 10px;--%>
<%--        }--%>
<%--        form input {--%>
<%--            margin-bottom: 20px;--%>
<%--            padding: 5px;--%>
<%--            border-radius: 3px;--%>
<%--            border: 1px solid #ccc;--%>
<%--            width: 250px;--%>
<%--        }--%>
<%--        button {--%>
<%--            margin-top: 20px;--%>
<%--            background-color: #4CAF50;--%>
<%--            color: white;--%>
<%--            font-weight: bold;--%>
<%--            border: none;--%>
<%--            padding: 10px 20px;--%>
<%--            border-radius: 3px;--%>
<%--            cursor: pointer;--%>
<%--        }--%>

<%--    </style>--%>

<%--</head>--%>
<%--<body>--%>
<%--<h1>Log into you account</h1>--%>
<%--<form action="#" method="post">--%>
<%--    <label for="username" style="color: whitesmoke">Username :</label>--%>
<%--    <input type="text" id="username" name="username" required><br>--%>

<%--    <label for="email" style="color: whitesmoke">Email:</label>--%>
<%--    <input type="email" id="email" name="email"  required><br>--%>

<%--    <label for="password" style="color: whitesmoke">Password:</label>--%>
<%--    <input type="password" id="password" name="password" required><br>--%>

<%--    <label for="confirm_password" style="color: whitesmoke">Confirm password:</label>--%>
<%--    <input type="password" id="confirm_password" name="confirm_password" required><br>--%>

<%--</form>--%>
<%--<button onclick="location.href='#';">Log in</button>--%>
<%--</body>--%>
<%--</html>--%>
<!DOCTYPE html>
<html>
<head>
    <title>Main_page</title>
<%--    <a href="https://www.mysite.com">Главная страница</a>--%>
    <style>
        body {
            background-color: #f5f5f5;

            font-family: Arial, sans-serif;
            margin: 0;
        }

        header {
            background-color: #4CAF50;
            color: white;
            padding: 10px;
            text-align: center;
        }

        nav {
            background-color: #333;
            color: white;
            display: flex;
            justify-content: space-between;
            padding: 10px;
        }

        nav a {
            color: white;
            text-decoration: none;
            padding: 10px;
        }

        nav a:hover {
            background-color: white;
            color: #333;
            border-radius: 3px;
        }

        .container {
            display: flex;
            flex-wrap: wrap;
            justify-content: center;
            padding: 20px;
        }

        .book {
            background-color: white;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.2);
            margin: 10px;
            width: 200px;
            height: 300px;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: space-between;
            padding: 10px;
        }

        .book img {
            max-width: 100%;
            max-height: 200px;
            object-fit: contain;
        }

        .book h2 {
            font-size: 1.2rem;
            margin: 0;
            text-align: center;
        }

        .book p {
            margin: 0;
            text-align: center;
            font-size: 0.9rem;
        }
    </style>
</head>
<body>
<header>
    <h1>Welcome to our Library</h1>
</header>

<nav>
    <a href="#">Order</a>
    <a href="#">Category</a>
    <a href="#">Search</a>
    <a href="#">Personal account</a>
</nav>

<div class="container">
    <div class="book">
        <img src="https://vikiperm.com/frontend/web/uploads/may/file_196.jpg" alt="Book Cover">
        <h2>Harry Potter</h2>
        <p>Joan Rowling</p>
        <button>Get in shoplist</button>
    </div>

    <div class="book">
        <img src="https://i.pinimg.com/originals/52/88/06/528806a823871e79259a0037c1994841.jpg" alt="Book Cover">
        <h2>Three comrades</h2>
        <p>Remark</p>
        <button>Get in shoplist</button>
    </div>

    <!-- Добавьте здесь больше элементов div.book, чтобы отобразить больше книг -->
</div>
</body>
</html>



