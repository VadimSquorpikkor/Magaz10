package com.squorpikkor.app.magaz10;

import java.util.ArrayList;

/**
 * Created by VadimSquorpikkor on 02.09.2017.
 *
 */

public class User {
    private String name;
    private ArrayList<Juice> currentUserOrder = new ArrayList<>();

    User(String name) {
        this.name = name;
    }

    void addJuice(String name) {
        currentUserOrder.add(new Juice(name));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Juice> getCurrentUserOrder() {
        return currentUserOrder;
    }

    double totalMoneyCount() {
        double total = 0;
        if (currentUserOrder.size() != 0) {
            for (Juice juice : currentUserOrder) {
                total += juice.totalPrice();
            }
        }
        return total;
    }


}
