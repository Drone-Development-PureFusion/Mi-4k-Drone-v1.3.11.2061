package com.google.android.gms.fitness.service;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.CallSuper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.C4696s;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.internal.service.AbstractC5180c;
import com.google.android.gms.fitness.internal.service.FitnessDataSourcesRequest;
import com.google.android.gms.fitness.internal.service.FitnessUnregistrationRequest;
import com.google.android.gms.fitness.result.DataSourcesResult;
import com.google.android.gms.internal.aky;
import com.google.android.gms.internal.alq;
import java.util.List;
/* loaded from: classes2.dex */
public abstract class FitnessSensorService extends Service {

    /* renamed from: a */
    public static final String f19129a = "com.google.android.gms.fitness.service.FitnessSensorService";

    /* renamed from: b */
    private BinderC5265a f19130b;

    /* renamed from: com.google.android.gms.fitness.service.FitnessSensorService$a */
    /* loaded from: classes2.dex */
    private static class BinderC5265a extends AbstractC5180c.AbstractBinderC5181a {

        /* renamed from: a */
        private final FitnessSensorService f19131a;

        private BinderC5265a(FitnessSensorService fitnessSensorService) {
            this.f19131a = fitnessSensorService;
        }

        @Override // com.google.android.gms.fitness.internal.service.AbstractC5180c
        /* renamed from: a */
        public void mo20859a(FitnessDataSourcesRequest fitnessDataSourcesRequest, aky akyVar) {
            this.f19131a.m20863a();
            akyVar.mo16863a(new DataSourcesResult(this.f19131a.m20860a(fitnessDataSourcesRequest.m21406a()), Status.f16786a));
        }

        @Override // com.google.android.gms.fitness.internal.service.AbstractC5180c
        /* renamed from: a */
        public void mo20858a(FitnessUnregistrationRequest fitnessUnregistrationRequest, alq alqVar) {
            this.f19131a.m20863a();
            if (this.f19131a.m20862a(fitnessUnregistrationRequest.m21404a())) {
                alqVar.mo16844a(Status.f16786a);
            } else {
                alqVar.mo16844a(new Status(13));
            }
        }

        @Override // com.google.android.gms.fitness.internal.service.AbstractC5180c
        /* renamed from: a */
        public void mo20857a(FitnessSensorServiceRequest fitnessSensorServiceRequest, alq alqVar) {
            this.f19131a.m20863a();
            if (this.f19131a.m20861a(fitnessSensorServiceRequest)) {
                alqVar.mo16844a(Status.f16786a);
            } else {
                alqVar.mo16844a(new Status(13));
            }
        }
    }

    /* renamed from: a */
    public abstract List<DataSource> m20860a(List<DataType> list);

    @TargetApi(19)
    /* renamed from: a */
    protected void m20863a() {
        int callingUid = Binder.getCallingUid();
        if (C4696s.m23106h()) {
            ((AppOpsManager) getSystemService("appops")).checkPackage(callingUid, "com.google.android.gms");
            return;
        }
        String[] packagesForUid = getPackageManager().getPackagesForUid(callingUid);
        if (packagesForUid != null) {
            for (String str : packagesForUid) {
                if (str.equals("com.google.android.gms")) {
                    return;
                }
            }
        }
        throw new SecurityException("Unauthorized caller");
    }

    /* renamed from: a */
    public abstract boolean m20862a(DataSource dataSource);

    /* renamed from: a */
    public abstract boolean m20861a(FitnessSensorServiceRequest fitnessSensorServiceRequest);

    @Override // android.app.Service
    @CallSuper
    public IBinder onBind(Intent intent) {
        if (f19129a.equals(intent.getAction())) {
            if (Log.isLoggable("FitnessSensorService", 3)) {
                String valueOf = String.valueOf(intent);
                String valueOf2 = String.valueOf(getClass().getName());
                Log.d("FitnessSensorService", new StringBuilder(String.valueOf(valueOf).length() + 20 + String.valueOf(valueOf2).length()).append("Intent ").append(valueOf).append(" received by ").append(valueOf2).toString());
            }
            return this.f19130b.asBinder();
        }
        return null;
    }

    @Override // android.app.Service
    @CallSuper
    public void onCreate() {
        super.onCreate();
        this.f19130b = new BinderC5265a();
    }
}
