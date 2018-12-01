public class MarsRobot implements Robot {
    String status;
    int speed;
    float temperature;

    //metoda
    public void checkTemperature() {
        if (temperature < -80) {
            status = "powrót do domu";
            speed = 5;
        }
    }

    public void showAttribiutes() {
        System.out.println("Status: " + status);
        System.out.println("Predkosc: " + speed);
        System.out.println("Temepratura: " + temperature);
    }
    public void checkStatus(){
        System.out.println("Status: " + status);
    }
}
