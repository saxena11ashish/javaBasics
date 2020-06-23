package strings;

public class AllSubstringOfAString {
    public static void main(String[] args) {
        String a = "abc",ans="";
        int n =a.length();
        int len=1;
        for(int i=n;i>0;i--){

            for(int j=0;j<n && j+len<n+1;j++){
                ans = ans+a.substring(j,j+len)+" ";
            }
            len++;
        }
        System.out.println(ans);
    }
}
