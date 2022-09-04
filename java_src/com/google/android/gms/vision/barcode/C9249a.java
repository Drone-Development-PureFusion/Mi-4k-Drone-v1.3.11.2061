package com.google.android.gms.vision.barcode;

import android.content.Context;
import android.util.SparseArray;
import com.google.android.gms.vision.AbstractC9246b;
import com.google.android.gms.vision.C9274d;
import com.google.android.gms.vision.barcode.internal.client.BarcodeDetectorOptions;
import com.google.android.gms.vision.barcode.internal.client.C9261b;
import com.google.android.gms.vision.internal.client.FrameMetadataParcel;
/* renamed from: com.google.android.gms.vision.barcode.a */
/* loaded from: classes2.dex */
public final class C9249a extends AbstractC9246b<Barcode> {

    /* renamed from: a */
    private final C9261b f29247a;

    /* renamed from: com.google.android.gms.vision.barcode.a$a */
    /* loaded from: classes2.dex */
    public static class C9251a {

        /* renamed from: a */
        private Context f29248a;

        /* renamed from: b */
        private BarcodeDetectorOptions f29249b = new BarcodeDetectorOptions();

        public C9251a(Context context) {
            this.f29248a = context;
        }

        /* renamed from: a */
        public C9251a m8818a(int i) {
            this.f29249b.f29251b = i;
            return this;
        }

        /* renamed from: a */
        public C9249a m8819a() {
            return new C9249a(new C9261b(this.f29248a, this.f29249b));
        }
    }

    private C9249a() {
        throw new IllegalStateException("Default constructor called");
    }

    private C9249a(C9261b c9261b) {
        this.f29247a = c9261b;
    }

    @Override // com.google.android.gms.vision.AbstractC9246b
    /* renamed from: a */
    public SparseArray<Barcode> mo8642a(C9274d c9274d) {
        Barcode[] m8788a;
        if (c9274d == null) {
            throw new IllegalArgumentException("No frame supplied.");
        }
        FrameMetadataParcel m8667a = FrameMetadataParcel.m8667a(c9274d);
        if (c9274d.m8759c() != null) {
            m8788a = this.f29247a.m8790a(c9274d.m8759c(), m8667a);
            if (m8788a == null) {
                throw new IllegalArgumentException("Internal barcode detector error; check logcat output.");
            }
        } else {
            m8788a = this.f29247a.m8788a(c9274d.m8761b(), m8667a);
        }
        SparseArray<Barcode> sparseArray = new SparseArray<>(m8788a.length);
        for (Barcode barcode : m8788a) {
            sparseArray.append(barcode.f29148C.hashCode(), barcode);
        }
        return sparseArray;
    }

    @Override // com.google.android.gms.vision.AbstractC9246b
    /* renamed from: a */
    public void mo8645a() {
        super.mo8645a();
        this.f29247a.c();
    }

    @Override // com.google.android.gms.vision.AbstractC9246b
    /* renamed from: b */
    public boolean mo8638b() {
        return this.f29247a.b();
    }
}
