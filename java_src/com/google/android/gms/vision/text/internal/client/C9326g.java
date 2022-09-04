package com.google.android.gms.vision.text.internal.client;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.akb;
import com.google.android.gms.p232c.BinderC4173f;
import com.google.android.gms.vision.internal.client.AbstractC9305a;
import com.google.android.gms.vision.internal.client.FrameMetadataParcel;
import com.google.android.gms.vision.text.internal.client.AbstractC9320c;
/* renamed from: com.google.android.gms.vision.text.internal.client.g */
/* loaded from: classes2.dex */
public class C9326g extends AbstractC9305a<AbstractC9317b> {

    /* renamed from: a */
    private final TextRecognizerOptions f29412a;

    public C9326g(Context context, TextRecognizerOptions textRecognizerOptions) {
        super(context, "TextNativeHandle");
        this.f29412a = textRecognizerOptions;
        d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.vision.internal.client.AbstractC9305a
    /* renamed from: a */
    public AbstractC9317b mo8612b(akb akbVar, Context context) {
        return AbstractC9320c.AbstractBinderC9321a.m8626a(akbVar.m17062a("com.google.android.gms.vision.text.ChimeraNativeTextRecognizerCreator")).mo8625a(BinderC4173f.m25293a(context), this.f29412a);
    }

    @Override // com.google.android.gms.vision.internal.client.AbstractC9305a
    /* renamed from: a */
    protected void mo8615a() {
        d().mo8629a();
    }

    /* renamed from: a */
    public LineBoxParcel[] m8614a(Bitmap bitmap, FrameMetadataParcel frameMetadataParcel, RecognitionOptions recognitionOptions) {
        if (!b()) {
            return new LineBoxParcel[0];
        }
        try {
            return d().mo8627a(BinderC4173f.m25293a(bitmap), frameMetadataParcel, recognitionOptions);
        } catch (RemoteException e) {
            Log.e("TextNativeHandle", "Error calling native text recognizer", e);
            return new LineBoxParcel[0];
        }
    }
}
