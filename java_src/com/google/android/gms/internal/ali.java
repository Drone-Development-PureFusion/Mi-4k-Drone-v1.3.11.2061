package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes2.dex */
public class ali {

    /* renamed from: a */
    protected static final Comparator<byte[]> f22163a = new Comparator<byte[]>() { // from class: com.google.android.gms.internal.ali.1
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(byte[] bArr, byte[] bArr2) {
            return bArr.length - bArr2.length;
        }
    };

    /* renamed from: b */
    private List<byte[]> f22164b = new LinkedList();

    /* renamed from: c */
    private List<byte[]> f22165c = new ArrayList(64);

    /* renamed from: d */
    private int f22166d = 0;

    /* renamed from: e */
    private final int f22167e;

    public ali(int i) {
        this.f22167e = i;
    }

    /* renamed from: a */
    private synchronized void m16954a() {
        while (this.f22166d > this.f22167e) {
            byte[] remove = this.f22164b.remove(0);
            this.f22165c.remove(remove);
            this.f22166d -= remove.length;
        }
    }

    /* renamed from: a */
    public synchronized void m16952a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f22167e) {
                this.f22164b.add(bArr);
                int binarySearch = Collections.binarySearch(this.f22165c, bArr, f22163a);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                this.f22165c.add(binarySearch, bArr);
                this.f22166d += bArr.length;
                m16954a();
            }
        }
    }

    /* renamed from: a */
    public synchronized byte[] m16953a(int i) {
        byte[] bArr;
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= this.f22165c.size()) {
                bArr = new byte[i];
                break;
            }
            bArr = this.f22165c.get(i3);
            if (bArr.length >= i) {
                this.f22166d -= bArr.length;
                this.f22165c.remove(i3);
                this.f22164b.remove(bArr);
                break;
            }
            i2 = i3 + 1;
        }
        return bArr;
    }
}
