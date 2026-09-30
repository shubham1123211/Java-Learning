package One;

public class ControlFlow {
    public static void main(String[] args) {
        String day = "Tuesday";
        switch(day) {
            case "Monday" -> System.out.println("It's the starting of the day");
            case "Tuesday" -> System.out.println("It's  day 2");
            default -> System.out.println("It's may be holiday");
        }
    }
}
