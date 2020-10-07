package com.fixer.data.acquirer;

import com.fixer.data.acquirer.impl.FileDataAcquirer;
import com.fixer.exceptions.InputStreamException;
import com.fixer.exceptions.TextFileNotFoundException;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

public class FileDataAcquirerTest {
    private static final String INVALID_PATH = "invalid.txt";
    private static final String VALID_PATH = "data.txt";
    private FileWriter fileWriter;
    private DataAcquirer fileAcquirer;

    @Test(expected = TextFileNotFoundException.class)
    public void testGetTextShouldThrowExceptionWhenFileIsNotFound() throws TextFileNotFoundException, InputStreamException {
        new FileDataAcquirer(INVALID_PATH).getText();
    }

    @Test
    public void testGetTextShouldGetTextWhenFileIsFilled() throws IOException, TextFileNotFoundException, InputStreamException {
        //given
        String text = "робот роскошь";
        fileWriter = new FileWriter(VALID_PATH);
        fileWriter.write(text);
        fileWriter.close();
        fileAcquirer = new FileDataAcquirer(VALID_PATH);
        //when
        String resultText = fileAcquirer.getText();
        //then
        Assert.assertEquals(text, resultText);
    }

    @Test
    public void testGetTextShouldGetNullWhenFileIsEmpty() throws IOException, TextFileNotFoundException, InputStreamException {
        //given
        fileWriter = new FileWriter(VALID_PATH);
        fileWriter.close();
        fileAcquirer = new FileDataAcquirer(VALID_PATH);
        //when
        String resultText = fileAcquirer.getText();
        //then
        Assert.assertNull(resultText);
    }
}
