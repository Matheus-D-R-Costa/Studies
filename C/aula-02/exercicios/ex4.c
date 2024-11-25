//
// Created by matheusdrc on 24/11/24.
//

#include <stdio.h>
#include <math.h>

/*
Execicio: Escreva um programa que imprima as raízes quadradas e os logaritmos (base 10) de todos os números inteiros entre
1 e 1000. Os valores devem ser impressos com 4 casas decimais
 */
int main() {

    for (int i = 1; i <= 1000; i++) {
        printf("%d %.4f %.4f\n", i, sqrt(i), log10(i));
    }

    return 0;
}


