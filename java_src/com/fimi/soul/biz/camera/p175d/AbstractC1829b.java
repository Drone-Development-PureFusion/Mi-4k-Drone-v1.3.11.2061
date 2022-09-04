package com.fimi.soul.biz.camera.p175d;

import com.fimi.soul.biz.camera.p173b.AbstractC1788b;
/* renamed from: com.fimi.soul.biz.camera.d.b */
/* loaded from: classes.dex */
public abstract class AbstractC1829b implements AbstractC1788b {

    /* renamed from: a */
    private AbstractC1829b f4772a;

    /* renamed from: a */
    public void m33981a(AbstractC1829b abstractC1829b) {
        this.f4772a = abstractC1829b;
    }

    @Override // com.fimi.soul.biz.camera.p173b.AbstractC1788b
    /* renamed from: b */
    public AbstractC1788b mo33980b() {
        return this.f4772a;
    }

    @Override // com.fimi.soul.biz.camera.p173b.AbstractC1788b
    /* renamed from: c */
    public boolean mo33979c() {
        return this.f4772a != null;
    }
}
