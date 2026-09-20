package leetcoed;

public class huiwen {
    static void main(String[] args) {
        String s="accnna";
        System.out.println(ifhuiwen(s));
    }
    public static boolean ifhuiwen(String s){
        char cs[]=s.toCharArray();
        int left=0;
        int right=cs.length-1;
        while (right>left){
            if(cs[left]!=cs[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
