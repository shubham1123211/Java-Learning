package MiniProjects.SmartDevices;

public class Devices {
    static void main(String[] args) {
        SmartLight light = new SmartLight();
        light.increase();
        light.decrease();
        light.turnOn();
        light.turnOff();

        SmartFan fan = new SmartFan();
        fan.decrease();
    }
}
