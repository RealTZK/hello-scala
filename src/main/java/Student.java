public class Student {
    private String name;
    private Integer age;
    private static String school = "hrbust";

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "{\"Student\":{"
                + "\"name\":\"" + name + "\""
                + ", \"age\":\"" + age + "\""
                + ", \"school\":\"" + Student.school + "\""
                + "}}";
    }

    public static void main(String[] args) {
        Student tzk = new Student("tzk", 23);
        Student jxd = new Student("jxd", 23);
        tzk.printInfo();
        jxd.printInfo();
    }
}
