const { gets, print } = require('./auxFunctions');

let choosedNumbers = gets();

highestEvenNumber = 0;

while (choosedNumbers !== undefined) {
    if (choosedNumbers % 2 === 0) {
        if (choosedNumbers > highestEvenNumber) {
            highestEvenNumber = choosedNumbers
        }
    }
    choosedNumbers = gets()
}

print(`O maior número par sorteado é ${highestEvenNumber}`);