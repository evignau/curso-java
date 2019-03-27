public class Elevador {
    public boolean puertaAbierta = false;
    public int pisoActual = 1;
    public final int ULTIMO_PISO = 10;
    public final int PRIMER_PISO = 1;

    public void abrirPuerta() {
        System.out.println("abriendo puerta");
        puertaAbierta = true;
        System.out.println("la puerta esta abierta");
    }

    public void cerrarPuerta() {
        System.out.println("cerrando puerta");
        puertaAbierta = false;
        System.out.println("la puerta esta cerrada");
    }

    public void goUp() {
        if (pisoActual == ULTIMO_PISO) {
            System.out.println("ya no se puede subir");
        } else {
            if (!puertaAbierta) {
                System.out.println("subiendo un piso");
                pisoActual++;
                System.out.println("piso:" + pisoActual);
            }
        }

    }

    public void goDown() {
        if (pisoActual == PRIMER_PISO) {
            System.out.println("ya no se puede baja");
        } else if (!puertaAbierta) {
            System.out.println("bajando un piso");
            pisoActual--;
            System.out.println("piso:" + pisoActual);
        }else{
            System.out.println("no se puede mover, la puerta esta abierta");
        }
    }

   
}