public class Cat {
    private String name;
    private String color;
    private String age;

    public Cat() {
    }
    public Cat(String name, String color, String age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(String age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
    public String getAge() {
        return age;
    }

}
