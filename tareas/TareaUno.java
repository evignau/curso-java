public class TareaUno{
   public static void main(String[] args) {
       
   
    String palabra="palabra", palabraDos="palabraDos";
    
    int parametro=7;


    switch(parametro){
        case 1:System.out.println(palabra.charAt(0));
        break;
        case 2:System.out.println(palabra.concat(" hola"));
        break;
        case 3:System.out.println(palabra.equals("hola"));
        break;
        case 4:System.out.println(palabra.length());
        break;
        case 5:System.out.println(palabra.replace('a','o'));
        break;
        case 6:System.out.println(palabra.toUpperCase());
        break;

        default: System.out.println("la opcion no existe.");
    }
  }
}