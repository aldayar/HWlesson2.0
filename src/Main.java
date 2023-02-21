public class Main {
    public static void main(String[] args) {
        createObject("Apple").print();
        createObject("Peach").print();
        createObject("Pear").print();




    }
    public static Fruit createObject (String className){
        Printable printable=null;

        switch (className){

            case "Apple":
                Apple apple = new Apple("apple",12,Color.RED,3,"Tree");
                return apple;
            case "Peach":
                Peach peach = new Peach("peach",23,"Summer",500);
                return peach;
            case "Pear":
                Pear pear = new Pear("pear",32,'P',12);
                return pear;
            case "Kiwi":
                Kiwi kiwi = new Kiwi("kiwi",15,1967,"Kiwi tree");
                return kiwi;

        }
        return (Fruit) printable;
    }
}