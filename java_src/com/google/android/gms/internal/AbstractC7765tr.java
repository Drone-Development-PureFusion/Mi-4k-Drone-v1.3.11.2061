package com.google.android.gms.internal;

import android.support.annotation.Nullable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
@aaa
/* renamed from: com.google.android.gms.internal.tr */
/* loaded from: classes.dex */
public abstract class AbstractC7765tr {
    @Nullable

    /* renamed from: b */
    private static MessageDigest f25686b = null;

    /* renamed from: a */
    protected Object f25687a = new Object();

    /* JADX INFO: Access modifiers changed from: protected */
    @Nullable
    /* renamed from: a */
    public MessageDigest m13529a() {
        MessageDigest messageDigest;
        synchronized (this.f25687a) {
            if (f25686b != null) {
                messageDigest = f25686b;
            } else {
                for (int i = 0; i < 2; i++) {
                    try {
                        f25686b = MessageDigest.getInstance("MD5");
                    } catch (NoSuchAlgorithmException e) {
                    }
                }
                messageDigest = f25686b;
            }
        }
        return messageDigest;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract byte[] mo13516a(String str);
}
