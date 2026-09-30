package MiniProjects.SmartDevices;

public class SmartFan implements SmartDevice, Controllable{
    @Override
    public void increase() {
        System.out.println("Fan speed increased");
    }

    @Override
    public void decrease() {
        System.out.println("Fan speed decrease");
    }

    @Override
    public void turnOn() {
        System.out.println("Fan turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan turned off");
    }

}
