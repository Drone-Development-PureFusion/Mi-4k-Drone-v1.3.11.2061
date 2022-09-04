package com.android.volley.toolbox;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import com.android.volley.AbstractC0916n;
import com.android.volley.C0920o;
import com.android.volley.C0924p;
import com.android.volley.C0967u;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
/* renamed from: com.android.volley.toolbox.k */
/* loaded from: classes.dex */
public class C0949k {

    /* renamed from: a */
    private final C0920o f2118a;

    /* renamed from: c */
    private final AbstractC0955b f2120c;

    /* renamed from: g */
    private Runnable f2124g;

    /* renamed from: b */
    private int f2119b = 100;

    /* renamed from: d */
    private final HashMap<String, C0954a> f2121d = new HashMap<>();

    /* renamed from: e */
    private final HashMap<String, C0954a> f2122e = new HashMap<>();

    /* renamed from: f */
    private final Handler f2123f = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.android.volley.toolbox.k$a */
    /* loaded from: classes.dex */
    public class C0954a {

        /* renamed from: b */
        private final AbstractC0916n<?> f2134b;

        /* renamed from: c */
        private Bitmap f2135c;

        /* renamed from: d */
        private C0967u f2136d;

        /* renamed from: e */
        private final LinkedList<C0956c> f2137e = new LinkedList<>();

        public C0954a(AbstractC0916n<?> abstractC0916n, C0956c c0956c) {
            this.f2134b = abstractC0916n;
            this.f2137e.add(c0956c);
        }

        /* renamed from: a */
        public C0967u m37302a() {
            return this.f2136d;
        }

        /* renamed from: a */
        public void m37299a(C0956c c0956c) {
            this.f2137e.add(c0956c);
        }

        /* renamed from: a */
        public void m37298a(C0967u c0967u) {
            this.f2136d = c0967u;
        }

        /* renamed from: b */
        public boolean m37296b(C0956c c0956c) {
            this.f2137e.remove(c0956c);
            if (this.f2137e.size() == 0) {
                this.f2134b.m37404l();
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.android.volley.toolbox.k$b */
    /* loaded from: classes.dex */
    public interface AbstractC0955b {
        /* renamed from: a */
        Bitmap mo29179a(String str);

        /* renamed from: a */
        void mo29177a(String str, Bitmap bitmap);
    }

    /* renamed from: com.android.volley.toolbox.k$c */
    /* loaded from: classes.dex */
    public class C0956c {

        /* renamed from: b */
        private Bitmap f2139b;

        /* renamed from: c */
        private final AbstractC0957d f2140c;

        /* renamed from: d */
        private final String f2141d;

        /* renamed from: e */
        private final String f2142e;

        public C0956c(Bitmap bitmap, String str, String str2, AbstractC0957d abstractC0957d) {
            this.f2139b = bitmap;
            this.f2142e = str;
            this.f2141d = str2;
            this.f2140c = abstractC0957d;
        }

        /* renamed from: a */
        public void m37295a() {
            if (this.f2140c == null) {
                return;
            }
            C0954a c0954a = (C0954a) C0949k.this.f2121d.get(this.f2141d);
            if (c0954a != null) {
                if (!c0954a.m37296b(this)) {
                    return;
                }
                C0949k.this.f2121d.remove(this.f2141d);
                return;
            }
            C0954a c0954a2 = (C0954a) C0949k.this.f2122e.get(this.f2141d);
            if (c0954a2 == null) {
                return;
            }
            c0954a2.m37296b(this);
            if (c0954a2.f2137e.size() != 0) {
                return;
            }
            C0949k.this.f2122e.remove(this.f2141d);
        }

        /* renamed from: b */
        public Bitmap m37292b() {
            return this.f2139b;
        }

        /* renamed from: c */
        public String m37291c() {
            return this.f2142e;
        }
    }

    /* renamed from: com.android.volley.toolbox.k$d */
    /* loaded from: classes.dex */
    public interface AbstractC0957d extends C0924p.AbstractC0925a {
        /* renamed from: a */
        void mo29151a(C0956c c0956c, boolean z);
    }

    public C0949k(C0920o c0920o, AbstractC0955b abstractC0955b) {
        this.f2118a = c0920o;
        this.f2120c = abstractC0955b;
    }

    /* renamed from: a */
    public static AbstractC0957d m37317a(final ImageView imageView, final int i, final int i2) {
        return new AbstractC0957d() { // from class: com.android.volley.toolbox.k.1
            @Override // com.android.volley.toolbox.C0949k.AbstractC0957d
            /* renamed from: a */
            public void mo29151a(C0956c c0956c, boolean z) {
                if (c0956c.m37292b() != null) {
                    imageView.setImageBitmap(c0956c.m37292b());
                } else if (i == 0) {
                } else {
                    imageView.setImageResource(i);
                }
            }

            @Override // com.android.volley.C0924p.AbstractC0925a
            /* renamed from: a */
            public void mo29150a(C0967u c0967u) {
                if (i2 != 0) {
                    imageView.setImageResource(i2);
                }
            }
        };
    }

    /* renamed from: a */
    private void m37319a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ImageLoader must be invoked from the main thread.");
        }
    }

    /* renamed from: a */
    private void m37310a(String str, C0954a c0954a) {
        this.f2122e.put(str, c0954a);
        if (this.f2124g == null) {
            this.f2124g = new Runnable() { // from class: com.android.volley.toolbox.k.4
                @Override // java.lang.Runnable
                public void run() {
                    for (C0954a c0954a2 : C0949k.this.f2122e.values()) {
                        Iterator it2 = c0954a2.f2137e.iterator();
                        while (it2.hasNext()) {
                            C0956c c0956c = (C0956c) it2.next();
                            if (c0956c.f2140c != null) {
                                if (c0954a2.m37302a() == null) {
                                    c0956c.f2139b = c0954a2.f2135c;
                                    c0956c.f2140c.mo29151a(c0956c, false);
                                } else {
                                    c0956c.f2140c.a(c0954a2.m37302a());
                                }
                            }
                        }
                    }
                    C0949k.this.f2122e.clear();
                    C0949k.this.f2124g = null;
                }
            };
            this.f2123f.postDelayed(this.f2124g, this.f2119b);
        }
    }

    /* renamed from: b */
    private static String m37304b(String str, int i, int i2, ImageView.ScaleType scaleType) {
        return new StringBuilder(str.length() + 12).append("#W").append(i).append("#H").append(i2).append("#S").append(scaleType.ordinal()).append(str).toString();
    }

    /* renamed from: a */
    protected AbstractC0916n<Bitmap> m37312a(String str, int i, int i2, ImageView.ScaleType scaleType, final String str2) {
        return new C0958l(str, new C0924p.AbstractC0926b<Bitmap>() { // from class: com.android.volley.toolbox.k.2
            @Override // com.android.volley.C0924p.AbstractC0926b
            /* renamed from: a  reason: avoid collision after fix types in other method */
            public void mo34899a(Bitmap bitmap) {
                C0949k.this.m37311a(str2, bitmap);
            }
        }, i, i2, scaleType, Bitmap.Config.RGB_565, new C0924p.AbstractC0925a() { // from class: com.android.volley.toolbox.k.3
            @Override // com.android.volley.C0924p.AbstractC0925a
            /* renamed from: a */
            public void mo29150a(C0967u c0967u) {
                C0949k.this.m37306a(str2, c0967u);
            }
        });
    }

    /* renamed from: a */
    public C0956c m37309a(String str, AbstractC0957d abstractC0957d) {
        return m37308a(str, abstractC0957d, 0, 0);
    }

    /* renamed from: a */
    public C0956c m37308a(String str, AbstractC0957d abstractC0957d, int i, int i2) {
        return m37307a(str, abstractC0957d, i, i2, ImageView.ScaleType.CENTER_INSIDE);
    }

    /* renamed from: a */
    public C0956c m37307a(String str, AbstractC0957d abstractC0957d, int i, int i2, ImageView.ScaleType scaleType) {
        m37319a();
        String m37304b = m37304b(str, i, i2, scaleType);
        Bitmap mo29179a = this.f2120c.mo29179a(m37304b);
        if (mo29179a != null) {
            C0956c c0956c = new C0956c(mo29179a, str, null, null);
            abstractC0957d.mo29151a(c0956c, true);
            return c0956c;
        }
        C0956c c0956c2 = new C0956c(null, str, m37304b, abstractC0957d);
        abstractC0957d.mo29151a(c0956c2, true);
        C0954a c0954a = this.f2121d.get(m37304b);
        if (c0954a != null) {
            c0954a.m37299a(c0956c2);
            return c0956c2;
        }
        AbstractC0916n<Bitmap> m37312a = m37312a(str, i, i2, scaleType, m37304b);
        this.f2118a.m37395a((AbstractC0916n) m37312a);
        this.f2121d.put(m37304b, new C0954a(m37312a, c0956c2));
        return c0956c2;
    }

    /* renamed from: a */
    public void m37318a(int i) {
        this.f2119b = i;
    }

    /* renamed from: a */
    protected void m37311a(String str, Bitmap bitmap) {
        this.f2120c.mo29177a(str, bitmap);
        C0954a remove = this.f2121d.remove(str);
        if (remove != null) {
            remove.f2135c = bitmap;
            m37310a(str, remove);
        }
    }

    /* renamed from: a */
    protected void m37306a(String str, C0967u c0967u) {
        C0954a remove = this.f2121d.remove(str);
        if (remove != null) {
            remove.m37298a(c0967u);
            m37310a(str, remove);
        }
    }

    /* renamed from: a */
    public boolean m37314a(String str, int i, int i2) {
        return m37313a(str, i, i2, ImageView.ScaleType.CENTER_INSIDE);
    }

    /* renamed from: a */
    public boolean m37313a(String str, int i, int i2, ImageView.ScaleType scaleType) {
        m37319a();
        return this.f2120c.mo29179a(m37304b(str, i, i2, scaleType)) != null;
    }
}
