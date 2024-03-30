let 
comsumoCarroEstrada = 20.8;
precoCombustivel = 6.80;
distanciaEmKm = Math.round(Math.random() * 50);

function valorViagem (){
    return Math.round((distanciaEmKm * comsumoCarroEstrada) / precoCombustivel)
}
console.log('Sua viagem de '+ distanciaEmKm + 'Km ' + 'custara um total de: ' + valorViagem() + ' Reais')