package com.fixer.data.factory.impl;

import com.fixer.data.acquirer.DataAcquirer;
import com.fixer.data.acquirer.impl.ConsoleDataAcquirer;
import com.fixer.data.factory.DataAcquirerFactory;

public class ConsoleDataAcquirerFactory implements DataAcquirerFactory {
    public DataAcquirer createAcquirer() {
        return new ConsoleDataAcquirer();
    }
}
