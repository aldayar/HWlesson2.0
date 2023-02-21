public class Pear extends Fruit{
    private char firstLetter;
    private int smallestPear;

    public Pear(String name, int size,  char firstLetter, int smallestPear) {
        super(name, size, Color.YELLOW);
        this.firstLetter = firstLetter;
        this.smallestPear = smallestPear;
    }

    public char getFirstLetter() {
        return firstLetter;
    }

    public void setFirstLetter(char firstLetter) {
        this.firstLetter = firstLetter;
    }

    public int getSmallestPear() {
        return smallestPear;
    }

    public void setSmallestPear(int smallestPear) {
        this.smallestPear = smallestPear;
    }

    @Override
    public void print() {
        System.out.println(" First letter of Pear: "+ firstLetter+
                "\nColor"+Color.ORANGE+
        "\n Smallest pear in history-size: "+smallestPear);
    }
}
