public class solutionEasyReserveInteger {
   public int reverse(int x) {        
        int result = 0;
        while(x != 0){
            
            int tail = x % 10;
            int newResult = result * 10 + tail;   // way to build decimal numbers
            
            // handle overflow
            if((newResult - tail) / 10 != result){
                return 0;
            }            
            result = newResult;
            x = x / 10; // update x
        }
        
      return result;
    } 
}
