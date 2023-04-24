<!DOCTYPE html>
<html>
<head>
    <title>Library</title>
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


</div>
</body>
</html>
