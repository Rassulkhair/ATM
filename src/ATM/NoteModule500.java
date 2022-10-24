package ATM;

public class NoteModule500 extends NoteModule {
    @Override
    void takeMoney(Money money) {
        int countNote = money.getAmt() / Note.KZT500;
        int remind = money.getAmt() % Note.KZT500;
        if (countNote > 0) {
            System.out.println("Выдано " + countNote + " купюр достоинством " + Note.KZT500 + " KZT");
        }
        if (remind > 0 && next != null) {
            next.takeMoney(new Money(remind));
        }
    }
}
