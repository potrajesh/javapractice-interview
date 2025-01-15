package ninzas.Stringpractice;

//3 questions involved
//1. all substrings in string
//2.large substrings in string
//3.checkPalindrom string
public class GetSubString {

    public static void main(String[] args) {
        String str = "hello world";
        checkPalindrom(str);
         String max = "";
        for (int i = 0; i < str.length()-1 ; i++) {
           // System.out.println(str.charAt(i));
            for (int j=i+1;j<str.length()-1;j++){
                //below line gives all substrings in string
                String substring = str.substring(i, j);
                //below line gives large substrings in string
                if(substring.length()>=max.length()){
                     max=substring;
                }

            }
        }
        System.out.println(max);
    }
    //checkPalindrom string
    private static boolean checkPalindrom(String str) {
        int start =0; int end = str.length()-1;
        while(start<=end){
             if(str.charAt(start)!=str.charAt(end)){
                  return false;
             }
             start++;
             end--;
        }
        return true;
    }

}
