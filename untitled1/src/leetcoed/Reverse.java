package leetcoed;

public class Reverse {
    static void main(String[] args) {
        String string="hello";
        System.out.println(reverse(string));
    }

    public static String reverse(String s){
        char cs[]=s.toCharArray();
        int left=0;
        int right=cs.length-1;
        while (right>left){
            char temp=cs[left];
            cs[left]=cs[right];
            cs[right]=temp;
            left++;
            right--;
        }
        return new String(cs);
    }
}
