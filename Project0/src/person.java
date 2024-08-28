public class person {
    private String name="Raj";
    private int age = 18;
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) throws Exception {
        try{
            if(age<0){
                throw new Exception("bklol age -ve nhi hoti");
            }
            this.age = age;
        }
        catch(Exception e){
            e.printStackTrace();
        }
//        if(age<0){
//            throw new Exception("bklol age -ve nhi hoti hai");
//        }
        this.age = age;
    }
    public person(String name, int age){
        this.name=name;
        this.age=age;
    }
}
