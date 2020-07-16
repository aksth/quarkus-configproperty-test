package org.acme;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TestProperty {

    private final OIDCProperties oidcProperties;

    public TestProperty(OIDCProperties oidcProperties){
        this.oidcProperties = oidcProperties;
    }

    public String getAdminRealm(){
        return oidcProperties.getAdminRealm();
    }

}
