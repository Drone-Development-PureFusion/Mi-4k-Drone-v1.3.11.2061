package com.google.android.gms.vision.text;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.util.SparseArray;
import com.google.android.gms.vision.AbstractC9246b;
import com.google.android.gms.vision.C9274d;
import com.google.android.gms.vision.internal.client.FrameMetadataParcel;
import com.google.android.gms.vision.text.internal.client.C9326g;
import com.google.android.gms.vision.text.internal.client.LineBoxParcel;
import com.google.android.gms.vision.text.internal.client.RecognitionOptions;
import com.google.android.gms.vision.text.internal.client.TextRecognizerOptions;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import org.codehaus.jackson.org.objectweb.asm.Opcodes;
/* renamed from: com.google.android.gms.vision.text.e */
/* loaded from: classes2.dex */
public final class C9312e extends AbstractC9246b<C9310d> {

    /* renamed from: a */
    private final C9326g f29377a;

    /* renamed from: com.google.android.gms.vision.text.e$a */
    /* loaded from: classes2.dex */
    public static class C9314a {

        /* renamed from: a */
        private Context f29378a;

        /* renamed from: b */
        private TextRecognizerOptions f29379b = new TextRecognizerOptions();

        public C9314a(Context context) {
            this.f29378a = context;
        }

        /* renamed from: a */
        public C9312e m8636a() {
            return new C9312e(new C9326g(this.f29378a, this.f29379b));
        }
    }

    private C9312e() {
        throw new IllegalStateException("Default constructor called");
    }

    private C9312e(C9326g c9326g) {
        this.f29377a = c9326g;
    }

    /* renamed from: a */
    private Bitmap m8644a(Bitmap bitmap, FrameMetadataParcel frameMetadataParcel) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (frameMetadataParcel.f29362f != 0) {
            Matrix matrix = new Matrix();
            matrix.postRotate(m8637b(frameMetadataParcel.f29362f));
            bitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
        }
        if (frameMetadataParcel.f29362f == 1 || frameMetadataParcel.f29362f == 3) {
            frameMetadataParcel.f29358b = height;
            frameMetadataParcel.f29359c = width;
        }
        return bitmap;
    }

    /* renamed from: a */
    private Bitmap m8640a(ByteBuffer byteBuffer, int i, int i2, int i3) {
        byte[] bArr;
        if (!byteBuffer.hasArray() || byteBuffer.arrayOffset() != 0) {
            bArr = new byte[byteBuffer.capacity()];
            byteBuffer.get(bArr);
        } else {
            bArr = byteBuffer.array();
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new YuvImage(bArr, i, i2, i3, null).compressToJpeg(new Rect(0, 0, i2, i3), 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
    }

    /* renamed from: a */
    private Rect m8643a(Rect rect, int i, int i2, FrameMetadataParcel frameMetadataParcel) {
        switch (frameMetadataParcel.f29362f) {
            case 1:
                return new Rect(i2 - rect.bottom, rect.left, i2 - rect.top, rect.right);
            case 2:
                return new Rect(i - rect.right, i2 - rect.bottom, i - rect.left, i2 - rect.top);
            case 3:
                return new Rect(rect.top, i - rect.right, rect.bottom, i - rect.left);
            default:
                return rect;
        }
    }

    /* renamed from: a */
    private SparseArray<C9310d> m8639a(LineBoxParcel[] lineBoxParcelArr) {
        SparseArray sparseArray = new SparseArray();
        for (LineBoxParcel lineBoxParcel : lineBoxParcelArr) {
            SparseArray sparseArray2 = (SparseArray) sparseArray.get(lineBoxParcel.f29396k);
            if (sparseArray2 == null) {
                sparseArray2 = new SparseArray();
                sparseArray.append(lineBoxParcel.f29396k, sparseArray2);
            }
            sparseArray2.append(lineBoxParcel.f29397l, lineBoxParcel);
        }
        SparseArray<C9310d> sparseArray3 = new SparseArray<>(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray3.append(sparseArray.keyAt(i), new C9310d((SparseArray) sparseArray.valueAt(i)));
        }
        return sparseArray3;
    }

    /* renamed from: b */
    private int m8637b(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
                return 90;
            case 2:
                return Opcodes.GETFIELD;
            case 3:
                return 270;
            default:
                throw new IllegalArgumentException("Unsupported rotation degree.");
        }
    }

    @Override // com.google.android.gms.vision.AbstractC9246b
    /* renamed from: a */
    public SparseArray<C9310d> mo8642a(C9274d c9274d) {
        return m8641a(c9274d, new RecognitionOptions(1, new Rect()));
    }

    /* renamed from: a */
    public SparseArray<C9310d> m8641a(C9274d c9274d, RecognitionOptions recognitionOptions) {
        Bitmap m8640a;
        if (c9274d == null) {
            throw new IllegalArgumentException("No frame supplied.");
        }
        FrameMetadataParcel m8667a = FrameMetadataParcel.m8667a(c9274d);
        if (c9274d.m8759c() != null) {
            m8640a = c9274d.m8759c();
        } else {
            m8640a = m8640a(c9274d.m8761b(), c9274d.m8765a().m8740f(), m8667a.f29358b, m8667a.f29359c);
        }
        Bitmap m8644a = m8644a(m8640a, m8667a);
        if (!recognitionOptions.f29399b.isEmpty()) {
            recognitionOptions.f29399b.set(m8643a(recognitionOptions.f29399b, c9274d.m8765a().m8751a(), c9274d.m8765a().m8748b(), m8667a));
        }
        m8667a.f29362f = 0;
        return m8639a(this.f29377a.m8614a(m8644a, m8667a, recognitionOptions));
    }

    @Override // com.google.android.gms.vision.AbstractC9246b
    /* renamed from: a */
    public void mo8645a() {
        super.mo8645a();
        this.f29377a.c();
    }

    @Override // com.google.android.gms.vision.AbstractC9246b
    /* renamed from: b */
    public boolean mo8638b() {
        return this.f29377a.b();
    }
}
