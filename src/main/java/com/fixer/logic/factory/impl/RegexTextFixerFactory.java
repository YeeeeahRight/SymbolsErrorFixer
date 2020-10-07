package com.fixer.logic.factory.impl;

import com.fixer.logic.factory.TextFixerFactory;
import com.fixer.logic.fixer.TextFixer;
import com.fixer.logic.fixer.impl.RegexTextFixer;

public class RegexTextFixerFactory implements TextFixerFactory {
    @Override
    public TextFixer createFixer() {
        return new RegexTextFixer();
    }
}
