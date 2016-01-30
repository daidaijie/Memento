package com.net.first;

import com.net.first.memonto.Caretaker;
import com.net.first.memonto.Originator;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Originator o  = new Originator();
        o.setState("On");
        o.show();

        Caretaker caretaker = new Caretaker();
        caretaker.setMemonto(o.createMemonto());

        o.setState("Off");
        o.show();

        o.setMemonto(caretaker.getMemonto());
        o.show();

    }
}
