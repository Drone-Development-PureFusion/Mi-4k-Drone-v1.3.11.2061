package com.fimi.kernel.p164c;

import android.content.SharedPreferences;
import com.fimi.kernel.C1642c;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.type.CollectionType;
/* renamed from: com.fimi.kernel.c.c */
/* loaded from: classes.dex */
public class C1645c implements AbstractC1643a {

    /* renamed from: e */
    private static final String f4056e = "BeautifulKernel_SPStoreManager";

    /* renamed from: b */
    private static C1645c f4055b = null;

    /* renamed from: a */
    public static final ObjectMapper f4054a = new ObjectMapper();

    /* renamed from: d */
    private SharedPreferences f4058d = C1642c.m34893a().getSharedPreferences(f4056e, 0);

    /* renamed from: c */
    private Gson f4057c = new Gson();

    private C1645c() {
    }

    /* renamed from: a */
    public static synchronized C1645c m34884a() {
        C1645c c1645c;
        synchronized (C1645c.class) {
            if (f4055b == null) {
                f4055b = new C1645c();
            }
            c1645c = f4055b;
        }
        return c1645c;
    }

    @Override // com.fimi.kernel.p164c.AbstractC1643a
    /* renamed from: a */
    public <T> T mo34880a(String str, Class<?> cls) {
        try {
            String string = this.f4058d.getString(str, null);
            if (string == null) {
                return null;
            }
            return (T) this.f4057c.fromJson(string, (Class<Object>) cls);
        } catch (Exception e) {
            return null;
        }
    }

    @Override // com.fimi.kernel.p164c.AbstractC1643a
    /* renamed from: a */
    public String mo34883a(String str) {
        return this.f4058d.getString(str, null);
    }

    @Override // com.fimi.kernel.p164c.AbstractC1643a
    /* renamed from: a */
    public void mo34882a(String str, int i) {
        SharedPreferences.Editor edit = this.f4058d.edit();
        edit.putInt(str, i);
        edit.commit();
    }

    @Override // com.fimi.kernel.p164c.AbstractC1643a
    /* renamed from: a */
    public void mo34881a(String str, long j) {
        SharedPreferences.Editor edit = this.f4058d.edit();
        edit.putLong(str, j);
        edit.commit();
    }

    @Override // com.fimi.kernel.p164c.AbstractC1643a
    /* renamed from: a */
    public void mo34879a(String str, Object obj) {
        SharedPreferences.Editor edit = this.f4058d.edit();
        edit.putString(str, this.f4057c.toJson(obj, obj.getClass()));
        edit.commit();
    }

    @Override // com.fimi.kernel.p164c.AbstractC1643a
    /* renamed from: a */
    public void mo34878a(String str, String str2) {
        SharedPreferences.Editor edit = this.f4058d.edit();
        edit.putString(str, str2);
        edit.commit();
    }

    @Override // com.fimi.kernel.p164c.AbstractC1643a
    /* renamed from: a */
    public <T> void mo34877a(String str, List<T> list) {
        SharedPreferences.Editor edit = this.f4058d.edit();
        edit.putString(str, this.f4057c.toJson(list));
        edit.commit();
    }

    @Override // com.fimi.kernel.p164c.AbstractC1643a
    /* renamed from: a */
    public void mo34876a(String str, boolean z) {
        SharedPreferences.Editor edit = this.f4058d.edit();
        edit.putBoolean(str, z);
        edit.commit();
    }

    @Override // com.fimi.kernel.p164c.AbstractC1643a
    /* renamed from: b */
    public int mo34875b(String str) {
        return this.f4058d.getInt(str, 0);
    }

    @Override // com.fimi.kernel.p164c.AbstractC1643a
    /* renamed from: b */
    public List mo34874b(String str, Class<?> cls) {
        CollectionType constructCollectionType = f4054a.getTypeFactory().constructCollectionType(ArrayList.class, cls);
        try {
            String string = this.f4058d.getString(str, null);
            if (string != null) {
                return (List) f4054a.readValue(string, constructCollectionType);
            }
        } catch (Exception e) {
        }
        return null;
    }

    @Override // com.fimi.kernel.p164c.AbstractC1643a
    /* renamed from: c */
    public long mo34873c(String str) {
        return this.f4058d.getLong(str, 0L);
    }

    @Override // com.fimi.kernel.p164c.AbstractC1643a
    /* renamed from: d */
    public boolean mo34872d(String str) {
        return this.f4058d.getBoolean(str, false);
    }

    /* renamed from: e */
    public void m34871e(String str) {
        try {
            this.f4058d.edit().remove(str).commit();
        } catch (Exception e) {
        }
    }
}
