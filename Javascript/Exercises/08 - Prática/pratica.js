class car {
    name;
    brand;
    color;
    fuelPrice;
    kmTorun;
    averageConsumptionPerKm;
    valueInReal;
    constructor (kmTorun, averageConsumptionPerKm, fuelPrice) { //fiz o uso errado
        this.valueInReal = Math.round((kmTorun * averageConsumptionPerKm) / fuelPrice)
    }

    averageExpensePErKmDriven () {
        console.log(`O seu ${this.name} ${this.color} da marca ${this.brand} comsumirá um total de ${this.valueInReal} Reais em um percurso de ${this.kmTorun}km.`)
    }
}

const 
civic = new car(300, 12.8, 5.17);
civic.kmTorun = 300;
civic.name = 'Civic';
civic.brand = 'Honda';
civic.color = 'Prata';

civic.averageExpensePErKmDriven()
