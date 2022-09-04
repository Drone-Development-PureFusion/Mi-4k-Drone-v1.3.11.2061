package com.google.android.gms.location.places.p246ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.util.TypedValue;
import com.google.android.gms.common.C4515b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.C4631c;
import com.google.android.gms.location.places.AbstractC8240d;
import com.google.android.gms.location.places.internal.PlaceEntity;
/* renamed from: com.google.android.gms.location.places.ui.d */
/* loaded from: classes2.dex */
abstract class AbstractC8322d {

    /* renamed from: d */
    public static final int f27213d = 2;

    /* renamed from: com.google.android.gms.location.places.ui.d$a */
    /* loaded from: classes2.dex */
    protected static abstract class AbstractC8323a {

        /* renamed from: a */
        protected final Intent f27214a;

        public AbstractC8323a(String str) {
            this.f27214a = new Intent(str);
            this.f27214a.setPackage("com.google.android.gms");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: a */
        public Intent mo12064a(Activity activity) {
            Resources.Theme theme = activity.getTheme();
            TypedValue typedValue = new TypedValue();
            TypedValue typedValue2 = new TypedValue();
            if (theme.resolveAttribute(16843827, typedValue, true) && !this.f27214a.hasExtra("primary_color")) {
                this.f27214a.putExtra("primary_color", typedValue.data);
            }
            if (theme.resolveAttribute(16843828, typedValue2, true) && !this.f27214a.hasExtra("primary_color_dark")) {
                this.f27214a.putExtra("primary_color_dark", typedValue2.data);
            }
            C4515b.m23920a().d(activity);
            return this.f27214a;
        }
    }

    /* renamed from: c */
    public static AbstractC8240d m12066c(Context context, Intent intent) {
        C4588d.m23626a(intent, "intent must not be null");
        C4588d.m23626a(context, "context must not be null");
        return (AbstractC8240d) C4631c.m23445a(intent, "selected_place", PlaceEntity.CREATOR);
    }

    /* renamed from: d */
    public static Status m12065d(Context context, Intent intent) {
        C4588d.m23626a(intent, "intent must not be null");
        C4588d.m23626a(context, "context must not be null");
        return (Status) C4631c.m23445a(intent, "status", Status.CREATOR);
    }
}
