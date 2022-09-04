package com.google.android.gms.internal;

import android.content.Context;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.C3780a;
import com.google.android.gms.internal.aaw;
import com.google.android.gms.internal.abi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;
@aaa
/* loaded from: classes.dex */
public class abb extends abq implements aba {

    /* renamed from: a */
    private final abi.C6129a f20848a;

    /* renamed from: b */
    private final Context f20849b;

    /* renamed from: c */
    private final ArrayList<Future> f20850c;

    /* renamed from: d */
    private final ArrayList<String> f20851d;

    /* renamed from: e */
    private final HashMap<String, aav> f20852e;

    /* renamed from: f */
    private final List<aaw> f20853f;

    /* renamed from: g */
    private final HashSet<String> f20854g;

    /* renamed from: h */
    private final Object f20855h;

    /* renamed from: i */
    private final aau f20856i;

    /* renamed from: j */
    private final long f20857j;

    public abb(Context context, abi.C6129a c6129a, aau aauVar) {
        this(context, c6129a, aauVar, C7788uf.f25782an.m13486c().longValue());
    }

    abb(Context context, abi.C6129a c6129a, aau aauVar, long j) {
        this.f20850c = new ArrayList<>();
        this.f20851d = new ArrayList<>();
        this.f20852e = new HashMap<>();
        this.f20853f = new ArrayList();
        this.f20854g = new HashSet<>();
        this.f20855h = new Object();
        this.f20849b = context;
        this.f20848a = c6129a;
        this.f20856i = aauVar;
        this.f20857j = j;
    }

    /* renamed from: a */
    private static int m18532a(int i) {
        switch (i) {
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
                return 4;
            case 6:
                return 0;
            case 7:
                return 3;
            default:
                return 6;
        }
    }

    /* renamed from: a */
    private abi m18531a(int i, @Nullable String str, @Nullable C7989xg c7989xg) {
        return new abi(this.f20848a.f20920a.f14487c, null, this.f20848a.f20921b.f14568d, i, this.f20848a.f20921b.f14570f, this.f20848a.f20921b.f14574j, this.f20848a.f20921b.f14576l, this.f20848a.f20921b.f14575k, this.f20848a.f20920a.f14493i, this.f20848a.f20921b.f14572h, c7989xg, null, str, this.f20848a.f20922c, null, this.f20848a.f20921b.f14573i, this.f20848a.f20923d, this.f20848a.f20921b.f14571g, this.f20848a.f20925f, this.f20848a.f20921b.f14578n, this.f20848a.f20921b.f14579o, this.f20848a.f20927h, null, this.f20848a.f20921b.f14552C, this.f20848a.f20921b.f14553D, this.f20848a.f20921b.f14554E, this.f20848a.f20921b.f14555F, this.f20848a.f20921b.f14556G, m18522f(), this.f20848a.f20921b.f14559J, this.f20848a.f20921b.f14563N);
    }

    /* renamed from: a */
    private abi m18526a(String str, C7989xg c7989xg) {
        return m18531a(-2, str, c7989xg);
    }

    /* renamed from: a */
    private static String m18530a(aaw aawVar) {
        String str = aawVar.f20838b;
        int m18532a = m18532a(aawVar.f20839c);
        return new StringBuilder(String.valueOf(str).length() + 33).append(str).append(".").append(m18532a).append(".").append(aawVar.f20840d).toString();
    }

    /* renamed from: a */
    private void m18525a(String str, String str2, C7989xg c7989xg) {
        synchronized (this.f20855h) {
            abc m18571c = this.f20856i.m18571c(str);
            if (m18571c == null || m18571c.m18520b() == null || m18571c.m18521a() == null) {
                this.f20853f.add(new aaw.C6123a().m18555b(c7989xg.f26219d).m18557a(str).m18559a(0L).m18560a(7).m18561a());
                return;
            }
            aav m18524a = m18524a(str, str2, c7989xg, m18571c);
            this.f20850c.add((Future) m18524a.mo12820e());
            this.f20851d.add(str);
            this.f20852e.put(str, m18524a);
        }
    }

    /* renamed from: c */
    private abi m18523c() {
        return m18531a(3, (String) null, (C7989xg) null);
    }

    /* renamed from: f */
    private String m18522f() {
        StringBuilder sb = new StringBuilder("");
        if (this.f20853f == null) {
            return sb.toString();
        }
        for (aaw aawVar : this.f20853f) {
            if (aawVar != null && !TextUtils.isEmpty(aawVar.f20838b)) {
                sb.append(String.valueOf(m18530a(aawVar)).concat("_"));
            }
        }
        return sb.substring(0, Math.max(0, sb.length() - 1));
    }

    /* renamed from: a */
    protected aav m18524a(String str, String str2, C7989xg c7989xg, abc abcVar) {
        return new aav(this.f20849b, str, str2, c7989xg, this.f20848a, abcVar, this, this.f20857j);
    }

    @Override // com.google.android.gms.internal.abq
    /* renamed from: a */
    public void mo12782a() {
        aav aavVar;
        aav aavVar2;
        aav aavVar3;
        aav aavVar4;
        for (C7989xg c7989xg : this.f20848a.f20922c.f26232a) {
            String str = c7989xg.f26224i;
            for (String str2 : c7989xg.f26218c) {
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str2) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str2)) {
                    try {
                        str2 = new JSONObject(str).getString("class_name");
                    } catch (JSONException e) {
                        abr.b("Unable to determine custom event class name, skipping...", e);
                    }
                }
                m18525a(str2, str, c7989xg);
            }
        }
        for (int i = 0; i < this.f20850c.size(); i++) {
            try {
                try {
                    this.f20850c.get(i).get();
                    synchronized (this.f20855h) {
                        String str3 = this.f20851d.get(i);
                        if (!TextUtils.isEmpty(str3) && (aavVar4 = this.f20852e.get(str3)) != null) {
                            this.f20853f.add(aavVar4.m18564c());
                        }
                    }
                    synchronized (this.f20855h) {
                        if (this.f20854g.contains(this.f20851d.get(i))) {
                            String str4 = this.f20851d.get(i);
                            final abi m18526a = m18526a(str4, this.f20852e.get(str4) != null ? this.f20852e.get(str4).m18562f() : null);
                            C3780a.f14737a.post(new Runnable() { // from class: com.google.android.gms.internal.abb.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    abb.this.f20856i.b(m18526a);
                                }
                            });
                            return;
                        }
                    }
                    continue;
                } catch (Throwable th) {
                    synchronized (this.f20855h) {
                        String str5 = this.f20851d.get(i);
                        if (!TextUtils.isEmpty(str5) && (aavVar3 = this.f20852e.get(str5)) != null) {
                            this.f20853f.add(aavVar3.m18564c());
                        }
                        throw th;
                    }
                }
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                synchronized (this.f20855h) {
                    String str6 = this.f20851d.get(i);
                    if (!TextUtils.isEmpty(str6) && (aavVar2 = this.f20852e.get(str6)) != null) {
                        this.f20853f.add(aavVar2.m18564c());
                    }
                }
            } catch (Exception e3) {
                abr.d("Unable to resolve rewarded adapter.", e3);
                synchronized (this.f20855h) {
                    String str7 = this.f20851d.get(i);
                    if (!TextUtils.isEmpty(str7) && (aavVar = this.f20852e.get(str7)) != null) {
                        this.f20853f.add(aavVar.m18564c());
                    }
                    continue;
                }
            }
        }
        final abi m18523c = m18523c();
        C3780a.f14737a.post(new Runnable() { // from class: com.google.android.gms.internal.abb.2
            @Override // java.lang.Runnable
            public void run() {
                abb.this.f20856i.b(m18523c);
            }
        });
    }

    @Override // com.google.android.gms.internal.aba
    /* renamed from: a */
    public void mo18528a(String str) {
        synchronized (this.f20855h) {
            this.f20854g.add(str);
        }
    }

    @Override // com.google.android.gms.internal.aba
    /* renamed from: a */
    public void mo18527a(String str, int i) {
    }

    @Override // com.google.android.gms.internal.abq
    /* renamed from: b */
    public void mo12779b() {
    }
}
