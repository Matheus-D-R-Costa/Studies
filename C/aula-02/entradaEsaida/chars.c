//
// Created by matheusdrc on 24/11/24.
//


#include <stdio.h>

int main() {

  char letter = getchar();

  while (letter != EOF) {
    if (letter == ' ') {
      letter = '_';

      putchar(letter);

      letter = getchar();

    }
  }

  return 0;

}