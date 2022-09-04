package com.google.ads;

import com.google.android.gms.ads.C3443c;
@Deprecated
/* renamed from: com.google.ads.a */
/* loaded from: classes.dex */
public final class C3392a {

    /* renamed from: a */
    public static final String f13626a = "0.0.0";

    /* renamed from: b */
    public static final String f13627b = "Ads";

    /* renamed from: c */
    public static final String f13628c = C3443c.f13732i;

    /* renamed from: com.google.ads.a$a */
    /* loaded from: classes2.dex */
    public enum EnumC3393a {
        INVALID_REQUEST("Invalid Ad request."),
        NO_FILL("Ad request successful, but no ad returned due to lack of ad inventory."),
        NETWORK_ERROR("A network error occurred."),
        INTERNAL_ERROR("There was an internal error.");
        

        /* renamed from: e */
        private final String f13634e;

        EnumC3393a(String str) {
            this.f13634e = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f13634e;
        }
    }

    /* renamed from: com.google.ads.a$b */
    /* loaded from: classes2.dex */
    public enum EnumC3394b {
        UNKNOWN,
        MALE,
        FEMALE
    }

    private C3392a() {
    }
}
