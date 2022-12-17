package com.java.study.task1;

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor("Acer", 189.99F, "Ab23251",1280, 1024);
        Monitor monitor1 = new Monitor("Acer", 189.99F, "Ab23251",1280, 1024);
        System.out.println(monitor);
        System.out.println(monitor.equals(monitor1));
        System.out.println(monitor.hashCode());
        System.out.println(monitor1.hashCode());

        EthernetAdapter adapter = new EthernetAdapter("Samsung", 25.99F, "FT132",100, "00:30:48:5a:58:65");
        EthernetAdapter adapter1 = new EthernetAdapter("Asus", 25.99F, "FT132",100, "00:30:48:5a:58:65");
        System.out.println(adapter);
        System.out.println(adapter.equals(adapter1));
        System.out.println(adapter.hashCode());
        System.out.println(adapter1.hashCode());
    }
}
