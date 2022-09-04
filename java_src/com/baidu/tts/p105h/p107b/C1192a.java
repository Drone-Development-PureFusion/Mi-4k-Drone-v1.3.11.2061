package com.baidu.tts.p105h.p107b;

import android.content.Context;
import com.baidu.android.common.util.CommonParam;
import com.baidu.tts.tools.FileTools;
import com.baidu.tts.tools.ResourceTools;
import java.lang.ref.WeakReference;
/* renamed from: com.baidu.tts.h.b.a */
/* loaded from: classes.dex */
public class C1192a {

    /* renamed from: a */
    private WeakReference<Context> f3013a;

    /* renamed from: b */
    private String f3014b;

    /* renamed from: c */
    private String f3015c;

    public C1192a(WeakReference<Context> weakReference) {
        this.f3013a = weakReference;
    }

    /* renamed from: c */
    private Context m36289c() {
        if (this.f3013a == null) {
            return null;
        }
        return this.f3013a.get();
    }

    /* renamed from: a */
    public String m36291a() {
        if (this.f3014b == null) {
            this.f3014b = CommonParam.getCUID(m36289c());
        }
        return this.f3014b;
    }

    /* renamed from: b */
    public String m36290b() {
        if (this.f3015c == null) {
            this.f3015c = FileTools.jointPathAndName(ResourceTools.getAppFilesDirPath(m36289c()), "baidu_tts_license");
        }
        return this.f3015c;
    }
}
