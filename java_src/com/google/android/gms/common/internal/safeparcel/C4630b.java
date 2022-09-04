package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
/* renamed from: com.google.android.gms.common.internal.safeparcel.b */
/* loaded from: classes.dex */
public class C4630b {
    /* renamed from: a */
    public static int m23480a(Parcel parcel) {
        return m23451b(parcel, 20293);
    }

    /* renamed from: a */
    public static void m23479a(Parcel parcel, int i) {
        m23448c(parcel, i);
    }

    /* renamed from: a */
    public static void m23478a(Parcel parcel, int i, byte b) {
        m23450b(parcel, i, 4);
        parcel.writeInt(b);
    }

    /* renamed from: a */
    public static void m23477a(Parcel parcel, int i, double d) {
        m23450b(parcel, i, 8);
        parcel.writeDouble(d);
    }

    /* renamed from: a */
    public static void m23476a(Parcel parcel, int i, float f) {
        m23450b(parcel, i, 4);
        parcel.writeFloat(f);
    }

    /* renamed from: a */
    public static void m23475a(Parcel parcel, int i, int i2) {
        m23450b(parcel, i, 4);
        parcel.writeInt(i2);
    }

    /* renamed from: a */
    public static void m23474a(Parcel parcel, int i, long j) {
        m23450b(parcel, i, 8);
        parcel.writeLong(j);
    }

    /* renamed from: a */
    public static void m23473a(Parcel parcel, int i, Bundle bundle, boolean z) {
        if (bundle == null) {
            if (!z) {
                return;
            }
            m23450b(parcel, i, 0);
            return;
        }
        int m23451b = m23451b(parcel, i);
        parcel.writeBundle(bundle);
        m23448c(parcel, m23451b);
    }

    /* renamed from: a */
    public static void m23472a(Parcel parcel, int i, IBinder iBinder, boolean z) {
        if (iBinder == null) {
            if (!z) {
                return;
            }
            m23450b(parcel, i, 0);
            return;
        }
        int m23451b = m23451b(parcel, i);
        parcel.writeStrongBinder(iBinder);
        m23448c(parcel, m23451b);
    }

    /* renamed from: a */
    public static void m23471a(Parcel parcel, int i, Parcel parcel2, boolean z) {
        if (parcel2 == null) {
            if (!z) {
                return;
            }
            m23450b(parcel, i, 0);
            return;
        }
        int m23451b = m23451b(parcel, i);
        parcel.appendFrom(parcel2, 0, parcel2.dataSize());
        m23448c(parcel, m23451b);
    }

    /* renamed from: a */
    public static void m23470a(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable == null) {
            if (!z) {
                return;
            }
            m23450b(parcel, i, 0);
            return;
        }
        int m23451b = m23451b(parcel, i);
        parcelable.writeToParcel(parcel, i2);
        m23448c(parcel, m23451b);
    }

    /* renamed from: a */
    public static void m23469a(Parcel parcel, int i, Boolean bool, boolean z) {
        int i2 = 0;
        if (bool == null) {
            if (!z) {
                return;
            }
            m23450b(parcel, i, 0);
            return;
        }
        m23450b(parcel, i, 4);
        if (bool.booleanValue()) {
            i2 = 1;
        }
        parcel.writeInt(i2);
    }

    /* renamed from: a */
    public static void m23468a(Parcel parcel, int i, Double d, boolean z) {
        if (d != null) {
            m23450b(parcel, i, 8);
            parcel.writeDouble(d.doubleValue());
        } else if (!z) {
        } else {
            m23450b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m23467a(Parcel parcel, int i, Float f, boolean z) {
        if (f != null) {
            m23450b(parcel, i, 4);
            parcel.writeFloat(f.floatValue());
        } else if (!z) {
        } else {
            m23450b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m23466a(Parcel parcel, int i, Integer num, boolean z) {
        if (num != null) {
            m23450b(parcel, i, 4);
            parcel.writeInt(num.intValue());
        } else if (!z) {
        } else {
            m23450b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m23465a(Parcel parcel, int i, Long l, boolean z) {
        if (l != null) {
            m23450b(parcel, i, 8);
            parcel.writeLong(l.longValue());
        } else if (!z) {
        } else {
            m23450b(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m23464a(Parcel parcel, int i, String str, boolean z) {
        if (str == null) {
            if (!z) {
                return;
            }
            m23450b(parcel, i, 0);
            return;
        }
        int m23451b = m23451b(parcel, i);
        parcel.writeString(str);
        m23448c(parcel, m23451b);
    }

    /* renamed from: a */
    public static void m23463a(Parcel parcel, int i, List<Integer> list, boolean z) {
        if (list == null) {
            if (!z) {
                return;
            }
            m23450b(parcel, i, 0);
            return;
        }
        int m23451b = m23451b(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(list.get(i2).intValue());
        }
        m23448c(parcel, m23451b);
    }

    /* renamed from: a */
    public static void m23462a(Parcel parcel, int i, short s) {
        m23450b(parcel, i, 4);
        parcel.writeInt(s);
    }

    /* renamed from: a */
    public static void m23461a(Parcel parcel, int i, boolean z) {
        m23450b(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: a */
    public static void m23460a(Parcel parcel, int i, byte[] bArr, boolean z) {
        if (bArr == null) {
            if (!z) {
                return;
            }
            m23450b(parcel, i, 0);
            return;
        }
        int m23451b = m23451b(parcel, i);
        parcel.writeByteArray(bArr);
        m23448c(parcel, m23451b);
    }

    /* renamed from: a */
    public static void m23459a(Parcel parcel, int i, float[] fArr, boolean z) {
        if (fArr == null) {
            if (!z) {
                return;
            }
            m23450b(parcel, i, 0);
            return;
        }
        int m23451b = m23451b(parcel, i);
        parcel.writeFloatArray(fArr);
        m23448c(parcel, m23451b);
    }

    /* renamed from: a */
    public static void m23458a(Parcel parcel, int i, int[] iArr, boolean z) {
        if (iArr == null) {
            if (!z) {
                return;
            }
            m23450b(parcel, i, 0);
            return;
        }
        int m23451b = m23451b(parcel, i);
        parcel.writeIntArray(iArr);
        m23448c(parcel, m23451b);
    }

    /* renamed from: a */
    public static void m23457a(Parcel parcel, int i, long[] jArr, boolean z) {
        if (jArr == null) {
            if (!z) {
                return;
            }
            m23450b(parcel, i, 0);
            return;
        }
        int m23451b = m23451b(parcel, i);
        parcel.writeLongArray(jArr);
        m23448c(parcel, m23451b);
    }

    /* renamed from: a */
    public static <T extends Parcelable> void m23456a(Parcel parcel, int i, T[] tArr, int i2, boolean z) {
        if (tArr == null) {
            if (!z) {
                return;
            }
            m23450b(parcel, i, 0);
            return;
        }
        int m23451b = m23451b(parcel, i);
        parcel.writeInt(tArr.length);
        for (T t : tArr) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                m23452a(parcel, t, i2);
            }
        }
        m23448c(parcel, m23451b);
    }

    /* renamed from: a */
    public static void m23455a(Parcel parcel, int i, String[] strArr, boolean z) {
        if (strArr == null) {
            if (!z) {
                return;
            }
            m23450b(parcel, i, 0);
            return;
        }
        int m23451b = m23451b(parcel, i);
        parcel.writeStringArray(strArr);
        m23448c(parcel, m23451b);
    }

    /* renamed from: a */
    public static void m23454a(Parcel parcel, int i, boolean[] zArr, boolean z) {
        if (zArr == null) {
            if (!z) {
                return;
            }
            m23450b(parcel, i, 0);
            return;
        }
        int m23451b = m23451b(parcel, i);
        parcel.writeBooleanArray(zArr);
        m23448c(parcel, m23451b);
    }

    /* renamed from: a */
    public static void m23453a(Parcel parcel, int i, byte[][] bArr, boolean z) {
        if (bArr == null) {
            if (!z) {
                return;
            }
            m23450b(parcel, i, 0);
            return;
        }
        int m23451b = m23451b(parcel, i);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        m23448c(parcel, m23451b);
    }

    /* renamed from: a */
    private static <T extends Parcelable> void m23452a(Parcel parcel, T t, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        t.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    /* renamed from: b */
    private static int m23451b(Parcel parcel, int i) {
        parcel.writeInt((-65536) | i);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* renamed from: b */
    private static void m23450b(Parcel parcel, int i, int i2) {
        if (i2 < 65535) {
            parcel.writeInt((i2 << 16) | i);
            return;
        }
        parcel.writeInt((-65536) | i);
        parcel.writeInt(i2);
    }

    /* renamed from: b */
    public static void m23449b(Parcel parcel, int i, List<String> list, boolean z) {
        if (list == null) {
            if (!z) {
                return;
            }
            m23450b(parcel, i, 0);
            return;
        }
        int m23451b = m23451b(parcel, i);
        parcel.writeStringList(list);
        m23448c(parcel, m23451b);
    }

    /* renamed from: c */
    private static void m23448c(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    /* renamed from: c */
    public static <T extends Parcelable> void m23447c(Parcel parcel, int i, List<T> list, boolean z) {
        if (list == null) {
            if (!z) {
                return;
            }
            m23450b(parcel, i, 0);
            return;
        }
        int m23451b = m23451b(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            T t = list.get(i2);
            if (t == null) {
                parcel.writeInt(0);
            } else {
                m23452a(parcel, t, 0);
            }
        }
        m23448c(parcel, m23451b);
    }

    /* renamed from: d */
    public static void m23446d(Parcel parcel, int i, List list, boolean z) {
        if (list == null) {
            if (!z) {
                return;
            }
            m23450b(parcel, i, 0);
            return;
        }
        int m23451b = m23451b(parcel, i);
        parcel.writeList(list);
        m23448c(parcel, m23451b);
    }
}
