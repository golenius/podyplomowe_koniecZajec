public class MarsApplication {
    public static void main(String[] args) {

        //tworzymy egzemplarz klasy marsrobot
        MarsRobot spirit = new MarsRobot();

        MarsRobot opportunity = new MarsRobot();

        spirit.status = "eksploracja";
        spirit.speed = 2;
        spirit.temperature = -60;

        spirit.showAttribiutes();

        System.out.println("Zwiekszenie predkosci do 3");
        spirit.speed =3;
        spirit.showAttribiutes();

        System.out.println("Zmiana temperatury na -90");
        spirit.temperature = -90;
        spirit.showAttribiutes();

        System.out.println("Sprawdzenie temperatury");
        spirit.checkTemperature();
        spirit.showAttribiutes();

        //Lab2
        System.out.println("+++++Lab2+++++");
        opportunity.status = "wiercenie";
        opportunity.temperature = -20;
        opportunity.speed = 10;
        opportunity.checkTemperature();
        opportunity.showAttribiutes();


    }
}
