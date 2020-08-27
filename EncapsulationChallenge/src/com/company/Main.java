package com.company;

public class Main {

    public static void main(String[] args) {
	    Printer printer = new Printer(50, false);
        System.out.println("Initial page COunt = " + printer.getPrintedPages());
        int pagesPrinted = printer.printPages(4);
        System.out.println("pages Printed was " + pagesPrinted + " New total Print count = " + printer.getPrintedPages());
        pagesPrinted = printer.printPages(2);
        System.out.println("pages Printed was " + pagesPrinted + " New total Print count = " + printer.getPrintedPages());
    }
}
