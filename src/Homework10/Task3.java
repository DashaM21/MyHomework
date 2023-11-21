package Homework10;

enum ProductType {
    APPLE(10),
    POTATO(5),
    MILK(20),
    BEER(30),
    TOBACCO(40);

    private int price;

    ProductType(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

class PurchaseException extends Exception {
    public PurchaseException(String message) {
        super(message);
    }
}

class Father {
    private String name;
    private int money;

    public Father(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public void buyProducts(ProductType product1, int quantity1, ProductType product2, int quantity2) throws PurchaseException {
        int totalCost = product1.getPrice() * quantity1 + product2.getPrice() * quantity2;

        if (totalCost > money) {
            throw new PurchaseException("Сумма покупки превышает количество денег в кармане отца.");
        }

        if (product1 == ProductType.BEER || product1 == ProductType.TOBACCO || product2 == ProductType.BEER || product2 == ProductType.TOBACCO) {
            throw new PurchaseException("Отец не может принести домой пиво или табак.");
        }

        if (quantity1 % 3 != 0 || quantity2 % 3 != 0) {
            throw new PurchaseException("Количество купленных товаров не делится на три.");
        }

        money -= totalCost;
        System.out.println("Уважаемый " + name + " стоимость ваших покупок " + totalCost + ". " +
                "Вы приобрели " + product1.name() + " в количестве " + quantity1 + ", и " +
                product2.name() + " в количестве " + quantity2 + ".");
    }
}

public class Task3 {
    public static void main(String[] args) {
        try {
            Father father = new Father("Валентин", 200);
            father.buyProducts(ProductType.APPLE, 3, ProductType.MILK, 6);
        } catch (PurchaseException e) {
            System.out.println("Ошибка покупки: " + e.getMessage());
        }
    }
}
