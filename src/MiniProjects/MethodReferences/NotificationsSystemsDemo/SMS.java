package MiniProjects.MethodReferences.NotificationsSystemsDemo;

public class SMS extends Notifications{
    public SMS(String massage){
        super(massage);
    }

    @Override
    public String Massage() {
        return "SMS : "+super.getMassage();
    }

    public static void staticMethod(){
        System.out.println("this is static method of SMS");
    }
}
