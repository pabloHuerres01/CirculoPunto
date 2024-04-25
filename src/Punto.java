public class Punto {
  private int x;
  private int y;

  // Constructor
  
  public Punto(int x,int y) {
    this.x = x;
    this.y = y;
  }
  public Punto() {
	  this.x=0;
	  this.y=0;
  }

  // Metodos getset
  
  public int getX() {
    return x;
  }
  
  public void setX(int x) {
	  this.x=x;
  }

  public int getY() {
    return y;
  }
  public void setY(int y) {
	  this.y=y;
  }

  // devuelve la distancia a otro punto
  
  public double Distancia(Punto Punto) {
    double x1 = x - Punto.getX();
    double y1 = y - Punto.getY();
    return Math.sqrt(x1 * x1 + y1 * y1);
  }


  // toString: devuelve una cadena con la representacion del objeto
  
  public String toString() {

    return "(" + x + ", " + y + ")";
  }
}