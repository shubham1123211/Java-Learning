package ExceptionHandling;

public class propogrationException {
    static void main(String[] args) {
        try {
            methodA();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void methodC() throws Exception {
        throw new Exception("Error");
    }

    public static void methodB() throws Exception{
        methodC();
    }

    public static void methodA() throws Exception{
        methodB();
    }
}
