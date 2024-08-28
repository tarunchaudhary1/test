public class person_Client {
    public static void main(String[] args) throws Exception {
        person p = new person("tarun",-19);
        p.setAge(-20);
        System.out.println(p.getName() + " "+ p.getAge());
    }
}