public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());
            
        for(int counter = 0; counter < n; counter++){
            if (counter == 0) {
                System.out.println(a.get(counter));
            }
            else System.out.println(bufferedReader.readLine());
        }
        
        bufferedReader.close();
    }
}
