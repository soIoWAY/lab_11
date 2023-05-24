public class Main {
    public static void main(String[] args) {
        ChechAge chechAge = new ChechAge();
        Wine wine_1 = new Wine(5);
        Wine wine_2 = new Wine(-1);
        chechAge.processWine(wine_1);
        chechAge.processWine(wine_2);
    }
}