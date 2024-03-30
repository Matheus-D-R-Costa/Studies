const { gets, print } = require('./auxFunctions');

let numbers = gets();

let filteredNumbers = Infinity

while (numbers !== undefined) { // para quando x condição se tornar true
    if (numbers % 2 !== 0) {
        if (numbers < filteredNumbers) {
            filteredNumbers = numbers
        }
    }
    numbers = gets();
}

print(`O menor número ímpar é ${filteredNumbers}`);