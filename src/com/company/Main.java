package com.company;

import com.BankEmployees.BankEmployees;
import com.BankEmployees.CheckExempt;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<BankEmployees> list = new ArrayList<BankEmployees>();
        list.add(new BankEmployees("Jane", "Doe", true));
        list.add(new BankEmployees("Tom", "Smith", false));

       // print(list, new CheckIsExempt());
        print(list, a -> a.isExempt());
        print(list, a -> ! a.isExempt());

    }

    private static void print(List<BankEmployees> list, CheckExempt c) {
        for (BankEmployees b: list) {
            if(c.check(b))
                System.out.println(b.getFirstName() + " " + b.getLastName() + " " + b.isExempt());
        }
    }
}
