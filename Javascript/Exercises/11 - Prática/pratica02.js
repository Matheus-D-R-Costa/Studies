
function isPar (YourchooseNumbers) {
    for (let i = 0; i < YourchooseNumbers.length; i++) {
        const number = YourchooseNumbers[i];
        if (number % 2 === 0) {
            console.log(`O número ${YourchooseNumbers[i]} é par`)
        } else {
            console.log(`O número ${YourchooseNumbers[i]} é ímpar`)
        }
    }
}

console.log(isPar([1234124, 12341243, 2345]))
