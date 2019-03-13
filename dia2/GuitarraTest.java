public class GuitarraTest{
	public static void main( String[]args){

		//crear variable
		Guitarra lespaul;

		//inicializar variable
		lespaul=new Guitarra();
		lespaul.nombre="lespaul";
		lespaul.madera="ebano";
		lespaul.cuerdas=6;

		Guitarra telecaster=new Guitarra();
		telecaster.nombre="telecaster";
		telecaster.madera="maple";
		telecaster.cuerdas=6;
		telecaster.esAcustica=true;
		//ejecutar metodo
		lespaul.displayinformation();
		telecaster.displayinformation();
		
	}

}