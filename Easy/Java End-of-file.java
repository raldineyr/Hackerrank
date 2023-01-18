public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        for(int counter = 1; input.hasNext(); counter++)
        {
            System.out.println(counter + " " + input.nextLine());
        }
        input.close();
    }
}
