package com.xiaomi.smack.util;

import android.content.Context;
import com.xiaomi.channel.commonutils.misc.C10414h;
import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.xiaomi.smack.util.h */
/* loaded from: classes2.dex */
public final class C10754h extends C10414h.AbstractC10416b {

    /* renamed from: a */
    final /* synthetic */ Context f33570a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10754h(Context context) {
        this.f33570a = context;
    }

    @Override // com.xiaomi.channel.commonutils.misc.C10414h.AbstractC10416b
    /* renamed from: b */
    public void mo3817b() {
        Object obj;
        ArrayList arrayList;
        List list;
        List list2;
        obj = C10752g.f33560c;
        synchronized (obj) {
            list = C10752g.f33561d;
            arrayList = new ArrayList(list);
            list2 = C10752g.f33561d;
            list2.clear();
        }
        C10752g.m3821b(this.f33570a, arrayList);
    }
}
