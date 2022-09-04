package com.fimi.soul.utils;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.util.EntityUtils;
/* renamed from: com.fimi.soul.utils.ag */
/* loaded from: classes.dex */
public class C3079ag {

    /* renamed from: a */
    private String f11526a;

    /* renamed from: b */
    private HttpPost f11527b;

    /* renamed from: c */
    private HttpResponse f11528c;

    /* renamed from: d */
    private HttpParams f11529d = new BasicHttpParams();

    /* renamed from: e */
    private HttpClient f11530e = new DefaultHttpClient(this.f11529d);

    public C3079ag(String str, Context context) {
        this.f11526a = str;
        HttpConnectionParams.setConnectionTimeout(this.f11529d, 15000);
        HttpConnectionParams.setSoTimeout(this.f11529d, 15000);
    }

    /* renamed from: a */
    public InputStream m29338a(List<NameValuePair> list) {
        try {
            this.f11527b = new HttpPost(this.f11526a);
            if (list != null) {
                this.f11527b.setEntity(new UrlEncodedFormEntity(list, "UTF-8"));
            }
            this.f11528c = this.f11530e.execute(this.f11527b);
            if (200 != this.f11528c.getStatusLine().getStatusCode()) {
                return null;
            }
            return this.f11528c.getEntity().getContent();
        } catch (IOException e) {
            return null;
        }
    }

    /* renamed from: b */
    public String m29337b(List<NameValuePair> list) {
        try {
            this.f11527b = new HttpPost(this.f11526a);
            if (list != null) {
                this.f11527b.setEntity(new UrlEncodedFormEntity(list, "UTF-8"));
            }
            this.f11528c = this.f11530e.execute(this.f11527b);
            if (200 != this.f11528c.getStatusLine().getStatusCode()) {
                return null;
            }
            String entityUtils = EntityUtils.toString(this.f11528c.getEntity());
            System.out.println("ȡ�÷���ֵ" + entityUtils);
            return entityUtils;
        } catch (IOException e) {
            e.printStackTrace();
            return "Error";
        }
    }

    /* renamed from: c */
    public int m29336c(List<NameValuePair> list) {
        try {
            this.f11527b = new HttpPost(this.f11526a);
            if (list != null) {
                this.f11527b.setEntity(new UrlEncodedFormEntity(list, "UTF-8"));
            }
            this.f11528c = this.f11530e.execute(this.f11527b);
            if (200 != this.f11528c.getStatusLine().getStatusCode()) {
                return -1;
            }
            return Integer.parseInt(EntityUtils.toString(this.f11528c.getEntity()));
        } catch (IOException e) {
            return -1;
        }
    }

    /* renamed from: d */
    public int m29335d(List<NameValuePair> list) {
        try {
            this.f11527b = new HttpPost(this.f11526a);
            if (list != null) {
                this.f11527b.setEntity(new UrlEncodedFormEntity(list, "UTF-8"));
            }
            this.f11528c = this.f11530e.execute(this.f11527b);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
