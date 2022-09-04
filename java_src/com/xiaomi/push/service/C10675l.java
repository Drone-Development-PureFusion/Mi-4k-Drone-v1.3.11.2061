package com.xiaomi.push.service;

import android.accounts.Account;
import android.accounts.OnAccountsUpdateListener;
import android.content.Context;
import android.text.TextUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.xiaomi.push.service.l */
/* loaded from: classes2.dex */
public class C10675l implements OnAccountsUpdateListener {

    /* renamed from: a */
    final /* synthetic */ C10673k f33164a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10675l(C10673k c10673k) {
        this.f33164a = c10673k;
    }

    @Override // android.accounts.OnAccountsUpdateListener
    public void onAccountsUpdated(Account[] accountArr) {
        Account account;
        Context context;
        Context context2;
        Context context3;
        Context context4;
        Context context5;
        boolean z = false;
        if (accountArr == null || accountArr.length <= 0) {
            return;
        }
        int length = accountArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                account = accountArr[i];
                if (account != null && TextUtils.equals("com.xiaomi", account.type)) {
                    break;
                }
                i++;
            } else {
                account = null;
                break;
            }
        }
        if (account != null && !TextUtils.isEmpty(account.name)) {
            z = true;
        }
        context = this.f33164a.f33160a;
        boolean m4198c = C10676m.m4201a(context).m4198c();
        if (z && !m4198c) {
            context5 = this.f33164a.f33160a;
            C10676m.m4201a(context5).m4200a(account.name);
            this.f33164a.m4209a(account.name);
        } else if (!z && m4198c) {
            context4 = this.f33164a.f33160a;
            C10676m.m4201a(context4).m4202a();
            this.f33164a.m4209a("0");
        } else if (!z || !m4198c) {
        } else {
            context2 = this.f33164a.f33160a;
            if (TextUtils.equals(C10676m.m4201a(context2).m4199b(), account.name)) {
                return;
            }
            context3 = this.f33164a.f33160a;
            C10676m.m4201a(context3).m4200a(account.name);
            this.f33164a.m4209a(account.name);
        }
    }
}
