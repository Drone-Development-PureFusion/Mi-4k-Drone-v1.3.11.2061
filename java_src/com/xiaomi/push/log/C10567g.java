package com.xiaomi.push.log;

import android.util.Log;
import com.xiaomi.channel.commonutils.file.C10402c;
import com.xiaomi.channel.commonutils.misc.C10414h;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.xiaomi.push.log.g */
/* loaded from: classes2.dex */
public class C10567g extends C10414h.AbstractC10416b {

    /* renamed from: a */
    final /* synthetic */ C10566f f32794a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10567g(C10566f c10566f) {
        this.f32794a = c10566f;
    }

    @Override // com.xiaomi.channel.commonutils.misc.C10414h.AbstractC10416b
    /* renamed from: b */
    public void mo3817b() {
        List list;
        String str;
        String str2;
        list = C10566f.f32791f;
        if (list.isEmpty()) {
            return;
        }
        try {
            if (!C10402c.m5277d()) {
                str2 = this.f32794a.f32792d;
                Log.w(str2, "SDCard is unavailable.");
            } else {
                this.f32794a.m4709b();
            }
        } catch (Exception e) {
            str = this.f32794a.f32792d;
            Log.e(str, "", e);
        }
    }
}
