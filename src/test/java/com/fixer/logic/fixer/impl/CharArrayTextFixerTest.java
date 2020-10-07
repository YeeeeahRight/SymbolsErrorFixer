package com.fixer.logic.fixer.impl;

import com.fixer.logic.fixer.AbstractTextFixer;

public class CharArrayTextFixerTest extends AbstractTextFixer {
    public CharArrayTextFixerTest() {
        super(new CharArrayFixer());
    }
}
