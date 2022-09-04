package p005b.p006a.p007a.p008a.p026n;
/* renamed from: b.a.a.a.n.o */
/* loaded from: classes.dex */
public class C0377o {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m39513a(StackTraceElement[] stackTraceElementArr, C0378p[] c0378pArr) {
        int i = 0;
        if (c0378pArr != null) {
            int length = stackTraceElementArr.length - 1;
            for (int length2 = c0378pArr.length - 1; length >= 0 && length2 >= 0 && stackTraceElementArr[length].equals(c0378pArr[length2].f406a); length2--) {
                i++;
                length--;
            }
        }
        return i;
    }
}
