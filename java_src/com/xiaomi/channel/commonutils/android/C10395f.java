package com.xiaomi.channel.commonutils.android;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
/* renamed from: com.xiaomi.channel.commonutils.android.f */
/* loaded from: classes2.dex */
public class C10395f {
    /* renamed from: a */
    public static Account m5304a(Context context) {
        try {
            Account[] accountsByType = AccountManager.get(context).getAccountsByType("com.xiaomi");
            if (accountsByType != null && accountsByType.length > 0) {
                return accountsByType[0];
            }
            return null;
        } catch (Exception e) {
            AbstractC10404b.m5264d(e.toString());
            return null;
        }
    }
}
