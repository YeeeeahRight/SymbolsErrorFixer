package com.fixer.logic.fixer.impl;

import com.fixer.logic.fixer.AbstractTextFixer;
import org.junit.Test;

public class CharArrayTextFixerTest extends AbstractTextFixer {
    public CharArrayTextFixerTest() {
        super(new CharArrayFixer());
    }

    @Test
    @Override
    public void testFixShouldReturnSourceStringWhenSourceStringIsEmpty() {
        super.testFixShouldReturnSourceStringWhenSourceStringIsEmpty();
    }

    @Test
    @Override
    public void testFixShouldReturnSourceStringWhenSourceStringIsCorrect() {
        super.testFixShouldReturnSourceStringWhenSourceStringIsCorrect();
    }

    @Test
    @Override
    public void testFixShouldFixWhenSourceStringIsIncorrect() {
        super.testFixShouldFixWhenSourceStringIsIncorrect();
    }

    @Override
    public void testFixShouldFixWhenSeveralWordsInSourceString() {
        super.testFixShouldFixWhenSeveralWordsInSourceString();
    }

    @Test
    @Override
    public void testFixShouldFixWhenSourceStringIsReplaceable() {
        super.testFixShouldFixWhenSourceStringIsReplaceable();
    }

    @Test
    @Override
    public void testFixShouldFixWhenSourceStringIsSeveralReplaceable() {
        super.testFixShouldFixWhenSourceStringIsSeveralReplaceable();
    }
}
