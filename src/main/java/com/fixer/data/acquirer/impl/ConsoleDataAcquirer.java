package com.fixer.data.acquirer.impl;

import com.fixer.data.acquirer.DataAcquirer;
import com.fixer.exceptions.InputStreamException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleDataAcquirer implements DataAcquirer {
    private static final String INPUT_ERROR_MESSAGE = "Something wrong with your input.";
    private static final String INPUT_TEXT_MESSAGE = "Input text: ";

    public String getText() throws InputStreamException {
        BufferedReader consoleReader;
        String text;
        System.out.print(INPUT_TEXT_MESSAGE);
        try {
            consoleReader = new BufferedReader(new InputStreamReader(System.in));
            text = consoleReader.readLine();
        } catch (IOException e) {
            throw new InputStreamException(INPUT_ERROR_MESSAGE);
        }
        return text;
    }
}
