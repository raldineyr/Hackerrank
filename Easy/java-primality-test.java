public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      
        BigInteger isPrime = new BigInteger(bufferedReader.readLine());       
            System.out.println(isPrime.isProbablePrime(7) ? "prime" : "not prime");        
        bufferedReader.close();
        
    }
}
