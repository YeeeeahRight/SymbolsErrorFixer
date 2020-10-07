package com.fixer.view.printer.impl;

import com.fixer.exceptions.OutputStreamException;
import com.fixer.view.printer.ResultPrinter;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class ConsoleResultPrinter implements ResultPrinter {
    private static final String OUTPUT_ERROR_MESSAGE = "Something wrong with console output.";

    @Override
    public void print(String result) throws OutputStreamException {
        BufferedWriter consoleWriter;
        try {
            consoleWriter = new BufferedWriter(new OutputStreamWriter(System.out));
            consoleWriter.write(result);
            consoleWriter.flush();
        } catch (IOException e) {
            throw new OutputStreamException(OUTPUT_ERROR_MESSAGE);
        }
    }
}
