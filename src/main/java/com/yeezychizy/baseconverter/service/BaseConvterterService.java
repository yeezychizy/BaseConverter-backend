package com.yeezychizy.baseconverter.service;


import org.springframework.stereotype.Service;

@Service
public class BaseConvterterService {
    private int toDecimal(String number, int base) {
        int decimalValue = 0;
        int power = 0;

        // Iterate through the number from right to left
        for (int i = number.length() - 1; i >= 0; i--) {
            char digit = number.charAt(i);

            // Convert character digit to integer value  - https://en.wikipedia.org/wiki/List_of_Unicode_characters
            int digitValue = Character.isDigit(digit) ? (digit - '0') : (Character.toUpperCase(digit) - 'A' + 10);

            // Add the contribution of this digit to the decimal value
            decimalValue += (int) (digitValue * Math.pow(base, power));
            power++;
        }
        return decimalValue;
    }

    // Function to convert a decimal number to any base
    private String fromDecimal(int decimalValue, int base) {
        StringBuilder result = new StringBuilder();

        // Keep dividing the decimal value by the base and appending remainders to the result
        while (decimalValue > 0) {
            int remainder = decimalValue % base;

            // Convert remainder to character representation
            char digit = (remainder < 10) ? (char) ('0' + remainder) : (char) ('A' + remainder - 10);

            // Append digit to result
            result.insert(0, digit);

            // Update decimal value for the next iteration
            decimalValue /= base;
        }

        return result.toString();
    }

    // Function to convert a number from one base to another
    public String convertBase(String number, int inputBase, int outputBase) {
        // Check if the input base is Decimal
        if(inputBase == 10) {
            return fromDecimal(Integer.parseInt(number), outputBase);
        }
        // Convert to decimal first
        int decimalValue = toDecimal(number, inputBase);

        // Convert decimal value to the desired output base
        return fromDecimal(decimalValue, outputBase);
    }
}