package com.fimi.soul.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.android.volley.C0920o;
import com.android.volley.C0967u;
import com.android.volley.toolbox.C0949k;
import com.android.volley.toolbox.C0966t;
import com.fimi.kernel.utils.C1670k;
import com.fimi.kernel.utils.C1673n;
/* renamed from: com.fimi.soul.utils.ax */
/* loaded from: classes.dex */
public class C3110ax {

    /* renamed from: a */
    private Context f11596a;

    /* renamed from: b */
    private int f11597b;

    /* renamed from: c */
    private int f11598c;

    /* renamed from: d */
    private int f11599d;

    /* renamed from: e */
    private Drawable f11600e;

    /* renamed from: f */
    private View f11601f;

    /* renamed from: g */
    private Drawable f11602g;

    /* renamed from: h */
    private Drawable f11603h;

    /* renamed from: i */
    private C0920o f11604i;

    /* renamed from: j */
    private C0949k f11605j;

    /* renamed from: k */
    private AbstractC3114b f11606k = null;

    /* renamed from: l */
    private AbstractC3113a f11607l = null;

    /* renamed from: com.fimi.soul.utils.ax$a */
    /* loaded from: classes.dex */
    public interface AbstractC3113a {
        /* renamed from: a */
        void m29149a();
    }

    /* renamed from: com.fimi.soul.utils.ax$b */
    /* loaded from: classes.dex */
    public interface AbstractC3114b {
        /* renamed from: a */
        void m29148a(Bitmap bitmap);
    }

    public C3110ax(Context context) {
        this.f11596a = null;
        this.f11605j = null;
        this.f11596a = context;
        this.f11604i = C0966t.m37269a(context);
        this.f11605j = new C0949k(this.f11604i, C3108aw.m29180a());
    }

    /* renamed from: a */
    public static C3110ax m29171a(Context context) {
        return new C3110ax(context);
    }

    /* renamed from: a */
    public int m29173a() {
        return this.f11597b;
    }

    /* renamed from: a */
    public void m29172a(int i) {
        this.f11600e = this.f11596a.getResources().getDrawable(i);
    }

    /* renamed from: a */
    public void m29170a(View view) {
        this.f11601f = view;
    }

    /* renamed from: a */
    public void m29169a(final ImageView imageView, String str) {
        if (C1673n.m34653b(str)) {
            if (this.f11603h != null) {
                if (this.f11601f != null) {
                    this.f11601f.setVisibility(4);
                }
                imageView.setVisibility(0);
                imageView.setImageDrawable(this.f11603h);
            }
            if (this.f11607l == null) {
                return;
            }
            this.f11607l.m29149a();
            return;
        }
        if (this.f11601f != null) {
            this.f11601f.setVisibility(0);
            imageView.setVisibility(4);
        } else if (this.f11600e != null) {
            imageView.setImageDrawable(this.f11600e);
            imageView.setVisibility(0);
        }
        imageView.setTag(str);
        this.f11605j.m37308a(str, new C0949k.AbstractC0957d() { // from class: com.fimi.soul.utils.ax.1
            @Override // com.android.volley.toolbox.C0949k.AbstractC0957d
            /* renamed from: a */
            public void mo29151a(C0949k.C0956c c0956c, boolean z) {
                Bitmap m37292b = c0956c.m37292b();
                if (C3110ax.this.f11606k != null) {
                    C3110ax.this.f11606k.m29148a(m37292b);
                }
                if (C3110ax.this.f11607l != null) {
                    C3110ax.this.f11607l.m29149a();
                }
                C1670k.m34711a(C3110ax.class, "获取到图片：" + m37292b);
                if (!c0956c.m37291c().equals(imageView.getTag())) {
                    return;
                }
                if (m37292b != null) {
                    imageView.setImageBitmap(m37292b);
                } else if (C3110ax.this.f11603h != null) {
                    imageView.setImageDrawable(C3110ax.this.f11603h);
                }
                if (C3110ax.this.f11601f != null) {
                    C3110ax.this.f11601f.setVisibility(4);
                }
                imageView.setVisibility(0);
            }

            @Override // com.android.volley.C0924p.AbstractC0925a
            /* renamed from: a */
            public void mo29150a(C0967u c0967u) {
                if (C3110ax.this.f11602g != null) {
                    imageView.setImageDrawable(C3110ax.this.f11602g);
                }
                if (C3110ax.this.f11607l != null) {
                    C3110ax.this.f11607l.m29149a();
                }
                imageView.setVisibility(0);
                if (C3110ax.this.f11601f != null) {
                    C3110ax.this.f11601f.setVisibility(4);
                }
            }
        }, this.f11597b, this.f11598c);
    }

    /* renamed from: a */
    public void m29168a(AbstractC3113a abstractC3113a) {
        this.f11607l = abstractC3113a;
    }

    /* renamed from: a */
    public void m29167a(AbstractC3114b abstractC3114b) {
        this.f11606k = abstractC3114b;
    }

    /* renamed from: a */
    public void m29165a(String str) {
        if (C1673n.m34653b(str)) {
            return;
        }
        this.f11605j.m37308a(str, new C0949k.AbstractC0957d() { // from class: com.fimi.soul.utils.ax.2
            @Override // com.android.volley.toolbox.C0949k.AbstractC0957d
            /* renamed from: a */
            public void mo29151a(C0949k.C0956c c0956c, boolean z) {
                Bitmap m37292b = c0956c.m37292b();
                if (C3110ax.this.f11606k != null) {
                    C3110ax.this.f11606k.m29148a(m37292b);
                }
                C1670k.m34711a(C3110ax.class, "获取到图片：" + m37292b);
            }

            @Override // com.android.volley.C0924p.AbstractC0925a
            /* renamed from: a */
            public void mo29150a(C0967u c0967u) {
            }
        }, this.f11597b, this.f11598c);
    }

    /* renamed from: b */
    public int m29164b() {
        return this.f11598c;
    }

    /* renamed from: b */
    public void m29163b(int i) {
        this.f11602g = this.f11596a.getResources().getDrawable(i);
    }

    /* renamed from: c */
    public int m29161c() {
        return this.f11599d;
    }

    /* renamed from: c */
    public void m29160c(int i) {
        this.f11603h = this.f11596a.getResources().getDrawable(i);
    }

    /* renamed from: d */
    public AbstractC3114b m29158d() {
        return this.f11606k;
    }

    /* renamed from: d */
    public void m29157d(int i) {
        this.f11597b = i;
    }

    /* renamed from: e */
    public AbstractC3113a m29155e() {
        return this.f11607l;
    }

    /* renamed from: e */
    public void m29154e(int i) {
        this.f11598c = i;
    }

    /* renamed from: f */
    public void m29152f(int i) {
        this.f11599d = i;
    }
}
