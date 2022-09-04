package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.wearable.AbstractC9453c;
import com.google.android.gms.wearable.Channel;
/* renamed from: com.google.android.gms.wearable.internal.al */
/* loaded from: classes2.dex */
final class C9500al implements AbstractC9453c.AbstractC9454a {

    /* renamed from: e */
    private final String f30023e;

    /* renamed from: f */
    private final AbstractC9453c.AbstractC9454a f30024f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9500al(String str, AbstractC9453c.AbstractC9454a abstractC9454a) {
        this.f30023e = (String) C4588d.m23627a(str);
        this.f30024f = (AbstractC9453c.AbstractC9454a) C4588d.m23627a(abstractC9454a);
    }

    @Override // com.google.android.gms.wearable.AbstractC9453c.AbstractC9454a
    /* renamed from: a */
    public void mo7994a(Channel channel) {
        this.f30024f.mo7994a(channel);
    }

    @Override // com.google.android.gms.wearable.AbstractC9453c.AbstractC9454a
    /* renamed from: a */
    public void mo7993a(Channel channel, int i, int i2) {
        this.f30024f.mo7993a(channel, i, i2);
    }

    @Override // com.google.android.gms.wearable.AbstractC9453c.AbstractC9454a
    /* renamed from: b */
    public void mo7992b(Channel channel, int i, int i2) {
        this.f30024f.mo7992b(channel, i, i2);
    }

    @Override // com.google.android.gms.wearable.AbstractC9453c.AbstractC9454a
    /* renamed from: c */
    public void mo7991c(Channel channel, int i, int i2) {
        this.f30024f.mo7991c(channel, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9500al)) {
            return false;
        }
        C9500al c9500al = (C9500al) obj;
        return this.f30024f.equals(c9500al.f30024f) && this.f30023e.equals(c9500al.f30023e);
    }

    public int hashCode() {
        return (this.f30023e.hashCode() * 31) + this.f30024f.hashCode();
    }
}
