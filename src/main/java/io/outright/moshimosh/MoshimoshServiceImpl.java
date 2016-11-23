package io.outright.moshimosh;

public class MoshimoshServiceImpl implements MoshimoshService {
    @Override
    public String hello(String name) {
        return "Hello, " + name;
    }
}
