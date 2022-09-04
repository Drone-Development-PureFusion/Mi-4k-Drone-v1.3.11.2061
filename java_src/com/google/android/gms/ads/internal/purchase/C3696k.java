package com.google.android.gms.ads.internal.purchase;

import android.content.Intent;
import com.google.android.gms.ads.internal.C3779u;
import com.google.android.gms.internal.aaa;
import com.google.android.gms.internal.abr;
@aaa
/* renamed from: com.google.android.gms.ads.internal.purchase.k */
/* loaded from: classes.dex */
public class C3696k {

    /* renamed from: a */
    private final String f14449a;

    public C3696k(String str) {
        this.f14449a = str;
    }

    /* renamed from: a */
    public String m27074a() {
        return C3779u.m26890e().m18324d();
    }

    /* renamed from: a */
    public boolean m27073a(String str, int i, Intent intent) {
        if (str == null || intent == null) {
            return false;
        }
        String m27078b = C3779u.m26876s().m27078b(intent);
        String m27076c = C3779u.m26876s().m27076c(intent);
        if (m27078b == null || m27076c == null) {
            return false;
        }
        if (!str.equals(C3779u.m26876s().m27079a(m27078b))) {
            abr.d("Developer payload not match.");
            return false;
        } else if (this.f14449a == null || C3697l.m27071a(this.f14449a, m27078b, m27076c)) {
            return true;
        } else {
            abr.d("Fail to verify signature.");
            return false;
        }
    }
}
