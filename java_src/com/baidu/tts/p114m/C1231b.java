package com.baidu.tts.p114m;

import com.baidu.tts.p090b.p091a.p093b.C1092e;
import com.baidu.tts.p090b.p091a.p093b.C1096f;
import com.baidu.tts.p102f.EnumC1178j;
import com.baidu.tts.p102f.EnumC1182n;
import com.baidu.tts.p115n.AbstractC1241a;
import com.baidu.tts.tools.DataTool;
/* renamed from: com.baidu.tts.m.b */
/* loaded from: classes.dex */
public class C1231b extends AbstractC1241a<C1231b> {

    /* renamed from: a */
    private C1096f.C1098b f3057a = new C1096f.C1098b();

    /* renamed from: b */
    private C1092e.C1094b f3058b = new C1092e.C1094b();

    /* renamed from: c */
    private EnumC1178j f3059c;

    /* renamed from: a */
    public C1096f.C1098b m36199a() {
        return this.f3057a;
    }

    /* renamed from: a */
    public void m36198a(EnumC1178j enumC1178j) {
        this.f3059c = enumC1178j;
    }

    /* renamed from: a */
    public void m36197a(String str) {
        this.f3057a.k(str);
        this.f3058b.k(str);
    }

    /* renamed from: b */
    public C1092e.C1094b m36196b() {
        return this.f3058b;
    }

    /* renamed from: b */
    public void m36195b(String str) {
        this.f3057a.m(str);
        this.f3058b.m(str);
    }

    /* renamed from: c */
    public EnumC1178j m36194c() {
        return this.f3059c;
    }

    /* renamed from: c */
    public void m36193c(String str) {
        this.f3057a.l(str);
        this.f3058b.l(str);
    }

    /* renamed from: d */
    public int m36192d(String str) {
        if (DataTool.isLong(str)) {
            this.f3057a.j(str);
            this.f3058b.j(str);
            return 0;
        }
        return EnumC1182n.TTS_PARAMETER_INVALID.m36307b();
    }
}
