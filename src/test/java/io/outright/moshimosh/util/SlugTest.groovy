package io.outright.moshimosh.util

import org.junit.Test

// Copyright (c) 2016, Outright Mental Inc. (http://outright.io) All Rights Reserved.
class SlugTest extends GroovyTestCase {
    void setUp() {
        super.setUp()

    }

    void tearDown() {

    }

    @Test
    void testToString() {
        testToStringAssert("jim", "jim");
        testToStringAssert("jim-251", "jim251");
        testToStringAssert("j i m - 2 5 1", "jim251");
        testToStringAssert("j!i\$m%-^2%5*1", "jim251");
    }

    static void testToStringAssert(String sIn, String sOut) {
        assert new Slug(sIn).toString() == sOut;
    }

    @Test
    void testPropercase() {
        assert new Slug("jaMMy").Propercase().toString() == "Jammy";
    }
}
