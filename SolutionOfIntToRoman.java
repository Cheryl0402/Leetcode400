class SolutionOfIntToRoman{
    public String intToRoman(int num) {
        
        //1, hardcode approach
        String[] thousands = {"", "M","MM", "MMM"};
        String[] hundreds = {"","C","CC","CCC","CD","D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"","X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] digits = {"","I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};                
        return thousands[num / 1000] + hundreds[(num % 1000) / 100] + tens[(num % 100) / 10] + digits[num % 10];
    }
}