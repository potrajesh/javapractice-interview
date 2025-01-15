package ninzas.Stringpractice;

public class CheckPalindrom {
    public static void main(String[] args) {
        String s = "abba";
        boolean palindrom = findPalindrom(s);
        System.out.println(palindrom);
    }

    private static boolean findPalindrom(String s) {
            //find first and last element
           // traverse each charecter ! start and end
          //if traverse is false then its non palindrom or its palindrom

        int start = 0; int end = s.length()-1;
        while (start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
