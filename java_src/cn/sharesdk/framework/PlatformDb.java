package cn.sharesdk.framework;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import cn.sharesdk.framework.utils.C0831d;
import com.mob.tools.utils.Hashon;
import com.tencent.p263mm.sdk.contact.RContact;
import com.tencent.p263mm.sdk.plugin.MMPluginProviderConstants;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p005b.p006a.p007a.p029b.p045i.p046a.C0548a;
/* loaded from: classes.dex */
public class PlatformDb {
    private static final String DB_NAME = "cn_sharesdk_weibodb";

    /* renamed from: db */
    private SharedPreferences f1478db;
    private String platformNname;
    private int platformVersion;

    public PlatformDb(Context context, String str, int i) {
        this.f1478db = context.getSharedPreferences("cn_sharesdk_weibodb_" + str + "_" + i, 0);
        this.platformNname = str;
        this.platformVersion = i;
    }

    public String exportData() {
        try {
            HashMap hashMap = new HashMap();
            hashMap.putAll(this.f1478db.getAll());
            return new Hashon().fromHashMap(hashMap);
        } catch (Throwable th) {
            C0831d.m37772a().m6199d(th);
            return null;
        }
    }

    public String get(String str) {
        return this.f1478db.getString(str, "");
    }

    public long getExpiresIn() {
        try {
            return this.f1478db.getLong("expiresIn", 0L);
        } catch (Throwable th) {
            try {
                return this.f1478db.getInt("expiresIn", 0);
            } catch (Throwable th2) {
                return 0L;
            }
        }
    }

    public long getExpiresTime() {
        return this.f1478db.getLong("expiresTime", 0L) + (getExpiresIn() * 1000);
    }

    public String getPlatformNname() {
        return this.platformNname;
    }

    public int getPlatformVersion() {
        return this.platformVersion;
    }

    public String getToken() {
        return this.f1478db.getString(Constants.EXTRA_KEY_TOKEN, "");
    }

    public String getTokenSecret() {
        return this.f1478db.getString(MMPluginProviderConstants.OAuth.SECRET, "");
    }

    public String getUserGender() {
        String string = this.f1478db.getString("gender", "2");
        if ("0".equals(string)) {
            return C0548a.f931b;
        }
        if (!"1".equals(string)) {
            return null;
        }
        return "f";
    }

    public String getUserIcon() {
        return this.f1478db.getString("icon", "");
    }

    public String getUserId() {
        String string = this.f1478db.getString("userID", "");
        return TextUtils.isEmpty(string) ? this.f1478db.getString("weibo", "") : string;
    }

    public String getUserName() {
        return this.f1478db.getString(RContact.COL_NICKNAME, "");
    }

    public void importData(String str) {
        try {
            HashMap fromJson = new Hashon().fromJson(str);
            if (fromJson == null) {
                return;
            }
            SharedPreferences.Editor edit = this.f1478db.edit();
            for (Map.Entry entry : fromJson.entrySet()) {
                Object value = entry.getValue();
                if (value instanceof Boolean) {
                    edit.putBoolean((String) entry.getKey(), ((Boolean) value).booleanValue());
                } else if (value instanceof Float) {
                    edit.putFloat((String) entry.getKey(), ((Float) value).floatValue());
                } else if (value instanceof Integer) {
                    edit.putInt((String) entry.getKey(), ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    edit.putLong((String) entry.getKey(), ((Long) value).longValue());
                } else {
                    edit.putString((String) entry.getKey(), String.valueOf(value));
                }
            }
            edit.commit();
        } catch (Throwable th) {
            C0831d.m37772a().m6199d(th);
        }
    }

    public boolean isValid() {
        String token = getToken();
        if (token == null || token.length() <= 0) {
            return false;
        }
        return getExpiresIn() == 0 || getExpiresTime() > System.currentTimeMillis();
    }

    public void put(String str, String str2) {
        SharedPreferences.Editor edit = this.f1478db.edit();
        edit.putString(str, str2);
        edit.commit();
    }

    public void putExpiresIn(long j) {
        SharedPreferences.Editor edit = this.f1478db.edit();
        edit.putLong("expiresIn", j);
        edit.putLong("expiresTime", System.currentTimeMillis());
        edit.commit();
    }

    public void putToken(String str) {
        SharedPreferences.Editor edit = this.f1478db.edit();
        edit.putString(Constants.EXTRA_KEY_TOKEN, str);
        edit.commit();
    }

    public void putTokenSecret(String str) {
        SharedPreferences.Editor edit = this.f1478db.edit();
        edit.putString(MMPluginProviderConstants.OAuth.SECRET, str);
        edit.commit();
    }

    public void putUserId(String str) {
        SharedPreferences.Editor edit = this.f1478db.edit();
        edit.putString("userID", str);
        edit.commit();
    }

    public void removeAccount() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : this.f1478db.getAll().entrySet()) {
            arrayList.add(entry.getKey());
        }
        SharedPreferences.Editor edit = this.f1478db.edit();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            edit.remove((String) it2.next());
        }
        edit.commit();
    }
}
