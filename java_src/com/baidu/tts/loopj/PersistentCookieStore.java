package com.baidu.tts.loopj;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.client.CookieStore;
import org.apache.http.cookie.Cookie;
import org.codehaus.jackson.smile.SmileConstants;
/* loaded from: classes.dex */
public class PersistentCookieStore implements CookieStore {
    private static final String COOKIE_NAME_PREFIX = "cookie_";
    private static final String COOKIE_NAME_STORE = "names";
    private static final String COOKIE_PREFS = "CookiePrefsFile";
    private static final String LOG_TAG = "PersistentCookieStore";
    private final SharedPreferences cookiePrefs;
    private boolean omitNonPersistentCookies = false;
    private final ConcurrentHashMap<String, Cookie> cookies = new ConcurrentHashMap<>();

    public PersistentCookieStore(Context context) {
        String[] split;
        Cookie decodeCookie;
        this.cookiePrefs = context.getSharedPreferences(COOKIE_PREFS, 0);
        String string = this.cookiePrefs.getString(COOKIE_NAME_STORE, null);
        if (string != null) {
            for (String str : TextUtils.split(string, Constants.ACCEPT_TIME_SEPARATOR_SP)) {
                String string2 = this.cookiePrefs.getString(COOKIE_NAME_PREFIX + str, null);
                if (string2 != null && (decodeCookie = decodeCookie(string2)) != null) {
                    this.cookies.put(str, decodeCookie);
                }
            }
            clearExpired(new Date());
        }
    }

    public void addCookie(Cookie cookie) {
        if (!this.omitNonPersistentCookies || cookie.isPersistent()) {
            String str = cookie.getName() + cookie.getDomain();
            if (!cookie.isExpired(new Date())) {
                this.cookies.put(str, cookie);
            } else {
                this.cookies.remove(str);
            }
            SharedPreferences.Editor edit = this.cookiePrefs.edit();
            edit.putString(COOKIE_NAME_STORE, TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, this.cookies.keySet()));
            edit.putString(COOKIE_NAME_PREFIX + str, encodeCookie(new SerializableCookie(cookie)));
            edit.commit();
        }
    }

    protected String byteArrayToHexString(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            int i = b & SmileConstants.BYTE_MARKER_END_OF_CONTENT;
            if (i < 16) {
                sb.append('0');
            }
            sb.append(Integer.toHexString(i));
        }
        return sb.toString().toUpperCase(Locale.US);
    }

    public void clear() {
        SharedPreferences.Editor edit = this.cookiePrefs.edit();
        Iterator<String> it2 = this.cookies.keySet().iterator();
        while (it2.hasNext()) {
            edit.remove(COOKIE_NAME_PREFIX + it2.next());
        }
        edit.remove(COOKIE_NAME_STORE);
        edit.commit();
        this.cookies.clear();
    }

    public boolean clearExpired(Date date) {
        boolean z;
        boolean z2 = false;
        SharedPreferences.Editor edit = this.cookiePrefs.edit();
        Iterator<Map.Entry<String, Cookie>> it2 = this.cookies.entrySet().iterator();
        while (true) {
            z = z2;
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry<String, Cookie> next = it2.next();
            String key = next.getKey();
            if (next.getValue().isExpired(date)) {
                this.cookies.remove(key);
                edit.remove(COOKIE_NAME_PREFIX + key);
                z2 = true;
            } else {
                z2 = z;
            }
        }
        if (z) {
            edit.putString(COOKIE_NAME_STORE, TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, this.cookies.keySet()));
        }
        edit.commit();
        return z;
    }

    protected Cookie decodeCookie(String str) {
        try {
            return ((SerializableCookie) new ObjectInputStream(new ByteArrayInputStream(hexStringToByteArray(str))).readObject()).getCookie();
        } catch (IOException e) {
            AsyncHttpClient.log.mo36210d(LOG_TAG, "IOException in decodeCookie", e);
            return null;
        } catch (ClassNotFoundException e2) {
            AsyncHttpClient.log.mo36210d(LOG_TAG, "ClassNotFoundException in decodeCookie", e2);
            return null;
        }
    }

    public void deleteCookie(Cookie cookie) {
        String str = cookie.getName() + cookie.getDomain();
        this.cookies.remove(str);
        SharedPreferences.Editor edit = this.cookiePrefs.edit();
        edit.remove(COOKIE_NAME_PREFIX + str);
        edit.commit();
    }

    protected String encodeCookie(SerializableCookie serializableCookie) {
        if (serializableCookie == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new ObjectOutputStream(byteArrayOutputStream).writeObject(serializableCookie);
            return byteArrayToHexString(byteArrayOutputStream.toByteArray());
        } catch (IOException e) {
            AsyncHttpClient.log.mo36210d(LOG_TAG, "IOException in encodeCookie", e);
            return null;
        }
    }

    public List<Cookie> getCookies() {
        return new ArrayList(this.cookies.values());
    }

    protected byte[] hexStringToByteArray(String str) {
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }

    public void setOmitNonPersistentCookies(boolean z) {
        this.omitNonPersistentCookies = z;
    }
}
