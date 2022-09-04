package com.google.android.gms.drive.query.internal;

import com.google.android.gms.drive.metadata.AbstractC4991a;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Set;
/* renamed from: com.google.android.gms.drive.query.internal.e */
/* loaded from: classes2.dex */
class C5040e {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static AbstractC4991a<?> m21990a(MetadataBundle metadataBundle) {
        Set<AbstractC4991a<?>> m22149c = metadataBundle.m22149c();
        if (m22149c.size() != 1) {
            throw new IllegalArgumentException("bundle should have exactly 1 populated field");
        }
        return m22149c.iterator().next();
    }
}
