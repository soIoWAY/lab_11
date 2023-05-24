public class ChechAge {
    public void checkAge(Wine wine) throws WineException {
        System.out.println("Вік: " + wine.getAge() + " років");
        if (wine.getAge() < 0) {
            throw new WineException("Некоректний вік вина");
        }
        System.out.println("Перевірка віку вина пройшла успішно");
    }

    public void processWine(Wine wine) {
        try {
            checkAge(wine);
        } catch (WineException we) {
            System.out.println(we);
        }
    }
}
