package com.google.android.gms.internal;
/* loaded from: classes.dex */
public enum afb {
    CLIENT_LOGIN_DISABLED("ClientLoginDisabled"),
    DEVICE_MANAGEMENT_REQUIRED("DeviceManagementRequiredOrSyncDisabled"),
    SOCKET_TIMEOUT("SocketTimeout"),
    SUCCESS("Ok"),
    UNKNOWN_ERROR("UNKNOWN_ERR"),
    NETWORK_ERROR("NetworkError"),
    SERVICE_UNAVAILABLE("ServiceUnavailable"),
    INTNERNAL_ERROR("InternalError"),
    BAD_AUTHENTICATION("BadAuthentication"),
    EMPTY_CONSUMER_PKG_OR_SIG("EmptyConsumerPackageOrSig"),
    NEEDS_2F("InvalidSecondFactor"),
    NEEDS_POST_SIGN_IN_FLOW("PostSignInFlowRequired"),
    NEEDS_BROWSER("NeedsBrowser"),
    UNKNOWN("Unknown"),
    NOT_VERIFIED("NotVerified"),
    TERMS_NOT_AGREED("TermsNotAgreed"),
    ACCOUNT_DISABLED("AccountDisabled"),
    CAPTCHA("CaptchaRequired"),
    ACCOUNT_DELETED("AccountDeleted"),
    SERVICE_DISABLED("ServiceDisabled"),
    NEED_PERMISSION("NeedPermission"),
    NEED_REMOTE_CONSENT("NeedRemoteConsent"),
    INVALID_SCOPE("INVALID_SCOPE"),
    USER_CANCEL("UserCancel"),
    PERMISSION_DENIED("PermissionDenied"),
    INVALID_AUDIENCE("INVALID_AUDIENCE"),
    UNREGISTERED_ON_API_CONSOLE("UNREGISTERED_ON_API_CONSOLE"),
    THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED("ThirdPartyDeviceManagementRequired"),
    DM_INTERNAL_ERROR("DeviceManagementInternalError"),
    DM_SYNC_DISABLED("DeviceManagementSyncDisabled"),
    DM_ADMIN_BLOCKED("DeviceManagementAdminBlocked"),
    DM_ADMIN_PENDING_APPROVAL("DeviceManagementAdminPendingApproval"),
    DM_STALE_SYNC_REQUIRED("DeviceManagementStaleSyncRequired"),
    DM_DEACTIVATED("DeviceManagementDeactivated"),
    DM_REQUIRED("DeviceManagementRequired"),
    ALREADY_HAS_GMAIL("ALREADY_HAS_GMAIL"),
    BAD_PASSWORD("WeakPassword"),
    BAD_REQUEST("BadRequest"),
    BAD_USERNAME("BadUsername"),
    DELETED_GMAIL("DeletedGmail"),
    EXISTING_USERNAME("ExistingUsername"),
    LOGIN_FAIL("LoginFail"),
    NOT_LOGGED_IN("NotLoggedIn"),
    NO_GMAIL("NoGmail"),
    REQUEST_DENIED("RequestDenied"),
    SERVER_ERROR("ServerError"),
    USERNAME_UNAVAILABLE("UsernameUnavailable"),
    GPLUS_OTHER("GPlusOther"),
    GPLUS_NICKNAME("GPlusNickname"),
    GPLUS_INVALID_CHAR("GPlusInvalidChar"),
    GPLUS_INTERSTITIAL("GPlusInterstitial"),
    GPLUS_PROFILE_ERROR("ProfileUpgradeError");
    

    /* renamed from: aa */
    private final String f21437aa;

    afb(String str) {
        this.f21437aa = str;
    }

    /* renamed from: a */
    public static final afb m17818a(String str) {
        afb afbVar = null;
        afb[] values = values();
        int length = values.length;
        int i = 0;
        while (i < length) {
            afb afbVar2 = values[i];
            if (!afbVar2.f21437aa.equals(str)) {
                afbVar2 = afbVar;
            }
            i++;
            afbVar = afbVar2;
        }
        return afbVar;
    }

    /* renamed from: a */
    public static boolean m17819a(afb afbVar) {
        return BAD_AUTHENTICATION.equals(afbVar) || CAPTCHA.equals(afbVar) || NEED_PERMISSION.equals(afbVar) || NEEDS_BROWSER.equals(afbVar) || USER_CANCEL.equals(afbVar) || DEVICE_MANAGEMENT_REQUIRED.equals(afbVar) || DM_INTERNAL_ERROR.equals(afbVar) || DM_SYNC_DISABLED.equals(afbVar) || DM_ADMIN_BLOCKED.equals(afbVar) || DM_ADMIN_PENDING_APPROVAL.equals(afbVar) || DM_STALE_SYNC_REQUIRED.equals(afbVar) || DM_DEACTIVATED.equals(afbVar) || DM_REQUIRED.equals(afbVar) || THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED.equals(afbVar);
    }

    /* renamed from: b */
    public static boolean m17817b(afb afbVar) {
        return NETWORK_ERROR.equals(afbVar) || SERVICE_UNAVAILABLE.equals(afbVar);
    }
}
