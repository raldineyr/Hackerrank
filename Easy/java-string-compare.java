import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        java.util.SortedSet<String> sortedSet = new java.util.TreeSet<String>();
        for (int counter = 0; counter <= s.length() - k; counter++){
            sortedSet.add((s.substring(counter, counter + k)));
        }
        
        smallest = sortedSet.first();
        largest = sortedSet.last();
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
