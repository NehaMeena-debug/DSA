package string_problem;

public class longest_substring {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int length = 0 ;
 
     for(int i=0;i<n;i++){
         String str = "" ; 
         for(int j=i;j<n;j++){
         char ch = s.charAt(j);
 
         if(str.indexOf(ch) == -1){
             str = str + ch;
             length = Math.max(length , str.length());
         }
         else{
             break;
         }
         }
     }
     return length;
     }
}
