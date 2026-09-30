package MiniProjects.SmartDevices;

public class SmartLight implements SmartDevice, Controllable{
    @Override
    public void increase() {
        System.out.println("Light brightness increased");
    }

    @Override
    public void decrease() {
        System.out.println("Light brightness decrease");
    }

    @Override
    public void turnOn() {
        System.out.println("Light turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Light turned off");
    }
}
