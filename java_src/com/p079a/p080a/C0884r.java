package com.p079a.p080a;

import java.util.zip.ZipException;
/* renamed from: com.a.a.r */
/* loaded from: classes.dex */
public class C0884r extends ZipException {

    /* renamed from: a */
    static final String f1866a = "archive's size exceeds the limit of 4GByte.";

    /* renamed from: b */
    static final String f1867b = "archive contains more than 65535 entries.";
    private static final long serialVersionUID = 20110809;

    public C0884r(String str) {
        super(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m37531a(C0890w c0890w) {
        return String.valueOf(c0890w.getName()) + "'s size exceeds the limit of 4GByte.";
    }
}
