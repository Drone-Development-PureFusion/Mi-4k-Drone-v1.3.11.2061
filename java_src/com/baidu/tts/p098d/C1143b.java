package com.baidu.tts.p098d;

import com.baidu.tts.client.model.OnDownloadListener;
import com.baidu.tts.tools.StringTool;
/* renamed from: com.baidu.tts.d.b */
/* loaded from: classes.dex */
public class C1143b {

    /* renamed from: a */
    private String f2691a;

    /* renamed from: b */
    private OnDownloadListener f2692b;

    /* renamed from: a */
    public String m36479a() {
        return this.f2691a;
    }

    /* renamed from: a */
    public void m36478a(OnDownloadListener onDownloadListener) {
        this.f2692b = onDownloadListener;
    }

    /* renamed from: a */
    public void m36477a(String str) {
        this.f2691a = str;
    }

    /* renamed from: b */
    public boolean m36476b() {
        return !StringTool.isEmpty(this.f2691a);
    }

    /* renamed from: c */
    public OnDownloadListener m36475c() {
        return this.f2692b;
    }
}
