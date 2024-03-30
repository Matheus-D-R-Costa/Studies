let 
comsumoCarroEstrada = 20.8;
precoEtanol = 3.65;
precoGasolina = 5.17
distanciaEmKm = Math.round(Math.random() * 50);

litrosConsumidos = distanciaEmKm / comsumoCarroEstrada;

tipoCombustivel = 'Etanol'

precoCombustivel = []

if (tipoCombustivel === 'Etanol') {
    precoCombustivel = precoEtanol; 
} else {
    precoCombustivel = precoGasolina;
}

function valorViagem (){
     return Math.round((distanciaEmKm * comsumoCarroEstrada) / precoCombustivel)
}
console.log('Sua viagem de '+ distanciaEmKm + 'Km feita em '+ tipoCombustivel + ' custara um total de: ' + valorViagem() + ' Reais')

