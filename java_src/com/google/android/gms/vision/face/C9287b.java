package com.google.android.gms.vision.face;

import android.content.Context;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.vision.AbstractC9246b;
import com.google.android.gms.vision.C9274d;
import com.google.android.gms.vision.C9304h;
import com.google.android.gms.vision.face.internal.client.C9293a;
import com.google.android.gms.vision.face.internal.client.FaceSettingsParcel;
import com.google.android.gms.vision.internal.client.FrameMetadataParcel;
import java.nio.ByteBuffer;
import java.util.HashSet;
/* renamed from: com.google.android.gms.vision.face.b */
/* loaded from: classes2.dex */
public final class C9287b extends AbstractC9246b<C9286a> {

    /* renamed from: a */
    public static final int f29295a = 0;

    /* renamed from: b */
    public static final int f29296b = 1;

    /* renamed from: c */
    public static final int f29297c = 0;

    /* renamed from: d */
    public static final int f29298d = 1;

    /* renamed from: e */
    public static final int f29299e = 0;

    /* renamed from: f */
    public static final int f29300f = 1;

    /* renamed from: g */
    private final C9304h f29301g;

    /* renamed from: h */
    private final C9293a f29302h;

    /* renamed from: i */
    private final Object f29303i;

    /* renamed from: j */
    private boolean f29304j;

    /* renamed from: com.google.android.gms.vision.face.b$a */
    /* loaded from: classes2.dex */
    public static class C9289a {

        /* renamed from: a */
        private final Context f29305a;

        /* renamed from: b */
        private int f29306b = 0;

        /* renamed from: c */
        private boolean f29307c = false;

        /* renamed from: d */
        private int f29308d = 0;

        /* renamed from: e */
        private boolean f29309e = true;

        /* renamed from: f */
        private int f29310f = 0;

        /* renamed from: g */
        private float f29311g = -1.0f;

        public C9289a(Context context) {
            this.f29305a = context;
        }

        /* renamed from: a */
        public C9289a m8706a(float f) {
            if (f < 0.0f || f > 1.0f) {
                throw new IllegalArgumentException(new StringBuilder(47).append("Invalid proportional face size: ").append(f).toString());
            }
            this.f29311g = f;
            return this;
        }

        /* renamed from: a */
        public C9289a m8705a(int i) {
            if (i == 0 || i == 1) {
                this.f29306b = i;
                return this;
            }
            throw new IllegalArgumentException(new StringBuilder(34).append("Invalid landmark type: ").append(i).toString());
        }

        /* renamed from: a */
        public C9289a m8704a(boolean z) {
            this.f29307c = z;
            return this;
        }

        /* renamed from: a */
        public C9287b m8707a() {
            FaceSettingsParcel faceSettingsParcel = new FaceSettingsParcel();
            faceSettingsParcel.f29340b = this.f29310f;
            faceSettingsParcel.f29341c = this.f29306b;
            faceSettingsParcel.f29342d = this.f29308d;
            faceSettingsParcel.f29343e = this.f29307c;
            faceSettingsParcel.f29344f = this.f29309e;
            faceSettingsParcel.f29345g = this.f29311g;
            return new C9287b(new C9293a(this.f29305a, faceSettingsParcel));
        }

        /* renamed from: b */
        public C9289a m8703b(int i) {
            if (i == 0 || i == 1) {
                this.f29308d = i;
                return this;
            }
            throw new IllegalArgumentException(new StringBuilder(40).append("Invalid classification type: ").append(i).toString());
        }

        /* renamed from: b */
        public C9289a m8702b(boolean z) {
            this.f29309e = z;
            return this;
        }

        /* renamed from: c */
        public C9289a m8701c(int i) {
            switch (i) {
                case 0:
                case 1:
                    this.f29310f = i;
                    return this;
                default:
                    throw new IllegalArgumentException(new StringBuilder(25).append("Invalid mode: ").append(i).toString());
            }
        }
    }

    private C9287b() {
        this.f29301g = new C9304h();
        this.f29303i = new Object();
        this.f29304j = true;
        throw new IllegalStateException("Default constructor called");
    }

    private C9287b(C9293a c9293a) {
        this.f29301g = new C9304h();
        this.f29303i = new Object();
        this.f29304j = true;
        this.f29302h = c9293a;
    }

    @Override // com.google.android.gms.vision.AbstractC9246b
    /* renamed from: a */
    public SparseArray<C9286a> mo8642a(C9274d c9274d) {
        C9286a[] m8690a;
        if (c9274d == null) {
            throw new IllegalArgumentException("No frame supplied.");
        }
        ByteBuffer m8761b = c9274d.m8761b();
        synchronized (this.f29303i) {
            if (!this.f29304j) {
                throw new RuntimeException("Cannot use detector after release()");
            }
            m8690a = this.f29302h.m8690a(m8761b, FrameMetadataParcel.m8667a(c9274d));
        }
        HashSet hashSet = new HashSet();
        SparseArray<C9286a> sparseArray = new SparseArray<>(m8690a.length);
        int i = 0;
        for (C9286a c9286a : m8690a) {
            int m8709j = c9286a.m8709j();
            i = Math.max(i, m8709j);
            if (hashSet.contains(Integer.valueOf(m8709j))) {
                m8709j = i + 1;
                i = m8709j;
            }
            hashSet.add(Integer.valueOf(m8709j));
            sparseArray.append(this.f29301g.m8669a(m8709j), c9286a);
        }
        return sparseArray;
    }

    @Override // com.google.android.gms.vision.AbstractC9246b
    /* renamed from: a */
    public void mo8645a() {
        super.mo8645a();
        synchronized (this.f29303i) {
            if (!this.f29304j) {
                return;
            }
            this.f29302h.c();
            this.f29304j = false;
        }
    }

    @Override // com.google.android.gms.vision.AbstractC9246b
    /* renamed from: a */
    public boolean mo8708a(int i) {
        boolean m8694a;
        int m8668b = this.f29301g.m8668b(i);
        synchronized (this.f29303i) {
            if (!this.f29304j) {
                throw new RuntimeException("Cannot use detector after release()");
            }
            m8694a = this.f29302h.m8694a(m8668b);
        }
        return m8694a;
    }

    @Override // com.google.android.gms.vision.AbstractC9246b
    /* renamed from: b */
    public boolean mo8638b() {
        return this.f29302h.b();
    }

    protected void finalize() {
        try {
            synchronized (this.f29303i) {
                if (this.f29304j) {
                    Log.w("FaceDetector", "FaceDetector was not released with FaceDetector.release()");
                    mo8645a();
                }
            }
        } finally {
            super.finalize();
        }
    }
}
