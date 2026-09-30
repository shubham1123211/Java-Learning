package MiniProjects.MethodReferences.NotificationsSystemsDemo;

public class Email extends Notifications{
    public Email(String massage){
        super(massage);
    }

    @Override
    public String Massage(){
        return "Email : "+super.getMassage();
    }

    public static void staticMethod(){
        System.out.println("This is the email static method");
    }
}
