package com.google.android.gms.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.AbstractC6830df;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.LinkedList;
/* renamed from: com.google.android.gms.internal.pr */
/* loaded from: classes2.dex */
public abstract class AbstractC7601pr implements AbstractC7495oq {

    /* renamed from: a */
    protected MotionEvent f25189a;

    /* renamed from: k */
    protected DisplayMetrics f25199k;

    /* renamed from: b */
    protected LinkedList<MotionEvent> f25190b = new LinkedList<>();

    /* renamed from: c */
    protected long f25191c = 0;

    /* renamed from: d */
    protected long f25192d = 0;

    /* renamed from: e */
    protected long f25193e = 0;

    /* renamed from: f */
    protected long f25194f = 0;

    /* renamed from: g */
    protected long f25195g = 0;

    /* renamed from: h */
    protected long f25196h = 0;

    /* renamed from: i */
    protected long f25197i = 0;

    /* renamed from: l */
    private boolean f25200l = false;

    /* renamed from: j */
    protected boolean f25198j = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC7601pr(Context context) {
        try {
            C7352ln.m14725a();
            this.f25199k = context.getResources().getDisplayMetrics();
        } catch (Throwable th) {
        }
    }

    /* renamed from: a */
    private String m14120a(Context context, String str, boolean z, View view) {
        AbstractC6830df.C6831a mo13800b;
        boolean z2 = true;
        try {
            if (z) {
                mo13800b = mo13808a(context, view);
                this.f25200l = true;
            } else {
                mo13800b = mo13800b(context);
            }
            if (mo13800b == null || mo13800b.g() == 0) {
                return Integer.toString(5);
            }
            if (m14117a(z)) {
                z2 = false;
            }
            return C7352ln.m14723a(mo13800b, str, z2);
        } catch (UnsupportedEncodingException e) {
            return Integer.toString(7);
        } catch (NoSuchAlgorithmException e2) {
            return Integer.toString(7);
        } catch (Throwable th) {
            return Integer.toString(3);
        }
    }

    /* renamed from: a */
    private static boolean m14118a(C7680rx c7680rx) {
        return (c7680rx == null || c7680rx.f25504d == null || c7680rx.f25507g == null) ? false : true;
    }

    /* renamed from: a */
    private static boolean m14117a(boolean z) {
        if (!C7788uf.f25824bc.m13486c().booleanValue()) {
            return true;
        }
        return C7788uf.f25842bu.m13486c().booleanValue() && z;
    }

    /* renamed from: b */
    private boolean m14116b(C7680rx c7680rx) {
        return (this.f25199k == null || c7680rx == null || c7680rx.f25505e == null || c7680rx.f25508h == null) ? false : true;
    }

    /* renamed from: a */
    protected abstract long mo13801a(StackTraceElement[] stackTraceElementArr);

    /* renamed from: a */
    protected abstract AbstractC6830df.C6831a mo13808a(Context context, View view);

    @Override // com.google.android.gms.internal.AbstractC7495oq
    /* renamed from: a */
    public String mo14123a(Context context) {
        return m14120a(context, null, false, null);
    }

    /* renamed from: a */
    public String m14122a(Context context, String str) {
        return mo14121a(context, str, (View) null);
    }

    @Override // com.google.android.gms.internal.AbstractC7495oq
    /* renamed from: a */
    public String mo14121a(Context context, String str, View view) {
        return m14120a(context, str, true, view);
    }

    @Override // com.google.android.gms.internal.AbstractC7495oq
    /* renamed from: a */
    public void mo14124a(int i, int i2, int i3) {
        if (this.f25189a != null) {
            this.f25189a.recycle();
        }
        if (this.f25199k != null) {
            this.f25189a = MotionEvent.obtain(0L, i3, 1, i * this.f25199k.density, i2 * this.f25199k.density, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            this.f25189a = null;
        }
        this.f25198j = false;
    }

    @Override // com.google.android.gms.internal.AbstractC7495oq
    /* renamed from: a */
    public void mo14119a(MotionEvent motionEvent) {
        if (this.f25200l) {
            this.f25194f = 0L;
            this.f25193e = 0L;
            this.f25192d = 0L;
            this.f25191c = 0L;
            this.f25195g = 0L;
            this.f25197i = 0L;
            this.f25196h = 0L;
            Iterator<MotionEvent> it2 = this.f25190b.iterator();
            while (it2.hasNext()) {
                it2.next().recycle();
            }
            this.f25190b.clear();
            this.f25189a = null;
            this.f25200l = false;
        }
        switch (motionEvent.getAction()) {
            case 0:
                this.f25191c++;
                break;
            case 1:
                this.f25189a = MotionEvent.obtain(motionEvent);
                this.f25190b.add(this.f25189a);
                if (this.f25190b.size() > 6) {
                    this.f25190b.remove().recycle();
                }
                this.f25193e++;
                try {
                    this.f25195g = mo13801a(new Throwable().getStackTrace());
                    break;
                } catch (C7672rs e) {
                    break;
                }
            case 2:
                this.f25192d += motionEvent.getHistorySize() + 1;
                if (C7788uf.f25832bk.m13486c().booleanValue() || C7788uf.f25827bf.m13486c().booleanValue()) {
                    try {
                        C7680rx mo13798b = mo13798b(motionEvent);
                        if (m14118a(mo13798b)) {
                            this.f25196h += mo13798b.f25504d.longValue() + mo13798b.f25507g.longValue();
                        }
                        if (m14116b(mo13798b)) {
                            this.f25197i = mo13798b.f25508h.longValue() + mo13798b.f25505e.longValue() + this.f25197i;
                            break;
                        }
                    } catch (C7672rs e2) {
                        break;
                    }
                }
                break;
            case 3:
                this.f25194f++;
                break;
        }
        this.f25198j = true;
    }

    /* renamed from: b */
    protected abstract AbstractC6830df.C6831a mo13800b(Context context);

    /* renamed from: b */
    protected abstract C7680rx mo13798b(MotionEvent motionEvent);
}
