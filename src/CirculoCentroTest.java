
public class CirculoCentroTest {

	public static void main(String[] args) {
		Punto punto=new Punto();
		Punto punto2=new Punto(5,9);
		Punto punto3=new Punto(3,0);
		
		Circulo circulo=new Circulo();
		Circulo circulo1=new Circulo(6);
		Circulo circulo2=new Circulo(1.5);
		
		CirculoCentro circulocentro=new CirculoCentro();
		CirculoCentro circulocentro1=new CirculoCentro(1,4,6);
		CirculoCentro circulocentro2=new CirculoCentro(1,4,6);
		System.out.println("Estan juntas la circunferencia 1, con la 2?");
		System.out.print(CirculoCentro.Juntas(circulocentro1,circulocentro2));
		System.out.println();
		System.out.println(circulocentro1.calculaperimetro());
	}

}
