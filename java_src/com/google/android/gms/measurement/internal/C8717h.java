package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.internal.amu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
/* renamed from: com.google.android.gms.measurement.internal.h */
/* loaded from: classes2.dex */
class C8717h {

    /* renamed from: a */
    final int f27898a;

    /* renamed from: b */
    final boolean f27899b;

    /* renamed from: c */
    final String f27900c;

    /* renamed from: d */
    final List<String> f27901d;

    /* renamed from: e */
    final String f27902e;

    /* renamed from: f */
    final boolean f27903f;

    public C8717h(amu.C6585f c6585f) {
        boolean z;
        boolean z2 = false;
        C4588d.m23627a(c6585f);
        if (c6585f.f22335a == null || c6585f.f22335a.intValue() == 0) {
            z = false;
        } else if (c6585f.f22335a.intValue() == 6) {
            if (c6585f.f22338d == null || c6585f.f22338d.length == 0) {
                z = false;
            }
            z = true;
        } else {
            if (c6585f.f22336b == null) {
                z = false;
            }
            z = true;
        }
        if (z) {
            this.f27898a = c6585f.f22335a.intValue();
            if (c6585f.f22337c != null && c6585f.f22337c.booleanValue()) {
                z2 = true;
            }
            this.f27899b = z2;
            if (this.f27899b || this.f27898a == 1 || this.f27898a == 6) {
                this.f27900c = c6585f.f22336b;
            } else {
                this.f27900c = c6585f.f22336b.toUpperCase(Locale.ENGLISH);
            }
            this.f27901d = c6585f.f22338d == null ? null : m10563a(c6585f.f22338d, this.f27899b);
            if (this.f27898a == 1) {
                this.f27902e = this.f27900c;
            } else {
                this.f27902e = null;
            }
        } else {
            this.f27898a = 0;
            this.f27899b = false;
            this.f27900c = null;
            this.f27901d = null;
            this.f27902e = null;
        }
        this.f27903f = z;
    }

    /* renamed from: a */
    private List<String> m10563a(String[] strArr, boolean z) {
        if (z) {
            return Arrays.asList(strArr);
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(str.toUpperCase(Locale.ENGLISH));
        }
        return arrayList;
    }

    /* renamed from: a */
    public Boolean m10564a(String str) {
        if (this.f27903f && str != null) {
            if (!this.f27899b && this.f27898a != 1) {
                str = str.toUpperCase(Locale.ENGLISH);
            }
            switch (this.f27898a) {
                case 1:
                    return Boolean.valueOf(Pattern.compile(this.f27902e, this.f27899b ? 0 : 66).matcher(str).matches());
                case 2:
                    return Boolean.valueOf(str.startsWith(this.f27900c));
                case 3:
                    return Boolean.valueOf(str.endsWith(this.f27900c));
                case 4:
                    return Boolean.valueOf(str.contains(this.f27900c));
                case 5:
                    return Boolean.valueOf(str.equals(this.f27900c));
                case 6:
                    return Boolean.valueOf(this.f27901d.contains(str));
                default:
                    return null;
            }
        }
        return null;
    }
}
