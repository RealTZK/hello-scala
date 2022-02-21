public class TestDataTypeConversion {
    public static void main(String[] args) {
        byte b = 10;
        test(b);
        char c = 'c';
        short c2 = (short) c;
        test(c2);
    }

//    private static void test(byte b) {
//        System.out.println("bbbb");
//    }

//    private static void test(short s) {
//        System.out.println("ssss");
//    }

    private static void test(char c) {
        System.out.println("cccc");
    }

    private static void test(int i) {
        System.out.println("iiii");
    }
}
