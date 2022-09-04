package com.xiaomi.mistatistic.sdk.controller;

import com.xiaomi.mistatistic.sdk.data.AbstractC10547a;
import com.xiaomi.mistatistic.sdk.data.C10548b;
import com.xiaomi.mistatistic.sdk.data.C10549c;
import com.xiaomi.mistatistic.sdk.data.C10552f;
import com.xiaomi.mistatistic.sdk.data.C10553g;
import com.xiaomi.mistatistic.sdk.data.C10554h;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.xiaomi.mistatistic.sdk.controller.n */
/* loaded from: classes2.dex */
public class C10533n implements AbstractC10524e {

    /* renamed from: a */
    private AbstractC10547a f32687a;

    public C10533n(AbstractC10547a abstractC10547a) {
        this.f32687a = abstractC10547a;
    }

    @Override // com.xiaomi.mistatistic.sdk.controller.AbstractC10524e
    /* renamed from: a */
    public void mo4784a() {
        C10554h mo4780a = this.f32687a.mo4780a();
        C10528i c10528i = new C10528i();
        if ((this.f32687a instanceof C10552f) || (this.f32687a instanceof C10553g) || (this.f32687a instanceof C10549c) || (this.f32687a instanceof C10548b)) {
            c10528i.m4843a(mo4780a);
        } else {
            String str = mo4780a.f32718c;
            String str2 = mo4780a.f32716a;
            C10554h m4842a = c10528i.m4842a(str2, str);
            if (m4842a == null || !mo4780a.f32719d.equals(m4842a.f32719d)) {
                c10528i.m4843a(mo4780a);
            } else {
                c10528i.m4841a(str, str2, mo4780a.f32720e);
            }
        }
        if (C10515ab.m4869a().m4861d()) {
            new C10539t().m4806a();
        }
    }
}
