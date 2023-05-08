package Lec_15;

public class Person {
    private int age;
    private String name;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age) throws Exception {
        if(age<0){
//            System.out.println("Invalid");
            throw new Exception("Age cannot be invalid");
//            return;
        }
        this.age=age;
    }
    public void setAge1(int age){
        try{
            if(age<0){
                throw new Exception("Age is invalid");
            }
            this.age=age;
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println(e);
        }
    }
    public void setName(String name){
        this.name=name;
    }
}
