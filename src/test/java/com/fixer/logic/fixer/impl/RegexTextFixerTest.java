package com.fixer.logic.fixer.impl;

import com.fixer.logic.fixer.AbstractTextFixer;
import org.junit.Test;

public class RegexTextFixerTest extends AbstractTextFixer {

    public RegexTextFixerTest() {
        super(new RegexTextFixer());
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

    @Test
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
