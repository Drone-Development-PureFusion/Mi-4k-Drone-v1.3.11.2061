package com.baidu.tts.p108i.p109a;

import com.baidu.tts.chainofresponsibility.logger.LoggerProxy;
import java.util.Iterator;
/* renamed from: com.baidu.tts.i.a.b */
/* loaded from: classes.dex */
public class C1195b implements Iterator<C1194a> {

    /* renamed from: a */
    private int f3024a;

    /* renamed from: b */
    private int f3025b;

    /* renamed from: c */
    private int f3026c;

    /* renamed from: d */
    private int f3027d;

    /* renamed from: e */
    private int f3028e;

    /* renamed from: f */
    private int f3029f;

    /* renamed from: g */
    private int f3030g;

    /* renamed from: e */
    private int m36265e() {
        return (this.f3024a + this.f3025b) - 1;
    }

    /* renamed from: f */
    private int m36264f() {
        return (this.f3027d + this.f3026c) - 1;
    }

    /* renamed from: a */
    public void m36272a() {
        this.f3024a = 0;
        this.f3025b = 0;
        this.f3027d = 0;
        this.f3028e = 0;
        this.f3029f = 0;
        this.f3030g = 0;
    }

    /* renamed from: a */
    public void m36271a(int i) {
        this.f3026c = i;
    }

    /* renamed from: b */
    public void m36270b() {
    }

    /* renamed from: b */
    public void m36269b(int i) {
        this.f3025b += i;
        this.f3029f = 0;
    }

    @Override // java.util.Iterator
    /* renamed from: c */
    public C1194a next() {
        C1194a c1194a = new C1194a();
        int m36264f = m36264f();
        if (m36264f <= m36265e()) {
            int i = (m36264f - this.f3028e) + 1;
            c1194a.m36278a(this.f3029f);
            c1194a.m36275b(i);
            this.f3028e = m36264f + 1;
            this.f3027d = this.f3028e;
            this.f3029f += i;
            float f = this.f3027d / this.f3025b;
            LoggerProxy.m36554d("UtteranceSubpackager", "mCurrentProgressStartIndex=" + this.f3027d + "--mCurrentAllUtteranceLenght=" + this.f3025b + "--percent=" + f);
            c1194a.m36279a(f);
            c1194a.m36277a(true);
        } else {
            int i2 = this.f3025b - this.f3028e;
            c1194a.m36278a(this.f3029f);
            c1194a.m36275b(i2);
            this.f3028e += i2;
            this.f3029f = i2 + this.f3029f;
        }
        return c1194a;
    }

    /* renamed from: c */
    public void m36267c(int i) {
        this.f3030g = i;
    }

    /* renamed from: d */
    public int m36266d() {
        return this.f3030g;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f3028e < m36265e();
    }

    @Override // java.util.Iterator
    public void remove() {
    }
}
