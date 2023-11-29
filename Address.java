package Ktra;

import java.util.Scanner;

public class Address {
    private String district;
    private String city;

    public Address(String district, String city) {
        this.district = district;
        this.city = city;
    }

    public Address() {
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap tinh:");
        district=scanner.nextLine();
        System.out.println("Nhap thanh pho:");
        city=scanner.nextLine();
    }

    @Override
    public String toString() {
        return district+", "+city;
    }
}
