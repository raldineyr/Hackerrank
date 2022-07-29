class Result {


    public static int simpleArraySum(List<Integer> ar) {
        
        int sum = 0;
        
        for (int counter = 0; counter < ar.size(); counter++)
        {
            sum += ar.get(counter);
        }
        
        return sum;
    }

}
