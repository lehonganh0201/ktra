package Ktra;

import java.util.Scanner;

public class Student extends Person{
    private double score;

    public Student(int id, String name, short age, Address address, double score) {
        super(id, name, age, address);
        this.score = score;
    }

    public Student(double score) {
        this.score = score;
    }

    public Student(int id, String name, short age, Address address) {
        super(id, name, age, address);
    }

    public Student() {
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String getCapacity() {
        if(score>=9.0){
            return "Xuat sac";
        }
        if(score >= 8.0){
            return "Gioi";
        }
        if(score >= 6.5){
            return "Kha";
        }
        else {
            return "Trung binh yeu";
        }
    }

    public static void inTieuDe(){
        System.out.printf("%-10s%-20s%-20s%-20s%-20s%-20s\n","ID","Name","Age","Address","Score","Capacity");
    }

    public void input(){
        Scanner sc=new Scanner(System.in);
        super.input();
        System.out.println("Nhap diem:");
        score=sc.nextDouble();
        sc.nextLine();
    }

    @Override
    public String toString() {
        return String.format("%-10d%-20s%-20d%-20s%-20.2f%-20s",getId(),getName(),getAge(),getAddress().toString(),getScore(),getCapacity());
    }
}
