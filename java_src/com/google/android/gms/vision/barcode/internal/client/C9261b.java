package com.google.android.gms.vision.barcode.internal.client;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.akb;
import com.google.android.gms.p232c.BinderC4173f;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.barcode.internal.client.AbstractC9265d;
import com.google.android.gms.vision.internal.client.AbstractC9305a;
import com.google.android.gms.vision.internal.client.FrameMetadataParcel;
import java.nio.ByteBuffer;
/* renamed from: com.google.android.gms.vision.barcode.internal.client.b */
/* loaded from: classes2.dex */
public class C9261b extends AbstractC9305a<AbstractC9262c> {

    /* renamed from: a */
    private final BarcodeDetectorOptions f29252a;

    public C9261b(Context context, BarcodeDetectorOptions barcodeDetectorOptions) {
        super(context, "BarcodeNativeHandle");
        this.f29252a = barcodeDetectorOptions;
        d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.vision.internal.client.AbstractC9305a
    /* renamed from: a */
    public AbstractC9262c mo8612b(akb akbVar, Context context) {
        return AbstractC9265d.AbstractBinderC9266a.m8783a(akbVar.m17062a("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator")).mo8782a(BinderC4173f.m25293a(context), this.f29252a);
    }

    @Override // com.google.android.gms.vision.internal.client.AbstractC9305a
    /* renamed from: a */
    protected void mo8615a() {
        d().mo8786a();
    }

    /* renamed from: a */
    public Barcode[] m8790a(Bitmap bitmap, FrameMetadataParcel frameMetadataParcel) {
        if (!b()) {
            return new Barcode[0];
        }
        try {
            return d().mo8784b(BinderC4173f.m25293a(bitmap), frameMetadataParcel);
        } catch (RemoteException e) {
            Log.e("BarcodeNativeHandle", "Error calling native barcode detector", e);
            return new Barcode[0];
        }
    }

    /* renamed from: a */
    public Barcode[] m8788a(ByteBuffer byteBuffer, FrameMetadataParcel frameMetadataParcel) {
        if (!b()) {
            return new Barcode[0];
        }
        try {
            return d().mo8785a(BinderC4173f.m25293a(byteBuffer), frameMetadataParcel);
        } catch (RemoteException e) {
            Log.e("BarcodeNativeHandle", "Error calling native barcode detector", e);
            return new Barcode[0];
        }
    }
}
