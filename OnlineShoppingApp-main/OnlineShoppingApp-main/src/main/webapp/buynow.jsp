<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Buy Now</title>
    <link rel="stylesheet" href="assets/css/buynow.css">
</head>
<body>
    <header>
        <h1>Buy Now</h1>
    </header>
    <main>
        <section id="product-details">
            <h2>Product Details</h2>
            <p>Product Name: MOBILE</p>
            <p>Price: 25000</p>
        </section>
        <section id="payment-options">
            <h2>Payment Options</h2>
            <form action="/purchase" method="post">
                <fieldset>
                    <legend>Select Payment Method:</legend>
                    <label>
                        <input type="radio" name="payment_method" value="credit_card">
                        Credit Card
                    </label><br>
                    <label>
                        <input type="radio" name="payment_method" value="paypal">
                        PayPal
                    </label><br>
                    <label>
                        <input type="radio" name="payment_method" value="apple_pay">
                        Apple Pay
                    </label><br>
                    <label>
                        <input type="radio" name="payment_method" value="google_pay">
                        Google Pay
                    </label><br>
                </fieldset>
                <button type="submit">Proceed to Payment</button>
            </form>
        </section>
    </main>
    <footer>
        <p>&copy; 2024 Buy Now Page</p>
    </footer>
</body>
</html>
