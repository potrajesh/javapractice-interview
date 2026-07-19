package interview1;

public class Test1 extends Thread{

    public static void main(String[] args) {
        int i = 0;
        String str = "how are you how are you how are youhow are youhow are youhow are youhow are you";

        while (true) {
            int found = str.indexOf("are", i);
            if(found==-1) break;
            int start = found +1;

            int end = str.indexOf(" ",start);
            String substring = str.substring(start, end);
            System.out.println(substring);
            i = end +1;
        }


    }
}
