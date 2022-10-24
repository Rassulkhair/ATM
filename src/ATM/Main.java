package ATM;

public class Main {
    public static void main(String[] args) {
        NoteModule noteModule5000=new NoteModule5000();
        NoteModule noteModule1000=new NoteModule1000();
        NoteModule noteModule500=new NoteModule500();
        NoteModule noteModule100=new NoteModule100();
        noteModule5000.setNextMoneyModule(noteModule1000);
        noteModule1000.setNextMoneyModule(noteModule500);
        noteModule500.setNextMoneyModule(noteModule100);

        noteModule5000.takeMoney(new Money(566_000));
    }
}