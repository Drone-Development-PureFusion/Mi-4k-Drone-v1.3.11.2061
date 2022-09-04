package com.google.android.gms.vision.face;

import android.util.SparseArray;
import com.google.android.gms.vision.AbstractC9246b;
import com.google.android.gms.vision.AbstractC9273c;
import com.google.android.gms.vision.C9303g;
/* renamed from: com.google.android.gms.vision.face.d */
/* loaded from: classes2.dex */
public class C9291d extends AbstractC9273c<C9286a> {

    /* renamed from: com.google.android.gms.vision.face.d$a */
    /* loaded from: classes2.dex */
    public static class C9292a {

        /* renamed from: a */
        private C9291d f29326a;

        public C9292a(AbstractC9246b<C9286a> abstractC9246b, C9303g<C9286a> c9303g) {
            this.f29326a = new C9291d(abstractC9246b, c9303g);
        }

        /* renamed from: a */
        public C9292a m8695a(int i) {
            this.f29326a.a(i);
            return this;
        }

        /* renamed from: a */
        public C9291d m8696a() {
            return this.f29326a;
        }
    }

    public C9291d(AbstractC9246b<C9286a> abstractC9246b, C9303g<C9286a> c9303g) {
        super(abstractC9246b, c9303g);
    }

    @Override // com.google.android.gms.vision.AbstractC9273c
    /* renamed from: b */
    public int mo8697b(AbstractC9246b.C9247a<C9286a> c9247a) {
        SparseArray<C9286a> m8823a = c9247a.m8823a();
        if (m8823a.size() == 0) {
            throw new IllegalArgumentException("No faces for selectFocus.");
        }
        int keyAt = m8823a.keyAt(0);
        int i = 1;
        int i2 = keyAt;
        float m8717b = m8823a.valueAt(0).m8717b();
        while (true) {
            int i3 = i;
            if (i3 >= m8823a.size()) {
                return i2;
            }
            int keyAt2 = m8823a.keyAt(i3);
            float m8717b2 = m8823a.valueAt(i3).m8717b();
            if (m8717b2 > m8717b) {
                m8717b = m8717b2;
                i2 = keyAt2;
            }
            i = i3 + 1;
        }
    }
}
