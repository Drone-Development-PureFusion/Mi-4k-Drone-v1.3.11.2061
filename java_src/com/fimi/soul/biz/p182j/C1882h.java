package com.fimi.soul.biz.p182j;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.fimi.soul.drone.p204h.C2279c;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: com.fimi.soul.biz.j.h */
/* loaded from: classes.dex */
public class C1882h {

    /* renamed from: a */
    public static final int f5156a = 0;

    /* renamed from: b */
    public static final int f5157b = 1;

    /* renamed from: c */
    public static final int f5158c = 2;

    /* renamed from: d */
    public static final int f5159d = 3;

    /* renamed from: e */
    public static final int f5160e = 4;

    /* renamed from: g */
    private static C1882h f5161g;

    /* renamed from: f */
    private AtomicInteger f5162f = new AtomicInteger(0);

    /* renamed from: h */
    private SharedPreferences f5163h;

    public C1882h(Context context) {
        this.f5163h = PreferenceManager.getDefaultSharedPreferences(context);
        m33764a(this.f5163h.getInt(C2279c.f7254bo, 0));
    }

    /* renamed from: a */
    public static C1882h m33763a(Context context) {
        if (f5161g == null) {
            f5161g = new C1882h(context);
        }
        return f5161g;
    }

    /* renamed from: a */
    public AtomicInteger m33765a() {
        return this.f5162f;
    }

    /* renamed from: a */
    public void m33764a(int i) {
        this.f5162f.set(i);
        this.f5163h.edit().putInt(C2279c.f7254bo, i).commit();
    }

    /* renamed from: b */
    public boolean m33762b() {
        return 1 == this.f5162f.get() || 2 == this.f5162f.get() || 3 == this.f5162f.get();
    }
}
