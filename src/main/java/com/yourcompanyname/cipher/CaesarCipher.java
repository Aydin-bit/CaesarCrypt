package com.yourcompanyname.cipher;

class CaesarCipher {
    
    // This method encrypts the input with the corresponding shift value
    String encrypt(String input, int shift) {
        String cipher = "";
        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            int asciiValue = (int) letter;
            if ((asciiValue >= 65 && asciiValue <= 90) || (asciiValue >= 97 && asciiValue <= 122)) {
                int temp = asciiValue;
                asciiValue += shift;
                if (((temp >= 65 && temp <= 90) && asciiValue > 90) ||   // If the ascii-code of big cap letter exceeds the range of big caps
                    ((temp >= 97 && temp <= 122) && asciiValue > 122)) { // If the ascii-code of small cap letter exceeds the range of small caps
                    asciiValue -= 26;
                }
                letter = (char) asciiValue;
                cipher += letter;
            } 
            else {
                return "Error: You used a non alphabetic symbol!";
            }
        }
        return cipher;
    }

}