package com.tencent.stat;

import android.content.Context;
import com.tencent.stat.common.StatLogger;
import com.tencent.stat.p268a.C10326d;
import java.io.File;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.stat.i */
/* loaded from: classes2.dex */
public class RunnableC10357i implements Runnable {

    /* renamed from: a */
    private Context f32279a;

    public RunnableC10357i(Context context) {
        this.f32279a = null;
        this.f32279a = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        StatLogger statLogger;
        Iterator<File> it2 = StatNativeCrashReport.m5506a(this.f32279a).iterator();
        while (it2.hasNext()) {
            File next = it2.next();
            C10326d c10326d = new C10326d(this.f32279a, StatService.m5498a(this.f32279a, false), StatNativeCrashReport.m5505a(next), 3, 10240);
            c10326d.m5477a(StatNativeCrashReport.m5504b(next));
            if (StatService.m5493c(this.f32279a) != null) {
                StatService.m5493c(this.f32279a).post(new RunnableC10359k(c10326d));
            }
            next.delete();
            statLogger = StatService.f32152i;
            statLogger.m5466d("delete tombstone file:" + next.getAbsolutePath().toString());
        }
    }
}
