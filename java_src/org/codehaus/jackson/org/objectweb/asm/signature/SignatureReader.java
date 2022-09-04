package org.codehaus.jackson.org.objectweb.asm.signature;
/* loaded from: classes3.dex */
public class SignatureReader {

    /* renamed from: a */
    private final String f36999a;

    public SignatureReader(String str) {
        this.f36999a = str;
    }

    /* renamed from: a */
    private static int m190a(String str, int i, SignatureVisitor signatureVisitor) {
        int i2 = i + 1;
        char charAt = str.charAt(i);
        switch (charAt) {
            case 'B':
            case 'C':
            case 'D':
            case 'F':
            case 'I':
            case 'J':
            case 'S':
            case 'V':
            case 'Z':
                signatureVisitor.visitBaseType(charAt);
                return i2;
            case 'E':
            case 'G':
            case 'H':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'U':
            case 'W':
            case 'X':
            case 'Y':
            default:
                boolean z = false;
                int i3 = i2;
                int i4 = i2;
                boolean z2 = false;
                while (true) {
                    int i5 = i4 + 1;
                    char charAt2 = str.charAt(i4);
                    switch (charAt2) {
                        case '.':
                        case ';':
                            if (!z) {
                                String substring = str.substring(i3, i5 - 1);
                                if (z2) {
                                    signatureVisitor.visitInnerClassType(substring);
                                } else {
                                    signatureVisitor.visitClassType(substring);
                                }
                            }
                            if (charAt2 != ';') {
                                z2 = true;
                                z = false;
                                i3 = i5;
                                i4 = i5;
                                break;
                            } else {
                                signatureVisitor.visitEnd();
                                return i5;
                            }
                        case '<':
                            String substring2 = str.substring(i3, i5 - 1);
                            if (z2) {
                                signatureVisitor.visitInnerClassType(substring2);
                            } else {
                                signatureVisitor.visitClassType(substring2);
                            }
                            int i6 = i5;
                            while (true) {
                                char charAt3 = str.charAt(i6);
                                switch (charAt3) {
                                    case '*':
                                        i6++;
                                        signatureVisitor.visitTypeArgument();
                                    case '+':
                                    case '-':
                                        i6 = m190a(str, i6 + 1, signatureVisitor.visitTypeArgument(charAt3));
                                    case '>':
                                        i4 = i6;
                                        z = true;
                                        break;
                                    default:
                                        i6 = m190a(str, i6, signatureVisitor.visitTypeArgument(SignatureVisitor.INSTANCEOF));
                                }
                            }
                        default:
                            i4 = i5;
                            break;
                    }
                }
            case 'T':
                int indexOf = str.indexOf(59, i2);
                signatureVisitor.visitTypeVariable(str.substring(i2, indexOf));
                return indexOf + 1;
            case '[':
                return m190a(str, i2, signatureVisitor.visitArrayType());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void accept(SignatureVisitor signatureVisitor) {
        char charAt;
        int i = 0;
        String str = this.f36999a;
        int length = str.length();
        if (str.charAt(0) == '<') {
            i = 2;
            do {
                int indexOf = str.indexOf(58, i);
                signatureVisitor.visitFormalTypeParameter(str.substring(i - 1, indexOf));
                int i2 = indexOf + 1;
                char charAt2 = str.charAt(i2);
                if (charAt2 == 'L' || charAt2 == '[' || charAt2 == 'T') {
                    i2 = m190a(str, i2, signatureVisitor.visitClassBound());
                }
                while (true) {
                    int i3 = i2;
                    i = i3 + 1;
                    charAt = str.charAt(i3);
                    if (charAt == ':') {
                        i2 = m190a(str, i, signatureVisitor.visitInterfaceBound());
                    }
                }
            } while (charAt != '>');
            if (str.charAt(i) == '(') {
                int m190a = m190a(str, i, signatureVisitor.visitSuperclass());
                while (m190a < length) {
                    m190a = m190a(str, m190a, signatureVisitor.visitInterface());
                }
                return;
            }
            int i4 = i + 1;
            while (str.charAt(i4) != ')') {
                i4 = m190a(str, i4, signatureVisitor.visitParameterType());
            }
            int m190a2 = m190a(str, i4 + 1, signatureVisitor.visitReturnType());
            while (m190a2 < length) {
                m190a2 = m190a(str, m190a2 + 1, signatureVisitor.visitExceptionType());
            }
        } else if (str.charAt(i) == '(') {
        }
    }

    public void acceptType(SignatureVisitor signatureVisitor) {
        m190a(this.f36999a, 0, signatureVisitor);
    }
}
