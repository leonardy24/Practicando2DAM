
public class Practica3ConClases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


class Cuenta{
	
	private String titular;
	private double cantidad;
	

	//CONTRUCTOR POR DEFECTO
	public Cuenta() {
		
	}
	
	public Cuenta(String titular, double cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}
	
	//SOBRECARGA DE CONTRUCTORES
	public Cuenta(String titular) {
		this(titular,0);
	}
	
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		//DEBO REVISAR PORQUE SE DEBE PASAR COMO UNA COPIA, CLONEABLE
		this.titular = titular;
	}
	
	public Double getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Cuenta [titular=" + titular + ", cantidad=" + cantidad + "]";
	}
	
	public void  Ingresar(double cantidad) {
		
		if(cantidad>0) {
			this.cantidad += cantidad;
		}else {
			System.out.println("Error en cantidad");
		}
		
		
		
	}
	
	public void retirar(double retirada) {
		
		if(this.cantidad - retirada < 0) {
			
			this.setCantidad((double) 0);
		}else {
			
			this.cantidad -= retirada;
		}
	}
	
}
