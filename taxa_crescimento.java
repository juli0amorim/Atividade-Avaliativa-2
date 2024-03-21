public class taxa_crescimento {
  public static void main(String[] args) {
    // Declaraão de variaveis
    int populacaoA = 80000;
    int populacaoB = 200000;
    double crescimentoA = 0.03; // Taxa de 3% anual
    double crescimetoB = 0.015; // Taxa de 15% anual 
    int anos = 0;
    
    // Loop para calcular a quantidade de anos necessários para que A ultrapasse ou iguale B
    while (populacaoA < populacaoB) { 
      // Calcula o crescimento populacional para cada país no proximo ano
      populacaoA += (int) (populacaoA * crescimentoA); 
      populacaoB += (int) (populacaoB * crescimetoB);
      anos++; // Incrementa o contador de anos  
    }
    // Exibe o número de anos necessários
    System.out.println("Após " + anos + " anos, a população do país A ultrapassará ou igualará a populaão do país B.");
  } 
}
