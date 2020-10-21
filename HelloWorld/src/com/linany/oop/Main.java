package com.linany.oop;

public class Main {
    public static void main(String[] args) {
        Things thing = new Things("bitch", 18, 18);
        thing.h.showl("cao ni ma");
        thing.getSize();
        thing.setSize(100);
        thing.getSize();
        thing.h.showl(thing);
        thing.h.showl(thing.Name);
        Things.Name = "SSSSSSS";
        thing.h.showl(thing.Name);

        thing.h.div();

        ThingsSon son = new ThingsSon("son", 333,3333);


        son.h.showl(son.type);


    }
}
