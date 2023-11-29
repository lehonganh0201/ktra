package Ktra;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentServiceImpl service=new StudentServiceImpl();
        while (true){
            System.out.print("1.Thêm sinh viên vào danh sách\n");
            System.out.print("2.Xóa sinh viên theo id\n");
            System.out.print("3.Tìm sinh viên chứa tên yêu cầu\n");
            System.out.print("4.Sắp xếp danh sách sinh viên theo score giảm dần\n");
            System.out.print("5.Hiển thị danh sách sinh viên\n");
            System.out.println("6.Thoat khoi chuong trinh");
            System.out.print("Nhap lua chon:");
            int n=sc.nextInt();
            sc.nextLine();
            switch (n){
                case 1:
                    Student student=new Student();
                    student.input();
                    service.addStudent(student);
                    break;
                case 2:
                    System.out.println("Nhap id muon xoa:");
                    int id=sc.nextInt();
                    sc.nextLine();
                    service.deleteStudent(id);
                    break;

                case 3:
                    System.out.println("Nhap ten muon tim:");
                    String str=sc.nextLine();
                    Student.inTieuDe();
                    System.out.println(service.searchStudent(str));
                    break;

                case 4:
                    service.sortedStudent();
                    System.out.println("Sap xep thanh cong");
                    break;

                case 5:
                    Student.inTieuDe();
                    service.showAllStudent();
                    break;

                case 6:
                    return;
            }
        }
    }
}
