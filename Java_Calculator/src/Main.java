//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Input:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        try {
            String result = calc(input);
            System.out.println(result);
        } catch (Exception var4) {
            System.out.println("throws Exception");
        }

    }

    public static String calc(String input) throws Exception {
        String[] arr = input.split(" ");
        if (arr.length != 3) {
            throw new Exception();
        } else {
            String operand1 = arr[0];
            String operator = arr[1];
            String operand2 = arr[2];
            boolean isRoman = false;

            int num1;
            int num2;
            try {
                num1 = Integer.parseInt(operand1);
                num2 = Integer.parseInt(operand2);
            } catch (NumberFormatException var11) {
                num1 = RomanNumeralsConverter.romanToArabic(operand1);
                num2 = RomanNumeralsConverter.romanToArabic(operand2);
                isRoman = true;
            }

            if (num1 >= 1 && num1 <= 10 && num2 >= 1 && num2 <= 10) {
                System.out.println("Output: ");
                int result;
                switch (operator) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        result = num1 / num2;
                        break;
                    default:
                        throw new Exception();
                }

                if (isRoman) {
                    if (result <= 0) {
                        throw new Exception();
                    } else {
                        return RomanNumeralsConverter.arabicToRoman(result);
                    }
                } else {
                    return String.valueOf(result);
                }
            } else {
                throw new Exception();
            }
        }
    }
}
