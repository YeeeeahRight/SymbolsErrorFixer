package com.fixer.view.printer;

import com.fixer.exceptions.OutputStreamException;

public interface ResultPrinter {
    void print(String result) throws OutputStreamException;
}
