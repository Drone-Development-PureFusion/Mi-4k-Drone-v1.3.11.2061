package cn.sharesdk.framework.utils;

import org.codehaus.jackson.org.objectweb.asm.signature.SignatureVisitor;
import p005b.p006a.p007a.p029b.C0494h;
/* renamed from: cn.sharesdk.framework.utils.b */
/* loaded from: classes.dex */
public class C0829b extends AbstractC0833e {

    /* renamed from: a */
    private static final char[] f1666a = {SignatureVisitor.EXTENDS};

    /* renamed from: b */
    private static final char[] f1667b = "0123456789ABCDEF".toCharArray();

    /* renamed from: c */
    private final boolean f1668c;

    /* renamed from: d */
    private final boolean[] f1669d;

    public C0829b(String str, boolean z) {
        if (str.matches(".*[0-9A-Za-z].*")) {
            throw new IllegalArgumentException("Alphanumeric characters are always 'safe' and should not be explicitly specified");
        }
        if (z && str.contains(" ")) {
            throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
        }
        if (str.contains("%")) {
            throw new IllegalArgumentException("The '%' character cannot be specified as 'safe'");
        }
        this.f1668c = z;
        this.f1669d = m37774a(str);
    }

    /* renamed from: a */
    private static boolean[] m37774a(String str) {
        char[] charArray = str.toCharArray();
        int i = 122;
        for (char c : charArray) {
            i = Math.max((int) c, i);
        }
        boolean[] zArr = new boolean[i + 1];
        for (int i2 = 48; i2 <= 57; i2++) {
            zArr[i2] = true;
        }
        for (int i3 = 65; i3 <= 90; i3++) {
            zArr[i3] = true;
        }
        for (int i4 = 97; i4 <= 122; i4++) {
            zArr[i4] = true;
        }
        for (char c2 : charArray) {
            zArr[c2] = true;
        }
        return zArr;
    }

    @Override // cn.sharesdk.framework.utils.AbstractC0833e
    /* renamed from: a */
    protected int mo37769a(CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            if (charAt >= this.f1669d.length || !this.f1669d[charAt]) {
                break;
            }
            i++;
        }
        return i;
    }

    @Override // cn.sharesdk.framework.utils.AbstractC0833e
    /* renamed from: a */
    protected char[] mo37770a(int i) {
        if (i >= this.f1669d.length || !this.f1669d[i]) {
            if (i == 32 && this.f1668c) {
                return f1666a;
            }
            if (i <= 127) {
                return new char[]{C0494h.f730r, f1667b[i >>> 4], f1667b[i & 15]};
            }
            if (i <= 2047) {
                char[] cArr = {C0494h.f730r, f1667b[(r1 >>> 4) | 12], f1667b[r1 & 15], C0494h.f730r, f1667b[(r1 & 3) | 8], f1667b[i & 15]};
                int i2 = i >>> 4;
                int i3 = i2 >>> 2;
                return cArr;
            } else if (i <= 65535) {
                char[] cArr2 = {C0494h.f730r, 'E', r2[r1 >>> 2], C0494h.f730r, f1667b[(r1 & 3) | 8], f1667b[r1 & 15], C0494h.f730r, f1667b[(r1 & 3) | 8], f1667b[i & 15]};
                int i4 = i >>> 4;
                int i5 = i4 >>> 2;
                int i6 = i5 >>> 4;
                char[] cArr3 = f1667b;
                return cArr2;
            } else if (i > 1114111) {
                throw new IllegalArgumentException("Invalid unicode character value " + i);
            } else {
                char[] cArr4 = {C0494h.f730r, 'F', f1667b[(r1 >>> 2) & 7], C0494h.f730r, f1667b[(r1 & 3) | 8], f1667b[r1 & 15], C0494h.f730r, f1667b[(r1 & 3) | 8], f1667b[r1 & 15], C0494h.f730r, f1667b[(r1 & 3) | 8], f1667b[i & 15]};
                int i7 = i >>> 4;
                int i8 = i7 >>> 2;
                int i9 = i8 >>> 4;
                int i10 = i9 >>> 2;
                int i11 = i10 >>> 4;
                return cArr4;
            }
        }
        return null;
    }

    @Override // cn.sharesdk.framework.utils.AbstractC0833e, cn.sharesdk.framework.utils.Escaper
    public String escape(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt >= this.f1669d.length || !this.f1669d[charAt]) {
                return a(str, i);
            }
        }
        return str;
    }
}
