public class Moto {
    String color;
    String marca;
    int  km  ;

    public static void main(String[] args) {
        Moto moto1 = new Moto();

        moto1.color = "negro";
        moto1.marca = "ducati";
        moto1.km = 300;

        System.out.println("el color de la moto1 es :"+moto1.color);
        System.out.println("marca de la moto1 es:"+moto1.marca);
        System.out.println("el kilomtraje de la moto1 es:"+moto1.km);

        Moto moto2 = new Moto();

        moto2.color ="blanco";
        moto2.marca ="mt09 hammaya";
        moto2.km =200;

        System.out.println("el color de la moto2 es :"+moto2.color);
        System.out.println("marca de la moto2 es:"+moto2.marca);
        System.out.println("el kilomtraje de la moto2 es:"+moto2.km);

        Moto moto3 =new Moto();

        moto3.color="azul";
        moto3.marca="dt hammaya";
        moto3.km =120;
        System.out.println("el color de la moto3 es :"+moto3.color);
        System.out.println("marca de la moto3 es:"+moto3.marca);
        System.out.println("el kilomtraje de la moto3 es:"+moto3.km);


    }


    }
