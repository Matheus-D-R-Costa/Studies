const numero = Math.round(Math.random() * 300)
edivisivelPor5 = numero % 5;

var resposta = ''

if (edivisivelPor5 === 0 || 5) {
    resposta = 'O número é inválido';
} else if (edivisivelPor5) {
    resposta = 'Sim!';

} else {
    resposta = 'Não!';
}

console.log(resposta)