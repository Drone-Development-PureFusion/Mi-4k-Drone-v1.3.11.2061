package com.google.android.gms.vision;

import android.util.SparseArray;
import com.google.android.gms.vision.C9274d;
/* renamed from: com.google.android.gms.vision.b */
/* loaded from: classes2.dex */
public abstract class AbstractC9246b<T> {

    /* renamed from: a */
    private Object f29115a = new Object();

    /* renamed from: b */
    private AbstractC9248b<T> f29116b;

    /* renamed from: com.google.android.gms.vision.b$a */
    /* loaded from: classes2.dex */
    public static class C9247a<T> {

        /* renamed from: a */
        private SparseArray<T> f29117a;

        /* renamed from: b */
        private C9274d.C9277b f29118b;

        /* renamed from: c */
        private boolean f29119c;

        public C9247a(SparseArray<T> sparseArray, C9274d.C9277b c9277b, boolean z) {
            this.f29117a = sparseArray;
            this.f29118b = c9277b;
            this.f29119c = z;
        }

        /* renamed from: a */
        public SparseArray<T> m8823a() {
            return this.f29117a;
        }

        /* renamed from: b */
        public C9274d.C9277b m8822b() {
            return this.f29118b;
        }

        /* renamed from: c */
        public boolean m8821c() {
            return this.f29119c;
        }
    }

    /* renamed from: com.google.android.gms.vision.b$b */
    /* loaded from: classes2.dex */
    public interface AbstractC9248b<T> {
        /* renamed from: a */
        void mo8733a();

        /* renamed from: a */
        void mo8732a(C9247a<T> c9247a);
    }

    /* renamed from: a */
    public abstract SparseArray<T> mo8642a(C9274d c9274d);

    /* renamed from: a */
    public void mo8645a() {
        synchronized (this.f29115a) {
            if (this.f29116b != null) {
                this.f29116b.mo8733a();
                this.f29116b = null;
            }
        }
    }

    /* renamed from: a */
    public void mo8738a(AbstractC9248b<T> abstractC9248b) {
        this.f29116b = abstractC9248b;
    }

    /* renamed from: a */
    public boolean mo8708a(int i) {
        return true;
    }

    /* renamed from: b */
    public void mo8736b(C9274d c9274d) {
        synchronized (this.f29115a) {
            if (this.f29116b == null) {
                throw new IllegalStateException("Detector processor must first be set with setProcessor in order to receive detection results.");
            }
            C9274d.C9277b c9277b = new C9274d.C9277b(c9274d.m8765a());
            c9277b.m8739g();
            this.f29116b.mo8732a(new C9247a<>(mo8642a(c9274d), c9277b, mo8638b()));
        }
    }

    /* renamed from: b */
    public boolean mo8638b() {
        return true;
    }
}
