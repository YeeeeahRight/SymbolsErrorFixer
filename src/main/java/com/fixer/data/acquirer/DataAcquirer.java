package com.fixer.data.acquirer;

import com.fixer.exceptions.InputStreamException;
import com.fixer.exceptions.TextFileNotFoundException;

public interface DataAcquirer {
    String getText() throws InputStreamException, TextFileNotFoundException;
}
