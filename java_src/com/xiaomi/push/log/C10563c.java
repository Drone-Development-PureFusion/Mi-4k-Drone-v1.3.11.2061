package com.xiaomi.push.log;

import com.xiaomi.channel.commonutils.file.C10402c;
import com.xiaomi.push.log.C10559b;
import java.io.File;
import java.util.Date;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.xiaomi.push.log.c */
/* loaded from: classes2.dex */
public class C10563c extends C10559b.C10561b {

    /* renamed from: a */
    File f32776a;

    /* renamed from: b */
    final /* synthetic */ int f32777b;

    /* renamed from: c */
    final /* synthetic */ Date f32778c;

    /* renamed from: d */
    final /* synthetic */ Date f32779d;

    /* renamed from: e */
    final /* synthetic */ String f32780e;

    /* renamed from: f */
    final /* synthetic */ String f32781f;

    /* renamed from: g */
    final /* synthetic */ boolean f32782g;

    /* renamed from: h */
    final /* synthetic */ C10559b f32783h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10563c(C10559b c10559b, int i, Date date, Date date2, String str, String str2, boolean z) {
        super();
        this.f32783h = c10559b;
        this.f32777b = i;
        this.f32778c = date;
        this.f32779d = date2;
        this.f32780e = str;
        this.f32781f = str2;
        this.f32782g = z;
    }

    @Override // com.xiaomi.push.log.C10559b.C10561b, com.xiaomi.channel.commonutils.misc.C10414h.AbstractC10416b
    /* renamed from: b */
    public void mo3817b() {
        if (!C10402c.m5277d()) {
            return;
        }
        try {
            File file = new File(this.f32783h.f32765b.getExternalFilesDir(null) + "/.logcache");
            file.mkdirs();
            if (!file.isDirectory()) {
                return;
            }
            C10558a c10558a = new C10558a();
            c10558a.m4731a(this.f32777b);
            this.f32776a = c10558a.m4730a(this.f32783h.f32765b, this.f32778c, this.f32779d, file);
        } catch (NullPointerException e) {
        }
    }

    @Override // com.xiaomi.channel.commonutils.misc.C10414h.AbstractC10416b
    /* renamed from: c */
    public void mo4323c() {
        if (this.f32776a != null && this.f32776a.exists()) {
            this.f32783h.f32764a.add(new C10559b.C10562c(this.f32780e, this.f32781f, this.f32776a, this.f32782g));
        }
        this.f32783h.m4724a(0L);
    }
}
