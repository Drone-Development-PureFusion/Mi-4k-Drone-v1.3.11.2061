package com.tencent.stat.p268a;

import android.content.Context;
import com.tencent.stat.StatConfig;
import com.tencent.stat.common.C10346k;
import java.io.PrintWriter;
import java.io.StringWriter;
import org.json.JSONObject;
/* renamed from: com.tencent.stat.a.d */
/* loaded from: classes2.dex */
public class C10326d extends AbstractC10327e {

    /* renamed from: a */
    private String f32167a;

    /* renamed from: l */
    private int f32168l;

    /* renamed from: m */
    private int f32169m = 100;

    public C10326d(Context context, int i, int i2, Throwable th) {
        super(context, i);
        if (th != null) {
            Throwable th2 = new Throwable(th);
            try {
                StackTraceElement[] stackTrace = th2.getStackTrace();
                if (stackTrace != null && stackTrace.length > this.f32169m) {
                    StackTraceElement[] stackTraceElementArr = new StackTraceElement[this.f32169m];
                    for (int i3 = 0; i3 < this.f32169m; i3++) {
                        stackTraceElementArr[i3] = stackTrace[i3];
                    }
                    th2.setStackTrace(stackTraceElementArr);
                }
            } catch (Throwable th3) {
                th3.printStackTrace();
            }
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th2.printStackTrace(printWriter);
            this.f32167a = stringWriter.toString();
            this.f32168l = i2;
            printWriter.close();
        }
    }

    public C10326d(Context context, int i, String str, int i2, int i3) {
        super(context, i);
        if (str != null) {
            i3 = i3 <= 0 ? StatConfig.getMaxReportEventLength() : i3;
            if (str.length() <= i3) {
                this.f32167a = str;
            } else {
                this.f32167a = str.substring(0, i3);
            }
        }
        this.f32168l = i2;
    }

    @Override // com.tencent.stat.p268a.AbstractC10327e
    /* renamed from: a */
    public EnumC10328f mo5470a() {
        return EnumC10328f.ERROR;
    }

    /* renamed from: a */
    public void m5477a(long j) {
        this.f32172c = j;
    }

    @Override // com.tencent.stat.p268a.AbstractC10327e
    /* renamed from: a */
    public boolean mo5469a(JSONObject jSONObject) {
        C10346k.m5427a(jSONObject, "er", this.f32167a);
        jSONObject.put("ea", this.f32168l);
        return true;
    }
}
