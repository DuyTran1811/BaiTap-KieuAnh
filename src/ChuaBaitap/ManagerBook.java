package ChuaBaitap;

public class ManagerBook {
    private Boooks[] boooksList = new Boooks[20];

    public ManagerBook() {
    }

    public ManagerBook(Boooks[] boooks) {
        this.boooksList = boooks;
    }

    public void setBoooks(Boooks[] boooks) {
        this.boooksList = boooks;
    }

    public void addBook(Boooks newBook) {
        for (int i = 0; i < boooksList.length; i++) {
            if (boooksList[i] == null) {
                boooksList[i] = newBook;
                System.out.println("Them moi thanh cong");
                return;
            }
        }
        System.out.println("Thu Vien da day");
    }

    public void editBook(int index, Boooks newBook) {
        if (index < 20 && index >= 0) {
            if (boooksList[index] != null)
                boooksList[index] = newBook;
            else return;
        }
    }

    public int getMaxPrice() {
        int sumPrice = 0;
        for (Boooks b : boooksList) {
            if (b != null) sumPrice += b.getTottalPrice();
        }
        return sumPrice;
    }
}
