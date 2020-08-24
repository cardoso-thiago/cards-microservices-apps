package br.com.mastertech.card.config;

import feign.RequestInterceptor;
import org.springframework.cloud.security.oauth2.client.feign.OAuth2FeignRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.client.token.grant.client.ClientCredentialsResourceDetails;

public class OAuthRequestInterceptor {

    private final OAuth2ClientContext oAuth2ClientContext;
    private final ClientCredentialsResourceDetails clientCredentialsResourceDetails;

    private OAuthRequestInterceptor(OAuth2ClientContext oAuth2ClientContext, ClientCredentialsResourceDetails clientCredentialsResourceDetails) {
        this.oAuth2ClientContext = oAuth2ClientContext;
        this.clientCredentialsResourceDetails = clientCredentialsResourceDetails;
    }

    @Bean
    public RequestInterceptor requestInterceptor(){
        return new OAuth2FeignRequestInterceptor(oAuth2ClientContext, clientCredentialsResourceDetails);
    }
}
