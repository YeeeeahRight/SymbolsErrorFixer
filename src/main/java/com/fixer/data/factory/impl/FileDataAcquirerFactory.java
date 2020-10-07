package com.fixer.data.factory.impl;

import com.fixer.data.acquirer.DataAcquirer;
import com.fixer.data.factory.DataAcquirerFactory;
import com.fixer.data.acquirer.impl.FileDataAcquirer;

public class FileDataAcquirerFactory implements DataAcquirerFactory {
    private static final String FILE_PATH = "data.txt";

    public DataAcquirer createAcquirer() {
        return new FileDataAcquirer(FILE_PATH);
    }
}
