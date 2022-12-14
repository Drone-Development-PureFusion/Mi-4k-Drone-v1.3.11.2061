package p005b.p006a.p007a.p029b.p032c;

import java.io.ByteArrayOutputStream;
import org.codehaus.jackson.smile.SmileConstants;
/* renamed from: b.a.a.b.c.a */
/* loaded from: classes.dex */
public class C0410a {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m39392a(byte[] bArr, int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            i2 += (bArr[i + i3] & 255) << (24 - (i3 * 8));
        }
        return i2;
    }

    /* renamed from: a */
    public static String m39393a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & SmileConstants.BYTE_MARKER_END_OF_CONTENT);
            if (hexString.length() == 1) {
                stringBuffer.append('0');
            }
            stringBuffer.append(hexString);
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m39395a(ByteArrayOutputStream byteArrayOutputStream, int i) {
        for (int i2 = 0; i2 < 4; i2++) {
            byteArrayOutputStream.write((byte) (i >>> (24 - (i2 * 8))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m39391a(byte[] bArr, int i, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            bArr[i + i3] = (byte) (i2 >>> (24 - (i3 * 8)));
        }
    }

    /* renamed from: a */
    public static byte[] m39394a(String str) {
        byte[] bArr = new byte[str.length() / 2];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (Integer.parseInt(str.substring(i2, i2 + 2), 16) & 255);
        }
        return bArr;
    }
}
