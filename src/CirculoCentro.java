
public class CirculoCentro {
	private Circulo circulo;
	private Punto centro;
	private final double Pi=3.1416;
	
	public CirculoCentro() {
		circulo=new Circulo();
		centro=new Punto();
		
	}
	public CirculoCentro(double radio, int centrox,int  centroy) {
		circulo=new Circulo(radio);
		centro=new Punto(centrox,centroy);
	}
	public Punto getCentro() {
		return centro;
	}
	public void setCentro(int x, int y) {
		centro.setX(x);
		centro.setY(y);
	}
	public void setRadio(double radio){
		circulo.setRadio(radio);
		
	}
	public double getRadio() {
		return circulo.getRadio();
	}
	public double calculaperimetro() {
		return Pi*(circulo.getRadio()*circulo.getRadio());
	}
	public static boolean Juntas(CirculoCentro a,CirculoCentro b ){
		if(a.getCentro()==b.getCentro()) {
			return true;
		}
		else return false;
	}
	public String toString() {
		return String.format("%s,%d","El radio de la circunfrencia es :", getRadio());
	}
	/*//Atributos
	private Punto pe;
	private int x,y;
	private double radio;
	//Constructores
	public CirculoCentro(int x,int y, double radio){
		this.x=x;
		this.y=y;
		this.radio=radio;
		
	}
	public CirculoCentro() {
		x=0;
		y=0;
		radio=0;
	}
	//Metodos
	public void setX(int x) {
		pe.setX(x);
	}
	public int getx() {
		return pe.getX();
	}
	public void setY(int y) {
		pe.setY(y);
	}
	public int getY() {	
		return pe.getY();
	}
	public void setradio(double radio) {
		 this.radio=radio;
	}
	public double getRadio() {
		return getRadio();
	}*/
	
	
	
	
}
