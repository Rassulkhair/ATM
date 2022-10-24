package ATM;

public class Money {
    private int amt;

    public Money(int amt) {
        setAmt(amt);
    }

    public int getAmt() {
        return amt;
    }

    public void setAmt(int amt) {
        if (amt > 0 && amt <= 1_000_000 && amt % Note.KZT100 == 0) {
            this.amt = amt;
        } else {
            throw new RuntimeException("Сумма денег должна быть не более 1 000 000 и кратная 100");
        }
    }
}
