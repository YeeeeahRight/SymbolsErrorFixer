package com.fixer.view.factory.impl;

import com.fixer.view.printer.ResultPrinter;
import com.fixer.view.factory.ResultPrinterFactory;
import com.fixer.view.printer.impl.ConsoleResultPrinter;

public class ConsoleResultPrinterFactory implements ResultPrinterFactory {
    @Override
    public ResultPrinter createPrinter() {
        return new ConsoleResultPrinter();
    }
}
