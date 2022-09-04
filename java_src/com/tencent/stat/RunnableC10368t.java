package com.tencent.stat;

import android.database.Cursor;
import com.tencent.stat.common.StatLogger;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.stat.t */
/* loaded from: classes2.dex */
public class RunnableC10368t implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C10362n f32305a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC10368t(C10362n c10362n) {
        this.f32305a = c10362n;
    }

    @Override // java.lang.Runnable
    public void run() {
        Cursor cursor;
        StatLogger statLogger;
        C10371w c10371w;
        try {
            c10371w = this.f32305a.f32292d;
            cursor = c10371w.getReadableDatabase().query("config", null, null, null, null, null, null);
            while (cursor.moveToNext()) {
                try {
                    int i = cursor.getInt(0);
                    String string = cursor.getString(1);
                    String string2 = cursor.getString(2);
                    int i2 = cursor.getInt(3);
                    C10334b c10334b = new C10334b(i);
                    c10334b.f32203a = i;
                    c10334b.f32204b = new JSONObject(string);
                    c10334b.f32205c = string2;
                    c10334b.f32206d = i2;
                    StatConfig.m5523a(c10334b);
                } catch (Throwable th) {
                    th = th;
                    try {
                        statLogger = C10362n.f32287e;
                        statLogger.m5464e(th);
                        if (cursor == null) {
                            return;
                        }
                        return;
                    } finally {
                        if (cursor != null) {
                            cursor.close();
                        }
                    }
                }
            }
            if (cursor == null) {
                return;
            }
            cursor.close();
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
        }
    }
}
