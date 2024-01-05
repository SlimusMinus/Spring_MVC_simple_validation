package spring.mvc;

public class Duck {
    String name;
    int id;

    public Duck(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String sayQuack(){
        return "QA";
    }
}
