package golife.com.gojek.api.config;

/**
 * Created by swetha on 6/27/2017.
 */

public class APIConfig {

    public static String WEBjm_SERVER_URL = "?key=92e084259eff419b8c864406180707&q=Berhampur&days=5";
    public static String WEB_SERVER_URL = "http://api.apixu.com/v1/forecast.json";

    public static final String REGISTER = "v1/users/register";
    public static final String OTP_VERIFY = "v1/users/otp-verify";
    public static final String SIGNIN = "oauth/token";
    public static final String LOGOUT = "/oauth/revoke";
    public static final String RESEND_OTP = "v1/users/resend-otp";


    public static final String HAS_MEMBERSHIP = "v1/has_membership";
    public static final String ALl_WORKPLACE = "v1/spaces";
    public static final String EVENT_LIST = "v1/events";
    public static final String EVENT_INTEREST = "/interested";


    public static final String PROFILE_DETAIL = "v1/members/me";
    public static final String PROFILE_UPDATE = "v1/users/avatar";

    public static final String WORKSPACE_DETAILS = "v1/bookings";
    public static final String BOOKINGS = "v1/bookings";
    public static final String DIRECTORY_DETAILS = "v1/members/directory";
    public static final String NONMEMBER_DIRECTORY_DETAILS = "v1/spaces/coworker_directory";


    public static final String ALlFAVLIST_DETAILS = "v1/my_favorites";
    public static final String CREATEFAV_LIST = "v1/favorites";
    public static final String DELETEFAV_LIST = "v1/favorites";

    public static final String GET_BOOKINGS = "v1/bookings/my";
    public static final String GET_BOOKINGDETAILS = "v1/bookings";
    public static final String INVITEMEMBER_AFTERBOOKING = "v1/bookings/";

    public static final String GETGOOGLEDETAILS = "https://www.googleapis.com/oauth2/v4/token";
    public static final String GET_FORGOTPASSWORD = "v1/users/forgot_password";
    public static final String GET_FORGOTPASSWORD_OTP = "v1/users/forgot_password_otp";
    public static final String GET_FORGOTPASSWORD_NEWPASSWORD = "v1/members/new_password";

    public static final String CHANGE_PASSWORD = "v1/members/change_password";
    public static final String FACEBOOK_FEED = "v1/facebook_feed";
    public static final String TWITTER_FEED = "v1/twitter_feed";

    public static final String GET_LOGISSUE = "v1/support";


}


