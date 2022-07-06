public class EjercicioTema3 {
    public static void main(String[] args) {
    int res;
    res = suma(10,10,10);
        System.out.println(res);
        sumar(1,2,3);

//*****SEGUNDA PARTE *****
        Coche miCoche = new Coche();
        miCoche.incrementarPuertas();
        System.out.println(miCoche.numPuertas);//??
    }

    //*****PRIMERA PARTE *****
public  static int suma(int a, int b, int c){
    return a+b+c;
    }

    public static void sumar(int a, int b, int c){
        int resultado;
        resultado = a+b+c;
        System.out.println("suma con void "+ resultado);

    }
    //*****SEGUNDA PARTE *****
    public  static class Coche {
        public int numPuertas = 4;
        public void incrementarPuertas(){
            this.numPuertas++;
        }


    }
}