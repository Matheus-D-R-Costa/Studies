const { gets, print } = require('./auxFunctions');

grades = gets();

if (grades >= 0 && grades < 5) {
    print(`Você foi reprovado com uma média de ${grades}`)
} else if (grades >= 5 && grades < 7) {
    print(`Você esta de recuperação com uma média de ${grades}`)
} else if (grades >= 7 && grades <= 10) {
    print(`Você foi aprovado com uma média de ${grades}`)
} else {
    print('Número inválido')
}

