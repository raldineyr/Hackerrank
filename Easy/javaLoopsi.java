public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        
        if (N >= 2 && N <= 20)
        {
            
            for (int i = 1; i <= 10; i++)
            {
                 int result = N * i;
                 System.out.printf("%d x %d = %d\n", N, i, result);
            }
        }
 
        bufferedReader.close();
    }
}
