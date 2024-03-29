package quizweb.app.authentic;


import javax.servlet.http.HttpServletRequest;

import org.springframework.security.web.authentication.preauth.AbstractPreAuthenticatedProcessingFilter;

public class MyPreAuthenticatedProcessingFilter extends AbstractPreAuthenticatedProcessingFilter{

    @Override
    protected Object getPreAuthenticatedPrincipal(HttpServletRequest req) {
        String oauthToken = req.getParameter("oauth_token");
        return oauthToken;
    }


    @Override
    protected Object getPreAuthenticatedCredentials(HttpServletRequest req) {
        String oauthVerifier = req.getParameter("oauth_verifier");
        return oauthVerifier;
    }

}
