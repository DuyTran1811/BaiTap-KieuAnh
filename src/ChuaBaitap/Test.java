package ChuaBaitap;

import java.util.Scanner;

public class Test {
    static ManagerBook managerBook = new ManagerBook();
    public static void main(String[] args) {
        var input = new Scanner(System.in);
        var choice = 0;
        Boooks boooks = new Boooks();
        do {
            System.out.println("1: Them Danh Sach");
            System.out.println("2: Sua");
            System.out.println("3: Tim Gia Lon Nhat");
            System.out.println("4: Tinh Tong Tien");
            System.out.println("0: Thoat");
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 0:
                    System.out.println("Cam on Ban da dung dich vu");
                case 1:
                    creatNewBook(input);
                    break;
                case 2:
                    System.out.println("Nhap Index");
                    var index = input.nextInt();
                    managerBook.editBook(index,boooks);
                    break;
                case 3:
                   managerBook.getMaxPrice();
                   break;
                case 4:
                    boooks.getTottalWeight();
                    break;
            }
        } while (choice != 0);
    }


    private static void creatNewBook(Scanner input) {
        System.out.println("Nhap Ten Sach");
        var name = input.nextLine();
        System.out.println("Nhap Tac Gia");
        var author = input.nextLine();
        System.out.println("Nhap Gia");
        var price = input.nextInt();
        System.out.println("Nhap So Tien");
        var amount = input.nextInt();
        System.out.println("Nhap Can Nang");
        var weight = input.nextDouble();
        Boooks boooks = new Boooks(name, author, price, amount, weight);
        managerBook.addBook(boooks);
    }
}
