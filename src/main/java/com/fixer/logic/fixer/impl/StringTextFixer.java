package com.fixer.logic.fixer.impl;

import com.fixer.logic.fixer.TextFixer;

public class StringTextFixer implements TextFixer {
    private static final String REPLACEABLE = "ра";
    private static final String REPLACEMENT = "ро";
    private static final int REPLACEABLE_LENGTH = REPLACEABLE.length();
    private static final int REPLACEMENT_LENGTH = REPLACEMENT.length();
    private static final int DIFFERENCE_LENGTHS = REPLACEMENT_LENGTH - REPLACEABLE_LENGTH;

    @Override
    public String fix(String source) {
        StringBuilder resultBuilder = new StringBuilder(source.length());
        int insertCounter = 0;
        int insertIndex = 0;
        int entryIndex;
        while (source.substring(insertIndex).contains(REPLACEABLE)) {
            entryIndex = source.substring(insertIndex).indexOf(REPLACEABLE);
            resultBuilder.append(source, insertIndex, entryIndex + insertIndex);
            resultBuilder.append(REPLACEMENT);
            insertCounter++;
            insertIndex = resultBuilder.length() - DIFFERENCE_LENGTHS * insertCounter;
        }
        if (source.length() != insertIndex) {
            resultBuilder.append(source.substring(insertIndex));
        }
        return resultBuilder.toString();
    }
}
