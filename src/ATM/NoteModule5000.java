package ATM;

public class NoteModule5000 extends NoteModule {
    @Override
    void takeMoney(Money money) {
        int countNote = money.getAmt() / Note.KZT5000;
        int remind = money.getAmt() % Note.KZT5000;
        if (countNote > 0) {
            System.out.println("Выдано " + countNote + " купюр достоинством " + Note.KZT5000 + " KZT");
        }
        if (remind > 0 && next != null) {
            next.takeMoney(new Money(remind));
        }
    }
}
