package Coding;

/*
 Program Name: Calculate.java
 Programmer's Name: Robert Kieca
 Program Description: Get text/combobox from FabricApp and calculate total cost
 */

public class Calculate extends FabricApp {

    public static double calcTotal(String f, double y, double sh) {
        double fabric = 0;
        double total;        

        switch (f) {
            case "Bazaar":
                if (y > 300) {
                    fabric = 3.50;
                } else {
                    fabric = 4.05;
                }   break;
            case "Blane":
                if (y > 300) {
                    fabric = 3.00;
                } else {
                    fabric = 3.50;
            }   break;
            case "Cordella":
                if (y > 200) {
                    fabric = 4.55;
                } else {
                    fabric = 5.05;
            }   break;
            case "Fusion":
                if (y > 340) {
                    fabric = 5.00;
                } else {
                    fabric = 5.50;
                }   break;
            case "Locke":
                if (y > 300) {
                    fabric = 2.55;
                } else {
                fabric = 3.05;
                }   break;
            case "Nyoko":
                if (y > 340) {
                    fabric = 4.50;
                } else {
                    fabric = 5.00;
                }   break;
            case "Tanglewood":
                if (y > 340) {
                    fabric = 4.00;
            } else {
                fabric = 4.50;
            }   break;
        }
   
    total = Math.round(((fabric * y) + sh) * 100) / 100.0;
    return total;
    }
}
