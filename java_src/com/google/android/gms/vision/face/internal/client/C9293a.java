package com.google.android.gms.vision.face.internal.client;

import android.content.Context;
import android.graphics.PointF;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.akb;
import com.google.android.gms.p232c.BinderC4173f;
import com.google.android.gms.vision.face.C9286a;
import com.google.android.gms.vision.face.C9290c;
import com.google.android.gms.vision.face.internal.client.AbstractC9299e;
import com.google.android.gms.vision.internal.client.AbstractC9305a;
import com.google.android.gms.vision.internal.client.FrameMetadataParcel;
import java.nio.ByteBuffer;
/* renamed from: com.google.android.gms.vision.face.internal.client.a */
/* loaded from: classes2.dex */
public class C9293a extends AbstractC9305a<AbstractC9296d> {

    /* renamed from: a */
    private final FaceSettingsParcel f29350a;

    public C9293a(Context context, FaceSettingsParcel faceSettingsParcel) {
        super(context, "FaceNativeHandle");
        this.f29350a = faceSettingsParcel;
        d();
    }

    /* renamed from: a */
    private C9286a m8692a(FaceParcel faceParcel) {
        return new C9286a(faceParcel.f29328b, new PointF(faceParcel.f29329c, faceParcel.f29330d), faceParcel.f29331e, faceParcel.f29332f, faceParcel.f29333g, faceParcel.f29334h, m8689b(faceParcel), faceParcel.f29336j, faceParcel.f29337k, faceParcel.f29338l);
    }

    /* renamed from: a */
    private C9290c m8691a(LandmarkParcel landmarkParcel) {
        return new C9290c(new PointF(landmarkParcel.f29347b, landmarkParcel.f29348c), landmarkParcel.f29349d);
    }

    /* renamed from: b */
    private C9290c[] m8689b(FaceParcel faceParcel) {
        LandmarkParcel[] landmarkParcelArr = faceParcel.f29335i;
        if (landmarkParcelArr == null) {
            return new C9290c[0];
        }
        C9290c[] c9290cArr = new C9290c[landmarkParcelArr.length];
        for (int i = 0; i < landmarkParcelArr.length; i++) {
            c9290cArr[i] = m8691a(landmarkParcelArr[i]);
        }
        return c9290cArr;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.vision.internal.client.AbstractC9305a
    /* renamed from: a */
    public AbstractC9296d mo8612b(akb akbVar, Context context) {
        return AbstractC9299e.AbstractBinderC9300a.m8678a(akbVar.m17062a("com.google.android.gms.vision.face.ChimeraNativeFaceDetectorCreator")).mo8677a(BinderC4173f.m25293a(context), this.f29350a);
    }

    @Override // com.google.android.gms.vision.internal.client.AbstractC9305a
    /* renamed from: a */
    protected void mo8615a() {
        d().mo8681a();
    }

    /* renamed from: a */
    public boolean m8694a(int i) {
        if (!b()) {
            return false;
        }
        try {
            return d().mo8680a(i);
        } catch (RemoteException e) {
            Log.e("FaceNativeHandle", "Could not call native face detector", e);
            return false;
        }
    }

    /* renamed from: a */
    public C9286a[] m8690a(ByteBuffer byteBuffer, FrameMetadataParcel frameMetadataParcel) {
        if (!b()) {
            return new C9286a[0];
        }
        try {
            FaceParcel[] mo8679a = d().mo8679a(BinderC4173f.m25293a(byteBuffer), frameMetadataParcel);
            C9286a[] c9286aArr = new C9286a[mo8679a.length];
            for (int i = 0; i < mo8679a.length; i++) {
                c9286aArr[i] = m8692a(mo8679a[i]);
            }
            return c9286aArr;
        } catch (RemoteException e) {
            Log.e("FaceNativeHandle", "Could not call native face detector", e);
            return new C9286a[0];
        }
    }
}
