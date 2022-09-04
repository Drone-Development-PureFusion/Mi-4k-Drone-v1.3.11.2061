package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C4628a;
import com.google.android.gms.common.internal.safeparcel.C4630b;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Device;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.fitness.request.t */
/* loaded from: classes2.dex */
public class C5243t implements Parcelable.Creator<DataReadRequest> {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m20986a(DataReadRequest dataReadRequest, Parcel parcel, int i) {
        int m23480a = C4630b.m23480a(parcel);
        C4630b.m23447c(parcel, 1, dataReadRequest.m21352a(), false);
        C4630b.m23447c(parcel, 2, dataReadRequest.m21349b(), false);
        C4630b.m23474a(parcel, 3, dataReadRequest.m21337l());
        C4630b.m23474a(parcel, 4, dataReadRequest.m21338k());
        C4630b.m23447c(parcel, 5, dataReadRequest.m21347c(), false);
        C4630b.m23447c(parcel, 6, dataReadRequest.m21345d(), false);
        C4630b.m23475a(parcel, 7, dataReadRequest.m21344e());
        C4630b.m23475a(parcel, 1000, dataReadRequest.m21339j());
        C4630b.m23474a(parcel, 8, dataReadRequest.m21336m());
        C4630b.m23470a(parcel, 9, (Parcelable) dataReadRequest.m21343f(), i, false);
        C4630b.m23475a(parcel, 10, dataReadRequest.m21342g());
        C4630b.m23461a(parcel, 12, dataReadRequest.m21340i());
        C4630b.m23461a(parcel, 13, dataReadRequest.m21341h());
        C4630b.m23472a(parcel, 14, dataReadRequest.m21335n(), false);
        C4630b.m23447c(parcel, 16, dataReadRequest.m21334o(), false);
        C4630b.m23463a(parcel, 17, dataReadRequest.m21333p(), false);
        C4630b.m23479a(parcel, m23480a);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DataReadRequest createFromParcel(Parcel parcel) {
        int m23508b = C4628a.m23508b(parcel);
        int i = 0;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        long j = 0;
        long j2 = 0;
        ArrayList arrayList3 = null;
        ArrayList arrayList4 = null;
        int i2 = 0;
        long j3 = 0;
        DataSource dataSource = null;
        int i3 = 0;
        boolean z = false;
        boolean z2 = false;
        IBinder iBinder = null;
        ArrayList arrayList5 = null;
        ArrayList<Integer> arrayList6 = null;
        while (parcel.dataPosition() < m23508b) {
            int m23514a = C4628a.m23514a(parcel);
            switch (C4628a.m23515a(m23514a)) {
                case 1:
                    arrayList = C4628a.m23504c(parcel, m23514a, DataType.CREATOR);
                    break;
                case 2:
                    arrayList2 = C4628a.m23504c(parcel, m23514a, DataSource.CREATOR);
                    break;
                case 3:
                    j = C4628a.m23498i(parcel, m23514a);
                    break;
                case 4:
                    j2 = C4628a.m23498i(parcel, m23514a);
                    break;
                case 5:
                    arrayList3 = C4628a.m23504c(parcel, m23514a, DataType.CREATOR);
                    break;
                case 6:
                    arrayList4 = C4628a.m23504c(parcel, m23514a, DataSource.CREATOR);
                    break;
                case 7:
                    i2 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 8:
                    j3 = C4628a.m23498i(parcel, m23514a);
                    break;
                case 9:
                    dataSource = (DataSource) C4628a.m23510a(parcel, m23514a, DataSource.CREATOR);
                    break;
                case 10:
                    i3 = C4628a.m23500g(parcel, m23514a);
                    break;
                case 12:
                    z = C4628a.m23505c(parcel, m23514a);
                    break;
                case 13:
                    z2 = C4628a.m23505c(parcel, m23514a);
                    break;
                case 14:
                    iBinder = C4628a.m23489r(parcel, m23514a);
                    break;
                case 16:
                    arrayList5 = C4628a.m23504c(parcel, m23514a, Device.CREATOR);
                    break;
                case 17:
                    arrayList6 = C4628a.m23519D(parcel, m23514a);
                    break;
                case 1000:
                    i = C4628a.m23500g(parcel, m23514a);
                    break;
                default:
                    C4628a.m23507b(parcel, m23514a);
                    break;
            }
        }
        if (parcel.dataPosition() != m23508b) {
            throw new C4628a.C4629a(new StringBuilder(37).append("Overread allowed size end=").append(m23508b).toString(), parcel);
        }
        return new DataReadRequest(i, arrayList, arrayList2, j, j2, arrayList3, arrayList4, i2, j3, dataSource, i3, z, z2, iBinder, arrayList5, arrayList6);
    }

    @Override // android.os.Parcelable.Creator
    /* renamed from: a */
    public DataReadRequest[] newArray(int i) {
        return new DataReadRequest[i];
    }
}
