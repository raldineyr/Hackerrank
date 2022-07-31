class Result {


    public static void extraLongFactorials(int n) {
    
    BigInteger totalValue = BigInteger.ONE;

    for (int counter = n; counter > 0; counter--)
    {
       totalValue = totalValue.multiply(BigInteger.valueOf(counter));

    }
    
    System.out.println(totalValue);

    }

}
