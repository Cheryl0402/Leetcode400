class zigZagConversion {
    public String convert(String s, int numRows) {
        
        if(s.length() == 0) return s;
        
        // using two array to hold the chars, two indexs to track the row number and index of string.
        
        //Initialize two demension arrays.
        StringBuilder[] sb = new StringBuilder[numRows];
        for(int i = 0; i < sb.length; i++){
            sb[i] = new StringBuilder();
        }
        
        char[] c = s.toCharArray();
        int len = c.length;
        int strIndex = 0;
        while( strIndex < len){
            // going down append; sbIndex strats from 0, ends with numRows-1;
            for(int sbIndex = 0; sbIndex < numRows && strIndex < len; sbIndex++){
                sb[sbIndex].append(c[strIndex]);
                strIndex++;
            }
            
            // going right up; sbIndex starts from numRows -2; strIndex keep incrementing.
            for(int sbIndex = numRows - 2; sbIndex >= 1 && strIndex < len ; sbIndex--){
                sb[sbIndex].append(c[strIndex]);
                strIndex++;
            }                        
        }
        
        //appending three rows to the first row.
        for(int sbIndex = 1; sbIndex < sb.length; sbIndex++){
            sb[0].append(sb[sbIndex]);
        }
        
        return sb[0].toString();
    }
}