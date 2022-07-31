class Result {
    public static void miniMaxSum(List<Integer> arr) {
        
        
       
     int minimumValue = arr.get(0); 
     int maximumValue = arr.get(0);
     long totalSum = 0; 
     
     for (int storage: arr)
     {
         totalSum += storage;
         
         if(storage< minimumValue) minimumValue = storage; 
         if (storage > maximumValue) maximumValue = storage; 
         
     }
     
     System.out.println((totalSum - maximumValue) +" "+ (totalSum - minimumValue));
   

    }

}
