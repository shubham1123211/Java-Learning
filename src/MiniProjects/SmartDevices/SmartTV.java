package MiniProjects.SmartDevices;

public class SmartTV implements SmartDevice, Controllable {

    @Override
    public void increase() {
        System.out.println("TV volume increased");
    }

    @Override
    public void decrease() {
        System.out.println("TV volume decrease");
    }

    @Override
    public void turnOn() {
        System.out.println("TV turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("TV turned off");
    }
}
