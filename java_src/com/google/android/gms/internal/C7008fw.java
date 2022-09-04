package com.google.android.gms.internal;

import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.common.api.Status;
import com.google.firebase.C9766c;
import com.google.firebase.C9826d;
import com.google.firebase.C9906f;
import com.google.firebase.auth.C9732g;
import com.google.firebase.auth.C9733h;
import com.google.firebase.auth.C9734i;
import com.google.firebase.auth.C9736k;
import com.google.firebase.auth.C9737l;
import com.google.firebase.auth.C9738m;
/* renamed from: com.google.android.gms.internal.fw */
/* loaded from: classes2.dex */
public final class C7008fw {

    /* renamed from: a */
    private static final SparseArray<Pair<String, String>> f23694a = new SparseArray<>();

    static {
        f23694a.put(17000, new Pair<>("ERROR_INVALID_CUSTOM_TOKEN", "The custom token format is incorrect. Please check the documentation."));
        f23694a.put(17002, new Pair<>("ERROR_CUSTOM_TOKEN_MISMATCH", "The custom token corresponds to a different audience."));
        f23694a.put(17004, new Pair<>("ERROR_INVALID_CREDENTIAL", "The supplied auth credential is malformed or has expired."));
        f23694a.put(17008, new Pair<>("ERROR_INVALID_EMAIL", "The email address is badly formatted."));
        f23694a.put(17009, new Pair<>("ERROR_WRONG_PASSWORD", "The password is invalid or the user does not have a password."));
        f23694a.put(17024, new Pair<>("ERROR_USER_MISMATCH", "The supplied credentials do not correspond to the previously signed in user."));
        f23694a.put(17014, new Pair<>("ERROR_REQUIRES_RECENT_LOGIN", "This operation is sensitive and requires recent authentication. Log in again before retrying this request."));
        f23694a.put(17012, new Pair<>("ERROR_ACCOUNT_EXISTS_WITH_DIFFERENT_CREDENTIAL", "An account already exists with the same email address but different sign-in credentials. Sign in using a provider associated with this email address."));
        f23694a.put(17007, new Pair<>("ERROR_EMAIL_ALREADY_IN_USE", "The email address is already in use by another account."));
        f23694a.put(17025, new Pair<>("ERROR_CREDENTIAL_ALREADY_IN_USE", "This credential is already associated with a different user account."));
        f23694a.put(17005, new Pair<>("ERROR_USER_DISABLED", "The user account has been disabled by an administrator."));
        f23694a.put(17021, new Pair<>("ERROR_USER_TOKEN_EXPIRED", "The user's credential is no longer valid. The user must sign in again."));
        f23694a.put(17011, new Pair<>("ERROR_USER_NOT_FOUND", "There is no user record corresponding to this identifier. The user may have been deleted."));
        f23694a.put(17017, new Pair<>("ERROR_INVALID_USER_TOKEN", "The user's credential is no longer valid. The user must sign in again."));
        f23694a.put(17006, new Pair<>("ERROR_OPERATION_NOT_ALLOWED", "This operation is not allowed. You must enable this service in the console."));
        f23694a.put(17026, new Pair<>("ERROR_WEAK_PASSWORD", "The given password is invalid."));
    }

    /* renamed from: a */
    public static C9766c m15806a(Status status) {
        int m24015i = status.m24015i();
        switch (m24015i) {
            case 17000:
            case 17002:
            case 17004:
            case 17008:
            case 17009:
            case 17024:
                return new C9733h(m15807a(m24015i), m15804b(m24015i));
            case 17005:
            case 17011:
            case 17017:
            case 17021:
                return new C9734i(m15807a(m24015i), m15804b(m24015i));
            case 17006:
                return new C9732g(m15807a(m24015i), m15804b(m24015i));
            case 17007:
            case 17012:
            case 17025:
                return new C9737l(m15807a(m24015i), m15804b(m24015i));
            case 17010:
                return new C9906f(m15805a("We have blocked all requests from this device due to unusual activity. Try again later.", status));
            case 17014:
                return new C9736k(m15807a(m24015i), m15804b(m24015i));
            case 17015:
                return new C9766c("User has already been linked to the given provider.");
            case 17016:
                return new C9766c("User was not linked to an account with the given provider.");
            case 17020:
                return new C9826d("A network error (such as timeout, interrupted connection or unreachable host) has occurred.");
            case 17026:
                return new C9738m(m15807a(m24015i), m15805a(m15804b(m24015i), status), status.m24021c());
            case 17495:
                return new C7416ms("Please sign in before trying to get a token.");
            case 17499:
                return new C9766c(m15805a("An internal error has occurred.", status));
            default:
                return new C9766c("An internal error has occurred.");
        }
    }

    /* renamed from: a */
    private static String m15807a(int i) {
        Pair<String, String> pair = f23694a.get(i);
        return pair != null ? (String) pair.first : "INTERNAL_ERROR";
    }

    /* renamed from: a */
    private static String m15805a(String str, Status status) {
        return TextUtils.isEmpty(status.m24021c()) ? str : String.format(String.valueOf(str).concat(" [ %s ]"), status.m24021c());
    }

    /* renamed from: b */
    private static String m15804b(int i) {
        Pair<String, String> pair = f23694a.get(i);
        return pair != null ? (String) pair.second : "An internal error happened";
    }
}
