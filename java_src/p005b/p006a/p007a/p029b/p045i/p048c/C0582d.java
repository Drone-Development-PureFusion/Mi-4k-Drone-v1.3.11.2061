package p005b.p006a.p007a.p029b.p045i.p048c;

import org.codehaus.jackson.org.objectweb.asm.Opcodes;
import org.p286a.p287a.p299f.p302c.C11125l;
/* renamed from: b.a.a.b.i.c.d */
/* loaded from: classes.dex */
public class C0582d implements AbstractC0581c {
    /* renamed from: b */
    public static String m38813b(String str) {
        int length = str.length();
        StringBuffer stringBuffer = new StringBuffer(length);
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            char charAt = str.charAt(i);
            if (charAt == '\\') {
                i = i2 + 1;
                charAt = str.charAt(i2);
                if (charAt == 'n') {
                    charAt = '\n';
                } else if (charAt == 'r') {
                    charAt = C11125l.f35803a;
                } else if (charAt == 't') {
                    charAt = '\t';
                } else if (charAt == 'f') {
                    charAt = '\f';
                }
            } else {
                i = i2;
            }
            stringBuffer.append(charAt);
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    String m38814a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(", \\").append(str.charAt(i));
        }
        return sb.toString();
    }

    @Override // p005b.p006a.p007a.p029b.p045i.p048c.AbstractC0581c
    /* renamed from: a */
    public void mo38812a(String str, StringBuffer stringBuffer, char c, int i) {
        if (str.indexOf(c) >= 0) {
            stringBuffer.append(c);
            return;
        }
        switch (c) {
            case '\\':
                stringBuffer.append(c);
                return;
            case '_':
                return;
            case 'n':
                stringBuffer.append('\n');
                return;
            case 'r':
                stringBuffer.append(C11125l.f35803a);
                return;
            case Opcodes.INEG /* 116 */:
                stringBuffer.append('\t');
                return;
            default:
                throw new IllegalArgumentException("Illegal char '" + c + " at column " + i + ". Only \\\\, \\_" + m38814a(str) + ", \\t, \\n, \\r combinations are allowed as escape characters.");
        }
    }
}
