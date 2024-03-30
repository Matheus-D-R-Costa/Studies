class people {
    name;
    age;
    job;
    height;
    weight;
    bank;
    wage;
    yearOfBirth;

    constructor (age) { //usado para deducção
        this.yearOfBirth = 2024 - age;
    }

    describeYourself () {
        console.log(`Meu nome é ${this.name} tenho ${this.age} anos, nasci em ${this.yearOfBirth}, sou um(a) ${this.job}, minha altura é de ${this.height}cm e peso ${this.weight}kg, sou afiliado(a) ao banco ${this.bank} e recebo ${this.wage} Reais.`)
    }
}

const
Kylian = new people(27); // ocorência de people
Kylian.name = 'Kylian Sthefane Di Naye';
Kylian.age = 27;
Kylian.job = 'Jardineiro';
Kylian.height = 1.87;
Kylian.weight = 80
Kylian.bank = 'Safra';
Kylian.wage = 12500;

Jake = new people(25); // ocorência de people
Jake.name = 'Talita Diomissa Goulart';
Jake.age = 25;
Jake.job = 'Empresária';
Jake.height = 1.61;
Jake.weight = 72;
Jake.bank = 'Nubank';
Jake.wage = 22300;

// Kylian.describeYourself();
// Jake.describeYourself();

function compareAge (person1, person2) {
    if (person1.age > person2.age) {
        console.log(`${person1.name} é mais velho que ${person2.name}.`);
    } else if (person1.age < person2.age) {
        console.log(`${person2.name} é mais velha que ${person1.name}.`);
    } else {
        console.log(`${person1.name} e ${person2.name} tem a mesma idade.`)
    }   
}

compareAge(Kylian, Jake);