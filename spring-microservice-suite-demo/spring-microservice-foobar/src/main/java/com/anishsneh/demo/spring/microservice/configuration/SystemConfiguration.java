package com.anishsneh.demo.spring.microservice.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * The Class SystemConfiguration.
 * 
 * @author Anish Sneh
 */
@Component
public class SystemConfiguration {
	
	/** The user key. */
	@Value("${userKey:fb_default_key}")
    public String userKey;
	
	/** The user secret type. */
	@Value("${userSecretType:fb_default_secret}")
    public String userSecretType;

}
