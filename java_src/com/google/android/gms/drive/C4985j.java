package com.google.android.gms.drive;

import android.text.TextUtils;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.C4467a;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.drive.internal.C4913bt;
/* renamed from: com.google.android.gms.drive.j */
/* loaded from: classes2.dex */
public class C4985j {

    /* renamed from: a */
    public static final int f17958a = 65536;

    /* renamed from: b */
    public static final int f17959b = 0;

    /* renamed from: c */
    public static final int f17960c = 1;

    /* renamed from: d */
    private final String f17961d;

    /* renamed from: e */
    private final boolean f17962e;

    /* renamed from: f */
    private final int f17963f;

    /* renamed from: com.google.android.gms.drive.j$a */
    /* loaded from: classes2.dex */
    public static class C4986a {

        /* renamed from: a */
        protected String f17964a;

        /* renamed from: b */
        protected boolean f17965b;

        /* renamed from: c */
        protected int f17966c = 0;

        /* renamed from: a */
        public C4986a mo21794a(int i) {
            if (!C4985j.m22220b(i)) {
                throw new IllegalArgumentException(new StringBuilder(53).append("Unrecognized value for conflict strategy: ").append(i).toString());
            }
            this.f17966c = i;
            return this;
        }

        /* renamed from: a */
        public C4986a mo21793a(String str) {
            if (!C4985j.m22222a(str)) {
                throw new IllegalArgumentException(String.format("trackingTag must not be null nor empty, and the length must be <= the maximum length (%s)", 65536));
            }
            this.f17964a = str;
            return this;
        }

        /* renamed from: a */
        public C4986a mo21792a(boolean z) {
            this.f17965b = z;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: a */
        public void m22218a() {
            if (this.f17966c != 1 || this.f17965b) {
                return;
            }
            throw new IllegalStateException("Cannot use CONFLICT_STRATEGY_KEEP_REMOTE without requesting completion notifications");
        }

        /* renamed from: b */
        public C4985j mo21791b() {
            m22218a();
            return new C4985j(this.f17964a, this.f17965b, this.f17966c);
        }
    }

    public C4985j(String str, boolean z, int i) {
        this.f17961d = str;
        this.f17962e = z;
        this.f17963f = i;
    }

    /* renamed from: a */
    public static boolean m22224a(int i) {
        switch (i) {
            case 1:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: a */
    public static boolean m22222a(String str) {
        return !TextUtils.isEmpty(str) && str.length() <= 65536;
    }

    /* renamed from: b */
    public static boolean m22220b(int i) {
        switch (i) {
            case 0:
            case 1:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: a */
    public String m22225a() {
        return this.f17961d;
    }

    /* renamed from: a */
    public void m22223a(AbstractC4489g abstractC4489g) {
        C4913bt c4913bt = (C4913bt) abstractC4489g.mo17383a((C4467a.C4475d<C4467a.AbstractC4477f>) C4798b.f17559a);
        if (!m22221b() || c4913bt.m22429m()) {
            return;
        }
        throw new IllegalStateException("Application must define an exported DriveEventService subclass in AndroidManifest.xml to be notified on completion");
    }

    /* renamed from: b */
    public boolean m22221b() {
        return this.f17962e;
    }

    /* renamed from: c */
    public int m22219c() {
        return this.f17963f;
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C4985j c4985j = (C4985j) obj;
        return C4585c.m23634a(this.f17961d, c4985j.f17961d) && this.f17963f == c4985j.f17963f && this.f17962e == c4985j.f17962e;
    }

    public int hashCode() {
        return C4585c.m23633a(this.f17961d, Integer.valueOf(this.f17963f), Boolean.valueOf(this.f17962e));
    }
}
