package com.fixer.application;

import com.fixer.data.acquirer.DataAcquirer;
import com.fixer.data.factory.DataAcquirerFactory;
import com.fixer.data.factory.impl.ConsoleDataAcquirerFactory;
import com.fixer.exceptions.InputStreamException;
import com.fixer.exceptions.OutputStreamException;
import com.fixer.exceptions.TextFileNotFoundException;
import com.fixer.logic.factory.TextFixerFactory;
import com.fixer.logic.factory.impl.StringTextFixerFactory;
import com.fixer.logic.fixer.TextFixer;
import com.fixer.view.factory.ResultPrinterFactory;
import com.fixer.view.factory.impl.ConsoleResultPrinterFactory;
import com.fixer.view.printer.ResultPrinter;

public class Main {
    public static void main(String[] args) throws TextFileNotFoundException, InputStreamException, OutputStreamException {
        DataAcquirerFactory acquirerCreator = new ConsoleDataAcquirerFactory();
        DataAcquirer acquirer = acquirerCreator.createAcquirer();
        String text = acquirer.getText();

        TextFixerFactory fixerCreator = new StringTextFixerFactory();
        TextFixer fixer = fixerCreator.createFixer();
        text = fixer.fix(text);

        ResultPrinterFactory printerCreator = new ConsoleResultPrinterFactory();
        ResultPrinter printer = printerCreator.createPrinter();
        printer.print(text);
    }
}
