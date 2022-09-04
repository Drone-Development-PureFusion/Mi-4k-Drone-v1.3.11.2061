package com.google.android.gms.internal;

import android.graphics.PointF;
import com.google.android.gms.internal.AbstractC6972fn;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.internal.fp */
/* loaded from: classes2.dex */
public class C6976fp {

    /* renamed from: b */
    private static final AbstractC6972fn.C6974b f23650b = new AbstractC6972fn.C6974b();

    /* renamed from: c */
    private static final AbstractC6972fn.C6973a f23651c = new AbstractC6972fn.C6973a();

    /* renamed from: a */
    private ArrayList<AbstractC6980d> f23652a = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.android.gms.internal.fp$a */
    /* loaded from: classes2.dex */
    public static class C6977a {

        /* renamed from: a */
        C6977a f23653a;

        /* renamed from: b */
        float f23654b;

        /* renamed from: c */
        PointF f23655c;

        C6977a(C6977a c6977a, float f, PointF pointF) {
            this.f23653a = c6977a;
            this.f23654b = f;
            this.f23655c = pointF;
        }
    }

    /* renamed from: com.google.android.gms.internal.fp$b */
    /* loaded from: classes2.dex */
    public static class C6978b implements AbstractC6980d {

        /* renamed from: a */
        final float f23656a;

        /* renamed from: b */
        final float f23657b;

        /* renamed from: c */
        final float f23658c;

        /* renamed from: d */
        final float f23659d;

        /* renamed from: e */
        final float f23660e;

        /* renamed from: f */
        final float f23661f;

        /* renamed from: g */
        private final boolean f23662g;

        public C6978b(float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
            this.f23656a = f;
            this.f23657b = f2;
            this.f23658c = f3;
            this.f23659d = f4;
            this.f23660e = f5;
            this.f23661f = f6;
            this.f23662g = z;
        }

        @Override // com.google.android.gms.internal.C6976fp.AbstractC6980d
        /* renamed from: a */
        public void mo15842a(ArrayList<PointF> arrayList, ArrayList<Float> arrayList2, float f, PointF pointF) {
            PointF pointF2 = arrayList.isEmpty() ? new PointF(0.0f, 0.0f) : arrayList.get(arrayList.size() - 1);
            C6976fp.m15843b(this.f23662g ? new PointF[]{pointF2, new PointF(this.f23656a + pointF2.x, this.f23657b + pointF2.y), new PointF(this.f23658c + pointF2.x, this.f23659d + pointF2.y), new PointF(this.f23660e + pointF2.x, pointF2.y + this.f23661f)} : new PointF[]{pointF2, new PointF(this.f23656a, this.f23657b), new PointF(this.f23658c, this.f23659d), new PointF(this.f23660e, this.f23661f)}, C6976fp.f23651c, true, arrayList, arrayList2, f, pointF);
        }
    }

    /* renamed from: com.google.android.gms.internal.fp$c */
    /* loaded from: classes2.dex */
    public static class C6979c implements AbstractC6980d {

        /* renamed from: a */
        final float f23663a;

        /* renamed from: b */
        final float f23664b;

        /* renamed from: c */
        private final boolean f23665c;

        public C6979c(float f, float f2, boolean z) {
            this.f23663a = f;
            this.f23664b = f2;
            this.f23665c = z;
        }

        @Override // com.google.android.gms.internal.C6976fp.AbstractC6980d
        /* renamed from: a */
        public void mo15842a(ArrayList<PointF> arrayList, ArrayList<Float> arrayList2, float f, PointF pointF) {
            PointF pointF2;
            if (!arrayList2.isEmpty()) {
                arrayList2.add(arrayList2.get(arrayList2.size() - 1));
            } else {
                arrayList2.add(Float.valueOf(0.0f));
            }
            if (!this.f23665c || arrayList.isEmpty()) {
                pointF2 = new PointF(this.f23663a, this.f23664b);
            } else {
                PointF pointF3 = arrayList.get(arrayList.size() - 1);
                pointF2 = new PointF(pointF3.x + this.f23663a, pointF3.y + this.f23664b);
            }
            arrayList.add(pointF2);
            pointF.set(pointF2);
        }
    }

    /* renamed from: com.google.android.gms.internal.fp$d */
    /* loaded from: classes2.dex */
    public interface AbstractC6980d {
        /* renamed from: a */
        void mo15842a(ArrayList<PointF> arrayList, ArrayList<Float> arrayList2, float f, PointF pointF);
    }

    /* renamed from: a */
    static boolean m15845a(PointF[] pointFArr, AbstractC6972fn abstractC6972fn, float f, PointF pointF, float f2, PointF pointF2, float[] fArr, PointF pointF3, float f3) {
        fArr[0] = (f2 + f) / 2.0f;
        abstractC6972fn.mo15851a(fArr[0], pointFArr, pointF3);
        float f4 = pointF3.x - ((pointF2.x + pointF.x) / 2.0f);
        float f5 = pointF3.y - ((pointF2.y + pointF.y) / 2.0f);
        return (f4 * f4) + (f5 * f5) > f3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0112  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m15843b(PointF[] pointFArr, AbstractC6972fn abstractC6972fn, boolean z, ArrayList<PointF> arrayList, ArrayList<Float> arrayList2, float f, PointF pointF) {
        boolean z2;
        C6977a c6977a = new C6977a(null, 1.0f, abstractC6972fn.mo15851a(1.0f, pointFArr, new PointF()));
        C6977a c6977a2 = new C6977a(c6977a, 0.0f, abstractC6972fn.mo15851a(0.0f, pointFArr, new PointF()));
        float[] fArr = new float[1];
        C6977a c6977a3 = c6977a2;
        boolean z3 = z;
        while (c6977a != null) {
            do {
                C6977a c6977a4 = c6977a;
                boolean z4 = z3;
                PointF pointF2 = new PointF();
                boolean m15845a = m15845a(pointFArr, abstractC6972fn, c6977a3.f23654b, c6977a3.f23655c, c6977a4.f23654b, c6977a4.f23655c, fArr, pointF2, f);
                if (!m15845a && z4) {
                    m15845a = m15845a(pointFArr, abstractC6972fn, c6977a3.f23654b, c6977a3.f23655c, fArr[0], pointF2, new float[1], new PointF(), f);
                    if (m15845a) {
                        z2 = m15845a;
                        z3 = false;
                        if (!z2) {
                            c6977a = new C6977a(c6977a4, fArr[0], pointF2);
                            c6977a3.f23653a = c6977a;
                            continue;
                        } else {
                            c6977a = c6977a4;
                            continue;
                        }
                    }
                }
                z2 = m15845a;
                z3 = z4;
                if (!z2) {
                }
            } while (z2);
            c6977a3 = c6977a;
            c6977a = c6977a.f23653a;
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new PointF(0.0f, 0.0f));
            arrayList2.add(Float.valueOf(0.0f));
            pointF.set(0.0f, 0.0f);
        }
        PointF pointF3 = arrayList.get(arrayList.size() - 1);
        float floatValue = arrayList2.get(arrayList2.size() - 1).floatValue();
        PointF pointF4 = pointF3;
        for (C6977a c6977a5 = c6977a2; c6977a5 != null; c6977a5 = c6977a5.f23653a) {
            arrayList.add(c6977a5.f23655c);
            floatValue += PointF.length(c6977a5.f23655c.x - pointF4.x, c6977a5.f23655c.y - pointF4.y);
            arrayList2.add(Float.valueOf(floatValue));
            pointF4 = c6977a5.f23655c;
        }
    }

    /* renamed from: a */
    public void m15847a(float f, float f2) {
        this.f23652a.add(new C6979c(f, f2, false));
    }

    /* renamed from: a */
    public void m15846a(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f23652a.add(new C6978b(f, f2, f3, f4, f5, f6, false));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public float[] m15848a(float f) {
        float f2;
        int i = 0;
        int size = this.f23652a.size();
        ArrayList<PointF> arrayList = new ArrayList<>(size + 1);
        ArrayList<Float> arrayList2 = new ArrayList<>(size + 1);
        float f3 = f * f;
        PointF pointF = new PointF();
        for (int i2 = 0; i2 < size; i2++) {
            this.f23652a.get(i2).mo15842a(arrayList, arrayList2, f3, pointF);
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new PointF(0.0f, 0.0f));
            arrayList2.add(Float.valueOf(0.0f));
        }
        float floatValue = arrayList2.get(arrayList2.size() - 1).floatValue();
        if (floatValue == 0.0f) {
            arrayList.add(arrayList.get(arrayList.size() - 1));
            arrayList2.add(Float.valueOf(1.0f));
            f2 = 1.0f;
        } else {
            f2 = floatValue;
        }
        int size2 = arrayList.size();
        float[] fArr = new float[size2 * 3];
        int i3 = 0;
        while (i < size2) {
            PointF pointF2 = arrayList.get(i);
            int i4 = i3 + 1;
            fArr[i3] = arrayList2.get(i).floatValue() / f2;
            int i5 = i4 + 1;
            fArr[i4] = pointF2.x;
            fArr[i5] = pointF2.y;
            i++;
            i3 = i5 + 1;
        }
        return fArr;
    }
}
