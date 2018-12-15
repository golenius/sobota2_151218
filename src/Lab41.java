public class Lab41 {
    public static void main(String[] args) {
        //MarsRobot marsRobot = new MarsRobot();
        //marsRobot.
        MarsRobot marsRobot;
        marsRobot = new MarsRobot(-200);
        marsRobot = new MarsRobot();

    }


}

class MarsRobot {
    public String status;
    public int speed;
    public float temperature;

    //public void checkTemperature() {
      MarsRobot( float temperature){
        if (temperature < -80) {
            status = "powrot do domu";
            speed = 5;
        }
    }

    //public void showAttributes() {
    MarsRobot(){
        System.out.println("Status: " + status);
        System.out.println("Predkosc: " + speed);
        System.out.println("Temperatura: " + temperature);
    }
}