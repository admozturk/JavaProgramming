package day39_Review_Encapsulation_Inheritance.shapeTask;

public class Shape {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name==null){
            System.err.println("name cannot be null");
            System.exit(1);// 1: something went wrong
        }
        if (name.isEmpty()||name.isBlank()){
            System.err.println("Invalid name");
            System.exit(1);
        }
        this.name = name;
    }





}
