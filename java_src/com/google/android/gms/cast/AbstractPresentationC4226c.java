package com.google.android.gms.cast;

import android.annotation.TargetApi;
import android.app.Presentation;
import android.content.Context;
import android.support.p001v4.view.ViewCompat;
import android.view.Display;
import android.view.Window;
import com.google.android.gms.drive.AbstractC4808e;
@TargetApi(19)
/* renamed from: com.google.android.gms.cast.c */
/* loaded from: classes2.dex */
public abstract class AbstractPresentationC4226c extends Presentation {
    public AbstractPresentationC4226c(Context context, Display display) {
        super(context, display);
        m24920a();
    }

    public AbstractPresentationC4226c(Context context, Display display, int i) {
        super(context, display, i);
        m24920a();
    }

    /* renamed from: a */
    private void m24920a() {
        Window window = getWindow();
        if (window != null) {
            window.setType(2030);
            window.addFlags(AbstractC4808e.f17570a_);
            window.addFlags(ViewCompat.MEASURED_STATE_TOO_SMALL);
            window.addFlags(1024);
        }
    }
}
