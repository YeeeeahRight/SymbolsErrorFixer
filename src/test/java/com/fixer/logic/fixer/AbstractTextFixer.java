package com.fixer.logic.fixer;

import org.junit.Assert;

public abstract class AbstractTextFixer {
    private TextFixer fixer;

    public AbstractTextFixer(TextFixer fixer) {
        this.fixer = fixer;
    }

    public void testFixShouldReturnSourceStringWhenSourceStringIsEmpty() {
        //given
        String source = "";
        //when
        String result = fixer.fix(source);
        //then
        Assert.assertEquals(source, result);
    }

    public void testFixShouldReturnSourceStringWhenSourceStringIsCorrect() {
        //given
        String source = "робот роскошь";
        //when
        String result = fixer.fix(source);
        //then
        Assert.assertEquals(source, result);
    }

    public void testFixShouldFixWhenSourceStringIsIncorrect() {
        //given
        String source = "работ";
        //when
        String result = fixer.fix(source);
        //then
        Assert.assertEquals("робот", result);
    }

    public void testFixShouldFixWhenSeveralWordsInSourceString() {
        //given
        String source = "работ раскошь";
        //when
        String result = fixer.fix(source);
        //then
        Assert.assertEquals("робот роскошь", result);
    }

    public void testFixShouldFixWhenSourceStringIsReplaceable() {
        //given
        String source = "ра";
        //when
        String result = fixer.fix(source);
        //then
        Assert.assertEquals("ро", result);
    }

    public void testFixShouldFixWhenSourceStringIsSeveralReplaceable() {
        //given
        String source = "рарарара ра ра арарар";
        //when
        String result = fixer.fix(source);
        //then
        Assert.assertEquals("роророро ро ро аророр", result);
    }
}
