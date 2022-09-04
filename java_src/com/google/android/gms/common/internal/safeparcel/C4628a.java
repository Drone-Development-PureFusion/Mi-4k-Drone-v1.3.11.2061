package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p001v4.internal.view.SupportMenu;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.google.android.gms.common.internal.safeparcel.a */
/* loaded from: classes.dex */
public class C4628a {

    /* renamed from: com.google.android.gms.common.internal.safeparcel.a$a */
    /* loaded from: classes.dex */
    public static class C4629a extends RuntimeException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public C4629a(String str, Parcel parcel) {
            super(new StringBuilder(String.valueOf(str).length() + 41).append(str).append(" Parcel: pos=").append(r0).append(" size=").append(parcel.dataSize()).toString());
            int dataPosition = parcel.dataPosition();
        }
    }

    /* renamed from: A */
    public static double[] m23522A(Parcel parcel, int i) {
        int m23513a = m23513a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m23513a == 0) {
            return null;
        }
        double[] createDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(m23513a + dataPosition);
        return createDoubleArray;
    }

    /* renamed from: B */
    public static BigDecimal[] m23521B(Parcel parcel, int i) {
        int m23513a = m23513a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m23513a == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigDecimal[] bigDecimalArr = new BigDecimal[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            byte[] createByteArray = parcel.createByteArray();
            bigDecimalArr[i2] = new BigDecimal(new BigInteger(createByteArray), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + m23513a);
        return bigDecimalArr;
    }

    /* renamed from: C */
    public static String[] m23520C(Parcel parcel, int i) {
        int m23513a = m23513a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m23513a == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(m23513a + dataPosition);
        return createStringArray;
    }

    /* renamed from: D */
    public static ArrayList<Integer> m23519D(Parcel parcel, int i) {
        int m23513a = m23513a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m23513a == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + m23513a);
        return arrayList;
    }

    /* renamed from: E */
    public static ArrayList<String> m23518E(Parcel parcel, int i) {
        int m23513a = m23513a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m23513a == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(m23513a + dataPosition);
        return createStringArrayList;
    }

    /* renamed from: F */
    public static Parcel m23517F(Parcel parcel, int i) {
        int m23513a = m23513a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m23513a == 0) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.appendFrom(parcel, dataPosition, m23513a);
        parcel.setDataPosition(m23513a + dataPosition);
        return obtain;
    }

    /* renamed from: G */
    public static Parcel[] m23516G(Parcel parcel, int i) {
        int m23513a = m23513a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m23513a == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        Parcel[] parcelArr = new Parcel[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            int readInt2 = parcel.readInt();
            if (readInt2 != 0) {
                int dataPosition2 = parcel.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt2);
                parcelArr[i2] = obtain;
                parcel.setDataPosition(readInt2 + dataPosition2);
            } else {
                parcelArr[i2] = null;
            }
        }
        parcel.setDataPosition(dataPosition + m23513a);
        return parcelArr;
    }

    /* renamed from: a */
    public static int m23515a(int i) {
        return 65535 & i;
    }

    /* renamed from: a */
    public static int m23514a(Parcel parcel) {
        return parcel.readInt();
    }

    /* renamed from: a */
    public static int m23513a(Parcel parcel, int i) {
        return (i & SupportMenu.CATEGORY_MASK) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m23510a(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int m23513a = m23513a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m23513a == 0) {
            return null;
        }
        T createFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(m23513a + dataPosition);
        return createFromParcel;
    }

    /* renamed from: a */
    private static void m23512a(Parcel parcel, int i, int i2) {
        int m23513a = m23513a(parcel, i);
        if (m23513a != i2) {
            String valueOf = String.valueOf(Integer.toHexString(m23513a));
            throw new C4629a(new StringBuilder(String.valueOf(valueOf).length() + 46).append("Expected size ").append(i2).append(" got ").append(m23513a).append(" (0x").append(valueOf).append(")").toString(), parcel);
        }
    }

    /* renamed from: a */
    private static void m23511a(Parcel parcel, int i, int i2, int i3) {
        if (i2 != i3) {
            String valueOf = String.valueOf(Integer.toHexString(i2));
            throw new C4629a(new StringBuilder(String.valueOf(valueOf).length() + 46).append("Expected size ").append(i3).append(" got ").append(i2).append(" (0x").append(valueOf).append(")").toString(), parcel);
        }
    }

    /* renamed from: a */
    public static void m23509a(Parcel parcel, int i, List list, ClassLoader classLoader) {
        int m23513a = m23513a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m23513a == 0) {
            return;
        }
        parcel.readList(list, classLoader);
        parcel.setDataPosition(m23513a + dataPosition);
    }

    /* renamed from: b */
    public static int m23508b(Parcel parcel) {
        int m23514a = m23514a(parcel);
        int m23513a = m23513a(parcel, m23514a);
        int dataPosition = parcel.dataPosition();
        if (m23515a(m23514a) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(m23514a));
            throw new C4629a(valueOf.length() != 0 ? "Expected object header. Got 0x".concat(valueOf) : new String("Expected object header. Got 0x"), parcel);
        }
        int i = dataPosition + m23513a;
        if (i >= dataPosition && i <= parcel.dataSize()) {
            return i;
        }
        throw new C4629a(new StringBuilder(54).append("Size read is invalid start=").append(dataPosition).append(" end=").append(i).toString(), parcel);
    }

    /* renamed from: b */
    public static void m23507b(Parcel parcel, int i) {
        parcel.setDataPosition(m23513a(parcel, i) + parcel.dataPosition());
    }

    /* renamed from: b */
    public static <T> T[] m23506b(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int m23513a = m23513a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m23513a == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(m23513a + dataPosition);
        return tArr;
    }

    /* renamed from: c */
    public static <T> ArrayList<T> m23504c(Parcel parcel, int i, Parcelable.Creator<T> creator) {
        int m23513a = m23513a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m23513a == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(m23513a + dataPosition);
        return createTypedArrayList;
    }

    /* renamed from: c */
    public static boolean m23505c(Parcel parcel, int i) {
        m23512a(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    /* renamed from: d */
    public static Boolean m23503d(Parcel parcel, int i) {
        int m23513a = m23513a(parcel, i);
        if (m23513a == 0) {
            return null;
        }
        m23511a(parcel, i, m23513a, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    /* renamed from: e */
    public static byte m23502e(Parcel parcel, int i) {
        m23512a(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    /* renamed from: f */
    public static short m23501f(Parcel parcel, int i) {
        m23512a(parcel, i, 4);
        return (short) parcel.readInt();
    }

    /* renamed from: g */
    public static int m23500g(Parcel parcel, int i) {
        m23512a(parcel, i, 4);
        return parcel.readInt();
    }

    /* renamed from: h */
    public static Integer m23499h(Parcel parcel, int i) {
        int m23513a = m23513a(parcel, i);
        if (m23513a == 0) {
            return null;
        }
        m23511a(parcel, i, m23513a, 4);
        return Integer.valueOf(parcel.readInt());
    }

    /* renamed from: i */
    public static long m23498i(Parcel parcel, int i) {
        m23512a(parcel, i, 8);
        return parcel.readLong();
    }

    /* renamed from: j */
    public static Long m23497j(Parcel parcel, int i) {
        int m23513a = m23513a(parcel, i);
        if (m23513a == 0) {
            return null;
        }
        m23511a(parcel, i, m23513a, 8);
        return Long.valueOf(parcel.readLong());
    }

    /* renamed from: k */
    public static BigInteger m23496k(Parcel parcel, int i) {
        int m23513a = m23513a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m23513a == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(m23513a + dataPosition);
        return new BigInteger(createByteArray);
    }

    /* renamed from: l */
    public static float m23495l(Parcel parcel, int i) {
        m23512a(parcel, i, 4);
        return parcel.readFloat();
    }

    /* renamed from: m */
    public static Float m23494m(Parcel parcel, int i) {
        int m23513a = m23513a(parcel, i);
        if (m23513a == 0) {
            return null;
        }
        m23511a(parcel, i, m23513a, 4);
        return Float.valueOf(parcel.readFloat());
    }

    /* renamed from: n */
    public static double m23493n(Parcel parcel, int i) {
        m23512a(parcel, i, 8);
        return parcel.readDouble();
    }

    /* renamed from: o */
    public static Double m23492o(Parcel parcel, int i) {
        int m23513a = m23513a(parcel, i);
        if (m23513a == 0) {
            return null;
        }
        m23511a(parcel, i, m23513a, 8);
        return Double.valueOf(parcel.readDouble());
    }

    /* renamed from: p */
    public static BigDecimal m23491p(Parcel parcel, int i) {
        int m23513a = m23513a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m23513a == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(m23513a + dataPosition);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    /* renamed from: q */
    public static String m23490q(Parcel parcel, int i) {
        int m23513a = m23513a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m23513a == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(m23513a + dataPosition);
        return readString;
    }

    /* renamed from: r */
    public static IBinder m23489r(Parcel parcel, int i) {
        int m23513a = m23513a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m23513a == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(m23513a + dataPosition);
        return readStrongBinder;
    }

    /* renamed from: s */
    public static Bundle m23488s(Parcel parcel, int i) {
        int m23513a = m23513a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m23513a == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(m23513a + dataPosition);
        return readBundle;
    }

    /* renamed from: t */
    public static byte[] m23487t(Parcel parcel, int i) {
        int m23513a = m23513a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m23513a == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(m23513a + dataPosition);
        return createByteArray;
    }

    /* renamed from: u */
    public static byte[][] m23486u(Parcel parcel, int i) {
        int m23513a = m23513a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m23513a == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            bArr[i2] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + m23513a);
        return bArr;
    }

    /* renamed from: v */
    public static boolean[] m23485v(Parcel parcel, int i) {
        int m23513a = m23513a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m23513a == 0) {
            return null;
        }
        boolean[] createBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(m23513a + dataPosition);
        return createBooleanArray;
    }

    /* renamed from: w */
    public static int[] m23484w(Parcel parcel, int i) {
        int m23513a = m23513a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m23513a == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(m23513a + dataPosition);
        return createIntArray;
    }

    /* renamed from: x */
    public static long[] m23483x(Parcel parcel, int i) {
        int m23513a = m23513a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m23513a == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(m23513a + dataPosition);
        return createLongArray;
    }

    /* renamed from: y */
    public static BigInteger[] m23482y(Parcel parcel, int i) {
        int m23513a = m23513a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m23513a == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigInteger[] bigIntegerArr = new BigInteger[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            bigIntegerArr[i2] = new BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(dataPosition + m23513a);
        return bigIntegerArr;
    }

    /* renamed from: z */
    public static float[] m23481z(Parcel parcel, int i) {
        int m23513a = m23513a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (m23513a == 0) {
            return null;
        }
        float[] createFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(m23513a + dataPosition);
        return createFloatArray;
    }
}
