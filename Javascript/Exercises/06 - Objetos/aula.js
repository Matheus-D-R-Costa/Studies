const matheus = {
    name: 'Matheus Da R Costa',
    age: 18,
    describeYourself: function () { // Uma função dentro de um objeto se chama método.
        console.log(`Meu nome é ${this.name} e minha idade é de ${this.age}`);
    }
};


matheus['name'] = 'Kylian Sthefane Di Naye';
matheus.height = 1.82;
matheus.height = 1.84;

matheus.describeYourself();

console.log(matheus.height)