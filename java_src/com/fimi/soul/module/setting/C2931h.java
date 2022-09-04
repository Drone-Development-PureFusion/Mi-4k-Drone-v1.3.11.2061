package com.fimi.soul.module.setting;

import java.io.Serializable;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: com.fimi.soul.module.setting.h */
/* loaded from: classes.dex */
public class C2931h implements Serializable {

    /* renamed from: a */
    private String f10538a;

    /* renamed from: b */
    private boolean f10539b = false;

    /* renamed from: a */
    public String m29893a() {
        return this.f10538a;
    }

    /* renamed from: a */
    public void m29892a(String str) {
        this.f10538a = str;
    }

    /* renamed from: a */
    public void m29891a(boolean z) {
        this.f10539b = z;
    }

    /* renamed from: b */
    public boolean m29890b() {
        return this.f10539b;
    }

    public String toString() {
        return "RollerItemEntity{itemName='" + this.f10538a + C0494h.f738z + ", is_able=" + this.f10539b + C0494h.f735w;
    }
}
