class Result {
    public static void staircase(int n) {
        
    for(int numberStep = 1; numberStep <= n; numberStep ++)
    {
      int numberSpaces = n - numberStep;

    for(int counter = 0; counter < numberSpaces; counter++)
    {
      System.out.print(' ');
    }
    
    for (int numberSymbols = 0; numberSymbols < numberStep; numberSymbols++)
    {
      System.out.print('#');
    }
      System.out.println();
    }
    
    }
  
  /*
  
       n      numeroDeEspaços     numeroDoDegrau                 
       #             3         +          1
      ##             2         +          2
     ###             1         +          3
    ####             0         +          4  
    
    O numero de degraus será igual ao: numero de espaços ' '  mais o numero de símbolos: #;
    
    Como o numero de degraus e o numero de simbolos são crescentes e proporcionais fica fácil
    encontrar a fórmula para os dois. Porém, no caso do numero de espaços é onde se encontra a
    raiz do problema a Equação será:
    
    Fórmula: numeroDeEspaços = QuantidadeTotalDeDegraus - numeroAtualdoDegrau;
    
    ou int numberSpaces = n - numberSteps;
    
    
   */
  
  
}
