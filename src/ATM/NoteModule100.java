package ATM;

public class NoteModule100 extends NoteModule {
    @Override
    void takeMoney(Money money) {
        int countNote = money.getAmt() / Note.KZT100;
        int remind = money.getAmt() % Note.KZT100;
        if (countNote > 0) {
            System.out.println("Выдано " + countNote + " купюр достоинством " + Note.KZT100 + " KZT");
        }
        if (remind > 0 && next != null) {
            next.takeMoney(new Money(remind));
        }
    }
}
