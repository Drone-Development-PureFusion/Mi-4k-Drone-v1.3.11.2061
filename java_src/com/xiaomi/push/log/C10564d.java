package com.xiaomi.push.log;

import com.xiaomi.channel.commonutils.misc.C10414h;
import com.xiaomi.push.log.C10559b;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.xiaomi.push.log.d */
/* loaded from: classes2.dex */
public class C10564d extends C10414h.AbstractC10416b {

    /* renamed from: a */
    C10414h.AbstractC10416b f32784a;

    /* renamed from: b */
    final /* synthetic */ C10559b f32785b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10564d(C10559b c10559b) {
        this.f32785b = c10559b;
    }

    @Override // com.xiaomi.channel.commonutils.misc.C10414h.AbstractC10416b
    /* renamed from: b */
    public void mo3817b() {
        C10559b.C10561b c10561b = (C10559b.C10561b) this.f32785b.f32764a.peek();
        if (c10561b == null || !c10561b.mo4713d()) {
            return;
        }
        this.f32784a = (C10414h.AbstractC10416b) this.f32785b.f32764a.remove();
        this.f32784a.mo3817b();
    }

    @Override // com.xiaomi.channel.commonutils.misc.C10414h.AbstractC10416b
    /* renamed from: c */
    public void mo4323c() {
        if (this.f32784a != null) {
            this.f32784a.mo4323c();
        }
    }
}
