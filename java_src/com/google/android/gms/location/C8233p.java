package com.google.android.gms.location;

import com.google.android.gms.common.api.Status;
@Deprecated
/* renamed from: com.google.android.gms.location.p */
/* loaded from: classes.dex */
public final class C8233p {

    /* renamed from: a */
    public static final int f26836a = 0;

    /* renamed from: b */
    public static final int f26837b = 1;

    /* renamed from: c */
    public static final int f26838c = 1000;

    /* renamed from: d */
    public static final int f26839d = 1001;

    /* renamed from: e */
    public static final int f26840e = 1002;

    private C8233p() {
    }

    /* renamed from: a */
    public static int m12370a(int i) {
        if (i < 0 || i > 1) {
            if (1000 <= i && i <= 1002) {
                return i;
            }
            return 1;
        }
        return i;
    }

    /* renamed from: b */
    public static Status m12369b(int i) {
        switch (i) {
            case 1:
                i = 13;
                break;
        }
        return new Status(i);
    }
}
