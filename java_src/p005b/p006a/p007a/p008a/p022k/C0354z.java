package p005b.p006a.p007a.p008a.p022k;
/* renamed from: b.a.a.a.k.z */
/* loaded from: classes.dex */
public class C0354z implements AbstractC0325a {

    /* renamed from: a */
    final int f353a;

    public C0354z(int i) {
        this.f353a = i;
    }

    /* renamed from: a */
    static int m39597a(String str, int[] iArr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int indexOf = str.indexOf(46, i);
            if (indexOf == -1 || i2 >= 16) {
                break;
            }
            iArr[i2] = indexOf;
            i2++;
            i = indexOf + 1;
        }
        return i2;
    }

    /* renamed from: b */
    static void m39595b(String str, int[] iArr) {
        System.out.print(str);
        for (int i = 0; i < iArr.length; i++) {
            if (i == 0) {
                System.out.print(iArr[i]);
            } else {
                System.out.print(", " + iArr[i]);
            }
        }
        System.out.println();
    }

    @Override // p005b.p006a.p007a.p008a.p022k.AbstractC0325a
    /* renamed from: a */
    public String mo39598a(String str) {
        StringBuilder sb = new StringBuilder(this.f353a);
        if (str == null) {
            throw new IllegalArgumentException("Class name may not be null");
        }
        if (str.length() < this.f353a) {
            return str;
        }
        int[] iArr = new int[16];
        int[] iArr2 = new int[17];
        int m39597a = m39597a(str, iArr);
        if (m39597a == 0) {
            return str;
        }
        m39596a(str, iArr, iArr2, m39597a);
        for (int i = 0; i <= m39597a; i++) {
            if (i == 0) {
                sb.append(str.substring(0, iArr2[i] - 1));
            } else {
                sb.append(str.substring(iArr[i - 1], iArr[i - 1] + iArr2[i]));
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    void m39596a(String str, int[] iArr, int[] iArr2, int i) {
        int i2 = 0;
        int length = str.length() - this.f353a;
        while (i2 < i) {
            int i3 = -1;
            if (i2 > 0) {
                i3 = iArr[i2 - 1];
            }
            int i4 = (iArr[i2] - i3) - 1;
            if (i4 < 1) {
            }
            int i5 = length > 0 ? i4 < 1 ? i4 : 1 : i4;
            iArr2[i2] = i5 + 1;
            i2++;
            length -= i4 - i5;
        }
        iArr2[i] = str.length() - iArr[i - 1];
    }
}
