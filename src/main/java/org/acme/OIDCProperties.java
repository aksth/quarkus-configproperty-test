package org.acme;

import io.quarkus.arc.config.ConfigProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@ConfigProperties(prefix = "oidc")
public class OIDCProperties {

    String serverUrl;
    String adminRealm;
    String adminClientId;

}