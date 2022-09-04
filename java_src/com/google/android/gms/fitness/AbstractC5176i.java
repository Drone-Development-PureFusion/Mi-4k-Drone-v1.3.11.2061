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
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.fitness.request.SessionInsertRequest;
import com.google.android.gms.fitness.request.SessionReadRequest;
import com.google.android.gms.fitness.result.SessionReadResult;
import com.google.android.gms.fitness.result.SessionStopResult;
/* renamed from: com.google.android.gms.fitness.i */
/* loaded from: classes2.dex */
public interface AbstractC5176i {

    /* renamed from: com.google.android.gms.fitness.i$a */
    /* loaded from: classes2.dex */
    public static class C5177a {

        /* renamed from: a */
        private final Context f18835a;

        /* renamed from: b */
        private Session f18836b;

        /* renamed from: c */
        private String f18837c;

        /* renamed from: d */
        private boolean f18838d = false;

        public C5177a(Context context) {
            this.f18835a = context;
        }

        /* renamed from: a */
        private Intent m21409a(Intent intent) {
            Intent intent2;
            ResolveInfo resolveActivity;
            if (this.f18837c == null || (resolveActivity = this.f18835a.getPackageManager().resolveActivity((intent2 = new Intent(intent).setPackage(this.f18837c)), 0)) == null) {
                return intent;
            }
            intent2.setComponent(new ComponentName(this.f18837c, resolveActivity.activityInfo.name));
            return intent2;
        }

        /* renamed from: a */
        public Intent m21410a() {
            C4588d.m23622a(this.f18836b != null, "Session must be set");
            Intent intent = new Intent(C5128c.f18215A);
            intent.setType(Session.m21571a(this.f18836b.m21563f()));
            C4631c.m23443a(this.f18836b, intent, Session.f18638a);
            if (!this.f18838d) {
                this.f18837c = this.f18836b.m21560i();
            }
            return m21409a(intent);
        }

        /* renamed from: a */
        public C5177a m21408a(Session session) {
            this.f18836b = session;
            return this;
        }

        /* renamed from: a */
        public C5177a m21407a(String str) {
            this.f18837c = str;
            this.f18838d = true;
            return this;
        }
    }

    /* renamed from: a */
    AbstractC4494i<Status> mo16862a(AbstractC4489g abstractC4489g, PendingIntent pendingIntent);

    /* renamed from: a */
    AbstractC4494i<Status> mo16860a(AbstractC4489g abstractC4489g, Session session);

    /* renamed from: a */
    AbstractC4494i<Status> mo16859a(AbstractC4489g abstractC4489g, SessionInsertRequest sessionInsertRequest);

    @RequiresPermission(anyOf = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.BODY_SENSORS"}, conditional = true)
    /* renamed from: a */
    AbstractC4494i<SessionReadResult> mo16858a(AbstractC4489g abstractC4489g, SessionReadRequest sessionReadRequest);

    /* renamed from: a */
    AbstractC4494i<SessionStopResult> mo16857a(AbstractC4489g abstractC4489g, String str);

    /* renamed from: b */
    AbstractC4494i<Status> mo16855b(AbstractC4489g abstractC4489g, PendingIntent pendingIntent);
}
