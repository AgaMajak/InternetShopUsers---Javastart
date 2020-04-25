import data.Director;

class IntenetShopMain {
    public static void main(String[] args) {
        
        Director director = new Director("Jan", "Kowalski", 333222999, 9500.0, "Wicedyrektor");
        director.setBonus(1200.50);
        director.printInfo();

    }
}
