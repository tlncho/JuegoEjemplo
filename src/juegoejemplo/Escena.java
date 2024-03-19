
package juegoejemplo;


public class Escena {
    private Auto auto;
    private Pared pared;
    
    public Escena(Auto auto){
           this.auto=auto;
           this.pared=new Pared();
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }
    
    public void jugar(){
    
        
        //Utilizando Scanner
        //A ---Izquierda
        //S---Abajo
        //D--Derecha
        //W---Para arriba
        //E..Salir del juego
        //si el auto choca con la pared, el auto queda chocado.
    }
    
}
