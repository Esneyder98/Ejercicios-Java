public class reverse {

    public static String StringReverse(String palabra) {
        String r="";
        for(int i = palabra.length()-1; i >= 0 ; i--){
             r=r+String.valueOf(palabra.charAt(i));
        }
        return r;
    }
}
