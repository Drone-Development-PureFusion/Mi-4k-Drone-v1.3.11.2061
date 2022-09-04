package com.fimi.kernel.p158b.p159a;

import it.p273a.p274a.AbstractC10872k;
/* renamed from: com.fimi.kernel.b.a.a */
/* loaded from: classes.dex */
public abstract class AbstractC1587a implements AbstractC10872k {

    /* renamed from: com.fimi.kernel.b.a.a$a */
    /* loaded from: classes.dex */
    public enum EnumC1588a {
        Started,
        Transferred,
        Aborted,
        Completed,
        Failed
    }

    @Override // it.p273a.p274a.AbstractC10872k
    /* renamed from: a */
    public void mo3002a() {
        mo33141a(EnumC1588a.Aborted, 0);
    }

    @Override // it.p273a.p274a.AbstractC10872k
    /* renamed from: a */
    public void mo3001a(int i) {
        mo33141a(EnumC1588a.Transferred, i);
    }

    /* renamed from: a */
    public abstract void mo33141a(EnumC1588a enumC1588a, int i);

    @Override // it.p273a.p274a.AbstractC10872k
    /* renamed from: b */
    public void mo3000b() {
        mo33141a(EnumC1588a.Completed, 0);
    }

    @Override // it.p273a.p274a.AbstractC10872k
    /* renamed from: c */
    public void mo2999c() {
        mo33141a(EnumC1588a.Failed, 0);
    }

    @Override // it.p273a.p274a.AbstractC10872k
    /* renamed from: d */
    public void mo2998d() {
        mo33141a(EnumC1588a.Started, 0);
    }
}
