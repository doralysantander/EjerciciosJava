public class EjercicosTema4 {
    public static void main(String[] args ){
    int numeroIf = -1;
    if(numeroIf >0){
        System.out.println("El numero es positivo");

    } else if(numeroIf<0){
        System.out.println("El numero es Negativo");
    }
    else{
        System.out.println("El numero es 0");
    }
    //********+SEGUNDO EJERCICIO*************

        int numeroWhile = 0;
        while(numeroWhile < 3){
            numeroWhile++;
            System.out.println("ciclowhile " + numeroWhile);
    }
//********+TERCER EJERCICIO*************
        do{

            System.out.println("numero dowhile" + numeroWhile);
            numeroWhile++;
            break;


        }while(numeroWhile < 3);

        //********CUARTO EJERCICIO*************

        for(int numeroFor=1;numeroFor<=3;numeroFor++){
            System.out.println("cicloFor " + numeroFor);
        }

        //********QUINTO EJERCICIO*************
        var estacion = "primavera";
        switch(estacion){
            case "verano":
                System.out.println("Es VERANO");
                break;

            case "invierno":
                System.out.println("Es invierno");
                break;

            case "primavera":
                System.out.println("Es PRIMAVERA");
                break;

            case "otoño":
                System.out.println("Es OTOÑO");
                break;

            default:
                System.out.println("Ninguna estacion");
        }


    }

}
