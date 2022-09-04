package com.google.android.gms.ads.formats;

import android.support.annotation.Nullable;
import com.google.android.gms.ads.C3473i;
import com.google.android.gms.internal.aaa;
@aaa
/* renamed from: com.google.android.gms.ads.formats.b */
/* loaded from: classes.dex */
public final class C3458b {

    /* renamed from: a */
    public static final int f13765a = 0;

    /* renamed from: b */
    public static final int f13766b = 1;

    /* renamed from: c */
    public static final int f13767c = 2;

    /* renamed from: d */
    public static final int f13768d = 0;

    /* renamed from: e */
    public static final int f13769e = 1;

    /* renamed from: f */
    public static final int f13770f = 2;

    /* renamed from: g */
    public static final int f13771g = 3;

    /* renamed from: h */
    private final boolean f13772h;

    /* renamed from: i */
    private final int f13773i;

    /* renamed from: j */
    private final boolean f13774j;

    /* renamed from: k */
    private final int f13775k;

    /* renamed from: l */
    private final C3473i f13776l;

    /* renamed from: com.google.android.gms.ads.formats.b$a */
    /* loaded from: classes.dex */
    public @interface AbstractC3460a {
    }

    /* renamed from: com.google.android.gms.ads.formats.b$b */
    /* loaded from: classes.dex */
    public static final class C3461b {

        /* renamed from: d */
        private C3473i f13780d;

        /* renamed from: a */
        private boolean f13777a = false;

        /* renamed from: b */
        private int f13778b = 0;

        /* renamed from: c */
        private boolean f13779c = false;

        /* renamed from: e */
        private int f13781e = 1;

        /* renamed from: a */
        public C3461b m27727a(int i) {
            this.f13778b = i;
            return this;
        }

        /* renamed from: a */
        public C3461b m27725a(C3473i c3473i) {
            this.f13780d = c3473i;
            return this;
        }

        /* renamed from: a */
        public C3461b m27724a(boolean z) {
            this.f13777a = z;
            return this;
        }

        /* renamed from: a */
        public C3458b m27728a() {
            return new C3458b(this);
        }

        /* renamed from: b */
        public C3461b m27723b(@AbstractC3460a int i) {
            this.f13781e = i;
            return this;
        }

        /* renamed from: b */
        public C3461b m27721b(boolean z) {
            this.f13779c = z;
            return this;
        }
    }

    private C3458b(C3461b c3461b) {
        this.f13772h = c3461b.f13777a;
        this.f13773i = c3461b.f13778b;
        this.f13774j = c3461b.f13779c;
        this.f13775k = c3461b.f13781e;
        this.f13776l = c3461b.f13780d;
    }

    /* renamed from: a */
    public boolean m27733a() {
        return this.f13772h;
    }

    /* renamed from: b */
    public int m27732b() {
        return this.f13773i;
    }

    /* renamed from: c */
    public boolean m27731c() {
        return this.f13774j;
    }

    /* renamed from: d */
    public int m27730d() {
        return this.f13775k;
    }

    @Nullable
    /* renamed from: e */
    public C3473i m27729e() {
        return this.f13776l;
    }
}
