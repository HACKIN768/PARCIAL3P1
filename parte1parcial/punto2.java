package parte1parcial;

public class punto2 {
	public abstract class NaveEspacial {
	    protected String modelo;
	    protected int velocidadMaxima;
	    protected int tripulacionMaxima;
	    
	    public NaveEspacial(String modelo, int velocidadMaxima, int tripulacionMaxima) {
	        this.modelo = modelo;
	        this.velocidadMaxima = velocidadMaxima;
	        this.tripulacionMaxima = tripulacionMaxima;
	    }
	    
	    public abstract void despegar();
	    
	    public abstract void aterrizar();
	    
	    public void viajar() {
	        System.out.println("La nave " + modelo + " está viajando a una velocidad de " + velocidadMaxima + " km/h");
	    }
	    
	    public String getModelo() {
	        return modelo;
	    }
	    
	    public int getVelocidadMaxima() {
	        return velocidadMaxima;
	    }
	    
	    public int getTripulacionMaxima() {
	        return tripulacionMaxima;
	    }
	}
	public class NaveCarga extends NaveEspacial {
	    private int capacidadCarga;
	    
	    public NaveCarga(String modelo, int velocidadMaxima, int tripulacionMaxima, int capacidadCarga) {
	        super(modelo, velocidadMaxima, tripulacionMaxima);
	        this.capacidadCarga = capacidadCarga;
	    }
	    
	    @Override
	    public void despegar() {
	        System.out.println("La nave de carga " + modelo + " está despegando");
	    }
	    
	    @Override
	    public void aterrizar() {
	        System.out.println("La nave de carga " + modelo + " está aterrizando");
	    }
	    
	    public void cargar(int peso) {
	        System.out.println("La nave de carga " + modelo + " está cargando " + peso + " kg");
	    }
	    
	    public int getCapacidadCarga() {
	        return capacidadCarga;
	    }
	}

	public class NaveCombate extends NaveEspacial {
	    private int armamento;
	    
	    public NaveCombate(String modelo, int velocidadMaxima, int tripulacionMaxima, int armamento) {
	        super(modelo, velocidadMaxima, tripulacionMaxima);
	        this.armamento = armamento;
	    }
	    
	    @Override
	    public void despegar() {
	        System.out.println("La nave de combate " + modelo + " está despegando");
	    }
	    
	    @Override
	    public void aterrizar() {
	        System.out.println("La nave de combate " + modelo + " está aterrizando");
	    }
	    
	    public void atacar() {
	        System.out.println("La nave de combate " + modelo + " está atacando con " + armamento + " armas");
	    }
	    
	    public int getArmamento() {
	        return armamento;
	    }
	}
	public class EstacionEspacial {
	    public static void main(String[] args) {
	       
//	    La clase NaveEspacial es una clase abstracta que define las características generales de una nave espacial, como su modelo, velocidad máxima y tripulación máxima. Además, tiene dos métodos abstractos despegar() y aterrizar() que deben ser implementados por las subclases. También tiene un método concreto llamado viajar(), que imprime el modelo de la nave y su velocidad máxima.
	//La clase NaveCarga es una subclase de NaveEspacial que hereda las características generales de una nave espacial y agrega una propiedad de capacidad de carga. Esta clase implementa los métodos despegar() y aterrizar() de la superclase, y agrega un método llamado cargar(int peso) que indica la cantidad de peso que está siendo cargado en la nave.//
	    	//La clase NaveCombate también es una subclase de NaveEspacial que agrega una propiedad de armamento a las características generales de una nave espacial. Esta clase también implementa los métodos despegar() y aterrizar() de la superclase, y agrega un método llamado atacar() que indica la cantidad de armas que están siendo utilizadas para atacar.//
	    	//La clase EstacionEspacial es una clase de prueba que incluye un método main() vacío donde se pueden crear instancias de las clases NaveCarga y NaveCombate.//
	    }
	}
}
