
public class Circulo {
	//Atributos
	final double PI =3.141592; 
	private double radio ;
	
	//Constructor
	public Circulo (double radio) {

		this.radio = radio;
	
	}
	
	public Circulo() {
		radio=0;
		// TODO Auto-generated constructor stub
	}

	public void Circulo(Circulo c) {
		this.radio=c.radio;
	}

	//Metodos 
	
	public double AreaCirculo () {
		
	return radio * radio *3.141592;
	
	}

	public double getRadio () { 
		return radio ; }

	public void setRadio ( double d) {
		radio = d;
		}
	
	public void Radio2(Circulo c1) {

		radio=c1.getRadio();
	}
	public double Perimetro(double radio) {
		return 1*PI*radio;
	}
	
}

