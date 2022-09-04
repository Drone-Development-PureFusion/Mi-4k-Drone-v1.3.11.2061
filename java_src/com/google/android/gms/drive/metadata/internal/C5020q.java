package com.google.android.gms.drive.metadata.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.UserMetadata;
import com.tencent.open.SocialConstants;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
/* renamed from: com.google.android.gms.drive.metadata.internal.q */
/* loaded from: classes2.dex */
public class C5020q extends AbstractC5013k<UserMetadata> {
    public C5020q(String str, int i) {
        super(str, m22093b(str), Collections.emptyList(), i);
    }

    /* renamed from: a */
    private String m22095a(String str) {
        return m22094a(a(), str);
    }

    /* renamed from: a */
    private static String m22094a(String str, String str2) {
        return new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length()).append(str).append(".").append(str2).toString();
    }

    /* renamed from: b */
    private static Collection<String> m22093b(String str) {
        return Arrays.asList(m22094a(str, "permissionId"), m22094a(str, "displayName"), m22094a(str, SocialConstants.PARAM_AVATAR_URI), m22094a(str, "isAuthenticatedUser"), m22094a(str, "emailAddress"));
    }

    @Override // com.google.android.gms.drive.metadata.AbstractC4996f
    /* renamed from: b */
    protected boolean mo17071b(DataHolder dataHolder, int i, int i2) {
        return dataHolder.m23895a(m22095a("permissionId")) && !dataHolder.m23876h(m22095a("permissionId"), i, i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.drive.metadata.AbstractC4996f
    /* renamed from: d */
    public UserMetadata mo17070c(DataHolder dataHolder, int i, int i2) {
        String m23886c = dataHolder.m23886c(m22095a("permissionId"), i, i2);
        if (m23886c != null) {
            String m23886c2 = dataHolder.m23886c(m22095a("displayName"), i, i2);
            String m23886c3 = dataHolder.m23886c(m22095a(SocialConstants.PARAM_AVATAR_URI), i, i2);
            Boolean valueOf = Boolean.valueOf(dataHolder.m23884d(m22095a("isAuthenticatedUser"), i, i2));
            return new UserMetadata(m23886c, m23886c2, m23886c3, valueOf.booleanValue(), dataHolder.m23886c(m22095a("emailAddress"), i, i2));
        }
        return null;
    }
}
