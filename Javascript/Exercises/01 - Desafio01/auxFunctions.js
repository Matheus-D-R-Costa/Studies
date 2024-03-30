const randomGrade = [6];
let i = 0;

function gets() {
    const grades = randomGrade[i]
    i++;
    return grades;
}

function print(text) {
    console.log(text);
}

module.exports = { gets, print };