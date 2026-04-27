class Person {
    private String name;
    private int age;
    private String address;

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }
}

public class Main {
    public static void main(String[] args) {

        Person person = new Person();

        person.setName("山本");
        person.setAge(22);
        person.setAddress("東京");

        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getAddress());
    }
}