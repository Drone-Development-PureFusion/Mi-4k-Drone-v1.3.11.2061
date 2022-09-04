package com.google.android.gms.vision;

import android.util.SparseArray;
import com.google.android.gms.vision.AbstractC9246b;
import java.util.HashSet;
/* renamed from: com.google.android.gms.vision.f */
/* loaded from: classes2.dex */
public class C9281f<T> implements AbstractC9246b.AbstractC9248b<T> {

    /* renamed from: a */
    private AbstractC9284b<T> f29277a;

    /* renamed from: b */
    private SparseArray<C9285c> f29278b;

    /* renamed from: c */
    private int f29279c;

    /* renamed from: com.google.android.gms.vision.f$a */
    /* loaded from: classes2.dex */
    public static class C9283a<T> {

        /* renamed from: a */
        private C9281f<T> f29280a = new C9281f<>();

        public C9283a(AbstractC9284b<T> abstractC9284b) {
            if (abstractC9284b == null) {
                throw new IllegalArgumentException("No factory supplied.");
            }
            ((C9281f) this.f29280a).f29277a = abstractC9284b;
        }

        /* renamed from: a */
        public C9283a<T> m8725a(int i) {
            if (i < 0) {
                throw new IllegalArgumentException(new StringBuilder(28).append("Invalid max gap: ").append(i).toString());
            }
            ((C9281f) this.f29280a).f29279c = i;
            return this;
        }

        /* renamed from: a */
        public C9281f<T> m8726a() {
            return this.f29280a;
        }
    }

    /* renamed from: com.google.android.gms.vision.f$b */
    /* loaded from: classes2.dex */
    public interface AbstractC9284b<T> {
        /* renamed from: a */
        C9303g<T> m8724a(T t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.vision.f$c */
    /* loaded from: classes2.dex */
    public class C9285c {

        /* renamed from: b */
        private C9303g<T> f29282b;

        /* renamed from: c */
        private int f29283c;

        private C9285c() {
            this.f29283c = 0;
        }

        /* renamed from: b */
        static /* synthetic */ int m8720b(C9285c c9285c) {
            int i = c9285c.f29283c;
            c9285c.f29283c = i + 1;
            return i;
        }
    }

    private C9281f() {
        this.f29278b = new SparseArray<>();
        this.f29279c = 3;
    }

    /* renamed from: b */
    private void m8729b(AbstractC9246b.C9247a<T> c9247a) {
        SparseArray<T> m8823a = c9247a.m8823a();
        for (int i = 0; i < m8823a.size(); i++) {
            int keyAt = m8823a.keyAt(i);
            T valueAt = m8823a.valueAt(i);
            if (this.f29278b.get(keyAt) == null) {
                C9285c c9285c = new C9285c();
                c9285c.f29282b = this.f29277a.m8724a(valueAt);
                c9285c.f29282b.m8672a(keyAt, (int) valueAt);
                this.f29278b.append(keyAt, c9285c);
            }
        }
    }

    /* renamed from: c */
    private void m8728c(AbstractC9246b.C9247a<T> c9247a) {
        SparseArray<T> m8823a = c9247a.m8823a();
        HashSet<Integer> hashSet = new HashSet();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f29278b.size()) {
                break;
            }
            int keyAt = this.f29278b.keyAt(i2);
            if (m8823a.get(keyAt) == null) {
                C9285c valueAt = this.f29278b.valueAt(i2);
                C9285c.m8720b(valueAt);
                if (valueAt.f29283c >= this.f29279c) {
                    valueAt.f29282b.m8673a();
                    hashSet.add(Integer.valueOf(keyAt));
                } else {
                    valueAt.f29282b.m8671a(c9247a);
                }
            }
            i = i2 + 1;
        }
        for (Integer num : hashSet) {
            this.f29278b.delete(num.intValue());
        }
    }

    /* renamed from: d */
    private void m8727d(AbstractC9246b.C9247a<T> c9247a) {
        SparseArray<T> m8823a = c9247a.m8823a();
        for (int i = 0; i < m8823a.size(); i++) {
            int keyAt = m8823a.keyAt(i);
            T valueAt = m8823a.valueAt(i);
            C9285c c9285c = this.f29278b.get(keyAt);
            c9285c.f29283c = 0;
            c9285c.f29282b.m8670a((AbstractC9246b.C9247a<AbstractC9246b.C9247a<T>>) c9247a, (AbstractC9246b.C9247a<T>) valueAt);
        }
    }

    @Override // com.google.android.gms.vision.AbstractC9246b.AbstractC9248b
    /* renamed from: a */
    public void mo8733a() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f29278b.size()) {
                this.f29278b.clear();
                return;
            } else {
                this.f29278b.valueAt(i2).f29282b.m8673a();
                i = i2 + 1;
            }
        }
    }

    @Override // com.google.android.gms.vision.AbstractC9246b.AbstractC9248b
    /* renamed from: a */
    public void mo8732a(AbstractC9246b.C9247a<T> c9247a) {
        m8729b(c9247a);
        m8728c(c9247a);
        m8727d(c9247a);
    }
}
