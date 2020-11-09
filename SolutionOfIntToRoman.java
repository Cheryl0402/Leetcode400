class SolutionOfIntToRoman{
    public String intToRoman(int num) {
        
        //1, hardcode approach
        // String[] thousands = {"", "M","MM", "MMM"};
        // String[] hundreds = {"","C","CC","CCC","CD","D", "DC", "DCC", "DCCC", "CM"};
        // String[] tens = {"","X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        // String[] digits = {"","I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};                
        // return thousands[num / 1000] + hundreds[(num % 1000) / 100] + tens[(num % 100) / 10] + digits[num % 10];
        
        // 2, Greedy algrithm
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < values.length && num > 0; i++) {
            while (num >= values[i]) { 
                num -= values[i];
                res.append(symbols[i]);
            }
        }
        return res.toString();
        
        //Pay attention to these:
        // 1,  check if num >0; if num = 0, we can stop iterating. eg. 3000
        // 2,  the inter condition has to be while loop rather than if, eg. 3000

    }
}