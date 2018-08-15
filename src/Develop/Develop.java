package Develop;

public class Develop {
    public String string;
    public Develop(String string) {
        System.out.println(string);
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public void createDeveloper(){
        System.out.println("I'm a new developer");
    }
}
