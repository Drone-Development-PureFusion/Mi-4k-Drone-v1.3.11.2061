package com.google.android.gms.wearable;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.AbstractC7649rd;
import com.google.android.gms.internal.C6949fe;
import com.google.android.gms.internal.C6951ff;
import com.google.android.gms.internal.C7648rc;
import com.google.firebase.p253b.C9755a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
/* renamed from: com.google.android.gms.wearable.k */
/* loaded from: classes2.dex */
public class C9628k {

    /* renamed from: a */
    public static final String f30153a = "DataMap";

    /* renamed from: b */
    private final HashMap<String, Object> f30154b = new HashMap<>();

    /* renamed from: a */
    public static C9628k m7640a(Bundle bundle) {
        bundle.setClassLoader(Asset.class.getClassLoader());
        C9628k c9628k = new C9628k();
        for (String str : bundle.keySet()) {
            m7635a(c9628k, str, bundle.get(str));
        }
        return c9628k;
    }

    /* renamed from: a */
    public static C9628k m7616a(byte[] bArr) {
        try {
            return C6949fe.m15896a(new C6949fe.C6950a(C6951ff.m15887a(bArr), new ArrayList()));
        } catch (C7648rc e) {
            throw new IllegalArgumentException("Unable to convert data", e);
        }
    }

    /* renamed from: a */
    public static ArrayList<C9628k> m7617a(ArrayList<Bundle> arrayList) {
        ArrayList<C9628k> arrayList2 = new ArrayList<>();
        Iterator<Bundle> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(m7640a(it2.next()));
        }
        return arrayList2;
    }

    /* renamed from: a */
    private static void m7639a(Bundle bundle, String str, Object obj) {
        if (obj instanceof String) {
            bundle.putString(str, (String) obj);
        } else if (obj instanceof Integer) {
            bundle.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Float) {
            bundle.putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof Boolean) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Byte) {
            bundle.putByte(str, ((Byte) obj).byteValue());
        } else if (obj instanceof byte[]) {
            bundle.putByteArray(str, (byte[]) obj);
        } else if (obj instanceof String[]) {
            bundle.putStringArray(str, (String[]) obj);
        } else if (obj instanceof long[]) {
            bundle.putLongArray(str, (long[]) obj);
        } else if (obj instanceof float[]) {
            bundle.putFloatArray(str, (float[]) obj);
        } else if (obj instanceof Asset) {
            bundle.putParcelable(str, (Asset) obj);
        } else if (obj instanceof C9628k) {
            bundle.putParcelable(str, ((C9628k) obj).m7641a());
        } else if (!(obj instanceof ArrayList)) {
        } else {
            switch (m7605b((ArrayList) obj)) {
                case 0:
                    bundle.putStringArrayList(str, (ArrayList) obj);
                    return;
                case 1:
                    bundle.putStringArrayList(str, (ArrayList) obj);
                    return;
                case 2:
                    bundle.putIntegerArrayList(str, (ArrayList) obj);
                    return;
                case 3:
                    bundle.putStringArrayList(str, (ArrayList) obj);
                    return;
                case 4:
                    ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                    Iterator it2 = ((ArrayList) obj).iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((C9628k) it2.next()).m7641a());
                    }
                    bundle.putParcelableArrayList(str, arrayList);
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: a */
    private static void m7635a(C9628k c9628k, String str, Object obj) {
        if (obj instanceof String) {
            c9628k.m7624a(str, (String) obj);
        } else if (obj instanceof Integer) {
            c9628k.m7630a(str, ((Integer) obj).intValue());
        } else if (obj instanceof Long) {
            c9628k.m7629a(str, ((Long) obj).longValue());
        } else if (obj instanceof Double) {
            c9628k.m7632a(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Float) {
            c9628k.m7631a(str, ((Float) obj).floatValue());
        } else if (obj instanceof Boolean) {
            c9628k.m7622a(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Byte) {
            c9628k.m7633a(str, ((Byte) obj).byteValue());
        } else if (obj instanceof byte[]) {
            c9628k.m7621a(str, (byte[]) obj);
        } else if (obj instanceof String[]) {
            c9628k.m7618a(str, (String[]) obj);
        } else if (obj instanceof long[]) {
            c9628k.m7619a(str, (long[]) obj);
        } else if (obj instanceof float[]) {
            c9628k.m7620a(str, (float[]) obj);
        } else if (obj instanceof Asset) {
            c9628k.m7628a(str, (Asset) obj);
        } else if (obj instanceof Bundle) {
            c9628k.m7627a(str, m7640a((Bundle) obj));
        } else if (!(obj instanceof ArrayList)) {
        } else {
            switch (m7605b((ArrayList) obj)) {
                case 0:
                    c9628k.m7602c(str, (ArrayList) obj);
                    return;
                case 1:
                    c9628k.m7602c(str, (ArrayList) obj);
                    return;
                case 2:
                    c9628k.m7607b(str, (ArrayList) obj);
                    return;
                case 3:
                    c9628k.m7602c(str, (ArrayList) obj);
                    return;
                case 4:
                default:
                    return;
                case 5:
                    c9628k.m7623a(str, m7617a((ArrayList) obj));
                    return;
            }
        }
    }

    /* renamed from: a */
    private void m7626a(String str, Object obj, String str2, ClassCastException classCastException) {
        m7625a(str, obj, str2, "<null>", classCastException);
    }

    /* renamed from: a */
    private void m7625a(String str, Object obj, String str2, Object obj2, ClassCastException classCastException) {
        Log.w(f30153a, "Key " + str + " expected " + str2 + " but value was a " + obj.getClass().getName() + ".  The default value " + obj2 + " was returned.");
        Log.w(f30153a, "Attempt to cast generated internal exception:", classCastException);
    }

    /* renamed from: a */
    private static boolean m7638a(Asset asset, Asset asset2) {
        return (asset == null || asset2 == null) ? asset == asset2 : !TextUtils.isEmpty(asset.m8140b()) ? asset.m8140b().equals(asset2.m8140b()) : Arrays.equals(asset.m8145a(), asset2.m8145a());
    }

    /* renamed from: a */
    private static boolean m7636a(C9628k c9628k, C9628k c9628k2) {
        if (c9628k.m7604c() != c9628k2.m7604c()) {
            return false;
        }
        for (String str : c9628k.m7597f()) {
            Object m7614b = c9628k.m7614b(str);
            Object m7614b2 = c9628k2.m7614b(str);
            if (m7614b instanceof Asset) {
                if (!(m7614b2 instanceof Asset) || !m7638a((Asset) m7614b, (Asset) m7614b2)) {
                    return false;
                }
            } else if (m7614b instanceof String[]) {
                if (!(m7614b2 instanceof String[]) || !Arrays.equals((String[]) m7614b, (String[]) m7614b2)) {
                    return false;
                }
            } else if (m7614b instanceof long[]) {
                if (!(m7614b2 instanceof long[]) || !Arrays.equals((long[]) m7614b, (long[]) m7614b2)) {
                    return false;
                }
            } else if (m7614b instanceof float[]) {
                if (!(m7614b2 instanceof float[]) || !Arrays.equals((float[]) m7614b, (float[]) m7614b2)) {
                    return false;
                }
            } else if (m7614b instanceof byte[]) {
                if (!(m7614b2 instanceof byte[]) || !Arrays.equals((byte[]) m7614b, (byte[]) m7614b2)) {
                    return false;
                }
            } else if (m7614b == null || m7614b2 == null) {
                return m7614b == m7614b2;
            } else if (!m7614b.equals(m7614b2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private static int m7605b(ArrayList<?> arrayList) {
        if (arrayList.isEmpty()) {
            return 0;
        }
        Iterator<?> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (next != null) {
                if (next instanceof Integer) {
                    return 2;
                }
                if (next instanceof String) {
                    return 3;
                }
                if (next instanceof C9628k) {
                    return 4;
                }
                if (next instanceof Bundle) {
                    return 5;
                }
            }
        }
        return 1;
    }

    /* renamed from: a */
    public Bundle m7641a() {
        Bundle bundle = new Bundle();
        for (String str : this.f30154b.keySet()) {
            m7639a(bundle, str, this.f30154b.get(str));
        }
        return bundle;
    }

    /* renamed from: a */
    public void m7637a(C9628k c9628k) {
        for (String str : c9628k.m7597f()) {
            this.f30154b.put(str, c9628k.m7614b(str));
        }
    }

    /* renamed from: a */
    public void m7633a(String str, byte b) {
        this.f30154b.put(str, Byte.valueOf(b));
    }

    /* renamed from: a */
    public void m7632a(String str, double d) {
        this.f30154b.put(str, Double.valueOf(d));
    }

    /* renamed from: a */
    public void m7631a(String str, float f) {
        this.f30154b.put(str, Float.valueOf(f));
    }

    /* renamed from: a */
    public void m7630a(String str, int i) {
        this.f30154b.put(str, Integer.valueOf(i));
    }

    /* renamed from: a */
    public void m7629a(String str, long j) {
        this.f30154b.put(str, Long.valueOf(j));
    }

    /* renamed from: a */
    public void m7628a(String str, Asset asset) {
        this.f30154b.put(str, asset);
    }

    /* renamed from: a */
    public void m7627a(String str, C9628k c9628k) {
        this.f30154b.put(str, c9628k);
    }

    /* renamed from: a */
    public void m7624a(String str, String str2) {
        this.f30154b.put(str, str2);
    }

    /* renamed from: a */
    public void m7623a(String str, ArrayList<C9628k> arrayList) {
        this.f30154b.put(str, arrayList);
    }

    /* renamed from: a */
    public void m7622a(String str, boolean z) {
        this.f30154b.put(str, Boolean.valueOf(z));
    }

    /* renamed from: a */
    public void m7621a(String str, byte[] bArr) {
        this.f30154b.put(str, bArr);
    }

    /* renamed from: a */
    public void m7620a(String str, float[] fArr) {
        this.f30154b.put(str, fArr);
    }

    /* renamed from: a */
    public void m7619a(String str, long[] jArr) {
        this.f30154b.put(str, jArr);
    }

    /* renamed from: a */
    public void m7618a(String str, String[] strArr) {
        this.f30154b.put(str, strArr);
    }

    /* renamed from: a */
    public boolean m7634a(String str) {
        return this.f30154b.containsKey(str);
    }

    /* renamed from: b */
    public byte m7613b(String str, byte b) {
        Object obj = this.f30154b.get(str);
        if (obj == null) {
            return b;
        }
        try {
            return ((Byte) obj).byteValue();
        } catch (ClassCastException e) {
            m7625a(str, obj, "Byte", Byte.valueOf(b), e);
            return b;
        }
    }

    /* renamed from: b */
    public double m7612b(String str, double d) {
        Object obj = this.f30154b.get(str);
        if (obj == null) {
            return d;
        }
        try {
            return ((Double) obj).doubleValue();
        } catch (ClassCastException e) {
            m7625a(str, obj, "Double", Double.valueOf(d), e);
            return d;
        }
    }

    /* renamed from: b */
    public float m7611b(String str, float f) {
        Object obj = this.f30154b.get(str);
        if (obj == null) {
            return f;
        }
        try {
            return ((Float) obj).floatValue();
        } catch (ClassCastException e) {
            m7625a(str, obj, "Float", Float.valueOf(f), e);
            return f;
        }
    }

    /* renamed from: b */
    public int m7610b(String str, int i) {
        Object obj = this.f30154b.get(str);
        if (obj == null) {
            return i;
        }
        try {
            return ((Integer) obj).intValue();
        } catch (ClassCastException e) {
            m7626a(str, obj, "Integer", e);
            return i;
        }
    }

    /* renamed from: b */
    public long m7609b(String str, long j) {
        Object obj = this.f30154b.get(str);
        if (obj == null) {
            return j;
        }
        try {
            return ((Long) obj).longValue();
        } catch (ClassCastException e) {
            m7626a(str, obj, "long", e);
            return j;
        }
    }

    /* renamed from: b */
    public <T> T m7614b(String str) {
        return (T) this.f30154b.get(str);
    }

    /* renamed from: b */
    public String m7608b(String str, String str2) {
        String m7592j = m7592j(str);
        return m7592j == null ? str2 : m7592j;
    }

    /* renamed from: b */
    public void m7607b(String str, ArrayList<Integer> arrayList) {
        this.f30154b.put(str, arrayList);
    }

    /* renamed from: b */
    public boolean m7606b(String str, boolean z) {
        Object obj = this.f30154b.get(str);
        if (obj == null) {
            return z;
        }
        try {
            return ((Boolean) obj).booleanValue();
        } catch (ClassCastException e) {
            m7625a(str, obj, "Boolean", Boolean.valueOf(z), e);
            return z;
        }
    }

    /* renamed from: b */
    public byte[] m7615b() {
        return AbstractC7649rd.m13857a(C6949fe.m15895a(this).f23344a);
    }

    /* renamed from: c */
    public int m7604c() {
        return this.f30154b.size();
    }

    /* renamed from: c */
    public Object m7603c(String str) {
        return this.f30154b.remove(str);
    }

    /* renamed from: c */
    public void m7602c(String str, ArrayList<String> arrayList) {
        this.f30154b.put(str, arrayList);
    }

    /* renamed from: d */
    public boolean m7601d() {
        return this.f30154b.isEmpty();
    }

    /* renamed from: d */
    public boolean m7600d(String str) {
        return m7606b(str, false);
    }

    /* renamed from: e */
    public byte m7598e(String str) {
        return m7613b(str, (byte) 0);
    }

    /* renamed from: e */
    public void m7599e() {
        this.f30154b.clear();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9628k)) {
            return false;
        }
        return m7636a(this, (C9628k) obj);
    }

    /* renamed from: f */
    public int m7596f(String str) {
        return m7610b(str, 0);
    }

    /* renamed from: f */
    public Set<String> m7597f() {
        return this.f30154b.keySet();
    }

    /* renamed from: g */
    public long m7595g(String str) {
        return m7609b(str, 0L);
    }

    /* renamed from: h */
    public float m7594h(String str) {
        return m7611b(str, 0.0f);
    }

    public int hashCode() {
        return this.f30154b.hashCode() * 29;
    }

    /* renamed from: i */
    public double m7593i(String str) {
        return m7612b(str, C9755a.f30449c);
    }

    /* renamed from: j */
    public String m7592j(String str) {
        Object obj = this.f30154b.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (String) obj;
        } catch (ClassCastException e) {
            m7626a(str, obj, "String", e);
            return null;
        }
    }

    /* renamed from: k */
    public Asset m7591k(String str) {
        Object obj = this.f30154b.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (Asset) obj;
        } catch (ClassCastException e) {
            m7626a(str, obj, "Asset", e);
            return null;
        }
    }

    /* renamed from: l */
    public C9628k m7590l(String str) {
        Object obj = this.f30154b.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (C9628k) obj;
        } catch (ClassCastException e) {
            m7626a(str, obj, f30153a, e);
            return null;
        }
    }

    /* renamed from: m */
    public ArrayList<Integer> m7589m(String str) {
        Object obj = this.f30154b.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (ArrayList) obj;
        } catch (ClassCastException e) {
            m7626a(str, obj, "ArrayList<Integer>", e);
            return null;
        }
    }

    /* renamed from: n */
    public ArrayList<String> m7588n(String str) {
        Object obj = this.f30154b.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (ArrayList) obj;
        } catch (ClassCastException e) {
            m7626a(str, obj, "ArrayList<String>", e);
            return null;
        }
    }

    /* renamed from: o */
    public ArrayList<C9628k> m7587o(String str) {
        Object obj = this.f30154b.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (ArrayList) obj;
        } catch (ClassCastException e) {
            m7626a(str, obj, "ArrayList<DataMap>", e);
            return null;
        }
    }

    /* renamed from: p */
    public byte[] m7586p(String str) {
        Object obj = this.f30154b.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (byte[]) obj;
        } catch (ClassCastException e) {
            m7626a(str, obj, "byte[]", e);
            return null;
        }
    }

    /* renamed from: q */
    public long[] m7585q(String str) {
        Object obj = this.f30154b.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (long[]) obj;
        } catch (ClassCastException e) {
            m7626a(str, obj, "long[]", e);
            return null;
        }
    }

    /* renamed from: r */
    public float[] m7584r(String str) {
        Object obj = this.f30154b.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (float[]) obj;
        } catch (ClassCastException e) {
            m7626a(str, obj, "float[]", e);
            return null;
        }
    }

    /* renamed from: s */
    public String[] m7583s(String str) {
        Object obj = this.f30154b.get(str);
        if (obj == null) {
            return null;
        }
        try {
            return (String[]) obj;
        } catch (ClassCastException e) {
            m7626a(str, obj, "String[]", e);
            return null;
        }
    }

    public String toString() {
        return this.f30154b.toString();
    }
}
