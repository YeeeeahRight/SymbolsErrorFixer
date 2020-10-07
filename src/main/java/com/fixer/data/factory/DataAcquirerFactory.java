package com.fixer.data.factory;

import com.fixer.data.acquirer.DataAcquirer;

public interface DataAcquirerFactory {
    DataAcquirer createAcquirer();
}
