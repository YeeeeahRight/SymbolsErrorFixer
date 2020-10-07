package com.fixer.logic.factory.impl;

import com.fixer.logic.factory.TextFixerFactory;
import com.fixer.logic.fixer.TextFixer;
import com.fixer.logic.fixer.impl.CharArrayFixer;

public class CharArrayFixerFactory implements TextFixerFactory {
    @Override
    public TextFixer createFixer() {
        return new CharArrayFixer();
    }
}
