package com.fixer.logic.fixer.impl;

import com.fixer.logic.fixer.TextFixer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTextFixer implements TextFixer {
    private static final String REPLACEABLE = "ра";
    private static final String REPLACEMENT = "ро";

    @Override
    public String fix(String source) {
        Pattern replacePattern = Pattern.compile(REPLACEABLE);
        Matcher matcher = replacePattern.matcher(source);
        return matcher.replaceAll(REPLACEMENT);
    }
}
