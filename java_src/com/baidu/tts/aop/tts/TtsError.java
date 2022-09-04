package com.baidu.tts.aop.tts;

import com.baidu.tts.p102f.EnumC1182n;
import com.baidu.tts.p105h.p106a.C1190b;
/* loaded from: classes.dex */
public class TtsError {

    /* renamed from: a */
    private Throwable f2452a;

    /* renamed from: b */
    private int f2453b;

    /* renamed from: c */
    private String f2454c;

    /* renamed from: d */
    private C1190b f2455d;

    public int getCode() {
        return this.f2453b;
    }

    public int getDetailCode() {
        return this.f2455d != null ? this.f2455d.m36301a(this) : this.f2453b;
    }

    public String getDetailMessage() {
        return this.f2455d != null ? this.f2455d.m36300b(this) : this.f2454c != null ? this.f2454c : "TtsErrorFlyweight is null";
    }

    public EnumC1182n getErrorEnum() {
        if (this.f2455d == null) {
            return null;
        }
        return this.f2455d.a();
    }

    public String getMessage() {
        return this.f2454c;
    }

    public Throwable getThrowable() {
        return this.f2452a;
    }

    public C1190b getTtsErrorFlyweight() {
        return this.f2455d;
    }

    public void setCode(int i) {
        this.f2453b = i;
    }

    public void setMessage(String str) {
        this.f2454c = str;
    }

    public void setThrowable(Throwable th) {
        this.f2452a = th;
    }

    public void setTtsErrorFlyweight(C1190b c1190b) {
        this.f2455d = c1190b;
    }
}
