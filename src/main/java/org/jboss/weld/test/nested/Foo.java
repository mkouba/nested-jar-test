package org.jboss.weld.test.nested;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

import org.jboss.weld.environment.se.events.ContainerInitialized;

@ApplicationScoped
public class Foo {

    public void onStart(@Observes ContainerInitialized event) {
        System.out.println("STARTED!");
    }

}
