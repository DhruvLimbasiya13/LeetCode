class Solution {
    public String intToRoman(int num) {
        String numStr = Integer.toString(num);
        int digits = numStr.length();
        String ans = "";

        for (int i = 0; i < numStr.length(); i++) {
            int digit = numStr.charAt(i) - '0';
            int place = (int) Math.pow(10, digits - i - 1);

            if (digit == 0) {
                continue;
            }

            // Thousands place
            if (place == 1000) {
                if (digit == 1) ans += "M";
                else if (digit == 2) ans += "MM";
                else if (digit == 3) ans += "MMM";
            }

            // Hundreds place
            else if (place == 100) {
                if (digit == 1) ans += "C";
                else if (digit == 2) ans += "CC";
                else if (digit == 3) ans += "CCC";
                else if (digit == 4) ans += "CD";
                else if (digit == 5) ans += "D";
                else if (digit == 6) ans += "DC";
                else if (digit == 7) ans += "DCC";
                else if (digit == 8) ans += "DCCC";
                else if (digit == 9) ans += "CM";
            }

            // Tens place
            else if (place == 10) {
                if (digit == 1) ans += "X";
                else if (digit == 2) ans += "XX";
                else if (digit == 3) ans += "XXX";
                else if (digit == 4) ans += "XL";
                else if (digit == 5) ans += "L";
                else if (digit == 6) ans += "LX";
                else if (digit == 7) ans += "LXX";
                else if (digit == 8) ans += "LXXX";
                else if (digit == 9) ans += "XC";
            }

            // Ones place
            else {
                if (digit == 1) ans += "I";
                else if (digit == 2) ans += "II";
                else if (digit == 3) ans += "III";
                else if (digit == 4) ans += "IV";
                else if (digit == 5) ans += "V";
                else if (digit == 6) ans += "VI";
                else if (digit == 7) ans += "VII";
                else if (digit == 8) ans += "VIII";
                else if (digit == 9) ans += "IX";
            }
        }

        return ans;
    }
}
