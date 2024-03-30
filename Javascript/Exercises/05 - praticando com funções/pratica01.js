function writeName (name) {
    return 'Meu nome é ' + name;
}

function isLegalAge (age) {
    if (age < 18) {
        console.log(writeName('Matheus Da Rosa Costa') + ' e sou Menor de idade');
    } else {
        console.log(writeName('Matheus Da Rosa Costa') + ' e sou Maior de idade');
    }
}

isLegalAge(17);