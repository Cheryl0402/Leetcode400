class Solution {
    public String addStrings(String num1, String num2) {
          //digit-by-digit addition
        // 1, initialize a empty string to hold the addition result.      
        //2, set two pointers at the end of each string        
        //3, loop through each string
            // set x1 to be equal to digit strong nums1 at p1. if p1 = 0, set x1 to 0;        
            // do the same to x2        
            //compute  the current value: value = (x1 + x2 + carry) % 10; and update carry: carry = (x1 + x2 + carry ) / 10 
        StringBuilder res = new StringBuilder();
        int p1 = num1.length() - 1;
        int p2 = num2.length() - 1;
        int carry = 0; 
        while(p1 >= 0 || p2 >= 0 || carry != 0){            
            int x1 = 0;
            int x2 = 0;
            if(p1 >= 0){
                x1 = num1.charAt(p1) - '0';
            }            
            if(p2 >= 0){
                x2 = num2.charAt(p2) - '0';
            }            
            int value = (x1 + x2 + carry) % 10;
            carry = (x1 + x2 + carry) / 10;
            
            res.append(value);
            p1--;
            p2--;
           
        }        
        return res.reverse().toString();                
    }
}