package p005b.p006a.p007a.p029b.p058r;

import org.codehaus.jackson.org.objectweb.asm.Opcodes;
/* renamed from: b.a.a.b.r.d */
/* loaded from: classes.dex */
class C0705d {
    /* renamed from: a */
    private String m38437a(int i) {
        return "\\d{" + i + "}";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public String m38436a(C0704c c0704c) {
        int i = c0704c.f1281b;
        char c = c0704c.f1280a;
        switch (c0704c.f1280a) {
            case '\'':
                if (i != 1) {
                    throw new IllegalStateException("Too many single quotes");
                }
                return "";
            case '.':
                return "\\.";
            case 'D':
            case 'F':
            case 'H':
            case 'K':
            case 'S':
            case 'W':
            case 'd':
            case 'h':
            case 'k':
            case 'm':
            case Opcodes.DREM /* 115 */:
            case Opcodes.DNEG /* 119 */:
            case Opcodes.LSHL /* 121 */:
                return m38437a(i);
            case 'E':
                return ".{2,12}";
            case 'G':
            case 'z':
                return ".*";
            case 'M':
                return i >= 3 ? ".{3,12}" : m38437a(i);
            case 'Z':
                return "(\\+|-)\\d{4}";
            case '\\':
                throw new IllegalStateException("Forward slashes are not allowed");
            case 'a':
                return ".{2}";
            default:
                return i == 1 ? "" + c : c + "{" + i + "}";
        }
    }
}
