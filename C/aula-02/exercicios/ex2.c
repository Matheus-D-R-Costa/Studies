//
// Created by matheusdrc on 24/11/24.
//

#include <stdio.h>

/*
Exercicio: Imprimir a seguinte sequência de números (00001 até 10000)
 */
int main() {

  for (int i = 1; i <= 10000; i++) {
    printf("%05d ", i);

    if (i % 8 == 0) {
      printf("\n");
    }
  }

  return 0;

}

