package com.google.android.gms.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.C4588d;
import com.tencent.p263mm.sdk.platformtools.Util;
import java.util.Random;
/* loaded from: classes2.dex */
public class aos {

    /* renamed from: a */
    private final Context f22658a;

    /* renamed from: b */
    private final Random f22659b;

    /* renamed from: c */
    private final String f22660c;

    public aos(Context context, String str) {
        this(context, str, new Random());
    }

    @VisibleForTesting
    aos(Context context, String str, Random random) {
        this.f22658a = (Context) C4588d.m23627a(context);
        this.f22660c = (String) C4588d.m23627a(str);
        this.f22659b = random;
    }

    /* renamed from: a */
    private long m16443a(long j, long j2) {
        SharedPreferences m16437g = m16437g();
        long max = Math.max(0L, m16437g.getLong("FORBIDDEN_COUNT", 0L));
        return ((float) (((((float) max) / ((float) ((Math.max(0L, m16437g.getLong("SUCCESSFUL_COUNT", 0L)) + max) + 1))) * ((float) (j2 - j))) + j)) * this.f22659b.nextFloat();
    }

    /* renamed from: g */
    private SharedPreferences m16437g() {
        Context context = this.f22658a;
        String valueOf = String.valueOf("v5_gtmContainerRefreshPolicy_");
        String valueOf2 = String.valueOf(this.f22660c);
        return context.getSharedPreferences(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf), 0);
    }

    /* renamed from: a */
    public long m16444a() {
        return 43200000 + m16443a(7200000L, 259200000L);
    }

    /* renamed from: b */
    public long m16442b() {
        return Util.MILLSECONDS_OF_HOUR + m16443a(600000L, 86400000L);
    }

    /* renamed from: c */
    public long m16441c() {
        if (Math.max(0L, m16437g().getLong("FORBIDDEN_COUNT", 0L)) == 0) {
            return 0L;
        }
        return m16443a(10000L, 600000L) + 10000;
    }

    /* renamed from: d */
    public boolean m16440d() {
        return Math.max(0L, m16437g().getLong("FORBIDDEN_COUNT", 0L)) > 0;
    }

    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: e */
    public void m16439e() {
        SharedPreferences m16437g = m16437g();
        long j = m16437g.getLong("FORBIDDEN_COUNT", 0L);
        long j2 = m16437g.getLong("SUCCESSFUL_COUNT", 0L);
        SharedPreferences.Editor edit = m16437g.edit();
        long min = j == 0 ? 3L : Math.min(10L, 1 + j);
        long max = Math.max(0L, Math.min(j2, 10 - min));
        edit.putLong("FORBIDDEN_COUNT", min);
        edit.putLong("SUCCESSFUL_COUNT", max);
        apv.m16288a(edit);
    }

    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: f */
    public void m16438f() {
        SharedPreferences m16437g = m16437g();
        long j = m16437g.getLong("SUCCESSFUL_COUNT", 0L);
        long j2 = m16437g.getLong("FORBIDDEN_COUNT", 0L);
        long min = Math.min(10L, j + 1);
        long max = Math.max(0L, Math.min(j2, 10 - min));
        SharedPreferences.Editor edit = m16437g.edit();
        edit.putLong("SUCCESSFUL_COUNT", min);
        edit.putLong("FORBIDDEN_COUNT", max);
        apv.m16288a(edit);
    }
}
