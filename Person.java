package Ktra;

import java.util.Scanner;

public abstract class Person {
    private int id=n;
    private String name;
    private short age;
    private Address address;

    public Person(int id, String name, short age, Address address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Person() {
        ++n;
        address=new Address();
    }

    public static int n = 1;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public static int getN() {
        return n;
    }

    public static void setN(int n) {
        Person.n = n;
    }

    public abstract String getCapacity();

    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ten:");
        name=sc.nextLine();
        System.out.println("Nhap tuoi:");
        age=sc.nextShort();
        sc.nextLine();
        address.input();
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
