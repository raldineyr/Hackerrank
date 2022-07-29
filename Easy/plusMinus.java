class Result
{
    public static void plusMinus(List<Integer> arr) 
    {
        
    int positive = 0, negative = 0, zero = 0;
    
    for(int counter = 0;counter < arr.size(); counter++)
    {
        if(arr.get(counter) > 0) positive++;
        else if (arr.get(counter) < 0 ) negative++;
        else zero++;
    }
    
    int totalElements = positive + negative + zero;
    
    System.out.println((float)positive/totalElements);
    System.out.println((float) negative/totalElements);
    System.out.println((float) zero/totalElements);
    }
}
