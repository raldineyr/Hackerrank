  public static int lonelyinteger(List<Integer> a) {

    int identifier = 0;
    
    for(int numbersIn: a){
        
        identifier = identifier ^ numbersIn;
    }
    return identifier;
    
    }
