public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        java.math.BigInteger A = new java.math.BigInteger(input.next());
        java.math.BigInteger B = new java.math.BigInteger(input.next());
        
        System.out.println(A.add(B)); 
        System.out.println(A.multiply(B));
    }
}
