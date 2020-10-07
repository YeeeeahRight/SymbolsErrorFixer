package com.fixer.data.acquirer.impl;

import com.fixer.data.acquirer.DataAcquirer;
import com.fixer.exceptions.InputStreamException;
import com.fixer.exceptions.TextFileNotFoundException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileDataAcquirer implements DataAcquirer {
    private static final String FILE_NOT_FOUND_MESSAGE = "Your file is not found.";
    private static final String INPUT_ERROR_EXCEPTION = "Something wrong with file input.";
    private static final String CLOSE_EXCEPTION_MESSAGE = "Error with closing reader.";
    private String filePath;

    public FileDataAcquirer(final String filePath) {
        this.filePath = filePath;
    }

    public String getText() throws TextFileNotFoundException, InputStreamException {
        BufferedReader fileReader = null;
        String text;
        try {
            fileReader = new BufferedReader(new FileReader(filePath));
            text = fileReader.readLine();
        } catch (FileNotFoundException e) {
            throw new TextFileNotFoundException(FILE_NOT_FOUND_MESSAGE);
        } catch (IOException e) {
            throw new InputStreamException(INPUT_ERROR_EXCEPTION);
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    System.out.println(CLOSE_EXCEPTION_MESSAGE);
                }
            }
        }
        return text;
    }
}
