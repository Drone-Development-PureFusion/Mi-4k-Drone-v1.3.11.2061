package com.google.android.gms.vision;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.vision.AbstractC9246b;
/* renamed from: com.google.android.gms.vision.c */
/* loaded from: classes2.dex */
public abstract class AbstractC9273c<T> implements AbstractC9246b.AbstractC9248b<T> {

    /* renamed from: a */
    private AbstractC9246b<T> f29255a;

    /* renamed from: b */
    private C9303g<T> f29256b;

    /* renamed from: e */
    private int f29259e;

    /* renamed from: c */
    private int f29257c = 3;

    /* renamed from: d */
    private boolean f29258d = false;

    /* renamed from: f */
    private int f29260f = 0;

    public AbstractC9273c(AbstractC9246b<T> abstractC9246b, C9303g<T> c9303g) {
        this.f29255a = abstractC9246b;
        this.f29256b = c9303g;
    }

    @Override // com.google.android.gms.vision.AbstractC9246b.AbstractC9248b
    /* renamed from: a */
    public void mo8733a() {
        this.f29256b.m8673a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m8766a(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(new StringBuilder(28).append("Invalid max gap: ").append(i).toString());
        }
        this.f29257c = i;
    }

    @Override // com.google.android.gms.vision.AbstractC9246b.AbstractC9248b
    /* renamed from: a */
    public void mo8732a(AbstractC9246b.C9247a<T> c9247a) {
        SparseArray<T> m8823a = c9247a.m8823a();
        if (m8823a.size() == 0) {
            if (this.f29260f == this.f29257c) {
                this.f29256b.m8673a();
                this.f29258d = false;
            } else {
                this.f29256b.m8671a(c9247a);
            }
            this.f29260f++;
            return;
        }
        this.f29260f = 0;
        if (this.f29258d) {
            T t = m8823a.get(this.f29259e);
            if (t != null) {
                this.f29256b.m8670a((AbstractC9246b.C9247a<AbstractC9246b.C9247a<T>>) c9247a, (AbstractC9246b.C9247a<T>) t);
                return;
            } else {
                this.f29256b.m8673a();
                this.f29258d = false;
            }
        }
        int mo8697b = mo8697b(c9247a);
        T t2 = m8823a.get(mo8697b);
        if (t2 == null) {
            Log.w("FocusingProcessor", new StringBuilder(35).append("Invalid focus selected: ").append(mo8697b).toString());
            return;
        }
        this.f29258d = true;
        this.f29259e = mo8697b;
        this.f29255a.mo8708a(this.f29259e);
        this.f29256b.m8672a(this.f29259e, (int) t2);
        this.f29256b.m8670a((AbstractC9246b.C9247a<AbstractC9246b.C9247a<T>>) c9247a, (AbstractC9246b.C9247a<T>) t2);
    }

    /* renamed from: b */
    public abstract int mo8697b(AbstractC9246b.C9247a<T> c9247a);
}
