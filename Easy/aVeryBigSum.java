class Result {

    public static long aVeryBigSum(List<Long> ar) {
    
    long sum = 0;
    
    for(int counter = 0; counter < ar.size(); counter++)
    {
        sum += ar.get(counter);
    }
        return sum;
    }

}
