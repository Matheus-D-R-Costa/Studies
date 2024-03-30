function IMC (peso, altura,) {
    return peso / Math.pow(altura, 2)
}

let casa = {
    Andre: IMC(130.00, 1.79),
    Josiane: IMC(66.00, 1.62),
    Matheus: IMC(89.00, 1.82)
}

pessoasCasa = [casa.Andre, casa.Josiane, casa.Matheus]
valorIMC = pessoasCasa[0]

if (valorIMC < 18.5) {
    console.log('Você esta abaixo do peso')
} else if (valorIMC >= 18.5 && valorIMC < 25.0) {
    console.log('Seu peso esta normal')
} else if (valorIMC >= 25.0 && valorIMC < 30.0) {
    console.log('Você esta acima do peso')
} else if (valorIMC >= 30.0 && valorIMC < 40.0) {
    console.log('Obesidade severa')
} else {
    console.log('Obesidade mórbida')
}
