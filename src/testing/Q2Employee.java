package testing;

public class Q2Employee {

    String city;
    String name;
    int age;

    public  Q2Employee(String city, String name, int age) {
        this.city=city;
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return name+", "+city+", "+age;
    }

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
