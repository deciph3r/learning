public class ZigZag {
    static String convert(String s, int numRows) {
        StringBuffer[] sb = new StringBuffer[numRows];
        int length = s.length();
        for(int i=0; i<numRows;i++){
            sb[i] = new StringBuffer();
        }

        int i=0;
        while(i<length){
            for(int idx=0;idx<numRows && i<length;idx++) sb[idx].append(s.charAt(i++));
            for(int idx=numRows-2; idx>0 && i<length;idx--) sb[idx].append(s.charAt(i++));
        }
        for(int j=1; j<numRows;j++){
            sb[0].append(sb[j].toString());
        }
        return sb[0].toString();
    }

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));
    }
}
