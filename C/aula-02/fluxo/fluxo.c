//
// Created by matheusdrc on 24/11/24.
//

#include <stdio.h>

int main() {

  int x = 10;
  x = x > 5 ? x + 1 : 0;
  printf("X = %d\n", x); // Corrigido para incluir \n

  int opt = 2;
  switch (opt) {
    case 1:
      printf("Opção 1 escolhida\n");
    break;
    case 2:
      printf("Opção 2 escolhida\n");
    break;
    default:
      printf("Opção inválida\n");
    break;
  }

  int counter = 0;
  while (counter < 3) {
    printf("While: counter = %d\n", counter);
    counter++;
  }

  counter = 0;
  do {
    printf("While: counter = %d\n", counter);
    counter++;
  } while (counter < 3);

  for (int i = 0; i < 3; i++) {
    printf("For: i = %d\n", i);
  }

  for (int i = 0; i < 5; i++) {
    if (i == 3) {
      printf("Break: i = %d, loop interrompido\n", i);
      break;
    }
  }

  for (int i = 0; i < 5; i++) {
    if (i == 2) {
      printf("Continue: ignorando i = %d\n", i);
      continue;
    }
    printf("Continue: i = %d\n", i);
  }

  int value = 0;
  goto label;
  value = 1; // nunca será executado...

  label:
    printf("Goto: saltou para label\n");

  return 0;
}

