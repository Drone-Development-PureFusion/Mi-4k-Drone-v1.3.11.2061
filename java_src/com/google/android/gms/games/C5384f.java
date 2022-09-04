package com.google.android.gms.games;

import com.google.android.gms.common.api.Status;
/* renamed from: com.google.android.gms.games.f */
/* loaded from: classes2.dex */
public final class C5384f {

    /* renamed from: A */
    public static final int f19470A = 6000;

    /* renamed from: B */
    public static final int f19471B = 6001;

    /* renamed from: C */
    public static final int f19472C = 6002;

    /* renamed from: D */
    public static final int f19473D = 6003;

    /* renamed from: E */
    public static final int f19474E = 6004;

    /* renamed from: F */
    public static final int f19475F = 6500;

    /* renamed from: G */
    public static final int f19476G = 6501;

    /* renamed from: H */
    public static final int f19477H = 6502;

    /* renamed from: I */
    public static final int f19478I = 6503;

    /* renamed from: J */
    public static final int f19479J = 6504;

    /* renamed from: K */
    public static final int f19480K = 6505;

    /* renamed from: L */
    public static final int f19481L = 6506;

    /* renamed from: M */
    public static final int f19482M = 6507;

    /* renamed from: N */
    public static final int f19483N = 7000;

    /* renamed from: O */
    public static final int f19484O = 7001;

    /* renamed from: P */
    public static final int f19485P = 7002;

    /* renamed from: Q */
    public static final int f19486Q = 7003;

    /* renamed from: R */
    public static final int f19487R = 7004;

    /* renamed from: S */
    public static final int f19488S = 7005;

    /* renamed from: T */
    public static final int f19489T = 7007;

    /* renamed from: U */
    public static final int f19490U = 8000;

    /* renamed from: V */
    public static final int f19491V = 8001;

    /* renamed from: W */
    public static final int f19492W = 8002;

    /* renamed from: X */
    public static final int f19493X = 8003;

    /* renamed from: Y */
    public static final int f19494Y = 9000;

    /* renamed from: Z */
    public static final int f19495Z = 9001;

    /* renamed from: a */
    public static final int f19496a = 0;

    /* renamed from: aa */
    public static final int f19497aa = 9002;

    /* renamed from: ab */
    public static final int f19498ab = 9003;

    /* renamed from: ac */
    public static final int f19499ac = 9004;

    /* renamed from: ad */
    public static final int f19500ad = 9006;

    /* renamed from: ae */
    public static final int f19501ae = 9009;

    /* renamed from: b */
    public static final int f19502b = 1;

    /* renamed from: c */
    public static final int f19503c = 2;

    /* renamed from: d */
    public static final int f19504d = 3;

    /* renamed from: e */
    public static final int f19505e = 4;

    /* renamed from: f */
    public static final int f19506f = 5;

    /* renamed from: g */
    public static final int f19507g = 6;

    /* renamed from: h */
    public static final int f19508h = 7;

    /* renamed from: i */
    public static final int f19509i = 8;

    /* renamed from: j */
    public static final int f19510j = 9;

    /* renamed from: k */
    public static final int f19511k = 14;

    /* renamed from: l */
    public static final int f19512l = 15;

    /* renamed from: m */
    public static final int f19513m = 2000;

    /* renamed from: n */
    public static final int f19514n = 2001;

    /* renamed from: o */
    public static final int f19515o = 2002;

    /* renamed from: p */
    public static final int f19516p = 3000;

    /* renamed from: q */
    public static final int f19517q = 3001;

    /* renamed from: r */
    public static final int f19518r = 3002;

    /* renamed from: s */
    public static final int f19519s = 3003;

    /* renamed from: t */
    public static final int f19520t = 4000;

    /* renamed from: u */
    public static final int f19521u = 4001;

    /* renamed from: v */
    public static final int f19522v = 4002;

    /* renamed from: w */
    public static final int f19523w = 4003;

    /* renamed from: x */
    public static final int f19524x = 4004;

    /* renamed from: y */
    public static final int f19525y = 4005;

    /* renamed from: z */
    public static final int f19526z = 4006;

    private C5384f() {
    }

    /* renamed from: a */
    public static Status m20457a(int i) {
        return new Status(i, m20456b(i));
    }

    /* renamed from: b */
    public static String m20456b(int i) {
        switch (i) {
            case 0:
                return "STATUS_OK";
            case 1:
                return "STATUS_INTERNAL_ERROR";
            case 2:
                return "STATUS_CLIENT_RECONNECT_REQUIRED";
            case 3:
                return "STATUS_NETWORK_ERROR_STALE_DATA";
            case 4:
                return "STATUS_NETWORK_ERROR_NO_DATA";
            case 5:
                return "STATUS_NETWORK_ERROR_OPERATION_DEFERRED";
            case 6:
                return "STATUS_NETWORK_ERROR_OPERATION_FAILED";
            case 7:
                return "STATUS_LICENSE_CHECK_FAILED";
            case 8:
                return "STATUS_APP_MISCONFIGURED";
            case 9:
                return "STATUS_GAME_NOT_FOUND";
            case 14:
                return "STATUS_INTERRUPTED";
            case 15:
                return "STATUS_TIMEOUT";
            case 500:
                return "STATUS_RESOLVE_STALE_OR_NO_DATA";
            case 1000:
                return "STATUS_AUTH_ERROR_HARD";
            case 1001:
                return "STATUS_AUTH_ERROR_USER_RECOVERABLE";
            case 1002:
                return "STATUS_AUTH_ERROR_UNREGISTERED_CLIENT_ID";
            case 1003:
                return "STATUS_AUTH_ERROR_API_ACCESS_DENIED";
            case 1500:
                return "STATUS_PLAYER_OOB_REQUIRED";
            case 2000:
                return "STATUS_REQUEST_UPDATE_PARTIAL_SUCCESS";
            case 2001:
                return "STATUS_REQUEST_UPDATE_TOTAL_FAILURE";
            case 2002:
                return "STATUS_REQUEST_TOO_MANY_RECIPIENTS";
            case 3000:
                return "STATUS_ACHIEVEMENT_UNLOCK_FAILURE";
            case 3001:
                return "STATUS_ACHIEVEMENT_UNKNOWN";
            case 3002:
                return "STATUS_ACHIEVEMENT_NOT_INCREMENTAL";
            case 3003:
                return "STATUS_ACHIEVEMENT_UNLOCKED";
            case 4000:
                return "STATUS_SNAPSHOT_NOT_FOUND";
            case 4001:
                return "STATUS_SNAPSHOT_CREATION_FAILED";
            case 4002:
                return "STATUS_SNAPSHOT_CONTENTS_UNAVAILABLE";
            case 4003:
                return "STATUS_SNAPSHOT_COMMIT_FAILED";
            case 4004:
                return "STATUS_SNAPSHOT_CONFLICT";
            case 4006:
                return "STATUS_SNAPSHOT_CONFLICT_MISSING";
            case f19470A /* 6000 */:
                return "STATUS_MULTIPLAYER_ERROR_CREATION_NOT_ALLOWED";
            case f19471B /* 6001 */:
                return "STATUS_MULTIPLAYER_ERROR_NOT_TRUSTED_TESTER";
            case f19472C /* 6002 */:
                return "STATUS_MULTIPLAYER_ERROR_INVALID_MULTIPLAYER_TYPE";
            case f19473D /* 6003 */:
                return "STATUS_MULTIPLAYER_DISABLED";
            case f19475F /* 6500 */:
                return "STATUS_MATCH_ERROR_INVALID_PARTICIPANT_STATE";
            case f19476G /* 6501 */:
                return "STATUS_MATCH_ERROR_INACTIVE_MATCH";
            case f19478I /* 6503 */:
                return "STATUS_MATCH_ERROR_OUT_OF_DATE_VERSION";
            case f19479J /* 6504 */:
                return "STATUS_MATCH_ERROR_INVALID_MATCH_RESULTS";
            case f19480K /* 6505 */:
                return "STATUS_MATCH_ERROR_ALREADY_REMATCHED";
            case f19481L /* 6506 */:
                return "STATUS_MATCH_NOT_FOUND";
            case f19482M /* 6507 */:
                return "STATUS_MATCH_ERROR_LOCALLY_MODIFIED";
            case f19483N /* 7000 */:
                return "STATUS_REAL_TIME_CONNECTION_FAILED";
            case f19484O /* 7001 */:
                return "STATUS_REAL_TIME_MESSAGE_SEND_FAILED";
            case f19485P /* 7002 */:
                return "STATUS_INVALID_REAL_TIME_ROOM_ID";
            case f19486Q /* 7003 */:
                return "STATUS_PARTICIPANT_NOT_CONNECTED";
            case f19487R /* 7004 */:
                return "STATUS_REAL_TIME_ROOM_NOT_JOINED";
            case f19488S /* 7005 */:
                return "STATUS_REAL_TIME_INACTIVE_ROOM";
            case 7006:
                return "STATUS_REAL_TIME_SERVICE_NOT_CONNECTED";
            case f19489T /* 7007 */:
                return "STATUS_OPERATION_IN_FLIGHT";
            case 8000:
                return "STATUS_MILESTONE_CLAIMED_PREVIOUSLY";
            case 8001:
                return "STATUS_MILESTONE_CLAIM_FAILED";
            case 8002:
                return "STATUS_QUEST_NO_LONGER_AVAILABLE";
            case 8003:
                return "STATUS_QUEST_NOT_STARTED";
            case f19494Y /* 9000 */:
                return "STATUS_VIDEO_NOT_ACTIVE";
            case 9001:
                return "STATUS_VIDEO_UNSUPPORTED";
            case 9002:
                return "STATUS_VIDEO_PERMISSION_ERROR";
            case 9003:
                return "STATUS_VIDEO_STORAGE_ERROR";
            case 9004:
                return "STATUS_VIDEO_UNEXPECTED_CAPTURE_ERROR";
            case 9006:
                return "STATUS_VIDEO_ALREADY_CAPTURING";
            case f19501ae /* 9009 */:
                return "STATUS_VIDEO_OUT_OF_DISK_SPACE";
            case 9010:
                return "STATUS_VIDEO_NO_MIC";
            case 9011:
                return "STATUS_VIDEO_NO_CAMERA";
            case 9012:
                return "STATUS_VIDEO_SCREEN_OFF";
            case 9016:
                return "STATUS_VIDEO_RELEASE_TIMEOUT";
            case 9017:
                return "STATUS_VIDEO_CAPTURE_VIDEO_PERMISSION_REQUIRED";
            case 9100:
                return "STATUS_VIDEO_NO_STREAMING_TARGET";
            case 9101:
                return "STATUS_YOUTUBE_LIVE_STREAM_NOT_ENABLED";
            case 9103:
                return "STATUS_YOUTUBE_LIVE_STREAM_GOOGLE_AUTH_ERROR";
            case 9200:
                return "STATUS_VIDEO_MISSING_OVERLAY_PERMISSION";
            case 9201:
                return "STATUS_VIDEO_MISSING_HEADLESS_PERMISSION";
            case 10000:
                return "STATUS_CLIENT_LOADING";
            case 10001:
                return "STATUS_CLIENT_EMPTY";
            case C5375d.f19452b /* 10002 */:
                return "STATUS_CLIENT_HIDDEN";
            default:
                return String.format("Status code (%d) not found!", Integer.valueOf(i));
        }
    }
}
