class People {
    name;
    weight;
    height;

    constructor (name, weight, height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }
    
    classBmi () {
        const bmi = Math.round(this.weight / Math.pow(this.height, 2));
        if (bmi < 16.9) {
            return (`Seu IMC é de: ${bmi}. Você está muito abaixo do peso.`)
        } else if (bmi >= 17 && bmi < 18.5) {
            return (`Seu IMC é de: ${bmi}. Você está abaixo do peso.`)
        } else if (bmi >= 18.5 && bmi < 25) {
            return (`Seu IMC é de: ${bmi}. Você está com o peso normal.`)
        } else if (bmi >= 25 && bmi < 30) {
            return (`Seu IMC é de: ${bmi}. Você está com o peso acima da média.`)
        } else if (bmi >= 30 && bmi < 35) {
            return (`Seu IMC é de: ${bmi}. Você está com obesidade grau 1.`)
        } else if (bmi >= 35 && bmi <= 40) {
            return (`Seu IMC é de: ${bmi}. Você está com obesidade grau 2.`)
        } else if (bmi > 40) {
            return (`Seu IMC é de: ${bmi}. Você está com obesidade grau 3.`)
        } else {
            return ('Os dados inseridos estão incorretos, reveja.')
        }
    }
}

const 
jose = new People('José', 70, 1.75);
sthefane = new People('Sthefane', 89, 1.78);

console.log(jose.classBmi());
console.log(sthefane.classBmi());