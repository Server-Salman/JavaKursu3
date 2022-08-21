package Gun38.Soru1;

import java.util.ArrayList;

public class FabrikaMain {
    public static void main(String[] args) {
        TeslaCar tesla=new TeslaCar("model 5", 310);
        ToyotaPirus tp=new ToyotaPirus("pirus",1200);
        Bus bus=new Bus("IVECO", 7000);

        ArrayList<Vehicle> arabalar=new ArrayList<>();
        arabalar.add(tesla);
        arabalar.add(tp);
        arabalar.add(bus);

        for(Vehicle v : arabalar){
            System.out.println(v.getClass().getSimpleName());
            System.out.println("--------------------------");

            System.out.println("Model = " + v.getModel());
            System.out.println("Engine = " + v.getEngine());

            if (v instanceof TeslaCar){
                System.out.println( ((TeslaCar)v).drive());
                System.out.println( ((TeslaCar)v).changeBattery());
            }

            if (v instanceof ToyotaPirus){
                System.out.println( ((ToyotaPirus)v).drive());
                System.out.println( ((ToyotaPirus)v).changeBattery());
                System.out.println( ((ToyotaPirus)v).changeOil());
            }

            if (v instanceof Bus){
                System.out.println( ((Bus)v).drive());
                System.out.println( ((Bus)v).changeDiesel());
            }
        }



    }
}
