let
nota1 = Math.round(Math.random() * 10);
nota2 = Math.round(Math.random() * 10);
nota3 = Math.round(Math.random() * 10);

function media () {
    return (nota1 + nota2 + nota3) / 3
}

if (media() < 5) {
    console.log('Sua média foi de: ' + media() + ' e você foi reprovado!')
} else if (media() >= 5 && media() <= 7) {
    console.log('Sua média foi de: ' + media() + ' e você esta em recuperação.')
} else {
    console.log('Sua média foi de: ' + media() + ' e você foi aprovado, parabéns :)')
}