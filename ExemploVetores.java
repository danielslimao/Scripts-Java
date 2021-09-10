
/**
 *
 * @author Luiz Gustavo Miranda
 */

public class ExemploVetores {
    public String[] nomes = new String[]{"Luiz","Letícia", "Maria","Rodrigo", "Pedro", "Raul", "Juca", "Afonso"};
    public int[] valores = new int[]{23,45,206,45,67,108,13,4};
    
    public void ordenacao_por_bolha(String nomes[], int valores[]){ 
        int valAux, tam = valores.length;
        String nomeAux;
        // Ordena de forma ascendente
        for(int i = 0; i <  tam - 1; i++)
            for(int j = 0; j < tam-i-1; j++)
                if(valores[j] > valores[j+1]){ // Verifica se um valor é maior que se sucessor
                    // Realiza a troca de posições entre o valor e o seu sucessor
                    valAux = valores[j]; 
                    valores[j] = valores[j+1];
                    valores[j+1] = valAux;
                    
                    /** Realiza a troca de posições entre os nomes para manter 
                     * a ordem em relação ao vetor de valores 
                     **/
                    nomeAux = nomes[j]; 
                    nomes[j] = nomes[j+1];
                    nomes[j+1] = nomeAux;
                }
    }
    
    public void imprimeMaiores(){
        ordenacao_por_bolha(nomes, valores);
        int n = valores.length;
        System.out.printf("Vetor de Valores: [%d", valores[0]);
        for(int i = 1; i < n; i++)
            System.out.printf(", %d", valores[i]);
        System.out.printf("]\n");   
        
        System.out.printf("Vetor de Nomes: [%s", nomes[0]);
        for(int i = 1; i < n; i++)
            System.out.printf(", %s", nomes[i]);
        System.out.printf("]\n");
            
        System.out.printf("Primeiro candidato: %s - %d votos\n",nomes[n-1], valores[n-1]);
        System.out.printf("Segundo candidato: %s - %d votos\n",nomes[n-2], valores[n-2]);
    }
    
    
}







  
    
    

