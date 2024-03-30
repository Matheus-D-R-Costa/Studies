import { wage, bonus } from "./main.js";

function aliquot(percent) {
    const tax = (percent / 100) * wage
    return (wage + bonus) - tax
}

export function gets() {
    if (wage >= 0.00 && wage <= 1100.00) {
        return aliquot(5)
    } else if (wage > 1100.00 && wage <= 2500.00) {
        return aliquot(10);
    } else {
        return aliquot(15);
    }
}

export function print(text) {
    console.log(text)
}
