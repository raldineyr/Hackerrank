class Result {
    
    public static int introTutorial(int V, List<Integer> arr) {
        int storage = 0;
        
        for (int counter = 0; counter < arr.size(); counter++)
        {
            if (V == arr.get(counter))
            {
                storage = counter;
            }
        }
        return storage;
    }
}
