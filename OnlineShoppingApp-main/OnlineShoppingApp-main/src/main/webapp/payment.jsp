<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Proceed to Payment</title>
    <link rel="stylesheet" href="assets/css/payment.css">
</head>
<body>
    <div class="container">
        <h2>Proceed to Payment</h2>
        <form action="/payment" method="post">
            <div class="form-group">
                <label for="card_number">Card Number</label>
                <input type="text" id="card_number" name="card_number" placeholder="Enter Card Number" required>
            </div>
            <div class="form-group">
                <label for="expiry_date">Expiry Date</label>
                <input type="text" id="expiry_date" name="expiry_date" placeholder="MM/YY" required>
            </div>
            <div class="form-group">
                <label for="cvv">CVV</label>
                <input type="text" id="cvv" name="cvv" placeholder="CVV" required>
            </div>
            <div class="form-group">
                <label for="mobile_number">Mobile Number</label>
                <input type="text" id="mobile_number" name="mobile_number" placeholder="Enter Mobile Number" required>
            </div>
            <button type="submit">Pay Now</button>
        </form>
    </div>
</body>
</html>
