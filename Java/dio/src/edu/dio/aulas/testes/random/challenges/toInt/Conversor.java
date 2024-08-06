package edu.dio.aulas.testes.random.challenges.toInt;

public class Conversor {

    public int stringToInt(String number) {
       if (number == null || number.isEmpty()) throw  new IllegalArgumentException("A string não pode ser nula ou vazia.");

       int result = 0;
       boolean isNegative = number.charAt(0) == '-';
       int startIndex = isNegative ? 1 : 0;

       for (int i = startIndex; i < number.length(); i++) {
           char c = number.charAt(i);

           if (c < '0' || c > '9') throw new IllegalArgumentException("A string contém caracteres inválidos.");

           int digitValue = c - '0';
           result = result * 10 + digitValue;
       }

       return isNegative ? -result : result;

    }
}
