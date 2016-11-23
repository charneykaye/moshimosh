package io.outright.moshimosh.service

// Copyright (c) 2016, Outright Mental Inc. (http://outright.io) All Rights Reserved.
class HelloServiceTest extends GroovyTestCase {
    void setUp() {
        super.setUp()

    }

    void tearDown() {

    }

    void testHello() {
        assert new HelloService().hello("nubbub 15%").toString() == "Hello, nubbub15!";
    }
}
