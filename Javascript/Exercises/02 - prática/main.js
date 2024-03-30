const {gets, print} = require('./auxFunctions.js');

dinamicLength = gets();

let highestvalue = 0;

for (let i = 0; i < dinamicLength; i++) {
    const luckyNumber = gets();
    if (luckyNumber > highestvalue) {
        highestvalue = luckyNumber
    }
}

print(highestvalue)