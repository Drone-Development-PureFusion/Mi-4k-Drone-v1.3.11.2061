package com.google.android.gms.common.data;

import java.util.ArrayList;
/* renamed from: com.google.android.gms.common.data.m */
/* loaded from: classes2.dex */
public abstract class AbstractC4534m<T> extends AbstractC4521a<T> {

    /* renamed from: b */
    private boolean f16913b = false;

    /* renamed from: c */
    private ArrayList<Integer> f16914c;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC4534m(DataHolder dataHolder) {
        super(dataHolder);
    }

    /* renamed from: a */
    private void m23828a() {
        synchronized (this) {
            if (!this.f16913b) {
                int m23879g = this.f16904a.m23879g();
                this.f16914c = new ArrayList<>();
                if (m23879g > 0) {
                    this.f16914c.add(0);
                    String mo7642h = mo7642h();
                    String m23886c = this.f16904a.m23886c(mo7642h, 0, this.f16904a.m23898a(0));
                    int i = 1;
                    while (i < m23879g) {
                        int m23898a = this.f16904a.m23898a(i);
                        String m23886c2 = this.f16904a.m23886c(mo7642h, i, m23898a);
                        if (m23886c2 == null) {
                            throw new NullPointerException(new StringBuilder(String.valueOf(mo7642h).length() + 78).append("Missing value for markerColumn: ").append(mo7642h).append(", at row: ").append(i).append(", for window: ").append(m23898a).toString());
                        }
                        if (!m23886c2.equals(m23886c)) {
                            this.f16914c.add(Integer.valueOf(i));
                        } else {
                            m23886c2 = m23886c;
                        }
                        i++;
                        m23886c = m23886c2;
                    }
                }
                this.f16913b = true;
            }
        }
    }

    @Override // com.google.android.gms.common.data.AbstractC4521a, com.google.android.gms.common.data.AbstractC4522b
    /* renamed from: a */
    public final T mo9715a(int i) {
        m23828a();
        return mo7644a(m23827b(i), m23825c(i));
    }

    /* renamed from: a */
    protected abstract T mo7644a(int i, int i2);

    /* renamed from: b */
    int m23827b(int i) {
        if (i < 0 || i >= this.f16914c.size()) {
            throw new IllegalArgumentException(new StringBuilder(53).append("Position ").append(i).append(" is out of bounds for this buffer").toString());
        }
        return this.f16914c.get(i).intValue();
    }

    @Override // com.google.android.gms.common.data.AbstractC4521a, com.google.android.gms.common.data.AbstractC4522b
    /* renamed from: c */
    public int mo23826c() {
        m23828a();
        return this.f16914c.size();
    }

    /* renamed from: c */
    protected int m23825c(int i) {
        if (i < 0 || i == this.f16914c.size()) {
            return 0;
        }
        int m23879g = i == this.f16914c.size() + (-1) ? this.f16904a.m23879g() - this.f16914c.get(i).intValue() : this.f16914c.get(i + 1).intValue() - this.f16914c.get(i).intValue();
        if (m23879g != 1) {
            return m23879g;
        }
        int m23827b = m23827b(i);
        int m23898a = this.f16904a.m23898a(m23827b);
        String mo20527i = mo20527i();
        if (mo20527i != null && this.f16904a.m23886c(mo20527i, m23827b, m23898a) == null) {
            return 0;
        }
        return m23879g;
    }

    /* renamed from: h */
    protected abstract String mo7642h();

    /* renamed from: i */
    protected String mo20527i() {
        return null;
    }
}
