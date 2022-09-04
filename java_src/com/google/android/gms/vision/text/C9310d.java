package com.google.android.gms.vision.text;

import android.graphics.Point;
import android.graphics.Rect;
import android.util.SparseArray;
import com.google.android.gms.vision.text.internal.client.BoundingBoxParcel;
import com.google.android.gms.vision.text.internal.client.LineBoxParcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* renamed from: com.google.android.gms.vision.text.d */
/* loaded from: classes2.dex */
public class C9310d implements AbstractC9309c {

    /* renamed from: a */
    private LineBoxParcel[] f29371a;

    /* renamed from: b */
    private Point[] f29372b;

    /* renamed from: c */
    private List<C9308b> f29373c;

    /* renamed from: d */
    private String f29374d;

    /* renamed from: e */
    private Rect f29375e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9310d(SparseArray<LineBoxParcel> sparseArray) {
        this.f29371a = new LineBoxParcel[sparseArray.size()];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.f29371a.length) {
                this.f29371a[i2] = sparseArray.valueAt(i2);
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private static Point[] m8654a(int i, int i2, int i3, int i4, BoundingBoxParcel boundingBoxParcel) {
        int i5 = boundingBoxParcel.f29381b;
        int i6 = boundingBoxParcel.f29382c;
        double sin = Math.sin(Math.toRadians(boundingBoxParcel.f29385f));
        double cos = Math.cos(Math.toRadians(boundingBoxParcel.f29385f));
        Point[] pointArr = {new Point(i, i2), new Point(i3, i2), new Point(i3, i4), new Point(i, i4)};
        for (int i7 = 0; i7 < 4; i7++) {
            int i8 = (int) ((pointArr[i7].x * sin) + (pointArr[i7].y * cos));
            pointArr[i7].x = (int) ((pointArr[i7].x * cos) - (pointArr[i7].y * sin));
            pointArr[i7].y = i8;
            pointArr[i7].offset(i5, i6);
        }
        return pointArr;
    }

    /* renamed from: a */
    private static Point[] m8653a(BoundingBoxParcel boundingBoxParcel, BoundingBoxParcel boundingBoxParcel2) {
        double sin = Math.sin(Math.toRadians(boundingBoxParcel2.f29385f));
        double cos = Math.cos(Math.toRadians(boundingBoxParcel2.f29385f));
        r6[0].offset(-boundingBoxParcel2.f29381b, -boundingBoxParcel2.f29382c);
        int i = (int) ((r6[0].x * cos) + (r6[0].y * sin));
        int i2 = (int) ((sin * (-r6[0].x)) + (cos * r6[0].y));
        r6[0].x = i;
        r6[0].y = i2;
        Point[] pointArr = {new Point(boundingBoxParcel.f29381b, boundingBoxParcel.f29382c), new Point(boundingBoxParcel.f29383d + i, i2), new Point(boundingBoxParcel.f29383d + i, boundingBoxParcel.f29384e + i2), new Point(i, i2 + boundingBoxParcel.f29384e)};
        return pointArr;
    }

    /* renamed from: a */
    public String m8655a() {
        LineBoxParcel[] lineBoxParcelArr;
        if (this.f29374d != null) {
            return this.f29374d;
        }
        HashMap hashMap = new HashMap();
        for (LineBoxParcel lineBoxParcel : this.f29371a) {
            hashMap.put(lineBoxParcel.f29393h, Integer.valueOf((hashMap.containsKey(lineBoxParcel.f29393h) ? ((Integer) hashMap.get(lineBoxParcel.f29393h)).intValue() : 0) + 1));
        }
        this.f29374d = (String) ((Map.Entry) Collections.max(hashMap.entrySet(), new Comparator<Map.Entry<String, Integer>>() { // from class: com.google.android.gms.vision.text.d.1
            @Override // java.util.Comparator
            /* renamed from: a */
            public int compare(Map.Entry<String, Integer> entry, Map.Entry<String, Integer> entry2) {
                return entry.getValue().compareTo(entry2.getValue());
            }
        })).getKey();
        if (this.f29374d == null || this.f29374d.isEmpty()) {
            this.f29374d = "und";
        }
        return this.f29374d;
    }

    @Override // com.google.android.gms.vision.text.AbstractC9309c
    /* renamed from: b */
    public String mo8652b() {
        if (this.f29371a.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(this.f29371a[0].f29391f);
        for (int i = 1; i < this.f29371a.length; i++) {
            sb.append("\n");
            sb.append(this.f29371a[i].f29391f);
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.vision.text.AbstractC9309c
    /* renamed from: c */
    public Rect mo8651c() {
        if (this.f29375e == null) {
            this.f29375e = C9315f.m8635a(this);
        }
        return this.f29375e;
    }

    @Override // com.google.android.gms.vision.text.AbstractC9309c
    /* renamed from: d */
    public Point[] mo8650d() {
        if (this.f29372b == null) {
            m8648f();
        }
        return this.f29372b;
    }

    @Override // com.google.android.gms.vision.text.AbstractC9309c
    /* renamed from: e */
    public List<? extends AbstractC9309c> mo8649e() {
        return m8647g();
    }

    /* renamed from: f */
    void m8648f() {
        if (this.f29371a.length == 0) {
            this.f29372b = new Point[0];
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        for (int i5 = 0; i5 < this.f29371a.length; i5++) {
            Point[] m8653a = m8653a(this.f29371a[i5].f29388c, this.f29371a[0].f29388c);
            int i6 = 0;
            while (i6 < 4) {
                Point point = m8653a[i6];
                int min = Math.min(i3, point.x);
                int max = Math.max(i2, point.x);
                int min2 = Math.min(i, point.y);
                i6++;
                i4 = Math.max(i4, point.y);
                i = min2;
                i2 = max;
                i3 = min;
            }
        }
        this.f29372b = m8654a(i3, i, i2, i4, this.f29371a[0].f29388c);
    }

    /* renamed from: g */
    List<C9308b> m8647g() {
        if (this.f29371a.length == 0) {
            return new ArrayList(0);
        }
        if (this.f29373c == null) {
            this.f29373c = new ArrayList(this.f29371a.length);
            for (LineBoxParcel lineBoxParcel : this.f29371a) {
                this.f29373c.add(new C9308b(lineBoxParcel));
            }
        }
        return this.f29373c;
    }
}
