package com.fixer.logic.fixer.impl;

import com.fixer.logic.fixer.TextFixer;

public class CharArrayFixer implements TextFixer {
    private static final char FIRST_CHAR_REPLACEABLE = 'р';
    private static final char SECOND_CHAR_REPLACEABLE = 'а';
    private static final char SECOND_CHAR_REPLACEMENT = 'о';


    @Override
    public String fix(String source) {
        char[] sourceCharArray = source.toCharArray();
        boolean isBeginReplaceable = false;
        for (int i = 0; i < sourceCharArray.length; i++) {
            if (isBeginReplaceable && sourceCharArray[i] == SECOND_CHAR_REPLACEABLE) {
                sourceCharArray[i] = SECOND_CHAR_REPLACEMENT;
            }
            isBeginReplaceable = sourceCharArray[i] == FIRST_CHAR_REPLACEABLE;
        }
        return new String(sourceCharArray);
    }
}
