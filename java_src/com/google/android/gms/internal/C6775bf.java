package com.google.android.gms.internal;

import com.google.android.gms.common.internal.C4588d;
import org.codehaus.jackson.org.objectweb.asm.Opcodes;
/* renamed from: com.google.android.gms.internal.bf */
/* loaded from: classes2.dex */
public class C6775bf extends aqg {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
        if (r0.equals(p005b.p006a.p007a.p029b.p052m.p053a.C0620k.f1083a) != false) goto L10;
     */
    @Override // com.google.android.gms.internal.aqg
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected AbstractC6880ea<?> mo13115a(apr aprVar, AbstractC6880ea<?>... abstractC6880eaArr) {
        char c = 1;
        C4588d.m23619b(abstractC6880eaArr != null);
        C4588d.m23619b(abstractC6880eaArr.length == 2);
        C4588d.m23619b(abstractC6880eaArr[0] instanceof C6893ej);
        String m16218d = aqf.m16218d(abstractC6880eaArr[1]);
        String str = (String) ((C6893ej) abstractC6880eaArr[0]).mo16034b();
        switch (str.hashCode()) {
            case 101:
                if (str.equals("e")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 105:
                break;
            case Opcodes.FNEG /* 118 */:
                if (str.equals("v")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case Opcodes.DNEG /* 119 */:
                if (str.equals("w")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                aph.m16396a(m16218d);
                break;
            case 1:
                aph.m16392c(m16218d);
                break;
            case 2:
                aph.m16391d(m16218d);
                break;
            case 3:
                aph.m16394b(m16218d);
                break;
            default:
                String valueOf = String.valueOf((String) ((C6893ej) abstractC6880eaArr[0]).mo16034b());
                throw new IllegalArgumentException(valueOf.length() != 0 ? "Invalid logging level: ".concat(valueOf) : new String("Invalid logging level: "));
        }
        return C6886ee.f23122e;
    }
}
