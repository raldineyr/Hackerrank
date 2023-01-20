public class Solution {
    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        String A=sc.next();
        String B=sc.next();
        String  largerThan  = "No";
        
        int sum = (A.length() + B.length());
        
        if(A.compareTo(B) > 0){
            largerThan = "Yes";
        }
        String originalA = A;
        String originalB = B;

        System.out.println(sum);
        System.out.println(largerThan);
        System.out.println(
            A.substring(0, 1).toUpperCase() +
            originalA.substring(1) + " " +
            B.substring(0, 1).toUpperCase() + 
            originalB.substring(1)
            );
        
 
    }
}
