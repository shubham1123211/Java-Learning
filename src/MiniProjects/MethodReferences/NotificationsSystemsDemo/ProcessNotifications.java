package MiniProjects.MethodReferences.NotificationsSystemsDemo;

import java.util.function.Function;

public class ProcessNotifications {
    static void main(String[] args) {
        Function<String, SMS> smsCreator = SMS::new;
        Function<String, Email> emailCreator = Email::new;

        Notifications sms1 = smsCreator.apply("This is the sms1");

        Notifications email1 = emailCreator.apply("This is the email1");

        Function<Notifications, String> showMassage = Notifications::Massage;

        System.out.println(showMassage.apply(sms1));
        System.out.println(showMassage.apply(email1));

        Runnable runSMSStaticMethod = SMS::staticMethod;
        Runnable runEmailStaticMethod = Email::staticMethod;

        runEmailStaticMethod.run();
        runSMSStaticMethod.run();
    }
}
