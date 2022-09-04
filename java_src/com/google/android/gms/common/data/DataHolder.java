package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.C4598n;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.codehaus.jackson.org.objectweb.asm.Opcodes;
@KeepName
/* loaded from: classes2.dex */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new C4533l();

    /* renamed from: k */
    private static final C4519a f16887k = new C4519a(new String[0], null) { // from class: com.google.android.gms.common.data.DataHolder.1
        @Override // com.google.android.gms.common.data.DataHolder.C4519a
        /* renamed from: a */
        public C4519a mo23874a(ContentValues contentValues) {
            throw new UnsupportedOperationException("Cannot add data to empty builder");
        }

        @Override // com.google.android.gms.common.data.DataHolder.C4519a
        /* renamed from: a */
        public C4519a mo23872a(HashMap<String, Object> hashMap) {
            throw new UnsupportedOperationException("Cannot add data to empty builder");
        }
    };

    /* renamed from: a */
    Bundle f16888a;

    /* renamed from: b */
    int[] f16889b;

    /* renamed from: c */
    int f16890c;

    /* renamed from: d */
    boolean f16891d;

    /* renamed from: e */
    private final int f16892e;

    /* renamed from: f */
    private final String[] f16893f;

    /* renamed from: g */
    private final CursorWindow[] f16894g;

    /* renamed from: h */
    private final int f16895h;

    /* renamed from: i */
    private final Bundle f16896i;

    /* renamed from: j */
    private boolean f16897j;

    /* renamed from: com.google.android.gms.common.data.DataHolder$a */
    /* loaded from: classes2.dex */
    public static class C4519a {

        /* renamed from: a */
        private final String[] f16898a;

        /* renamed from: b */
        private final ArrayList<HashMap<String, Object>> f16899b;

        /* renamed from: c */
        private final String f16900c;

        /* renamed from: d */
        private final HashMap<Object, Integer> f16901d;

        /* renamed from: e */
        private boolean f16902e;

        /* renamed from: f */
        private String f16903f;

        private C4519a(String[] strArr, String str) {
            this.f16898a = (String[]) C4588d.m23627a(strArr);
            this.f16899b = new ArrayList<>();
            this.f16900c = str;
            this.f16901d = new HashMap<>();
            this.f16902e = false;
            this.f16903f = null;
        }

        /* renamed from: b */
        private int m23870b(HashMap<String, Object> hashMap) {
            Object obj;
            if (this.f16900c != null && (obj = hashMap.get(this.f16900c)) != null) {
                Integer num = this.f16901d.get(obj);
                if (num != null) {
                    return num.intValue();
                }
                this.f16901d.put(obj, Integer.valueOf(this.f16899b.size()));
                return -1;
            }
            return -1;
        }

        /* renamed from: a */
        public C4519a mo23874a(ContentValues contentValues) {
            C4598n.m23595a(contentValues);
            HashMap<String, Object> hashMap = new HashMap<>(contentValues.size());
            for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
            return mo23872a(hashMap);
        }

        /* renamed from: a */
        public C4519a mo23872a(HashMap<String, Object> hashMap) {
            C4598n.m23595a(hashMap);
            int m23870b = m23870b(hashMap);
            if (m23870b == -1) {
                this.f16899b.add(hashMap);
            } else {
                this.f16899b.remove(m23870b);
                this.f16899b.add(m23870b, hashMap);
            }
            this.f16902e = false;
            return this;
        }

        /* renamed from: a */
        public DataHolder m23875a(int i) {
            return new DataHolder(this, i, (Bundle) null);
        }
    }

    /* renamed from: com.google.android.gms.common.data.DataHolder$b */
    /* loaded from: classes2.dex */
    public static class C4520b extends RuntimeException {
        public C4520b(String str) {
            super(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.f16891d = false;
        this.f16897j = true;
        this.f16892e = i;
        this.f16893f = strArr;
        this.f16894g = cursorWindowArr;
        this.f16895h = i2;
        this.f16896i = bundle;
    }

    private DataHolder(C4519a c4519a, int i, Bundle bundle) {
        this(c4519a.f16898a, m23896a(c4519a, -1), i, bundle);
    }

    public DataHolder(String[] strArr, CursorWindow[] cursorWindowArr, int i, Bundle bundle) {
        this.f16891d = false;
        this.f16897j = true;
        this.f16892e = 1;
        this.f16893f = (String[]) C4588d.m23627a(strArr);
        this.f16894g = (CursorWindow[]) C4588d.m23627a(cursorWindowArr);
        this.f16895h = i;
        this.f16896i = bundle;
        m23899a();
    }

    /* renamed from: a */
    public static C4519a m23891a(String[] strArr) {
        return new C4519a(strArr, null);
    }

    /* renamed from: a */
    public static DataHolder m23897a(int i, Bundle bundle) {
        return new DataHolder(f16887k, i, bundle);
    }

    /* renamed from: a */
    private void m23894a(String str, int i) {
        if (this.f16888a == null || !this.f16888a.containsKey(str)) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "No such column: ".concat(valueOf) : new String("No such column: "));
        } else if (m23877h()) {
            throw new IllegalArgumentException("Buffer is closed.");
        } else {
            if (i >= 0 && i < this.f16890c) {
                return;
            }
            throw new CursorIndexOutOfBoundsException(i, this.f16890c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.util.List] */
    /* renamed from: a */
    private static CursorWindow[] m23896a(C4519a c4519a, int i) {
        int i2;
        boolean z;
        CursorWindow cursorWindow;
        if (c4519a.f16898a.length == 0) {
            return new CursorWindow[0];
        }
        ArrayList subList = (i < 0 || i >= c4519a.f16899b.size()) ? c4519a.f16899b : c4519a.f16899b.subList(0, i);
        int size = subList.size();
        CursorWindow cursorWindow2 = new CursorWindow(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(cursorWindow2);
        cursorWindow2.setNumColumns(c4519a.f16898a.length);
        int i3 = 0;
        boolean z2 = false;
        while (i3 < size) {
            try {
                if (!cursorWindow2.allocRow()) {
                    Log.d("DataHolder", new StringBuilder(72).append("Allocating additional cursor window for large data set (row ").append(i3).append(")").toString());
                    cursorWindow2 = new CursorWindow(false);
                    cursorWindow2.setStartPosition(i3);
                    cursorWindow2.setNumColumns(c4519a.f16898a.length);
                    arrayList.add(cursorWindow2);
                    if (!cursorWindow2.allocRow()) {
                        Log.e("DataHolder", "Unable to allocate row to hold data.");
                        arrayList.remove(cursorWindow2);
                        return (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]);
                    }
                }
                Map map = (Map) subList.get(i3);
                boolean z3 = true;
                for (int i4 = 0; i4 < c4519a.f16898a.length && z3; i4++) {
                    String str = c4519a.f16898a[i4];
                    Object obj = map.get(str);
                    if (obj == null) {
                        z3 = cursorWindow2.putNull(i3, i4);
                    } else if (obj instanceof String) {
                        z3 = cursorWindow2.putString((String) obj, i3, i4);
                    } else if (obj instanceof Long) {
                        z3 = cursorWindow2.putLong(((Long) obj).longValue(), i3, i4);
                    } else if (obj instanceof Integer) {
                        z3 = cursorWindow2.putLong(((Integer) obj).intValue(), i3, i4);
                    } else if (obj instanceof Boolean) {
                        z3 = cursorWindow2.putLong(((Boolean) obj).booleanValue() ? 1L : 0L, i3, i4);
                    } else if (obj instanceof byte[]) {
                        z3 = cursorWindow2.putBlob((byte[]) obj, i3, i4);
                    } else if (obj instanceof Double) {
                        z3 = cursorWindow2.putDouble(((Double) obj).doubleValue(), i3, i4);
                    } else if (!(obj instanceof Float)) {
                        String valueOf = String.valueOf(obj);
                        throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(valueOf).length()).append("Unsupported object for column ").append(str).append(": ").append(valueOf).toString());
                    } else {
                        z3 = cursorWindow2.putDouble(((Float) obj).floatValue(), i3, i4);
                    }
                }
                if (z3) {
                    i2 = i3;
                    z = false;
                    cursorWindow = cursorWindow2;
                } else if (z2) {
                    throw new C4520b("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
                } else {
                    Log.d("DataHolder", new StringBuilder(74).append("Couldn't populate window data for row ").append(i3).append(" - allocating new window.").toString());
                    cursorWindow2.freeLastRow();
                    CursorWindow cursorWindow3 = new CursorWindow(false);
                    cursorWindow3.setStartPosition(i3);
                    cursorWindow3.setNumColumns(c4519a.f16898a.length);
                    arrayList.add(cursorWindow3);
                    i2 = i3 - 1;
                    cursorWindow = cursorWindow3;
                    z = true;
                }
                z2 = z;
                cursorWindow2 = cursorWindow;
                i3 = i2 + 1;
            } catch (RuntimeException e) {
                int size2 = arrayList.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    ((CursorWindow) arrayList.get(i5)).close();
                }
                throw e;
            }
        }
        return (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]);
    }

    /* renamed from: b */
    public static DataHolder m23889b(int i) {
        return m23897a(i, (Bundle) null);
    }

    /* renamed from: a */
    public int m23898a(int i) {
        int i2 = 0;
        C4588d.m23623a(i >= 0 && i < this.f16890c);
        while (true) {
            if (i2 >= this.f16889b.length) {
                break;
            } else if (i < this.f16889b[i2]) {
                i2--;
                break;
            } else {
                i2++;
            }
        }
        return i2 == this.f16889b.length ? i2 - 1 : i2;
    }

    /* renamed from: a */
    public long m23893a(String str, int i, int i2) {
        m23894a(str, i);
        return this.f16894g[i2].getLong(i, this.f16888a.getInt(str));
    }

    /* renamed from: a */
    public void m23899a() {
        this.f16888a = new Bundle();
        for (int i = 0; i < this.f16893f.length; i++) {
            this.f16888a.putInt(this.f16893f[i], i);
        }
        this.f16889b = new int[this.f16894g.length];
        int i2 = 0;
        for (int i3 = 0; i3 < this.f16894g.length; i3++) {
            this.f16889b[i3] = i2;
            i2 += this.f16894g[i3].getNumRows() - (i2 - this.f16894g[i3].getStartPosition());
        }
        this.f16890c = i2;
    }

    /* renamed from: a */
    public void m23892a(String str, int i, int i2, CharArrayBuffer charArrayBuffer) {
        m23894a(str, i);
        this.f16894g[i2].copyStringToBuffer(i, this.f16888a.getInt(str), charArrayBuffer);
    }

    /* renamed from: a */
    public boolean m23895a(String str) {
        return this.f16888a.containsKey(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m23890b() {
        return this.f16892e;
    }

    /* renamed from: b */
    public int m23888b(String str, int i, int i2) {
        m23894a(str, i);
        return this.f16894g[i2].getInt(i, this.f16888a.getInt(str));
    }

    /* renamed from: c */
    public String m23886c(String str, int i, int i2) {
        m23894a(str, i);
        return this.f16894g[i2].getString(i, this.f16888a.getInt(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public String[] m23887c() {
        return this.f16893f;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            if (!this.f16891d) {
                this.f16891d = true;
                for (int i = 0; i < this.f16894g.length; i++) {
                    this.f16894g[i].close();
                }
            }
        }
    }

    /* renamed from: d */
    public boolean m23884d(String str, int i, int i2) {
        m23894a(str, i);
        return Long.valueOf(this.f16894g[i2].getLong(i, this.f16888a.getInt(str))).longValue() == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public CursorWindow[] m23885d() {
        return this.f16894g;
    }

    /* renamed from: e */
    public float m23882e(String str, int i, int i2) {
        m23894a(str, i);
        return this.f16894g[i2].getFloat(i, this.f16888a.getInt(str));
    }

    /* renamed from: e */
    public int m23883e() {
        return this.f16895h;
    }

    /* renamed from: f */
    public Bundle m23881f() {
        return this.f16896i;
    }

    /* renamed from: f */
    public byte[] m23880f(String str, int i, int i2) {
        m23894a(str, i);
        return this.f16894g[i2].getBlob(i, this.f16888a.getInt(str));
    }

    protected void finalize() {
        try {
            if (this.f16897j && this.f16894g.length > 0 && !m23877h()) {
                close();
                String valueOf = String.valueOf(toString());
                Log.e("DataBuffer", new StringBuilder(String.valueOf(valueOf).length() + Opcodes.GETSTATIC).append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ").append(valueOf).append(")").toString());
            }
        } finally {
            super.finalize();
        }
    }

    /* renamed from: g */
    public int m23879g() {
        return this.f16890c;
    }

    /* renamed from: g */
    public Uri m23878g(String str, int i, int i2) {
        String m23886c = m23886c(str, i, i2);
        if (m23886c == null) {
            return null;
        }
        return Uri.parse(m23886c);
    }

    /* renamed from: h */
    public boolean m23877h() {
        boolean z;
        synchronized (this) {
            z = this.f16891d;
        }
        return z;
    }

    /* renamed from: h */
    public boolean m23876h(String str, int i, int i2) {
        m23894a(str, i);
        return this.f16894g[i2].isNull(i, this.f16888a.getInt(str));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4533l.m23829a(this, parcel, i);
    }
}
