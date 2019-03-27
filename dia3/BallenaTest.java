public class BallenaTest{
    public static void main( String[]args){
        
        Ballena ballena=new Ballena();
        ballena.aletaDorsal=true;
        ballena.color="azul";
        ballena.largo= "10 m";

        ballena.migrar();
        ballena.comer();
        ballena.comunicar();
        ballena.undirse();

        ballena.displayinformation();
    }
}