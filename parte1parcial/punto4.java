package parte1parcial;

public class punto4 {
	public abstract class NaveEspacial {
	    private String nombre;
	    private String tipo;
	    private int capacidadCarga;
	    private int velocidadMaxima;

	    public NaveEspacial(String nombre, String tipo, int capacidadCarga, int velocidadMaxima) {
	        this.nombre = nombre;
	        this.tipo = tipo;
	        this.capacidadCarga = capacidadCarga;
	        this.velocidadMaxima = velocidadMaxima;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public String getTipo() {
	        return tipo;
	    }

	    public int getCapacidadCarga() {
	        return capacidadCarga;
	    }

	    public int getVelocidadMaxima() {
	        return velocidadMaxima;
	    }

	    public abstract void despegar();

	    public abstract void aterrizar();

	    public abstract void acelerar(int incremento);

	    public abstract void frenar(int decremento);
	}
	public class NaveCarga extends NaveEspacial {
	    private int espacioDisponible;

	    public NaveCarga(String nombre, int capacidadCarga, int velocidadMaxima, int espacioDisponible) {
	        super(nombre, "Carga", capacidadCarga, velocidadMaxima);
	        this.espacioDisponible = espacioDisponible;
	    }

	    public int getEspacioDisponible() {
	        return espacioDisponible;
	    }

	    public void setEspacioDisponible(int espacioDisponible) {
	        this.espacioDisponible = espacioDisponible;
	    }

	    public void cargar(int cantidad) {
	        if (cantidad <= espacioDisponible) {
	            espacioDisponible -= cantidad;
	            System.out.println("Cargando " + cantidad + " toneladas de carga.");
	        } else {
	            System.out.println("No hay suficiente espacio disponible para cargar " + cantidad + " toneladas de carga.");
	        }
	    }

	    public void descargar(int cantidad) {
	        if (cantidad <= (getCapacidadCarga() - espacioDisponible)) {
	            espacioDisponible += cantidad;
	            System.out.println("Descargando " + cantidad + " toneladas de carga.");
	        } else {
	            System.out.println("No hay suficiente carga para descargar " + cantidad + " toneladas de carga.");
	        }
	    }

	    @Override
	    public void despegar() {
	        System.out.println("Despegando la nave de carga "); 

}

		@Override
		public void aterrizar() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void acelerar(int incremento) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void frenar(int decremento) {
			// TODO Auto-generated method stub
			
			//La primera parte del código define una clase abstracta llamada NaveEspacial que tiene 4 atributos privados (nombre, tipo, capacidadCarga, velocidadMaxima) y 4 métodos abstractos (despegar, aterrizar, acelerar, frenar). Los métodos abstractos no tienen cuerpo, lo que significa que las clases que heredan de NaveEspacial deben implementarlos.//
			//Este código está escrito en el lenguaje de programación Java.La primera parte del código define una clase abstracta llamada NaveEspacial que tiene 4 atributos privados (nombre, tipo, capacidadCarga, velocidadMaxima) y 4 métodos abstractos (despegar, aterrizar, acelerar, frenar). Los métodos abstractos no tienen cuerpo, lo que significa que las clases que heredan de NaveEspacial deben implementarlos.La segunda parte del código define una clase llamada NaveCarga que hereda de la clase NaveEspacial. La clase NaveCarga tiene un atributo adicional llamado espacioDisponible y dos métodos adicionales llamados cargar y descargar. La clase NaveCarga también implementa los métodos abstractos heredados de NaveEspacial (despegar, aterrizar, acelerar, frenar) y proporciona una implementación concreta para el método despegar.
		//este código define dos clases en Java: una clase abstracta NaveEspacial y una clase NaveCarga que hereda de ella. La clase NaveCarga tiene funcionalidades adicionales específicas para las naves de carga, como la capacidad de cargar y descargar carga y la capacidad de verificar el espacio disponible.
		}
	}
}
