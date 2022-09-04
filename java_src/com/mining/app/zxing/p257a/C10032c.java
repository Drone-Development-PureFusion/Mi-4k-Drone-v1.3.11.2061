package com.mining.app.zxing.p257a;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.SurfaceHolder;
import java.io.IOException;
/* renamed from: com.mining.app.zxing.a.c */
/* loaded from: classes.dex */
public final class C10032c {

    /* renamed from: a */
    static final int f30939a;

    /* renamed from: b */
    private static final String f30940b = C10032c.class.getSimpleName();

    /* renamed from: c */
    private static final int f30941c = 240;

    /* renamed from: d */
    private static final int f30942d = 240;

    /* renamed from: e */
    private static final int f30943e = 480;

    /* renamed from: f */
    private static final int f30944f = 360;

    /* renamed from: g */
    private static C10032c f30945g;

    /* renamed from: h */
    private final Context f30946h;

    /* renamed from: i */
    private final C10031b f30947i;

    /* renamed from: j */
    private Camera f30948j;

    /* renamed from: k */
    private Rect f30949k;

    /* renamed from: l */
    private Rect f30950l;

    /* renamed from: m */
    private Rect f30951m;

    /* renamed from: n */
    private boolean f30952n;

    /* renamed from: o */
    private boolean f30953o;

    /* renamed from: p */
    private final boolean f30954p;

    /* renamed from: q */
    private final C10035f f30955q;

    /* renamed from: r */
    private final C10030a f30956r;

    /* renamed from: s */
    private int f30957s;

    static {
        int i;
        try {
            i = Integer.parseInt(Build.VERSION.SDK);
        } catch (NumberFormatException e) {
            i = 10000;
        }
        f30939a = i;
    }

    private C10032c(Context context) {
        this.f30946h = context;
        this.f30947i = new C10031b(context);
        this.f30954p = Integer.parseInt(Build.VERSION.SDK) > 3;
        this.f30955q = new C10035f(this.f30947i, this.f30954p);
        this.f30956r = new C10030a();
    }

    /* renamed from: a */
    public static C10032c m6416a() {
        return f30945g;
    }

    /* renamed from: a */
    public static void m6414a(Context context) {
        if (f30945g == null) {
            f30945g = new C10032c(context);
        }
    }

    /* renamed from: a */
    public int m6415a(int i) {
        return (i * 58) / 108;
    }

    /* renamed from: a */
    public C10034e m6411a(byte[] bArr, int i, int i2) {
        Rect m6404f = m6404f();
        int m6419c = this.f30947i.m6419c();
        String m6418d = this.f30947i.m6418d();
        switch (m6419c) {
            case 16:
            case 17:
                return new C10034e(bArr, i, i2, m6404f.left, m6404f.top, m6404f.width(), m6404f.height());
            default:
                if (!"yuv420p".equals(m6418d)) {
                    throw new IllegalArgumentException("Unsupported picture format: " + m6419c + '/' + m6418d);
                }
                return new C10034e(bArr, i, i2, m6404f.left, m6404f.top, m6404f.width(), m6404f.height());
        }
    }

    /* renamed from: a */
    public void m6413a(Handler handler, int i) {
        if (this.f30948j == null || !this.f30953o) {
            return;
        }
        this.f30955q.m6391a(handler, i);
        if (this.f30954p) {
            this.f30948j.setOneShotPreviewCallback(this.f30955q);
        } else {
            this.f30948j.setPreviewCallback(this.f30955q);
        }
    }

    /* renamed from: a */
    public void m6412a(SurfaceHolder surfaceHolder) {
        if (this.f30948j == null) {
            this.f30948j = Camera.open();
            if (this.f30948j == null) {
                throw new IOException();
            }
            this.f30948j.setPreviewDisplay(surfaceHolder);
            if (!this.f30952n) {
                this.f30952n = true;
                this.f30947i.m6426a(this.f30948j);
            }
            this.f30947i.m6420b(this.f30948j);
            C10033d.m6396b();
        }
    }

    /* renamed from: b */
    public int m6409b(int i) {
        return (i * 42) / 192;
    }

    /* renamed from: b */
    public void m6410b() {
        if (this.f30948j != null) {
            C10033d.m6396b();
            this.f30948j.release();
            this.f30948j = null;
        }
    }

    /* renamed from: b */
    public void m6408b(Handler handler, int i) {
        if (this.f30948j == null || !this.f30953o) {
            return;
        }
        this.f30956r.m6430a(handler, i);
        this.f30948j.autoFocus(this.f30956r);
    }

    /* renamed from: c */
    public void m6407c() {
        if (this.f30948j == null || this.f30953o) {
            return;
        }
        this.f30948j.startPreview();
        this.f30953o = true;
    }

    /* renamed from: d */
    public void m6406d() {
        if (this.f30948j == null || !this.f30953o) {
            return;
        }
        if (!this.f30954p) {
            this.f30948j.setPreviewCallback(null);
        }
        this.f30948j.stopPreview();
        this.f30955q.m6391a(null, 0);
        this.f30956r.m6430a(null, 0);
        this.f30953o = false;
    }

    /* renamed from: e */
    public Rect m6405e() {
        Point m6422b = this.f30947i.m6422b();
        if (this.f30949k == null) {
            if (this.f30948j == null) {
                return null;
            }
            int m6415a = m6415a(m6422b.x);
            this.f30957s = m6409b(m6422b.y);
            int i = (m6422b.x - m6415a) / 2;
            int i2 = ((m6422b.y - this.f30957s) - m6415a) / 2;
            this.f30949k = new Rect(i, i2, i + m6415a, m6415a + i2);
            Log.d(f30940b, "Calculated framing rect: " + this.f30949k);
        }
        return this.f30949k;
    }

    /* renamed from: f */
    public Rect m6404f() {
        if (this.f30951m == null) {
            Rect rect = new Rect(m6405e());
            Point m6429a = this.f30947i.m6429a();
            Point m6422b = this.f30947i.m6422b();
            rect.left = (rect.left * m6429a.y) / m6422b.x;
            rect.right = (rect.right * m6429a.y) / m6422b.x;
            rect.top = (rect.top * m6429a.x) / m6422b.y;
            rect.bottom = (m6429a.x * rect.bottom) / m6422b.y;
            this.f30951m = rect;
        }
        return this.f30951m;
    }

    /* renamed from: g */
    public Context m6403g() {
        return this.f30946h;
    }
}
