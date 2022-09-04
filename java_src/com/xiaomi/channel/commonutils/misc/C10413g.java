package com.xiaomi.channel.commonutils.misc;

import android.content.SharedPreferences;
import com.xiaomi.channel.commonutils.misc.C10410f;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.xiaomi.channel.commonutils.misc.g */
/* loaded from: classes2.dex */
public class C10413g extends C10410f.RunnableC10412b {

    /* renamed from: a */
    final /* synthetic */ String f32353a;

    /* renamed from: b */
    final /* synthetic */ C10410f f32354b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10413g(C10410f c10410f, C10410f.AbstractRunnableC10411a abstractRunnableC10411a, String str) {
        super(abstractRunnableC10411a);
        this.f32354b = c10410f;
        this.f32353a = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.xiaomi.channel.commonutils.misc.C10410f.RunnableC10412b
    /* renamed from: a */
    public void mo5246a() {
        super.mo5246a();
    }

    @Override // com.xiaomi.channel.commonutils.misc.C10410f.RunnableC10412b
    /* renamed from: b */
    void mo5245b() {
        SharedPreferences sharedPreferences;
        sharedPreferences = this.f32354b.f32351e;
        sharedPreferences.edit().putLong(this.f32353a, System.currentTimeMillis()).commit();
    }
}
