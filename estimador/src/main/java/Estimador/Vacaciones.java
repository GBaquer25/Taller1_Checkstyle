package Estimador;

/**
 * Clase estimador
 * @author Baquerizo Anastacio Génesis 
 */

public class Vacaciones {
	
	private String destino;
	private int totalViajantes;
	private int diasDeViaje;
	
	public String getDestino() {
		return destino;
	}
	
	public void setDestino(String destino) {
		
		this.destino = destino;
	}
	
	public int getTotalViajantes() {
		
		return totalViajantes;
	}
	
	public void setTotalViajantes(int totalViajantes) {
		
		this.totalViajantes = totalViajantes;
	}
	
	public int getDiasDeViaje() {
		
		return diasDeViaje;
	}
	
	public void setDiasDeViaje(int diasDeViaje) {
		
		this.diasDeViaje = diasDeViaje;
	}

	private double costoTotal = 0;
	private double precioBase = 1000;
	private double descuento;

	public Vacaciones() {
		
	}
	
	public Vacaciones(String destino, int totalViajantes, int diasDeViaje) {
		
		this.destino = destino;
		this.totalViajantes = totalViajantes;
		this.diasDeViaje = diasDeViaje;
	}
	
	private double validarNumeroPasajeros() {
		if (totalViajantes > 80) {
			return -1;
		}
		
		if (destino.equals("Paris")) {
			int adicional = 500;
			costoTotal = precioBase + adicional;
		} else if (destino.equals("New York")) {
			int adicional = 600;
			costoTotal = precioBase + adicional;
		}
		else if (4 < totalViajantes || totalViajantes < 10) {
			descuento = 0.10;
			costoTotal = costoTotal * descuento;
		}
		else if (totalViajantes > 10) {
			descuento = 0.20;
			costoTotal = costoTotal * descuento;
		}
		else if (diasDeViaje < 7) {
			costoTotal = costoTotal + 200;
		}
		else if (diasDeViaje > 30 || totalViajantes == 2) {
			costoTotal = costoTotal - 200;
		}
		return costoTotal;
	}
}
