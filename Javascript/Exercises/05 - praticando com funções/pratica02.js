function getDiscount (value, discount) {
    return (value - (value * (discount / 100)))
}

function getFees (value, fees) {
    return (value + (value * (fees / 100)))
}

const 
price = 100;
PaymentMethod = 4;

if (PaymentMethod === 1) {
    console.log(getDiscount(price, 10))
} else if (PaymentMethod === 2) {
    console.log(getDiscount(price, 15))
} else if (PaymentMethod === 3) {
    console.log(price)
} else {
    console.log(getFees(price, 10))
}

