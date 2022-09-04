package com.google.android.gms.vision;

import android.util.SparseArray;
import com.google.android.gms.vision.AbstractC9246b;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.google.android.gms.vision.e */
/* loaded from: classes2.dex */
public class C9278e extends AbstractC9246b<Object> {

    /* renamed from: a */
    private List<AbstractC9246b<? extends Object>> f29275a;

    /* renamed from: com.google.android.gms.vision.e$a */
    /* loaded from: classes2.dex */
    public static class C9280a {

        /* renamed from: a */
        private C9278e f29276a = new C9278e();

        /* renamed from: a */
        public C9280a m8734a(AbstractC9246b<? extends Object> abstractC9246b) {
            this.f29276a.f29275a.add(abstractC9246b);
            return this;
        }

        /* renamed from: a */
        public C9278e m8735a() {
            if (this.f29276a.f29275a.size() == 0) {
                throw new RuntimeException("No underlying detectors added to MultiDetector.");
            }
            return this.f29276a;
        }
    }

    private C9278e() {
        this.f29275a = new ArrayList();
    }

    @Override // com.google.android.gms.vision.AbstractC9246b
    /* renamed from: a */
    public SparseArray<Object> mo8642a(C9274d c9274d) {
        SparseArray<Object> sparseArray = new SparseArray<>();
        for (AbstractC9246b<? extends Object> abstractC9246b : this.f29275a) {
            SparseArray<? extends Object> mo8642a = abstractC9246b.mo8642a(c9274d);
            for (int i = 0; i < mo8642a.size(); i++) {
                int keyAt = mo8642a.keyAt(i);
                if (sparseArray.get(keyAt) != null) {
                    throw new IllegalStateException(new StringBuilder(105).append("Detection ID overlap for id = ").append(keyAt).append(".  This means that one of the detectors is not using global IDs.").toString());
                }
                sparseArray.append(keyAt, mo8642a.valueAt(i));
            }
        }
        return sparseArray;
    }

    @Override // com.google.android.gms.vision.AbstractC9246b
    /* renamed from: a */
    public void mo8645a() {
        for (AbstractC9246b<? extends Object> abstractC9246b : this.f29275a) {
            abstractC9246b.mo8645a();
        }
        this.f29275a.clear();
    }

    @Override // com.google.android.gms.vision.AbstractC9246b
    /* renamed from: a */
    public void mo8738a(AbstractC9246b.AbstractC9248b<Object> abstractC9248b) {
        throw new UnsupportedOperationException("MultiDetector.setProcessor is not supported.  You should set a processor instance on each underlying detector instead.");
    }

    @Override // com.google.android.gms.vision.AbstractC9246b
    /* renamed from: b */
    public void mo8736b(C9274d c9274d) {
        for (AbstractC9246b<? extends Object> abstractC9246b : this.f29275a) {
            abstractC9246b.mo8736b(c9274d);
        }
    }

    @Override // com.google.android.gms.vision.AbstractC9246b
    /* renamed from: b */
    public boolean mo8638b() {
        for (AbstractC9246b<? extends Object> abstractC9246b : this.f29275a) {
            if (!abstractC9246b.mo8638b()) {
                return false;
            }
        }
        return true;
    }
}
