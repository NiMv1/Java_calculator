//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

class RomanNumeralsConverter {
    private static final int[] NUMBERS = new int[]{100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] ROMAN_NUMERALS = new String[]{"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    RomanNumeralsConverter() {
    }

    public static int romanToArabic(String roman) {
        int result = 0;
        int i = 0;

        for(int j = 0; j < NUMBERS.length; ++j) {
            while(roman.startsWith(ROMAN_NUMERALS[j], i)) {
                result += NUMBERS[j];
                i += ROMAN_NUMERALS[j].length();
            }
        }

        return result;
    }

    public static String arabicToRoman(int number) {
        StringBuilder result = new StringBuilder();
        int i = 0;

        while(number > 0) {
            if (number >= NUMBERS[i]) {
                result.append(ROMAN_NUMERALS[i]);
                number -= NUMBERS[i];
            } else {
                ++i;
            }
        }

        return result.toString();
    }
}