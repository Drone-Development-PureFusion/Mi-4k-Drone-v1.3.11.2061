package com.google.android.gms.fitness.internal.service;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.fitness.service.FitnessSensorServiceRequest;
import com.google.android.gms.internal.aky;
import com.google.android.gms.internal.alq;
/* renamed from: com.google.android.gms.fitness.internal.service.c */
/* loaded from: classes2.dex */
public interface AbstractC5180c extends IInterface {

    /* renamed from: com.google.android.gms.fitness.internal.service.c$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractBinderC5181a extends Binder implements AbstractC5180c {
        public AbstractBinderC5181a() {
            attachInterface(this, "com.google.android.gms.fitness.internal.service.IFitnessSensorService");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            FitnessUnregistrationRequest fitnessUnregistrationRequest = null;
            FitnessDataSourcesRequest fitnessDataSourcesRequest = null;
            FitnessSensorServiceRequest fitnessSensorServiceRequest = null;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.google.android.gms.fitness.internal.service.IFitnessSensorService");
                    if (parcel.readInt() != 0) {
                        fitnessDataSourcesRequest = FitnessDataSourcesRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(fitnessDataSourcesRequest, aky.AbstractBinderC6476a.m16991a(parcel.readStrongBinder()));
                    return true;
                case 2:
                    parcel.enforceInterface("com.google.android.gms.fitness.internal.service.IFitnessSensorService");
                    if (parcel.readInt() != 0) {
                        fitnessSensorServiceRequest = FitnessSensorServiceRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(fitnessSensorServiceRequest, alq.AbstractBinderC6512a.m16932a(parcel.readStrongBinder()));
                    return true;
                case 3:
                    parcel.enforceInterface("com.google.android.gms.fitness.internal.service.IFitnessSensorService");
                    if (parcel.readInt() != 0) {
                        fitnessUnregistrationRequest = FitnessUnregistrationRequest.CREATOR.createFromParcel(parcel);
                    }
                    a(fitnessUnregistrationRequest, alq.AbstractBinderC6512a.m16932a(parcel.readStrongBinder()));
                    return true;
                case 1598968902:
                    parcel2.writeString("com.google.android.gms.fitness.internal.service.IFitnessSensorService");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    /* renamed from: a */
    void mo20859a(FitnessDataSourcesRequest fitnessDataSourcesRequest, aky akyVar);

    /* renamed from: a */
    void mo20858a(FitnessUnregistrationRequest fitnessUnregistrationRequest, alq alqVar);

    /* renamed from: a */
    void mo20857a(FitnessSensorServiceRequest fitnessSensorServiceRequest, alq alqVar);
}
