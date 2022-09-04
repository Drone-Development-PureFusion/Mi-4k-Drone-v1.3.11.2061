package com.fimi.soul.biz.camera.p175d;

import com.fimi.soul.biz.camera.entity.X11RespCmd;
import com.fimi.soul.biz.camera.p173b.AbstractC1788b;
import com.fimi.soul.biz.camera.p173b.AbstractC1792f;
/* renamed from: com.fimi.soul.biz.camera.d.a */
/* loaded from: classes.dex */
public class C1828a implements AbstractC1792f<X11RespCmd> {

    /* renamed from: a */
    private AbstractC1788b f4771a;

    /* renamed from: a */
    public void m33983a(AbstractC1788b abstractC1788b) {
        if (this.f4771a != null) {
            this.f4771a.mo33978a();
        }
    }

    @Override // com.fimi.soul.biz.camera.p173b.AbstractC1792f
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public void mo28055a(boolean z, X11RespCmd x11RespCmd) {
        if (!z || !this.f4771a.mo33979c()) {
            return;
        }
        m33983a(this.f4771a.mo33980b());
    }
}
