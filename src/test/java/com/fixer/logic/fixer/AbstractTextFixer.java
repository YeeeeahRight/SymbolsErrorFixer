package com.fixer.logic.fixer;

import org.junit.Assert;
import org.junit.Test;

public abstract class AbstractTextFixer {
    private TextFixer fixer;

    public AbstractTextFixer(TextFixer fixer) {
        this.fixer = fixer;
    }

    @Test
    public void testFixShouldReturnSourceStringWhenSourceStringIsEmpty() {
        //given
        String source = "";
        //when
        String result = fixer.fix(source);
        //then
        Assert.assertEquals(source, result);
    }

    @Test
    public void testFixShouldReturnSourceStringWhenSourceStringIsCorrect() {
        //given
        String source = "робот роскошь";
        //when
        String result = fixer.fix(source);
        //then
        Assert.assertEquals(source, result);
    }

    @Test
    public void testFixShouldFixWhenSourceStringIsIncorrect() {
        //given
        String source = "работ";
        //when
        String result = fixer.fix(source);
        //then
        Assert.assertEquals("робот", result);
    }

    @Test
    public void testFixShouldFixWhenSeveralWordsInSourceString() {
        //given
        String source = "работ раскошь";
        //when
        String result = fixer.fix(source);
        //then
        Assert.assertEquals("робот роскошь", result);
    }

    @Test
    public void testFixShouldFixWhenSourceStringIsReplaceable() {
        //given
        String source = "ра";
        //when
        String result = fixer.fix(source);
        //then
        Assert.assertEquals("ро", result);
    }

    @Test
    public void testFixShouldFixWhenSourceStringIsSeveralReplaceable() {
        //given
        String source = "рарарара ра ра арарар";
        //when
        String result = fixer.fix(source);
        //then
        Assert.assertEquals("роророро ро ро аророр", result);
    }
}
