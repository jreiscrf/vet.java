import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    System.out.print("Qual é o tamanho do Vetor que deseja? ");
    int tamanho = leitor.nextInt();
    int[] vetor1 = new int[tamanho];
    for (int i = 0; i < vetor1.length; i++) {
      System.out.println("----------------------------------------");
      System.out.println("Digite o Valor do vetor na posição " + i + ": ");
      int val = leitor.nextInt();
      vetor1[i] = val;
    }
    System.out.println("----------------------------------------");
    System.out.println("----------------------------------------");
    int dif = calcDif(vetor1);
    System.out.println("A) Valor da maior diferença entre dois elementos distintos do Vetor: " + dif);
    System.out.println("----------------------------------------");
    boolean ar = or(vetor1);
    System.out.println("B) O Vetor está na ordem Crescente? " + ar);
    leitor.close();  
  }
    static boolean or(int [] vetor){
    for(int i = 0; i < vetor.length -1; i++){
      if(vetor[i] > vetor[i+1]){
        return false;
      }
    }
    return true;
  }
    static int calcDif (int [] vetor){
    int ma = vetor[0];
    int me = vetor[0];
    for(int i = 0; i < vetor.length; i++){
      if(vetor[i] <= me){
        me = vetor[i];
      }
      if (vetor[i] > ma){
        ma = vetor[i];
      }
    }
      int diferenca = ma - me;
      return diferenca;          
  }
}
