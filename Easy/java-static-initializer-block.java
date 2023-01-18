public class Solution {
    
private static boolean flag;
private static int B, H;

static
{
    Scanner input = new Scanner(System.in);
    B = input.nextInt();
    H = input.nextInt();
    
    if(B <= 0 || H <= 0)
    {
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    } else
    {
        flag = true;
    }
}

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

