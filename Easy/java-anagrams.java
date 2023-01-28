public class Solution {

    static boolean isAnagram(String a, String b) {
        
       a = a.replace(" ","").toLowerCase();
       b = b.replace(" ","").toLowerCase();
       
       char[] A = a.toCharArray();
       char[] B = b.toCharArray();
       
       java.util.Arrays.sort(A);
       java.util.Arrays.sort(B);
       
       if(java.util.Arrays.equals(A,B)) return true;
       else return false;
       
       
        
    }
