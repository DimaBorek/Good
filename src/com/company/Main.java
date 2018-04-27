package com.company;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Tool> tools = Arrays.asList(
                new Tool("molotok", 100),
                new Tool("gvozd",10),
                new Tool("pila",150),
                new Tool("lom", 80));
        List<Food> foods = Arrays.asList(
                new Food("moloko", 100),
                new Food("sandwich",10),
                new Food("gamburger",150),
                new Food("voda", 80));
        List<Toy> toys = Arrays.asList(
                new Toy("slon", 100),
                new Toy("kot",10),
                new Toy("sobachka",150),
                new Toy("mishka", 80));
        Shop toolShop = new Shop();
        Shop foodShop = new Shop();
        Shop toyShop = new Shop();
        toolShop.setGoods(tools);
        foodShop.setGoods(foods);
        toyShop.setGoods(toys);


        System.out.println(toolShop+""+foodShop+""+toyShop);
        Customer customer = new Customer("dima",250);
        System.out.println(customer.getBag());






    }
}
