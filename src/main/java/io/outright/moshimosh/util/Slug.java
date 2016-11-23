// Copyright (c) 2016, Outright Mental Inc. (http://outright.io) All Rights Reserved.
package io.outright.moshimosh.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Slug {
    private static final Pattern nonAlphanumeric = Pattern.compile("[^0-9a-zA-Z]");
    private final String text;

    public Slug(String raw) {
        Matcher m = nonAlphanumeric.matcher(raw);
        this.text = m.replaceAll("");
    }

    public Slug(String raw, String defaultValue) {
        Matcher m = nonAlphanumeric.matcher(raw);
        String slug = m.replaceAll("");
        this.text = slug.length() > 0 ? slug : defaultValue;
    }

    public Slug Propercase() {
        String lower = this.text.toLowerCase();
        return new Slug(lower.substring(0, 1).toUpperCase() + lower.substring(1));
    }

    @Override
    public String toString() {
        return this.text;
    }
}
