package strings;

public class ReverseStringWordByWord {
    public static void main(String[] args) {
        String s ="      i       love        java, the     coffee    ",ans="";
        int i = s.length()-1,j;
        while(i>=0){
            while(i>=0 && s.charAt(i)==' ')    //trailing spaces traversed
                i--;
            if(i<0)break;
            j=i;
            while(i>=0 && s.charAt(i)!=' ')
                i--;
            //i+1 -> j+1 is a word. [j+1] as in substring(i,j),j is not included
            if(ans.length()==0)
                ans=ans + s.substring(i+1,j+1);
            else
                ans=ans+ " " + s.substring(i+1,j+1);
        }
        System.out.println(ans);
    }
}
