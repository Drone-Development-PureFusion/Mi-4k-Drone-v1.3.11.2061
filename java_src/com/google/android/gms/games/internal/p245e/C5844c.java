package com.google.android.gms.games.internal.p245e;

import com.google.android.gms.common.data.AbstractC4531j;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.C4585c;
import com.xiaomi.market.sdk.AbstractC10446k;
/* renamed from: com.google.android.gms.games.internal.e.c */
/* loaded from: classes2.dex */
public final class C5844c extends AbstractC4531j implements AbstractC5842a {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C5844c(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    /* renamed from: a */
    public long m19997a() {
        return b(AbstractC10446k._ID);
    }

    /* renamed from: d */
    public String m19996d() {
        return e("notification_id");
    }

    /* renamed from: e */
    public int m19995e() {
        return c("type");
    }

    /* renamed from: f */
    public String m19994f() {
        return e("ticker");
    }

    /* renamed from: g */
    public String m19993g() {
        return e("title");
    }

    /* renamed from: h */
    public String m19992h() {
        return e("text");
    }

    /* renamed from: i */
    public String m19991i() {
        return e("coalesced_text");
    }

    /* renamed from: j */
    public boolean m19990j() {
        return c("acknowledged") > 0;
    }

    /* renamed from: k */
    public boolean m19989k() {
        return c("alert_level") == 0;
    }

    /* renamed from: l */
    public boolean m19988l() {
        return c("alert_level") == 2;
    }

    public String toString() {
        return C4585c.m23635a(this).m23632a("Id", Long.valueOf(m19997a())).m23632a("NotificationId", m19996d()).m23632a("Type", Integer.valueOf(m19995e())).m23632a("Title", m19993g()).m23632a("Ticker", m19994f()).m23632a("Text", m19992h()).m23632a("CoalescedText", m19991i()).m23632a("isAcknowledged", Boolean.valueOf(m19990j())).m23632a("isSilent", Boolean.valueOf(m19989k())).m23632a("isQuiet", Boolean.valueOf(m19988l())).toString();
    }
}
