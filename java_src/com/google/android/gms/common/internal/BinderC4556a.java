package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.C4656l;
import com.google.android.gms.common.internal.AbstractC4559ac;
/* renamed from: com.google.android.gms.common.internal.a */
/* loaded from: classes2.dex */
public class BinderC4556a extends AbstractC4559ac.AbstractBinderC4560a {

    /* renamed from: a */
    int f17022a;

    /* renamed from: a */
    public static Account m23716a(AbstractC4559ac abstractC4559ac) {
        Account account = null;
        if (abstractC4559ac != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                account = abstractC4559ac.mo23701a();
            } catch (RemoteException e) {
                Log.w("AccountAccessor", "Remote account accessor probably died");
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return account;
    }

    @Override // com.google.android.gms.common.internal.AbstractC4559ac
    /* renamed from: a */
    public Account mo23701a() {
        int callingUid = Binder.getCallingUid();
        if (callingUid != this.f17022a) {
            if (!C4656l.m23343c(null, callingUid)) {
                throw new SecurityException("Caller is not GooglePlayServices");
            }
            this.f17022a = callingUid;
        }
        return null;
    }

    public boolean equals(Object obj) {
        Account account = null;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BinderC4556a)) {
            return false;
        }
        BinderC4556a binderC4556a = (BinderC4556a) obj;
        return account.equals(null);
    }
}
