package com.google.android.gms.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.stats.C4675f;
import com.google.android.gms.common.stats.C4677h;
import com.google.android.gms.common.util.C4696s;
import com.google.android.gms.common.util.C4700w;
import com.google.android.gms.common.util.C4703z;
/* loaded from: classes2.dex */
public class aon {

    /* renamed from: a */
    private static String f22599a = "WakeLock";

    /* renamed from: b */
    private static String f22600b = "*gcore*:";

    /* renamed from: c */
    private static boolean f22601c = false;

    /* renamed from: d */
    private final PowerManager.WakeLock f22602d;

    /* renamed from: e */
    private WorkSource f22603e;

    /* renamed from: f */
    private final int f22604f;

    /* renamed from: g */
    private final String f22605g;

    /* renamed from: h */
    private final String f22606h;

    /* renamed from: i */
    private final String f22607i;

    /* renamed from: j */
    private final Context f22608j;

    /* renamed from: k */
    private boolean f22609k;

    /* renamed from: l */
    private int f22610l;

    /* renamed from: m */
    private int f22611m;

    public aon(Context context, int i, String str) {
        this(context, i, str, null, context == null ? null : context.getPackageName());
    }

    @SuppressLint({"UnwrappedWakeLock"})
    public aon(Context context, int i, String str, String str2, String str3) {
        this(context, i, str, str2, str3, null);
    }

    @SuppressLint({"UnwrappedWakeLock"})
    public aon(Context context, int i, String str, String str2, String str3, String str4) {
        this.f22609k = true;
        C4588d.m23624a(str, (Object) "Wake lock name can NOT be empty");
        this.f22604f = i;
        this.f22606h = str2;
        this.f22607i = str4;
        this.f22608j = context.getApplicationContext();
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            String valueOf = String.valueOf(f22600b);
            String valueOf2 = String.valueOf(str);
            this.f22605g = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        } else {
            this.f22605g = str;
        }
        this.f22602d = ((PowerManager) context.getSystemService("power")).newWakeLock(i, str);
        if (C4703z.m23086a(this.f22608j)) {
            this.f22603e = C4703z.m23085a(context, C4700w.m23093a(str3) ? context.getPackageName() : str3);
            m16488a(this.f22603e);
        }
    }

    /* renamed from: a */
    private String m16485a(String str, boolean z) {
        return (!this.f22609k || !z) ? this.f22606h : str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x001e, code lost:
        if (r9.f22611m == 1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
        if (r0 == false) goto L14;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m16487a(String str) {
        boolean m16481b = m16481b(str);
        String m16485a = m16485a(str, m16481b);
        synchronized (this) {
            if (this.f22609k) {
                int i = this.f22610l - 1;
                this.f22610l = i;
                if (i != 0) {
                }
                C4677h.m23179a().m23177a(this.f22608j, C4675f.m23185a(this.f22602d, m16485a), 8, this.f22605g, m16485a, this.f22607i, this.f22604f, C4703z.m23080b(this.f22603e));
                this.f22611m--;
            }
            if (!this.f22609k) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x001d, code lost:
        if (r12.f22611m == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
        if (r0 == false) goto L14;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m16486a(String str, long j) {
        boolean m16481b = m16481b(str);
        String m16485a = m16485a(str, m16481b);
        synchronized (this) {
            if (this.f22609k) {
                int i = this.f22610l;
                this.f22610l = i + 1;
                if (i != 0) {
                }
                C4677h.m23179a().m23176a(this.f22608j, C4675f.m23185a(this.f22602d, m16485a), 7, this.f22605g, m16485a, this.f22607i, this.f22604f, C4703z.m23080b(this.f22603e), j);
                this.f22611m++;
            }
            if (!this.f22609k) {
            }
        }
    }

    /* renamed from: b */
    private void m16482b(WorkSource workSource) {
        try {
            this.f22602d.setWorkSource(workSource);
        } catch (IllegalArgumentException e) {
            Log.wtf(f22599a, e.toString());
        }
    }

    /* renamed from: b */
    private boolean m16481b(String str) {
        return !TextUtils.isEmpty(str) && !str.equals(this.f22606h);
    }

    /* renamed from: a */
    public void m16490a() {
        m16487a((String) null);
        this.f22602d.release();
    }

    /* renamed from: a */
    public void m16489a(long j) {
        if (!C4696s.m23110d() && this.f22609k) {
            String str = f22599a;
            String valueOf = String.valueOf(this.f22605g);
            Log.wtf(str, valueOf.length() != 0 ? "Do not acquire with timeout on reference counted WakeLocks before ICS. wakelock: ".concat(valueOf) : new String("Do not acquire with timeout on reference counted WakeLocks before ICS. wakelock: "));
        }
        m16486a((String) null, j);
        this.f22602d.acquire(j);
    }

    /* renamed from: a */
    public void m16488a(WorkSource workSource) {
        if (workSource == null || !C4703z.m23086a(this.f22608j)) {
            return;
        }
        if (this.f22603e != null) {
            this.f22603e.add(workSource);
        } else {
            this.f22603e = workSource;
        }
        m16482b(this.f22603e);
    }

    /* renamed from: a */
    public void m16484a(boolean z) {
        this.f22602d.setReferenceCounted(z);
        this.f22609k = z;
    }

    /* renamed from: b */
    public boolean m16483b() {
        return this.f22602d.isHeld();
    }
}
