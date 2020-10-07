package com.fixer.view.factory.impl;

import com.fixer.view.printer.ResultPrinter;
import com.fixer.view.factory.ResultPrinterFactory;
import com.fixer.view.printer.impl.FileResultPrinter;

public class FileResultPrinterFactory implements ResultPrinterFactory {
    private final static String FILE_PATH = "result.txt";

    @Override
    public ResultPrinter createPrinter() {
        return new FileResultPrinter(FILE_PATH);
    }
}
