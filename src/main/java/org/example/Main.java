package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println("*************");
    }

    public static boolean isPalindrome(int number) {
        String numberStr = String.valueOf(Math.abs(number));
        int length = numberStr.length();


        for (int i = 0; i < length / 2; i++) {
            if (numberStr.charAt(i) != numberStr.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
    public static boolean isPerfectNumber(int number) {
        if (number<0) return false;
        int total = 0;
        for (int i=1; i<(number/2)+1; i++) {
            if(number%i == 0) total+= i;
        }
        if (total == number) return true;
        else return false;
        }
        public static String numberToWords(int number) {
        if (number<0) return "Invalid Value";

        StringBuilder stringBuilder = new StringBuilder();

        char[] digits = String.valueOf(number).toCharArray();
        String text = "";

        for(char digit: digits) {
            switch(digit) {
                case '0':
                    text += "Zero ";
                    break;
                case '1':
                    text += "One ";
                    break;
                case '2':
                    text += "Two ";
                    break;
                case '3':
                    text += "Three ";
                    break;
                case '4':
                    text += "Four ";
                    break;
                case '5':
                    text += "Five ";
                    break;
                case '6':
                    text += "Six ";
                    break;
                case '7':
                    text += "Seven ";
                    break;
                case '8':
                    text += "Eight ";
                    break;
                case '9':
                    text += "Nine ";
                    break;
            }

            }
            String textWoSpace = text.trim();
            return textWoSpace;
        }

        }
