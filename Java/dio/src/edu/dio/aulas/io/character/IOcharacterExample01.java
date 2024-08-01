package edu.dio.aulas.io.character;

import java.io.*;

public class IOcharacterExample01 {

    public static void main(String[] args) {
        getKeyboardInputAndOutputSomething();
    }

    public static void getKeyboardInputAndOutputSomething() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            System.out.println("Enter something: ");
            String input = br.readLine();

            while (!input.isEmpty()) {
                bw.write(input);
                bw.newLine();
                input = br.readLine();
            }
            bw.flush();

            br.close();
            bw.close();

        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }

}
