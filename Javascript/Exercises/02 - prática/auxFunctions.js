const numbers = [2134, 2345, 23, 2346, 2344, 2222, 2401];
let i = 0;

function gets () {
    const value = numbers[i];
    i++;
    return value;
}

function print (text) {
    console.log(text);
}

module.exports = {gets, print};