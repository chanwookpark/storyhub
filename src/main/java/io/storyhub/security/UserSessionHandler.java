package io.storyhub.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpSession;

/**
 * Helper class to handling session data for user
 *
 * @author chanwook
 */
public class UserSessionHandler {
    private final Logger logger = LoggerFactory.getLogger(LoginController.class);

    public static final String ACCESS_TOKEN = "_ACCESS_TOKEN";
    public static final String USER_ID = "_USER_ID";

    private final HttpSession httpSession;

    public UserSessionHandler(HttpSession session) {
        this.httpSession = session;
    }

    public void saveUserInfo(String accessToken, String userId) {
        //TODO add verify logic
        //TODO optional
        httpSession.setAttribute(ACCESS_TOKEN, accessToken);
        httpSession.setAttribute(USER_ID, userId);
    }

    public String getUserId() {
        return (String) httpSession.getAttribute(USER_ID);
    }
}