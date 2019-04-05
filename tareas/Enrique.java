import java.util.Scanner; 
public class Enrique{
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
    String nombre="";
    int clave=0;
    int antiguedad= 0;
    System.out.println("*****************************************************");
    System.out.println("bienvenido al sistema vacacional de coca-cola company");
    System.out.println("*****************************************************");
    System.out.println("");
    System.out.println("");
    System.out.print("cual es el nombre del trabajador?:");
        nombre=entrada.nextLine(); 
        System.out.println("");
    System.out.println("cuantos años tiene el trabajador?:");
        antiguedad=entrada.nextInt();
        System.out.println("");
    System.out.println("cual es la clave del trabajador?:");
        clave= entrada.nextInt();
        System.out.println("");
        if(clave==1){
            if(antiguedad==1){
                System.out.println(nombre+" derecho 6 dias.");
            }else if(antiguedad>=2 && antiguedad<=6){
                System.out.println(nombre+" derecho 14 dias.");
            }else if(antiguedad>=7){
                System.out.println(nombre+" deracho 20 dias.");
            }else{
                System.out.println(nombre+" aun no tiene derecho a vacaciones.");
            }

        }else if(clave==2){
            
            if(antiguedad==1){
                System.out.println(nombre+" derecho 7 dias.");
            }else if(antiguedad>=2 && antiguedad<=6){
                System.out.println(nombre+" derecho 15 dias.");
            }else if(antiguedad>=7){
                System.out.println(nombre+" deracho 22 dias.");
            }else{
                System.out.println(nombre+" aun no tiene derecho a vacaciones.");
            }
        } else if(clave==3){

            if(antiguedad==1){
                System.out.println(nombre+" derecho 10 dias.");
            }else if(antiguedad>=2 && antiguedad<=6){
                System.out.println(nombre+" derecho 20 dias.");
            }else if(antiguedad>=7){
                System.out.println(nombre+" deracho 30 dias.");
            }else{
                System.out.println(nombre+" aun no tiene derecho a vacaciones.");
            }
        }else{
            System.out.println("error, la clave de departamento no existe.");
        }
    }
    


      
} 