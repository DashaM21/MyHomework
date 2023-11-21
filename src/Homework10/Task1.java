package Homework10;

import java.util.Random;

interface Purchase {
    void returnCost();
}

class Shop implements Purchase {
    private String shopName;

    public Shop(String shopName) {
        this.shopName = shopName;
    }

    private class Seller {
        private String sellerName;
        private boolean isHonest;

        public Seller(String sellerName, boolean isHonest) {
            this.sellerName = sellerName;
            this.isHonest = isHonest;
        }

        public boolean isHonest() {
            return isHonest;
        }
    }

    private class Buyer {
        private String buyerName;
        private int age;
        private boolean hasDiscountCard;

        public Buyer(String buyerName, int age, boolean hasDiscountCard) {
            this.buyerName = buyerName;
            this.age = age;
            this.hasDiscountCard = hasDiscountCard;
        }

        public boolean hasDiscountCard() {
            return hasDiscountCard;
        }
    }

    private class Product {
        private String productName;

        public Product(String productName) {
            this.productName = productName;
        }
    }

    private class PurchaseDetails {
        private Buyer buyer;
        private Seller seller;
        private Product product;
        private double cost;

        public PurchaseDetails(Buyer buyer, Seller seller, Product product, double cost) {
            this.buyer = buyer;
            this.seller = seller;
            this.product = product;
            this.cost = cost;
        }

        public double calculateDiscount() {
            return buyer.hasDiscountCard() ? 0.1 : 0.0;
        }

        @Override
        public String toString() {
            return String.format("Уважаемый %s, продавец %s нашего магазина \"%s\", продаст вам этот товар %s, " +
                            "в них есть алкогольная продукция, а ваш возраст %d. Стоимость вашей покупки равна %.2f. " +
                            "Вот вам скидка %.0f%%",
                    buyer.buyerName, seller.sellerName, shopName, product.productName, buyer.age,
                    cost * (1 - calculateDiscount()) * 100, calculateDiscount() * 100);
        }
    }

    @Override
    public void returnCost() {
        Random random = new Random();

        Seller seller = new Seller("Иван", true);
        Buyer buyer = new Buyer("Петр", 25, true);
        Product product = new Product("Вино");

        double cost = 100.0; // Произвольная стоимость товара

        if (seller.isHonest() && product.productName.equals("Вино")) {
            System.out.println("Продавец честный, не продаст алкогольный товар.");
            return;
        }

        if (buyer.age < 18 && product.productName.equals("Вино")) {
            System.out.println("Покупателю меньше 18 лет, продажа алкоголя запрещена.");
            return;
        }

        PurchaseDetails purchaseDetails = new PurchaseDetails(buyer, seller, product, cost);
        System.out.println(purchaseDetails);
    }
}

public class Task1 {
    public static void main(String[] args) {
        Shop shop = new Shop("ABC Store");
        shop.returnCost();
    }
}
