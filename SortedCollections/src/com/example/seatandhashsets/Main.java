package com.example.seatandhashsets;

import java.util.Map;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {

        StockItem temp = new StockItem("Bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("Cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("Car", 12.58, 2);
        stockList.addStock(temp);

        temp = new StockItem("Chair", 62.0, 10);
        stockList.addStock(temp);

        temp = new StockItem("Cup", 0.58, 200);
        stockList.addStock(temp);

        temp = new StockItem("Cup", 0.45, 7);
        stockList.addStock(temp);

        temp = new StockItem("Door", 72.95, 4);
        stockList.addStock(temp);

        temp = new StockItem("Juice", 2.50, 36);
        stockList.addStock(temp);

        temp = new StockItem("Phone", 96.99, 35);
        stockList.addStock(temp);

        temp = new StockItem("Towel", 2.40, 80);
        stockList.addStock(temp);

        temp = new StockItem("Vase", 8.76, 40);
        stockList.addStock(temp);

        System.out.println(stockList);

        for(String s: stockList.Items().keySet()) {
            System.out.println(s);
        }

        Basket anantsBasket = new Basket("Anant");
        sellItem(anantsBasket, "Car", 1);
        System.out.println(anantsBasket);

        sellItem(anantsBasket, "Car", 1);
        System.out.println(anantsBasket);

        if(sellItem(anantsBasket, "Car", 1) != 1) {
            System.out.println("There are no more cars in Stock");
        }

        sellItem(anantsBasket, "Spanner", 5);
//        System.out.println(anantsBasket);

        sellItem(anantsBasket, "Juice", 4);
        sellItem(anantsBasket, "Cup", 12);
        sellItem(anantsBasket, "Bread", 1);
//        System.out.println(anantsBasket);

        Basket basket = new Basket("customer");
        sellItem(basket, "Cup", 100);
        sellItem(basket, "Juice", 5);
        removeItem(basket, "Cup", 1);
        System.out.println(basket);

        removeItem(anantsBasket, "Car", 1);
        removeItem(anantsBasket, "Cup", 9);
        removeItem(anantsBasket, "Car", 1);
        System.out.println("Cars Removed: " + removeItem(anantsBasket, "Car", 1));
        System.out.println(anantsBasket);

        removeItem(anantsBasket, "Bread", 1);
        removeItem(anantsBasket, "Cup", 3);
        removeItem(anantsBasket, "Juice", 4);
        removeItem(anantsBasket, "Cup", 3);
        System.out.println(anantsBasket);

        System.out.println("\nDisplay Stock List before and after Checkout");
        System.out.println(basket);
        System.out.println(stockList);
        checkOut(basket);
        System.out.println(basket);
        System.out.println(stockList);

        //You can adjsut stock in 2 different ways
        StockItem car = stockList.Items().get("Car");
        //stockList.Items().get("Car").adjustStock(2000);
        if(car != null){
            car.adjustStock(2000);
        }
        //stockList.get("Car").adjustStock(-1000);
        if(car != null){
            car.adjustStock(-1000);
        }



        System.out.println(stockList);
//        for(Map.Entry<String, Double> prices: stockList.PriceList().entrySet()){
//            System.out.println(prices.getKey() + " costs " + prices.getValue() );
//        }

        checkOut(anantsBasket);
        System.out.println(anantsBasket);;
    }

    public static int sellItem(Basket basket, String item, int quantity) {
        //retrieve the item from stock list
        StockItem stockItem = stockList.get(item);
        if(stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if(stockList.reserveStock(item,quantity) != 0 ) {
            return basket.addToBasket(stockItem, quantity);
        }
        return 0;
    }

    public static int removeItem(Basket basket, String item, int quantity) {
        //retrieve the item from stock list
        StockItem stockItem = stockList.get(item);
        if(stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if(basket.removeFromBasket(stockItem,quantity) == quantity ) {
            return stockList.unreserveStock(item, quantity);
        }
        return 0;
    }

    public static void checkOut(Basket basket){
        for(Map.Entry<StockItem, Integer> item : basket.Items().entrySet()) {
            stockList.sellStock(item.getKey().getName(), item.getValue());
        }
        basket.clearBasket();
    }
}
