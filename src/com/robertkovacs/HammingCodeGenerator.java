package com.robertkovacs;

public class HammingCodeGenerator {

    public static String generate(String input) {
        if(input.matches("[0-1]+")) {
            if(input.length() == 4) {
                char[] result = new char[7];
                char d0 = input.charAt(0), d1 = input.charAt(1),
                        d2 = input.charAt(2), d3 = input.charAt(3);
                char p0 = !isEven(d0 + "" + d1 + "" + d3) ? '1' : '0',
                        p1 = !isEven(d0 + "" + d2 + "" + d3) ? '1' : '0',
                        p2 = !isEven(d1 + "" + d2 + "" + d3) ? '1' : '0';
                result[0] = p0;
                result[1] = p1;
                result[2] = d0;
                result[3] = p2;
                result[4] = d1;
                result[5] = d2;
                result[6] = d3;
                return String.valueOf(result);
            } else if(input.length() > 4) {
                return "Too much character given.";
            } else {
                return "Not enough character given.";
            }
        } else {
            return "Input contains invalid characters. Bitstring required [0-1].";
        }
    }

    private static boolean isEven(String bitString) {
        int count = 0;
        for(int i = 0; i < bitString.length(); i++) {
            if(bitString.charAt(i) == '1') {
                count++;
            }
        }
        return count % 2 == 0;
    }
}
