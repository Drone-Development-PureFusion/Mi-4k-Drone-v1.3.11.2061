package com.google.android.gms.internal;

import com.google.ads.C3392a;
import com.google.ads.C3395b;
import com.google.ads.mediation.C3404c;
import com.google.android.gms.ads.C3789j;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import java.util.Date;
import java.util.HashSet;
@aaa
/* renamed from: com.google.android.gms.internal.yf */
/* loaded from: classes.dex */
public final class C8044yf {

    /* renamed from: com.google.android.gms.internal.yf$1 */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C80451 {

        /* renamed from: a */
        static final /* synthetic */ int[] f26355a;

        static {
            try {
                f26356b[C3392a.EnumC3393a.INTERNAL_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f26356b[C3392a.EnumC3393a.INVALID_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f26356b[C3392a.EnumC3393a.NETWORK_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f26356b[C3392a.EnumC3393a.NO_FILL.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            f26355a = new int[C3392a.EnumC3394b.values().length];
            try {
                f26355a[C3392a.EnumC3394b.FEMALE.ordinal()] = 1;
            } catch (NoSuchFieldError e5) {
            }
            try {
                f26355a[C3392a.EnumC3394b.MALE.ordinal()] = 2;
            } catch (NoSuchFieldError e6) {
            }
            try {
                f26355a[C3392a.EnumC3394b.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError e7) {
            }
        }
    }

    /* renamed from: a */
    public static int m12942a(C3392a.EnumC3393a enumC3393a) {
        switch (enumC3393a) {
            case INVALID_REQUEST:
                return 1;
            case NETWORK_ERROR:
                return 2;
            case NO_FILL:
                return 3;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    public static C3392a.EnumC3394b m12943a(int i) {
        switch (i) {
            case 1:
                return C3392a.EnumC3394b.MALE;
            case 2:
                return C3392a.EnumC3394b.FEMALE;
            default:
                return C3392a.EnumC3394b.UNKNOWN;
        }
    }

    /* renamed from: a */
    public static C3395b m12940a(AdSizeParcel adSizeParcel) {
        C3395b[] c3395bArr = {C3395b.f13644f, C3395b.f13645g, C3395b.f13646h, C3395b.f13647i, C3395b.f13648j, C3395b.f13649k};
        for (int i = 0; i < 6; i++) {
            if (c3395bArr[i].m27930a() == adSizeParcel.f13868f && c3395bArr[i].m27926b() == adSizeParcel.f13865c) {
                return c3395bArr[i];
            }
        }
        return new C3395b(C3789j.m26819a(adSizeParcel.f13868f, adSizeParcel.f13865c, adSizeParcel.f13864b));
    }

    /* renamed from: a */
    public static C3404c m12941a(AdRequestParcel adRequestParcel) {
        return new C3404c(new Date(adRequestParcel.f13846b), m12943a(adRequestParcel.f13848d), adRequestParcel.f13849e != null ? new HashSet(adRequestParcel.f13849e) : null, adRequestParcel.f13850f, adRequestParcel.f13855k);
    }
}
