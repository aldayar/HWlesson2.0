public class Kiwi extends Fruit{
    private int fistKiwi;
    private String kiwiTreeName;

    public Kiwi(String name, int size,  int fistKiwi, String kiwiTreeName) {
        super(name, size, Color.GREEN);
        this.fistKiwi = fistKiwi;
        this.kiwiTreeName = kiwiTreeName;
    }

    public int getFistKiwi() {
        return fistKiwi;
    }

    public void setFistKiwi(int fistKiwi) {
        this.fistKiwi = fistKiwi;
    }

    public String getKiwiTreeName() {
        return kiwiTreeName;
    }

    public void setKiwiTreeName(String kiwiTreeName) {
        this.kiwiTreeName = kiwiTreeName;
    }

    @Override
    public void print() {
        System.out.println(" First kiwi in a life of human in: "+fistKiwi+
                "\nColor: "+Color.GREEN+
        "\n Tree where grow kiwi"+ kiwiTreeName);
    }
}
