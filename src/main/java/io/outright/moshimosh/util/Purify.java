// Copyright (c) 2016, Outright Mental Inc. (http://outright.io) All Rights Reserved.
package io.outright.moshimosh.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

abstract public class Purify {
    private static final Pattern nonAlphanumeric = Pattern.compile("[^0-9a-zA-Z]");

    public static String Slug(String raw) {
        Matcher m = nonAlphanumeric.matcher(raw);
        return m.replaceAll("");
    }

    public static String Slug(String raw, String defaultValue) {
        String slug = Slug(raw);
        return slug.length() > 0 ? slug : defaultValue;
    }

    public static String Properslug(String raw) {
        return toProper(Slug(raw));
    }

    public static String Properslug(String raw, String defaultValue) {
        return toProper(Slug(raw, defaultValue));
    }

    private static String toProper(String from) {
        if (from.length() > 1) {
            String lower = from.toLowerCase();
            return lower.substring(0, 1).toUpperCase() + lower.substring(1);
        } else if (from.length() > 0) {
            return from.toUpperCase();
        } else {
            return "";
        }
    }
}
