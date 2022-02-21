public class TestOperator {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = new String("hello");

        boolean equal = s1 == s2;
        System.out.println(equal);
        System.out.println(s1.equals(s2));
    }
}
