package com.google.android.gms.common;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.internal.C4588d;
import java.util.ArrayList;
/* renamed from: com.google.android.gms.common.a */
/* loaded from: classes2.dex */
public final class C4466a {
    private C4466a() {
    }

    /* renamed from: a */
    public static Intent m24034a(Account account, ArrayList<Account> arrayList, String[] strArr, boolean z, String str, String str2, String[] strArr2, Bundle bundle) {
        return m24033a(account, arrayList, strArr, z, str, str2, strArr2, bundle, false);
    }

    /* renamed from: a */
    public static Intent m24033a(Account account, ArrayList<Account> arrayList, String[] strArr, boolean z, String str, String str2, String[] strArr2, Bundle bundle, boolean z2) {
        return m24032a(account, arrayList, strArr, z, str, str2, strArr2, bundle, z2, 0, 0);
    }

    /* renamed from: a */
    public static Intent m24032a(Account account, ArrayList<Account> arrayList, String[] strArr, boolean z, String str, String str2, String[] strArr2, Bundle bundle, boolean z2, int i, int i2) {
        return m24031a(account, arrayList, strArr, z, str, str2, strArr2, bundle, z2, i, i2, null, false);
    }

    /* renamed from: a */
    public static Intent m24031a(Account account, ArrayList<Account> arrayList, String[] strArr, boolean z, String str, String str2, String[] strArr2, Bundle bundle, boolean z2, int i, int i2, String str3, boolean z3) {
        Intent intent = new Intent();
        if (!z3) {
            C4588d.m23618b(str3 == null, "We only support hostedDomain filter for account chip styled account picker");
        }
        intent.setAction(z3 ? "com.google.android.gms.common.account.CHOOSE_ACCOUNT_USERTILE" : "com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("allowableAccounts", arrayList);
        intent.putExtra("allowableAccountTypes", strArr);
        intent.putExtra("addAccountOptions", bundle);
        intent.putExtra("selectedAccount", account);
        intent.putExtra("alwaysPromptForAccount", z);
        intent.putExtra("descriptionTextOverride", str);
        intent.putExtra("authTokenType", str2);
        intent.putExtra("addAccountRequiredFeatures", strArr2);
        intent.putExtra("setGmsCoreAccount", z2);
        intent.putExtra("overrideTheme", i);
        intent.putExtra("overrideCustomTheme", i2);
        intent.putExtra("hostedDomainFilter", str3);
        return intent;
    }
}
