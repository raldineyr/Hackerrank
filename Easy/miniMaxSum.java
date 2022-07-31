class Result {
    public static void miniMaxSum(List<Integer> arr) {
        
        
       
     int minimumValue = arr.get(0); 
     int maximumValue = arr.get(0);
     long totalSummer = 0; 
     
     for (int storage: arr)
     {
         totalSummer += storage;
         
         if(storage< minimumValue) minimumValue = storage; 
         if (storage > maximumValue) maximumValue = storage; 
         
     }
     
     System.out.println((totalSummer - maximumValue) +" "+ (totalSummer - minimumValue));
   

    }

}
