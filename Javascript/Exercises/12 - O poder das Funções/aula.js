

function incrementarJuros(valor, porcentualJuros) {
    const valorDeAcrescimo = (porcentualJuros / 100) * valor;
    return valor + valorDeAcrescimo;
}

console.log(incrementarJuros(100, 20))
console.log(incrementarJuros(200, 20))
console.log(incrementarJuros(300, 20))