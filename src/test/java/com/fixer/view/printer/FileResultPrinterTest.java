package com.fixer.view.printer;

import com.fixer.exceptions.OutputStreamException;
import com.fixer.view.printer.impl.FileResultPrinter;
import org.junit.Assert;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileResultPrinterTest {
    private static final String FILE_NOT_EXIST_PATH = "new file.txt";
    private static final String FILE_EXIST_PATH = "result.txt";
    private ResultPrinter filePrinter;

    @Test
    public void testPrintShouldPrintWhenFileIsCreated() throws OutputStreamException, IOException {
        //given
        String text = "робот";
        filePrinter = new FileResultPrinter(FILE_EXIST_PATH);
        //when
        filePrinter.print(text);
        //then
        Assert.assertEquals(new BufferedReader(new FileReader(FILE_EXIST_PATH)).readLine(), text);
    }


    @Test
    public void testPrintShouldCreateFileAndPrintWhenFileIsNotCreated() throws OutputStreamException, IOException {
        //given
        String text = "робот";
        filePrinter = new FileResultPrinter(FILE_NOT_EXIST_PATH);
        //when
        filePrinter.print(text);
        //then
        Assert.assertEquals(new BufferedReader(new FileReader(FILE_NOT_EXIST_PATH)).readLine(), text);
    }
}
