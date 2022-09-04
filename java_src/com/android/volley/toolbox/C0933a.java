package com.android.volley.toolbox;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerFuture;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.android.volley.C0899a;
/* renamed from: com.android.volley.toolbox.a */
/* loaded from: classes.dex */
public class C0933a implements AbstractC0934b {

    /* renamed from: a */
    private final AccountManager f2080a;

    /* renamed from: b */
    private final Account f2081b;

    /* renamed from: c */
    private final String f2082c;

    /* renamed from: d */
    private final boolean f2083d;

    C0933a(AccountManager accountManager, Account account, String str, boolean z) {
        this.f2080a = accountManager;
        this.f2081b = account;
        this.f2082c = str;
        this.f2083d = z;
    }

    public C0933a(Context context, Account account, String str) {
        this(context, account, str, false);
    }

    public C0933a(Context context, Account account, String str, boolean z) {
        this(AccountManager.get(context), account, str, z);
    }

    /* renamed from: a */
    public Account m37370a() {
        return this.f2081b;
    }

    @Override // com.android.volley.toolbox.AbstractC0934b
    /* renamed from: a */
    public void mo37369a(String str) {
        this.f2080a.invalidateAuthToken(this.f2081b.type, str);
    }

    @Override // com.android.volley.toolbox.AbstractC0934b
    /* renamed from: b */
    public String mo37368b() {
        String str = null;
        AccountManagerFuture<Bundle> authToken = this.f2080a.getAuthToken(this.f2081b, this.f2082c, this.f2083d, null, null);
        try {
            Bundle result = authToken.getResult();
            if (authToken.isDone() && !authToken.isCancelled()) {
                if (result.containsKey("intent")) {
                    throw new C0899a((Intent) result.getParcelable("intent"));
                }
                str = result.getString("authtoken");
            }
            if (str != null) {
                return str;
            }
            throw new C0899a("Got null auth token for type: " + this.f2082c);
        } catch (Exception e) {
            throw new C0899a("Error while retrieving auth token", e);
        }
    }
}
