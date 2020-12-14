
import java.util.Scanner;

public class ManagerBook {

    public static void main(String[] args) {
        Books[] lisBook = new Books[20];
        var choices = 0;
        var input = new Scanner(System.in);
        do {
            System.out.println("1: Them Sach ");
            System.out.println("2: Hien Thi Sach ");
            System.out.println("3: Edit ");
            System.out.println("4: Sach Co So Tien Lon Nhat ");
            System.out.println("5: Tong To Tien Trong Thu Vien ");
            System.out.println("0: De Thoat");
            choices = input.nextInt();
            input.nextLine();
            switch (choices) {
                case 0:
                    System.out.println("Chao Va Hen Gap Lai");
                case 1:
                    addBook(lisBook, input);
                    break;
                case 2:
                    display(lisBook);
                    break;
                case 3:
                    System.out.println("Nhap Vi Tri Ban Muon Sua");
                    var index = input.nextInt();
                    edit(lisBook, index);
                    break;
                case 4:
                    getMaxPrice(lisBook);
                    break;
                case 5:
                    getTotalPrice(lisBook);
                    break;
            }
        } while (choices != 0);
    }

    private static int getTotalPrice(Books[] books) {
        int sum = 0;
        for (Books book : books) {
            if (book != null) {
                sum += book.getTottalPrice();
            }
        }
        return sum;
    }

    private static int getMaxPrice(Books[] books) {
        int max = books[0].getPrice();
        for (Books book : books) {
            if (book != null && book.getPrice() > max) {
                max = book.getPrice();
            }
        }
        return max;
    }

    private static void edit(Books[] lisBook, int index) {
        for (Books books : lisBook) {
            if (books.equals(index)) {
                var input = new Scanner(System.in);
                System.out.println("Nhap Ten Sach");
                var id = input.nextLine();
                books.setName(id);
                System.out.println("Nhap Ten Tac Gia");
                var other = input.nextLine();
                books.setAuthor(other);
                System.out.println("Nhap Gia Ban");
                var price = input.nextInt();
                books.setPrice(price);
                System.out.println("So Tien");
                var amount = input.nextInt();
                books.setAmount(amount);
                System.out.println("Can Nang");
                var width = input.nextDouble();
                books.setWeight(width);
            }
        }
    }

    private static void display(Books[] lisBook) {
        System.out.printf("%-12s%-12s%-12s%-12s%-12s\n",
                "Ten Sach", "Tac Gia", "Gia Ban", "So Tien", "Can Nang");
        for (Books books : lisBook) {
            show(books);
        }
    }

    private static void show(Books books) {
        System.out.printf("%-12s%-12s%-12s%-12s%-12s\n",
                books.getName(), books.getAuthor(), books.getPrice(), books.getAmount(), books.getWeight());
    }


    private static void addBook(Books[] lisBook, Scanner input) {
        System.out.println("Nhap So Sach Ban Muon Them");
        var n = input.nextInt();
//        Books[] lisBook = new Books[20];
        for (int i = 0; i < n; i++) {
            lisBook[i] = add();
        }
    }

    private static Books add() {
        var input = new Scanner(System.in);
        System.out.println("Nhap Ten Sach");
        var name = input.nextLine();
        System.out.println("Nhap Tac Gia");
        var other = input.nextLine();
        System.out.println("Nhap Gia Ban");
        var price = input.nextInt();
        System.out.println("Nhap So Tien");
        var amount = input.nextInt();
        System.out.println("Nhap Can Nang");
        var width = input.nextDouble();
        return new Books(name, other, price, amount, width);
    }
}
