package rubberduck.KEA19c;

public class Rubberduck {

    private int number;

    public Rubberduck() {
    }

    public Rubberduck(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Number: " + number;
    }
}
