package MiniProjects.MethodReferences.NotificationsSystemsDemo;

public abstract class Notifications {
    private String massage;
    public Notifications(String massage) {
        this.massage = massage;
    }
    public String getMassage() {
        return massage;
    }
    public abstract String Massage();
}
