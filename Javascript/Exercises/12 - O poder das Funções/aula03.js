function imc (peso, altura,) {
    return peso / Math.pow(altura, 2)
}

function imcClass (imc) {
    if (valorImc < 18.5) {
        return ('Você esta abaixo do peso')
    } else if (valorImc >= 18.5 && valorImc < 25.0) {
        return ('Seu peso esta normal')
    } else if (valorImc >= 25.0 && valorImc < 30.0) {
        return ('Você esta acima do peso')
    } else if (valorImc >= 30.0 && valorImc < 40.0) {
        return ('Obesidade severa')
    } else {
        return ('Obesidade mórbida')
    }    
}

//Main
(function () {
    let casa = {
        Andre: imc(130.00, 1.79),
        Josiane: imc(66.00, 1.62),
        Matheus: imc(89.00, 1.82)
    }
    pessoasCasa = [casa.Andre, casa.Josiane, casa.Matheus]
    valorImc = pessoasCasa[0]
    console.log(imcClass(imc))
})(); //funçaõ imediatamente invocada

