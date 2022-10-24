package ATM;

public class NoteModule1000 extends NoteModule {
    @Override
    void takeMoney(Money money) {
        int countNote = money.getAmt() / Note.KZT1000;
        int remind = money.getAmt() % Note.KZT1000;
        if (countNote > 0) {
            System.out.println("Выдано " + countNote + " купюр достоинством " + Note.KZT1000 + " KZT");
        }
        if (remind > 0 && next != null) {
            next.takeMoney(new Money(remind));
        }
    }
}
