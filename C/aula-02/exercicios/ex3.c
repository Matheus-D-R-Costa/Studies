//
// Created by matheusdrc on 24/11/24.
//

#include <stdio.h>

/*
Ler um texto da entrada padrão e produzir o mesmo texto na saída padrão, mas com as letras convertidas em maiúsculas.
Sugestão: usar a função getchar() para ler caracteres da entrada (até encontrar um EOF), a função putchar() para
escrever caracteres na saída e uma estrutura switch (ou uma tabela) para converter os caracteres.
Sugestão: em C, caracteres são tratados como números inteiros; consulte uma tabela ASCII para ver seus valores respectivos.
 */
int main() {

  char ch;

  while((ch = getchar()) != EOF) {
    if (ch >= 'a' && ch <= 'z') {
      putchar(ch - 32);
    } else {
      putchar(ch);
    }
  }

  return 0;

}
