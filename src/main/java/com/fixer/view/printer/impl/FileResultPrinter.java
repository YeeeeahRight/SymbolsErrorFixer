package com.fixer.view.printer.impl;

import com.fixer.exceptions.OutputStreamException;
import com.fixer.view.printer.ResultPrinter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileResultPrinter implements ResultPrinter {
    private static final String OUTPUT_ERROR_MESSAGE = "Something wrong with file output.";
    private static final String CLOSE_EXCEPTION_MESSAGE = "Error with closing reader.";
    private String filePath;

    public FileResultPrinter(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void print(String result) throws OutputStreamException {
        BufferedWriter fileWriter = null;
        try {
            fileWriter = new BufferedWriter(new FileWriter(filePath));
            fileWriter.write(result);
            fileWriter.flush();
        } catch (IOException e) {
            throw new OutputStreamException(OUTPUT_ERROR_MESSAGE);
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    System.out.println(CLOSE_EXCEPTION_MESSAGE);
                }
            }
        }
    }
}
