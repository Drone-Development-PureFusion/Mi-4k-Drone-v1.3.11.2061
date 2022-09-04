package com.google.android.gms.drive.query.internal;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.drive.query.C5035f;
import com.google.android.gms.drive.query.Filter;
/* loaded from: classes2.dex */
public abstract class AbstractFilter extends AbstractSafeParcelable implements Filter {
    public String toString() {
        return String.format("Filter[%s]", a(new C5035f()));
    }
}
