package io.outright.moshimosh;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.servlet.ServletModule;
import io.outright.moshimosh.service.Service;
import io.outright.moshimosh.service.HelloService;

/**
 * taken from https://github.com/google/guice/wiki/ServletModule
 */
public class ServletConfig extends GuiceServletContextListener {
    @Override
    protected Injector getInjector() {
        return Guice.createInjector(new ServletModule() {
            @Override
            protected void configureServlets() {
                serve("/api/*").with(Servlet.class);
                bind(Service.class).to(HelloService.class);
            }
        });
    }
}
