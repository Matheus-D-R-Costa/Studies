//
// Created by matheusdrc on 24/11/24.
//

#include <stdio.h>
#include <math.h>

/*
Exercicio: Ler um inteiro N e uma sequência de N inteiros, gerando na saída o valor de N, os valores máximo e mínimo
observados (inteiros), a média (real) e o desvio padrão (real) dos N valores lidos.
 */
int main() {

    int unsigned N;
    printf("Digite um numero: ");
    scanf("%d", &N);

    if (N <= 0) {
        printf("n deve ser maior que 0\n");
    }

    int values[N];
    int sum = 0, min, max;
    double sum_of_squares = 0.0;

    printf("Digite os %d valores:\n", N);
    for (int i = 0; i < N; i++) {
        scanf("%d", &values[i]);
        sum += values[i];

        if (i == 0) {
            max = min = values[i];
        } else {
            if (values[i] > max) max = values[i];
            if (values[i] < min) min = values[i];
        }
    }

    const double avg = (double) sum / N;

    for (int i = 0; i < N; i++) {
        sum_of_squares += pow(values[i] - avg, 2);
    }

    const double standard_deviation = sqrt(sum_of_squares / N);

    printf("N = %d\n", N);
    printf("Máximo = %d\n", max);
    printf("Mínimo = %d\n", min);
    printf("Media = %.2lf\n", avg);
    printf("Desvio Padrão = %.2lf\n", standard_deviation);

    return 0;

}
