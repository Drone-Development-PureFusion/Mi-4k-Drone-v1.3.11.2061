package com.google.android.gms.common.data;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
/* renamed from: com.google.android.gms.common.data.j */
/* loaded from: classes2.dex */
public abstract class AbstractC4531j {

    /* renamed from: c */
    private int f16908c;

    /* renamed from: c_ */
    protected final DataHolder f16909c_;

    /* renamed from: d_ */
    protected int f16910d_;

    public AbstractC4531j(DataHolder dataHolder, int i) {
        this.f16909c_ = (DataHolder) C4588d.m23627a(dataHolder);
        m23846a(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m23846a(int i) {
        C4588d.m23623a(i >= 0 && i < this.f16909c_.m23879g());
        this.f16910d_ = i;
        this.f16908c = this.f16909c_.m23898a(this.f16910d_);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m23845a(String str, CharArrayBuffer charArrayBuffer) {
        this.f16909c_.m23892a(str, this.f16910d_, this.f16908c, charArrayBuffer);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public long m23843b(String str) {
        return this.f16909c_.m23893a(str, this.f16910d_, this.f16908c);
    }

    /* renamed from: b */
    public boolean m23844b() {
        return !this.f16909c_.m23877h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public int m23842c(String str) {
        return this.f16909c_.m23888b(str, this.f16910d_, this.f16908c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public boolean m23841d(String str) {
        return this.f16909c_.m23884d(str, this.f16910d_, this.f16908c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public String m23840e(String str) {
        return this.f16909c_.m23886c(str, this.f16910d_, this.f16908c);
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC4531j) {
            AbstractC4531j abstractC4531j = (AbstractC4531j) obj;
            return C4585c.m23634a(Integer.valueOf(abstractC4531j.f16910d_), Integer.valueOf(this.f16910d_)) && C4585c.m23634a(Integer.valueOf(abstractC4531j.f16908c), Integer.valueOf(this.f16908c)) && abstractC4531j.f16909c_ == this.f16909c_;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: f */
    public float m23839f(String str) {
        return this.f16909c_.m23882e(str, this.f16910d_, this.f16908c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public byte[] m23838g(String str) {
        return this.f16909c_.m23880f(str, this.f16910d_, this.f16908c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public Uri m23837h(String str) {
        return this.f16909c_.m23878g(str, this.f16910d_, this.f16908c);
    }

    public int hashCode() {
        return C4585c.m23633a(Integer.valueOf(this.f16910d_), Integer.valueOf(this.f16908c), this.f16909c_);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: i */
    public boolean m23836i(String str) {
        return this.f16909c_.m23876h(str, this.f16910d_, this.f16908c);
    }

    /* renamed from: m_ */
    public boolean m23835m_(String str) {
        return this.f16909c_.m23895a(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s_ */
    public int m23834s_() {
        return this.f16910d_;
    }
}
