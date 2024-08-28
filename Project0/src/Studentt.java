public class Studentt {
    private String name = "Raj";
    private int age = 18;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Studentt(){
    }
    public Studentt(String name , int age){
        this.name = name;
        this.age=age;
    }
}