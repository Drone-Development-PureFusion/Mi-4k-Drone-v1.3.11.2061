package com.xiaomi.push.service;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.OnAccountsUpdateListener;
import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.android.C10395f;
import com.xiaomi.channel.commonutils.logger.AbstractC10404b;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.xiaomi.push.service.k */
/* loaded from: classes2.dex */
public class C10673k {

    /* renamed from: c */
    private static volatile C10673k f33159c;

    /* renamed from: a */
    private Context f33160a;

    /* renamed from: b */
    private AccountManager f33161b;

    /* renamed from: d */
    private ArrayList<AbstractC10674a> f33162d = new ArrayList<>();

    /* renamed from: e */
    private OnAccountsUpdateListener f33163e;

    /* renamed from: com.xiaomi.push.service.k$a */
    /* loaded from: classes2.dex */
    public interface AbstractC10674a {
        /* renamed from: a */
        void mo4203a(String str, Context context);
    }

    private C10673k(Context context) {
        this.f33160a = context;
        this.f33161b = AccountManager.get(this.f33160a);
    }

    /* renamed from: a */
    public static C10673k m4213a(Context context) {
        if (f33159c == null) {
            synchronized (C10673k.class) {
                if (f33159c == null) {
                    f33159c = new C10673k(context);
                }
            }
        }
        return f33159c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m4209a(String str) {
        if (this.f33162d == null || this.f33162d.size() < 1) {
            return;
        }
        Iterator<AbstractC10674a> it2 = this.f33162d.iterator();
        while (it2.hasNext()) {
            it2.next().mo4203a(str, this.f33160a);
        }
    }

    /* renamed from: d */
    private void m4205d() {
        if (this.f33163e != null) {
            return;
        }
        this.f33163e = new C10675l(this);
    }

    /* renamed from: e */
    private String m4204e() {
        Account m5304a = C10395f.m5304a(this.f33160a);
        return m5304a == null ? "" : m5304a.name;
    }

    /* renamed from: a */
    public void m4214a() {
        try {
            if (this.f33163e == null) {
                m4205d();
            }
            this.f33161b.addOnAccountsUpdatedListener(this.f33163e, null, true);
        } catch (Exception e) {
            AbstractC10404b.m5264d(e.toString());
        }
    }

    /* renamed from: a */
    public void m4212a(AbstractC10674a abstractC10674a) {
        if (this.f33162d == null) {
            this.f33162d = new ArrayList<>();
        }
        if (abstractC10674a != null) {
            int size = this.f33162d.size();
            this.f33162d.add(abstractC10674a);
            if (size != 0) {
                return;
            }
            m4214a();
        }
    }

    /* renamed from: b */
    public void m4208b() {
        if (this.f33163e == null) {
            return;
        }
        this.f33161b.removeOnAccountsUpdatedListener(this.f33163e);
    }

    /* renamed from: b */
    public void m4207b(AbstractC10674a abstractC10674a) {
        if (this.f33162d == null || abstractC10674a == null) {
            return;
        }
        this.f33162d.remove(abstractC10674a);
        if (this.f33162d.size() != 0) {
            return;
        }
        m4208b();
    }

    /* renamed from: c */
    public String m4206c() {
        String m4204e = m4204e();
        if (!TextUtils.isEmpty(m4204e)) {
            C10676m.m4201a(this.f33160a).m4200a(m4204e);
            return m4204e;
        }
        C10676m.m4201a(this.f33160a).m4200a("0");
        return "0";
    }
}
