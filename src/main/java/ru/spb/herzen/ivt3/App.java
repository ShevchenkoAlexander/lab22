package ru.spb.herzen.ivt3;

import org.kohsuke.randname.RandomNameGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        RandomNameGenerator rnd = new RandomNameGenerator(0);
        System.out.println("№1");
        List<String> strings = new ArrayList<String>();
        for (int i = 0; i < 15; i++) {
            String names = rnd.next();
            strings.add(names);
        }
        for (String name : strings) {
            System.out.println("Hello, " + name);
        }

        System.out.println("\n№2");
        Collections.sort(strings);
        for (String orderedListEl : strings) {
            System.out.println(orderedListEl);
        }

        System.out.println("\n№3");
        for (int i = 2; i < 5; i++) {
            String list = strings.get(i);
            System.out.println("Hello, " + list);
        }

        System.out.println("\n№4");
        for (String el_up : strings) {
            el_up = el_up.toUpperCase();
            System.out.println(el_up);
        }

        System.out.println("\n№5");
        List<Integer> num_list = new ArrayList<Integer>();
        for (int i = 0; i < 30; i++) {
            num_list.add((int) (1 + Math.random() * 100));
        }
        int even = 0;
        for (int x : num_list) {
            System.out.println(x);
            if (x % 2 == 0)
                even++;
        }
        System.out.println("Четных: " + even);
        System.out.println("Минимальное число: " + Collections.min(num_list));
        System.out.println("Максимальное число: " + Collections.max(num_list));

        System.out.println("\n№6 and №7");

        String name = "Alexander";
        int numb = 0;
        List<Character> symbols = new ArrayList<Character>(Arrays.asList('e', 'u', 'o', 'a'));
        char[] chars = name.toCharArray();
        for (char x : chars) {
            for (char y : symbols) {
                if (x == y) {
                    numb++;
                }
            }
        }
        System.out.print("Ваше имя содержит: " + numb + " гласных\n");
        for (char z : chars) {
            System.out.println(z);

        }
    }
}