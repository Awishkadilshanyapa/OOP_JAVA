
package com.mycompany.mainitem;

public class Mainitem {

    public static void main(String[] args) {
        Item It = new Item();
        It.setLocation(220);
        It.setDescription("Kandy");
        System.out.println(It.getLocation());
        System.out.println(It.getDescription());
    }
}
