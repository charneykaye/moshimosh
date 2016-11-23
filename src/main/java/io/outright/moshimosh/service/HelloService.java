package io.outright.moshimosh.service;

import io.outright.moshimosh.util.Slug;

public class HelloService implements Service {

    @Override
    public String hello(String raw) {
        Slug name = new Slug(raw, "moshimosh");
        return "Hello, " + name +"!";
    }
}
