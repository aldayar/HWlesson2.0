public class Peach extends Fruit{
    private String season;
    private int biggestPeachSize;

    public Peach(String name, int size, String season, int biggestPeachSize) {
        super(name, size, Color.ORANGE);
        this.season = season;
        this.biggestPeachSize = biggestPeachSize;
    }

    public String getSeason() {
        return season;
    }


    public int getBiggestPeachSize() {
        return biggestPeachSize;
    }

    @Override
    public void print() {
        System.out.println(" Best season for peach: "+season+
                "\nColor: "+Color.YELLOW+
                "\n Biggest peach in history- size: "+ biggestPeachSize);
    }
}
