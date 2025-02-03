package com.yourcompanyname.cipher;

import java.util.Scanner;

class Main {

    // Creating a Caesar Cipher for each letter of the alphabet
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CaesarCipher cipherer = new CaesarCipher();
        System.out.println("Please write down the message that shall be encypted!");
        String input = scanner.nextLine();
        scanner.close();
        for (int i = 1; i < 26; i++) {
            String currentCipher = cipherer.encrypt(input, i);
            System.out.println(currentCipher);
        }
    }

}