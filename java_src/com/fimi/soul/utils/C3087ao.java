package com.fimi.soul.utils;

import android.accounts.OperationCanceledException;
import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.facebook.common.util.UriUtil;
import com.fimi.kernel.C1642c;
import com.fimi.overseas.soul.C1704R;
import com.fimi.soul.base.C1756a;
import com.fimi.soul.biz.manager.C1964f;
import com.fimi.soul.biz.manager.C2015y;
import com.fimi.soul.biz.p176d.C1833a;
import com.fimi.soul.biz.p185m.AbstractC1945k;
import com.fimi.soul.entity.PlaneMsg;
import com.fimi.soul.entity.User;
import com.fimi.soul.module.login.LoginActivity;
import com.fimi.soul.utils.AbstractC3093ap;
import com.xiaomi.account.openauth.XMAuthericationException;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import com.xiaomi.account.openauth.XiaomiOAuthFuture;
import com.xiaomi.account.openauth.XiaomiOAuthResults;
import com.xiaomi.account.openauth.XiaomiOAuthorize;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.fimi.soul.utils.ao */
/* loaded from: classes.dex */
public class C3087ao implements AbstractC3093ap {

    /* renamed from: a */
    private static final String f11538a = "http://dev.xiaomi.com";

    /* renamed from: b */
    private XiaomiOAuthResults f11539b;

    /* renamed from: c */
    private User f11540c = new User();

    /* renamed from: d */
    private C2015y f11541d;

    /* renamed from: e */
    private Context f11542e;

    /* renamed from: f */
    private AbstractC3093ap.AbstractC3094a f11543f;

    /* renamed from: g */
    private String f11544g;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.fimi.soul.utils.ao$3] */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.fimi.soul.utils.ao$4] */
    /* renamed from: a */
    public void m29308a() {
        C1964f.m33399a(this.f11542e).m33395a(new AbstractC1945k() { // from class: com.fimi.soul.utils.ao.2
            @Override // com.fimi.soul.biz.p185m.AbstractC1945k
            /* renamed from: a */
            public void mo28106a(PlaneMsg planeMsg, File file) {
            }
        });
        final XiaomiOAuthFuture<String> callOpenApi = new XiaomiOAuthorize().callOpenApi(this.f11542e, Long.parseLong("2882303761517518920"), XiaomiOAuthConstants.OPEN_API_PATH_PHONE, this.f11539b.getAccessToken(), this.f11539b.getMacKey(), this.f11539b.getMacAlgorithm());
        new AsyncTask<Void, Void, String>() { // from class: com.fimi.soul.utils.ao.3

            /* renamed from: a */
            Exception f11549a;

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a */
            public String doInBackground(Void... voidArr) {
                try {
                    return (String) callOpenApi.getResult();
                } catch (OperationCanceledException e) {
                    this.f11549a = e;
                    return null;
                } catch (XMAuthericationException e2) {
                    this.f11549a = e2;
                    return null;
                } catch (IOException e3) {
                    this.f11549a = e3;
                    return null;
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a */
            public void onPostExecute(String str) {
                if (str == null) {
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str).getJSONObject(UriUtil.DATA_SCHEME);
                    if (jSONObject.getString("phone") == null || jSONObject.getString("phone").length() <= 0) {
                        return;
                    }
                    C3087ao.this.f11540c.setPhone(jSONObject.getString("phone"));
                } catch (NullPointerException e) {
                    e.printStackTrace();
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }

            @Override // android.os.AsyncTask
            protected void onPreExecute() {
                C1756a.m34261a("waiting for Future result...", LoginActivity.class);
            }
        }.execute(new Void[0]);
        final XiaomiOAuthFuture<String> callOpenApi2 = new XiaomiOAuthorize().callOpenApi(this.f11542e, Long.parseLong("2882303761517518920"), XiaomiOAuthConstants.OPEN_API_PATH_PROFILE, this.f11539b.getAccessToken(), this.f11539b.getMacKey(), this.f11539b.getMacAlgorithm());
        new AsyncTask<Void, Void, String>() { // from class: com.fimi.soul.utils.ao.4

            /* renamed from: a */
            Exception f11552a;

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a */
            public String doInBackground(Void... voidArr) {
                try {
                    return (String) callOpenApi2.getResult();
                } catch (OperationCanceledException e) {
                    this.f11552a = e;
                    return null;
                } catch (XMAuthericationException e2) {
                    this.f11552a = e2;
                    return null;
                } catch (IOException e3) {
                    this.f11552a = e3;
                    return null;
                }
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a */
            public void onPostExecute(String str) {
                if (TextUtils.isEmpty(str)) {
                    if (C3087ao.this.f11543f == null) {
                        return;
                    }
                    C3087ao.this.f11543f.mo29290a(C3087ao.this.f11542e.getResources().getString(C1704R.C1707string.login_result));
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str).getJSONObject(UriUtil.DATA_SCHEME);
                    C3087ao.this.f11540c.setXiaomiID(jSONObject.getString("userId"));
                    C3087ao.this.f11540c.setName(jSONObject.getString("miliaoNick"));
                    C3087ao.this.f11540c.setNickName(jSONObject.getString("miliaoNick"));
                    C3087ao.this.f11540c.setDevice(C3103au.m29239a(C1642c.m34893a()));
                    if (jSONObject.has("sex")) {
                        if (jSONObject.getString("sex").equals(C3087ao.this.f11542e.getResources().getString(C1704R.C1707string.man))) {
                            C3087ao.this.f11540c.setSex("1");
                        } else if (jSONObject.getString("sex").equals(C3087ao.this.f11542e.getResources().getString(C1704R.C1707string.woman))) {
                            C3087ao.this.f11540c.setSex("0");
                        }
                    }
                    if (jSONObject.has("miliaoIcon_orig")) {
                        C3087ao.this.f11540c.setUserImgUrl(jSONObject.getString("miliaoIcon_orig"));
                    }
                    C3087ao.this.f11541d.m33236d(C3087ao.this.f11540c, new AbstractC1945k() { // from class: com.fimi.soul.utils.ao.4.1
                        @Override // com.fimi.soul.biz.p185m.AbstractC1945k
                        /* renamed from: a */
                        public void mo28106a(PlaneMsg planeMsg, File file) {
                            C3087ao.this.f11544g = planeMsg.getErrorMessage();
                            if (planeMsg.isSuccess()) {
                                if (C3087ao.this.f11543f == null) {
                                    return;
                                }
                                C3087ao.this.f11543f.mo29291a();
                            } else if (C3087ao.this.f11544g != null) {
                                if (C3087ao.this.f11543f == null) {
                                    return;
                                }
                                C3087ao.this.f11543f.mo29290a(C3087ao.this.f11544g);
                            } else if (C3087ao.this.f11543f == null) {
                            } else {
                                C3087ao.this.f11543f.mo29290a(C3087ao.this.f11542e.getResources().getString(C1704R.C1707string.login_result_net));
                            }
                        }
                    });
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            @Override // android.os.AsyncTask
            protected void onPreExecute() {
                C1756a.m34261a("waiting for Future result...", LoginActivity.class);
            }
        }.execute(new Void[0]);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.fimi.soul.utils.ao$1] */
    /* renamed from: a */
    private <V> void m29304a(final XiaomiOAuthFuture<V> xiaomiOAuthFuture) {
        new AsyncTask<Void, Void, V>() { // from class: com.fimi.soul.utils.ao.1

            /* renamed from: a */
            Exception f11545a;

            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Type inference failed for: r0v4, types: [V, java.lang.Object] */
            @Override // android.os.AsyncTask
            /* renamed from: a */
            public V doInBackground(Void... voidArr) {
                try {
                    return xiaomiOAuthFuture.getResult();
                } catch (OperationCanceledException e) {
                    this.f11545a = e;
                    return null;
                } catch (XMAuthericationException e2) {
                    this.f11545a = e2;
                    return null;
                } catch (IOException e3) {
                    this.f11545a = e3;
                    return null;
                }
            }

            @Override // android.os.AsyncTask
            protected void onPostExecute(V v) {
                if (v == 0) {
                    if (this.f11545a != null) {
                        if (C3087ao.this.f11543f == null) {
                            return;
                        }
                        C3087ao.this.f11543f.mo29289b();
                    } else if (C3087ao.this.f11543f == null) {
                    } else {
                        C3087ao.this.f11543f.mo29290a(C3087ao.this.f11542e.getResources().getString(C1704R.C1707string.login_result));
                    }
                } else if (!(v instanceof XiaomiOAuthResults)) {
                } else {
                    C3087ao.this.f11539b = (XiaomiOAuthResults) v;
                    if (C3087ao.this.f11539b.getAccessToken() == null) {
                        if (C3087ao.this.f11543f == null) {
                            return;
                        }
                        C3087ao.this.f11543f.mo29290a(C3087ao.this.f11542e.getResources().getString(C1704R.C1707string.login_result));
                        return;
                    }
                    C1833a.m33966c(C1642c.m34893a(), 0, C3087ao.this.f11539b.getAccessToken());
                    C1833a.m33968b(C1642c.m34893a(), 0, C3087ao.this.f11539b.getMacKey());
                    C1833a.m33970a(C1642c.m34893a(), 0, C3087ao.this.f11539b.getMacAlgorithm());
                    C3087ao.this.m29308a();
                }
            }

            @Override // android.os.AsyncTask
            protected void onPreExecute() {
                C1756a.m34261a("waiting for Future result...", LoginActivity.class);
            }
        }.execute(new Void[0]);
    }

    @Override // com.fimi.soul.utils.AbstractC3093ap
    /* renamed from: a */
    public void mo29292a(Context context, AbstractC3093ap.AbstractC3094a abstractC3094a) {
        this.f11542e = context;
        this.f11543f = abstractC3094a;
        this.f11541d = C2015y.m33256a(context);
        m29304a(new XiaomiOAuthorize().setAppId(Long.parseLong("2882303761517518920")).setRedirectUrl(f11538a).setScope(Arrays.copyOf(new int[4], 0)).setKeepCookies(true).setNoMiui(false).setSkipConfirm(false).startGetAccessToken((Activity) context));
    }
}
