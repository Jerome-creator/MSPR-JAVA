package fr.epsi.demo.tp2;

public class Main {

    public static void main(String... args){
        AirPlane a =  new AirPlane("Airbus", "A320");

        AirPlane c =  new AirPlane("Airbus", "A320");
        AirPlane b =  new AirPlane("Airbus", "A310", 300);


        b.accelerate(1000);
b.decelerate(30);

        System.out.println(a);
        System.out.println(b);




        System.out.println(b.getSpeed());

        a.setCapacity(1000);
        System.out.println(a.getCapacity());
        System.out.println(a.toString());


        System.out.println(a.equals(c));
        System.out.println("--------------");

        Car c1 = new Car();
        c1.m1();
        c1.m2();
        System.out.println(c1);

        System.out.println("--------------");
        Car t1 = new Truck();
        t1.m1();
        t1.m2();
        System.out.println(t1);

        System.out.println("--------------");
        Car m = new MonsterTruck();
        m.m1();
        m.m2();
        System.out.println(m);





    }
}
