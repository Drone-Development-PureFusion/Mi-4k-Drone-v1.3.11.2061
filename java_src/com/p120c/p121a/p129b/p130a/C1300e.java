package com.p120c.p121a.p129b.p130a;

import org.codehaus.jackson.org.objectweb.asm.Opcodes;
/* renamed from: com.c.a.b.a.e */
/* loaded from: classes.dex */
public class C1300e {

    /* renamed from: a */
    private static final int f3259a = 9;

    /* renamed from: b */
    private static final String f3260b = "x";

    /* renamed from: c */
    private final int f3261c;

    /* renamed from: d */
    private final int f3262d;

    public C1300e(int i, int i2) {
        this.f3261c = i;
        this.f3262d = i2;
    }

    public C1300e(int i, int i2, int i3) {
        if (i3 % Opcodes.GETFIELD == 0) {
            this.f3261c = i;
            this.f3262d = i2;
            return;
        }
        this.f3261c = i2;
        this.f3262d = i;
    }

    /* renamed from: a */
    public int m35911a() {
        return this.f3261c;
    }

    /* renamed from: a */
    public C1300e m35910a(float f) {
        return new C1300e((int) (this.f3261c * f), (int) (this.f3262d * f));
    }

    /* renamed from: a */
    public C1300e m35909a(int i) {
        return new C1300e(this.f3261c / i, this.f3262d / i);
    }

    /* renamed from: b */
    public int m35908b() {
        return this.f3262d;
    }

    public String toString() {
        return new StringBuilder(9).append(this.f3261c).append(f3260b).append(this.f3262d).toString();
    }
}
