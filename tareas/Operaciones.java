import java.util.Scanner;

public class Operaciones{
  public static void main(String[] args) {
      int numUno= 5, numDos=3, resultado=0;
      int parametro;
      
      Scanner inPut=new Scanner(System.in);
      System.out.print("ingrese el parametro: ");

      parametro=inPut.nextInt();

      
     switch(parametro){
         case 1:resultado=numUno+numDos;
         System.out.println("el resultado de la suma es: "+resultado);
            break;
        case 2:resultado=numUno-numDos;
         System.out.println("el resultado de la resta es: "+resultado);
            break;
        case 3:resultado=numUno*numDos;
         System.out.println("el resultado de la multiplicacion es: "+resultado);
            break;
        case 4:resultado=numUno/numDos;
         System.out.println("el resultado de la division es: "+resultado);
            break;     
        default: System.out.println("error, la opcion no esta disponible");
        break;
     }
  }  
}