public class Apple extends Fruit{
    private int sort;
    private String placeOfGrowth;

    public Apple(String name, int size,Color color, int sort, String placeOfGrowth) {
        super(name, size, color);
        this.sort = sort;
        this.placeOfGrowth = placeOfGrowth;
    }

    public int getSort() {
        return sort;
    }


    public String getPlaceOfGrowth() {
        return placeOfGrowth;
    }


    @Override
    public void print() {
        System.out.println(" Sort: "+sort+
                "\nColor: "+Color.RED+
                "\nBest place to apple: "+placeOfGrowth);

    }
}
