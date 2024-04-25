
public class TestCirculoPunto {
	
	public static void main(String[] args) {
		//Creamos los puntos y los circulos
		Circulo c1 = new Circulo();
		Circulo c2 = new Circulo();
		Punto p1 = new Punto();
		Punto p2= new Punto(5,9);
		//Damos valores a lso circulos
		c1.setRadio(5);
		c1.getRadio();
				
		//Copia circulo
		c2.Circulo(c1);
		//Cambaimos los valores de la x e y de los ptos
		p1.setX(2);
		p1.setY(4);
		p2.setX(1);
		p2.setY(5);
		//Dibujamos por consola
		System.out.print("Primer punto :\n");
		System.out.println(p1.toString());
		System.out.print("segundo punto\n");
		System.out.println(p2.toString());
		System.out.print("La distancia entre los puntos es :\n");
		System.out.print(p1.Distancia(p2));
		
		
		
	}

}