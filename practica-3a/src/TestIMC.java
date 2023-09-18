import java.util.Scanner;

public class TestIMC {
  public static void main(String[] args) {
    IMC imc = new IMC();
    
    Scanner sc = new Scanner(System.in);
    System.out.print("peso: ");
    float input = sc.nextFloat();
    imc.setPeso(input);
    System.out.print("altura: ");
    input = sc.nextFloat();
    imc.setAltura(input);
    

    float resultado = imc.calculo();

    if (resultado < 18.0) 
      System.out.println("Por debajo del indice");
    else if (resultado > 25.0)
      System.out.println("Por arriba del indice");
    else
      System.out.println("ta bien");

    sc.close();
  }
}
