package com.google.android.gms.internal;

import com.google.android.gms.common.api.AbstractC4502m;
import com.google.android.gms.common.api.Status;
/* renamed from: com.google.android.gms.internal.dm */
/* loaded from: classes2.dex */
public class C6850dm implements AbstractC4502m {

    /* renamed from: a */
    private final Status f23043a;

    /* renamed from: b */
    private final int f23044b;

    /* renamed from: c */
    private final C6851a f23045c;

    /* renamed from: d */
    private final C6873dy f23046d;

    /* renamed from: com.google.android.gms.internal.dm$a */
    /* loaded from: classes2.dex */
    public static class C6851a {

        /* renamed from: a */
        private final byte[] f23047a;

        /* renamed from: b */
        private final long f23048b;

        /* renamed from: c */
        private final C6828dd f23049c;

        /* renamed from: d */
        private final C6865dv f23050d;

        public C6851a(C6828dd c6828dd, byte[] bArr, C6865dv c6865dv, long j) {
            this.f23049c = c6828dd;
            this.f23047a = bArr;
            this.f23050d = c6865dv;
            this.f23048b = j;
        }

        public C6851a(C6865dv c6865dv) {
            this(null, null, c6865dv, 0L);
        }

        /* renamed from: a */
        public byte[] m16121a() {
            return this.f23047a;
        }

        /* renamed from: b */
        public C6828dd m16120b() {
            return this.f23049c;
        }

        /* renamed from: c */
        public C6865dv m16119c() {
            return this.f23050d;
        }

        /* renamed from: d */
        public long m16118d() {
            return this.f23048b;
        }
    }

    public C6850dm(Status status, int i) {
        this(status, i, null, null);
    }

    public C6850dm(Status status, int i, C6851a c6851a, C6873dy c6873dy) {
        this.f23043a = status;
        this.f23044b = i;
        this.f23045c = c6851a;
        this.f23046d = c6873dy;
    }

    @Override // com.google.android.gms.common.api.AbstractC4502m
    /* renamed from: a */
    public Status mo7645a() {
        return this.f23043a;
    }

    /* renamed from: b */
    public C6851a m16125b() {
        return this.f23045c;
    }

    /* renamed from: c */
    public C6873dy m16124c() {
        return this.f23046d;
    }

    /* renamed from: d */
    public int m16123d() {
        return this.f23044b;
    }

    /* renamed from: e */
    public String m16122e() {
        if (this.f23044b == 0) {
            return "Network";
        }
        if (this.f23044b == 1) {
            return "Saved file on disk";
        }
        if (this.f23044b != 2) {
            throw new IllegalStateException("Resource source is unknown.");
        }
        return "Default resource";
    }
}
