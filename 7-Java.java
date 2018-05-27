class Solution {
    public int reverse(int x) {
        int out_x;
        long lon_x;
        int flag = 0;
        char[] chrArray;
        
        if(x == -2147483648) {
            return 0;
        }
        
        // 判断正负
        if(x < 0) {
            flag = 1;
            x = -(x);
        }
        
        String str_x = String.valueOf(x);
        chrArray = str_x.toCharArray();
        int len = str_x.length();
        
        for(int i=0; i<len/2; ++i) {
            char temp = chrArray[i];
            chrArray[i] = chrArray[len-i-1];
            chrArray[len-i-1] = temp;
        }
        
        str_x = String.valueOf(chrArray);
        lon_x = Long.parseLong(str_x);
        if(lon_x > 2147483647L) {
            return 0;
        }
        out_x = Integer.parseInt(str_x);
        
        if(flag == 1) {
            return -out_x;
        }
        
        return out_x;
    }
}