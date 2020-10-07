package com.fixer.view.printer.impl;

import com.fixer.view.printer.ResultPrinter;


public class ConsoleResultPrinter implements ResultPrinter {

    @Override
    public void print(String result) {
        System.out.println(result);
    }
}
