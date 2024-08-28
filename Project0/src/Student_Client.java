public class Student_Client {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "kaju";
        s.age = 19;
        System.out.println(s.name);
        System.out.println(s.age);
        s.Intro_yourself();

        Student s1 = new Student();
        s1.name = "kaju";
        s1.age = 19;
        System.out.println(s1.name);
        System.out.println(s1.age);
        s1.Intro_yourself();

        s1.sayHey("Tarun");
    }
    static {
        System.out.println("In Main Method");
    }
}
