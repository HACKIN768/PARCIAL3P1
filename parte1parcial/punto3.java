package parte1parcial;

public class punto3 {
	public abstract class NaveEspacial {
	    protected int velocidadMaxima;
	    protected int capacidadCarga;

	    public abstract void acelerar();
	    public abstract void frenar();
	}
	public class Carga extends NaveEspacial {
	    public void acelerar() {
	        System.out.println("La nave de carga está acelerando...");
	    }

	    public void frenar() {
	        System.out.println("La nave de carga está frenando...");
	    }
	}

	public class Exploracion extends NaveEspacial {
	    public void acelerar() {
	        System.out.println("La nave de exploración está acelerando...");
	    }

	    public void frenar() {
	        System.out.println("La nave de exploración está frenando...");
	    }
	}
	public static void main(String[] args) {
	    NaveEspacial nave1 = new Carga();
	    NaveEspacial nave2 = new Exploracion();

	    nave1.acelerar();
	    nave2.frenar();
	    
	    //Las clases Carga y Exploracion heredan de la clase NaveEspacial y deben implementar los métodos abstractos acelerar() y frenar(). En este ejemplo, cada una de estas clases implementa los métodos de forma diferente, imprimiendo un mensaje que indica si la nave está acelerando o frenando.//
	    //En el método main(), se crean dos objetos: nave1, que es una instancia de la clase Carga, y nave2, que es una instancia de la clase Exploracion. Luego, se llama a los métodos acelerar() y frenar() de cada objeto, que ejecutan la implementación de los métodos de cada clase correspondiente.//
	}

}
