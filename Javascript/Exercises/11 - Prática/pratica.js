class MultplicationTable {
    number;

    constructor (chooseNumber) {
        this.number = chooseNumber;    
    }
    multiplicate () {
        for (let i = 1; i <= 10; i++) {
            console.log(i * this.number);     
        }
    }
}

const six = new MultplicationTable(6);
console.log(six.multiplicate());