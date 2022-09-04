package com.google.android.gms.fitness;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.support.annotation.RequiresPermission;
import com.google.android.gms.common.api.AbstractC4489g;
import com.google.android.gms.common.api.AbstractC4494i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.C4631c;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.DataDeleteRequest;
import com.google.android.gms.fitness.request.DataReadRequest;
import com.google.android.gms.fitness.request.DataUpdateListenerRegistrationRequest;
import com.google.android.gms.fitness.request.DataUpdateRequest;
import com.google.android.gms.fitness.result.DailyTotalResult;
import com.google.android.gms.fitness.result.DataReadResult;
import java.util.concurrent.TimeUnit;
/* renamed from: com.google.android.gms.fitness.f */
/* loaded from: classes2.dex */
public interface AbstractC5172f {

    /* renamed from: com.google.android.gms.fitness.f$a */
    /* loaded from: classes2.dex */
    public static class C5173a {

        /* renamed from: a */
        private final Context f18829a;

        /* renamed from: b */
        private final DataType f18830b;

        /* renamed from: c */
        private DataSource f18831c;

        /* renamed from: d */
        private long f18832d;

        /* renamed from: e */
        private long f18833e;

        /* renamed from: f */
        private String f18834f;

        public C5173a(Context context, DataType dataType) {
            this.f18829a = context;
            this.f18830b = dataType;
        }

        /* renamed from: a */
        private Intent m21413a(Intent intent) {
            Intent intent2;
            ResolveInfo resolveActivity;
            if (this.f18834f == null || (resolveActivity = this.f18829a.getPackageManager().resolveActivity((intent2 = new Intent(intent).setPackage(this.f18834f)), 0)) == null) {
                return intent;
            }
            intent2.setComponent(new ComponentName(this.f18834f, resolveActivity.activityInfo.name));
            return intent2;
        }

        /* renamed from: a */
        public Intent m21415a() {
            boolean z = true;
            C4588d.m23622a(this.f18832d > 0, "Start time must be set");
            if (this.f18833e <= this.f18832d) {
                z = false;
            }
            C4588d.m23622a(z, "End time must be set and after start time");
            Intent intent = new Intent(C5128c.f18215A);
            intent.setType(DataType.m21655b(this.f18831c.m21691a()));
            intent.putExtra(C5128c.f18217C, this.f18832d);
            intent.putExtra(C5128c.f18218D, this.f18833e);
            C4631c.m23443a(this.f18831c, intent, DataSource.f18404a);
            return m21413a(intent);
        }

        /* renamed from: a */
        public C5173a m21414a(long j, long j2, TimeUnit timeUnit) {
            this.f18832d = timeUnit.toMillis(j);
            this.f18833e = timeUnit.toMillis(j2);
            return this;
        }

        /* renamed from: a */
        public C5173a m21412a(DataSource dataSource) {
            C4588d.m23617b(dataSource.m21691a().equals(this.f18830b), "Data source %s is not for the data type %s", dataSource, this.f18830b);
            this.f18831c = dataSource;
            return this;
        }

        /* renamed from: a */
        public C5173a m21411a(String str) {
            this.f18834f = str;
            return this;
        }
    }

    /* renamed from: a */
    AbstractC4494i<Status> mo16913a(AbstractC4489g abstractC4489g, PendingIntent pendingIntent);

    /* renamed from: a */
    AbstractC4494i<Status> mo16912a(AbstractC4489g abstractC4489g, DataSet dataSet);

    @RequiresPermission(anyOf = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.BODY_SENSORS"}, conditional = true)
    /* renamed from: a */
    AbstractC4494i<DailyTotalResult> mo16910a(AbstractC4489g abstractC4489g, DataType dataType);

    /* renamed from: a */
    AbstractC4494i<Status> mo16908a(AbstractC4489g abstractC4489g, DataDeleteRequest dataDeleteRequest);

    @RequiresPermission(anyOf = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.BODY_SENSORS"}, conditional = true)
    /* renamed from: a */
    AbstractC4494i<DataReadResult> mo16907a(AbstractC4489g abstractC4489g, DataReadRequest dataReadRequest);

    @RequiresPermission(anyOf = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.BODY_SENSORS"}, conditional = true)
    /* renamed from: a */
    AbstractC4494i<Status> mo16906a(AbstractC4489g abstractC4489g, DataUpdateListenerRegistrationRequest dataUpdateListenerRegistrationRequest);

    /* renamed from: a */
    AbstractC4494i<Status> mo16905a(AbstractC4489g abstractC4489g, DataUpdateRequest dataUpdateRequest);

    @RequiresPermission(anyOf = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.BODY_SENSORS"}, conditional = true)
    /* renamed from: b */
    AbstractC4494i<DailyTotalResult> mo16904b(AbstractC4489g abstractC4489g, DataType dataType);
}
