class Result {

    public static int diagonalDifference(List<List<Integer>> arr) {
       
        
        int diagonal = 0;

        
        for(int x = 0; x < arr.size(); x++){
           diagonal += arr.get(x).get(x);
           diagonal -= arr.get(x).get(arr.size() - (x + 1));
            
        }
        
        return Math.abs(diagonal);
    

    }
  
   /*
        
        Uma 'lista de uma lista de inteiros' é equivalente a arr = [[1,2,3], [4,5,6], [9,8,9]]
        Onde as linhas correspondem a:
        
        Primeira linha: arr.get(0) [1,2,3]
        Segunda linha: arr.get(1)  [4,5,6]
        Terceira linha: arr.get(2) [9,8,9]
        
        Para acessar os elementos de cada linha necessitamos utilizar mais uma vez o .get(index);
        O primeiro .get(linha) e o Segundo é a coluna.get(coluna) de forma sucessiva.
        
        Esquerda para direita ->       linha  coluna   
        Pirmeira linha, elemento 1 = arr.get(0).get(0) 1
        Primeira linha, elemento 5 = arr.get(1).get(1)   5
        Primeira linha, elemento 9 = arr.get(2).get(2)     9
    
        Direita para a esquerda ->     linha  coluna
        Segunda linha, elemento 3 = arr.get(0).get(2)      3
        Segunda linha, elemento 5 = arr.get(1).get(1)    5
        Segunda linha, elemento 9 = arr.get(2).get(0)  9      
        
        Sobre o acesso aos elementos da esquerda para a direita:
        A trajetoria será crescente:  0,0 > 1,1 > 2,2
        
        Sobre o acesso aos elementos da direita para a esquerda há
        uma diferença significativa: 0,2 > 1.1 > 2,0
        
        O valor da linha será crescente: linha + 1
        O valor da coluna será decrescente, mas contendo o tamanho total do array .size() 
        
        Inversamente proporcional: 
        
        linha     coluna  
        0         2 
        1         1  
        2         0 
        
        Equação: 
        
        ValorArmazenado = Size - (linha + 1)
        ValorArmazenado = 3 - (0 + 1) = 2
        ValorArmazenado = 3 - (1 + 1) = 1
        ValorArmazenado = 3 - (2 + 1) = 0
        
        */

  

}
