package com.google.android.gms.tagmanager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.C4588d;
import com.tencent.p263mm.sdk.platformtools.Util;
import java.util.Random;
/* renamed from: com.google.android.gms.tagmanager.dn */
/* loaded from: classes2.dex */
public class C9180dn {

    /* renamed from: a */
    private final Context f28967a;

    /* renamed from: b */
    private final Random f28968b;

    /* renamed from: c */
    private final String f28969c;

    public C9180dn(Context context, String str) {
        this(context, str, new Random());
    }

    @VisibleForTesting
    C9180dn(Context context, String str, Random random) {
        this.f28967a = (Context) C4588d.m23627a(context);
        this.f28969c = (String) C4588d.m23627a(str);
        this.f28968b = random;
    }

    /* renamed from: a */
    private long m9015a(long j, long j2) {
        SharedPreferences m9011e = m9011e();
        long max = Math.max(0L, m9011e.getLong("FORBIDDEN_COUNT", 0L));
        return ((float) (((((float) max) / ((float) ((Math.max(0L, m9011e.getLong("SUCCESSFUL_COUNT", 0L)) + max) + 1))) * ((float) (j2 - j))) + j)) * this.f28968b.nextFloat();
    }

    /* renamed from: e */
    private SharedPreferences m9011e() {
        Context context = this.f28967a;
        String valueOf = String.valueOf("_gtmContainerRefreshPolicy_");
        String valueOf2 = String.valueOf(this.f28969c);
        return context.getSharedPreferences(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), 0);
    }

    /* renamed from: a */
    public long m9016a() {
        return 43200000 + m9015a(7200000L, 259200000L);
    }

    /* renamed from: b */
    public long m9014b() {
        return Util.MILLSECONDS_OF_HOUR + m9015a(600000L, 86400000L);
    }

    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: c */
    public void m9013c() {
        SharedPreferences m9011e = m9011e();
        long j = m9011e.getLong("FORBIDDEN_COUNT", 0L);
        long j2 = m9011e.getLong("SUCCESSFUL_COUNT", 0L);
        SharedPreferences.Editor edit = m9011e.edit();
        long min = j == 0 ? 3L : Math.min(10L, 1 + j);
        long max = Math.max(0L, Math.min(j2, 10 - min));
        edit.putLong("FORBIDDEN_COUNT", min);
        edit.putLong("SUCCESSFUL_COUNT", max);
        C9133cn.m9161a(edit);
    }

    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: d */
    public void m9012d() {
        SharedPreferences m9011e = m9011e();
        long j = m9011e.getLong("SUCCESSFUL_COUNT", 0L);
        long j2 = m9011e.getLong("FORBIDDEN_COUNT", 0L);
        long min = Math.min(10L, j + 1);
        long max = Math.max(0L, Math.min(j2, 10 - min));
        SharedPreferences.Editor edit = m9011e.edit();
        edit.putLong("SUCCESSFUL_COUNT", min);
        edit.putLong("FORBIDDEN_COUNT", max);
        C9133cn.m9161a(edit);
    }
}
