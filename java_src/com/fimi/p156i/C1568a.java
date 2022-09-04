package com.fimi.p156i;

import java.util.regex.Pattern;
/* renamed from: com.fimi.i.a */
/* loaded from: classes.dex */
public class C1568a {

    /* renamed from: a */
    private String f3866a;

    /* renamed from: b */
    private String f3867b;

    /* renamed from: a */
    public String m35111a() {
        return this.f3866a;
    }

    /* renamed from: a */
    public void m35110a(String str) {
        this.f3866a = Pattern.compile("\\s*|\t|\r|\n").matcher(str).replaceAll("");
    }

    /* renamed from: b */
    public String m35109b() {
        return this.f3867b;
    }

    /* renamed from: b */
    public void m35108b(String str) {
        this.f3867b = Pattern.compile("\\s*|\t|\r|\n").matcher(str).replaceAll("");
    }

    public String toString() {
        return "" + m35111a() + " " + m35109b();
    }
}
