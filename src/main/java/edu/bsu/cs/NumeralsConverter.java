package edu.bsu.cs;

public  class NumeralsConverter {
    public String converttoNumerals(int number) {
        int digit1 = 0;
        int digit2 = 0;
        int digit3 = 0;
        int digit4 = 0;
        String firstdigit=null;
        String seconddigit=null;
        String thirddigit=null;
        String fourthdigit=null;
        if (number >= 1) {
            digit1 = number % 10;
             firstdigit = charConverter(digit1);
        }
        if (number >= 10) {
             digit2 = (number % 10 - digit1) / 10;
             String digitholder = charConverter(digit2);
             seconddigit = digitholder.replace("V","L").replace("I","X");
        }
        if (number >= 100) {
            digit3 = (number / 100) % 10;
            String digitholder = charConverter(digit3);
            thirddigit = digitholder.replace("V","D").replace("I","C");

        }
        if (number >= 1000) {
            digit4 = (number / 1000) % 10;
            String digitholder = charConverter(digit4);
            fourthdigit = digitholder.replace("I","M");
        }
        String convertednumeral = fourthdigit+thirddigit+seconddigit+firstdigit;
        return convertednumeral;
    }

    public String charConverter(int digit) {
        String letter = null;
        if (digit == 0) {
            letter = "";
        }
        if (digit == 1) {
            letter = "I";
        }
        if (digit == 2) {
            letter = "II";
        }
        if (digit == 3) {
            letter = "III";
        }
        if (digit == 4) {
            letter = "IV";
        }
        if (digit == 5) {
            letter = "V";
        }
        if (digit == 6) {
            letter = "VI";
        }
        if (digit == 7) {
            letter = "VII";
        }
        if (digit == 8) {
            letter = "VIII";
        }
        if (digit == 9) {
            letter = "IX";
        }
        return letter;


    }

}
