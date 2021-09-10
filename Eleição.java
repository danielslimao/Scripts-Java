
package elei��o;
import java.util.Scanner;

public class Elei��o {          
   
    public static void main(String[] args) {
        
        int rodrigo=0;              
        int ananias=0;               
        int rosangela=0;         
        int augusto=0;              
        int joana=0;           
        int eliana=0;
        int votosNulos=0;
        int votosTotais=0;
        
        
        System.out.println("Entre com o número do seu candidato");
        System.out.println("Rodrigo: número 22 /"
                + " Ananias: número 98 /"
                + " Rosangela: número 73 /"
                + " Augusto: número 41 /"
                + " Joana: número 28 /"
                + " Eliana: número 11 ");
        
        Scanner scanner = new Scanner(System.in);
    
        while(true) {
            
            System.out.println("Em quem você deseja votar? Digite 0 para encerrar a votação do primeiro turno.");
            int voto = scanner.nextInt();
            
            if (voto == 22) {
                System.out.print("Digite 1 para confirmar seu voto em Rodrigo, 2 para cancelá-lo [1/2]");
                int resposta1 = scanner.nextInt();
                if (resposta1==1) {
                    System.out.println("Voto confirmado em Rodrigo.");
                    rodrigo+=1;
                    votosTotais += 1;
                }    
            }
            
            
            else if (voto == 98) {
                System.out.print("Digite 1 para confirmar seu voto Ananias, 2 para cancelá-lo [1/2]");
                int resposta2 = scanner.nextInt();
                if (resposta2==1) {
                    System.out.println("Voto confirmado em Ananias.");
                    ananias+=1;
                    votosTotais += 1;
                }
            }
            
            else if (voto == 73) {
                System.out.print("Digite 1 para confirmar seu voto em Rosangela, 2 para cancelá-lo [1/2]");
                int resposta3 = scanner.nextInt();
                if (resposta3==1) {
                    System.out.println("Voto confirmado em Rosangela.");
                    rosangela+=1;
                    votosTotais += 1;
                }  
             }
             
            else if (voto == 41) {
                System.out.print("Digite 1 para confirmar seu voto em Augusto, 2 para cancelá-lo [1/2]");
                int resposta4 = scanner.nextInt();
                if (resposta4==1) {
                    System.out.println("Voto confirmado em Augusto.");
                    augusto+=1;
                    votosTotais += 1;
                }
             }
             
            else if (voto == 28) {
                System.out.print("Digite 1 para confirmar seu voto em Joana, 2 para cancelá-lo [1/2]");
                int resposta5 = scanner.nextInt();
                if (resposta5==1) {
                    System.out.println("Voto confirmado em Joana.");
                    joana+=1;
                    votosTotais += 1;
                }
             }
             
            else if (voto == 11) {
                System.out.print("Digite 1 para confirmar seu voto em Eliana, 2 para cancelá-lo [1/2]");
                int resposta6 = scanner.nextInt();
                if (resposta6==1) {
                    System.out.println("Voto confirmado em Eliana.");
                    eliana+=1;
                    votosTotais += 1;
                }                                      
            }
            
            else if (voto == 0) {
                System.out.println("Votação encerrada.");
                break;
            }
            
            else {
                System.out.println("Você entrou com um número inexsitente, deseja anular seu voto? Digite 1 confirmar, 2 pra votar novamente.");
                int resposta7 = scanner.nextInt();
                if (resposta7 == 1){
                    System.out.println("Voto anulado!");
                    votosTotais +=1;
                    votosNulos+=1;
                }
            }
        }            
         
        
        System.out.println("Votos totais = "+votosTotais);
        
        System.out.println("Rodrigo: "+rodrigo+" votos");
        System.out.println("Ananias: "+ananias+" votos");
        System.out.println("Rosangela: "+rosangela+" votos");
        System.out.println("Augusto: "+augusto+" votos");
        System.out.println("Joana : "+joana+" votos");
        System.out.println("Eliana : "+eliana+" votos");
        System.out.println("Votos nulos : "+votosNulos+" votos");
        
        
        
        if (rodrigo>votosTotais/2) {
            System.out.println("Rodrigo é o novo prefeito!");
        }
        
        else if (ananias>votosTotais/2) {
            System.out.println("Ananias é o novo prefeito!");
        }
        
        else if (rosangela>votosTotais/2) {
            System.out.println("Rosangela é o novo prefeito!");
        }
        
        else if (augusto>votosTotais/2) {
            System.out.println("Augusto é o novo prefeito!");
        }
        
        else if (joana>votosTotais/2) {
            System.out.println("Joana é o novo prefeito!");
        }
        
        else if (eliana>votosTotais/2) {
            System.out.println("Eliana é o novo prefeito!");
        }
            
        else {
               
            String[] nomes = new String[]{"Rodrigo","Ananias","Rosangela","Augusto","Joana","Eliana"};
            int[] valores = new int[]{rodrigo,ananias,rosangela,augusto,joana,eliana};
            int[] votos = new int[]{22,98,73,41,28,11};
    
             
            int valorAuxiliar, tamanho = valores.length;
            String nomeAuxiliar;
            int votosAuxiliar;
        
            for(int i = 0; i <  tamanho - 1; i++){
                for(int j = 0; j < tamanho-i-1; j++){
                    if(valores[j] > valores[j+1]){ 
                    
                        valorAuxiliar = valores[j]; 
                        valores[j] = valores[j+1];
                        valores[j+1] = valorAuxiliar;
                    
                    
                        nomeAuxiliar = nomes[j]; 
                        nomes[j] = nomes[j+1];
                        nomes[j+1] = nomeAuxiliar; 
                        
                        votosAuxiliar = votos[j]; 
                        votos[j] = votos[j+1];
                        votos[j+1] = votosAuxiliar; 
                    }    
                }
            }            
                        
                
            
            
            System.out.println("Votação foi para o segundo turno com "+nomes[4]+" e "+nomes[5]); 
            
            int primeiroCandidato = 0;
            int segundoCandidato = 0;


            while (true){
                
                System.out.print("Em quem você deseja votar? Digite 0 para encerrar a votação do segundo turno.");
                int voto = scanner.nextInt();
                
                if (voto==votos[5]){
                    System.out.print("Digite 1 para confirmar seu voto em "+nomes[5]+", 2 para cancelá-lo [1/2]");
                    int confirma1 = scanner.nextInt();
                    if (confirma1==1) {
                        System.out.println("Voto confirmado em "+nomes[5]+".");
                        primeiroCandidato+=1;                   
                }
                }
                

                else if (voto==votos[4]){
                    System.out.print("Digite 1 para confirmar seu voto em "+nomes[4]+", 2 para cancelá-lo [1/2]");
                    int confirma2 = scanner.nextInt();
                    if (confirma2==1) {
                        System.out.println("Voto confirmado em "+nomes[4]+".");
                        segundoCandidato+=1;                   
                    }
                }    


                else if (voto==0){
                    System.out.println("Votação encerrada!");
                    break;
                }
                
                else{
                    System.out.println("Voto anulado.");
                }
                    
            }
            
            //contagem de votos
            System.out.println(nomes[5]+":"+primeiroCandidato+" votos");
            System.out.println(nomes[4]+":"+segundoCandidato+" votos");
            

            if (primeiroCandidato > segundoCandidato){
                System.out.println(nomes[5] + " é o novo prefeito!");
            }

            else if (segundoCandidato > primeiroCandidato){
                System.out.println(nomes[4] + " é o novo prefeito!");
            }
            
            else if (segundoCandidato == primeiroCandidato){
                System.out.println("Houve empate! O caso será julgado pela Justiça Eleitoral.");
            }



        }
    }
    
           
            
    
    
}






    
    
    



