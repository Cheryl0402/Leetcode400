class atoiStringToIntegerSolution {
    public int myAtoi(String s) {

        //corner case:empty string
        if(s.length() == 0) return 0;
        
        int index = 0, sign = 1, digit = 0;
        
        //1, remove white space
        while(index < s.length() && s.charAt(index) == ' '){
                index++;        
        }
        
        //check the sign if it exists
        if(index < s.length() && (s.charAt(index) == '+' || s.charAt(index) == '-')){
            sign = (s.charAt(index) == '-') ? -1 : 1;
            index++;
        }
        
        // build the result number and handle overflow 
        int result = 0;
        while(index < s.length() && s.charAt(index) >= '0' && s.charAt(index) <= '9'){
            digit = s.charAt(index) - '0';
            if((Integer.MAX_VALUE - digit) / 10 < result){
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + digit;
            index++;
        }
        return sign * result;
        
            
          //Three points to pay attention:
         //1, transfer char and integer
         //2, how to handle overflow
        //3, the way to build decimal number.
    }
}