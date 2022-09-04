package com.google.android.gms.internal;

import android.net.Uri;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.common.util.UriUtil;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.p239g.C5290i;
import com.google.firebase.C9751b;
import com.google.firebase.auth.C9741o;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* renamed from: com.google.android.gms.internal.ng */
/* loaded from: classes2.dex */
public class C7439ng {
    /* renamed from: a */
    public static long m14482a(@Nullable String str) {
        if (str == null) {
            return 0L;
        }
        String replaceAll = str.replaceAll("Z$", "-0000");
        try {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.getDefault()).parse(replaceAll).getTime();
        } catch (ParseException e) {
            String valueOf = String.valueOf(replaceAll);
            Log.w("StorageUtil", valueOf.length() != 0 ? "unable to parse datetime:".concat(valueOf) : new String("unable to parse datetime:"), e);
            return 0L;
        }
    }

    @Nullable
    /* renamed from: a */
    public static Uri m14484a(@NonNull C9751b c9751b, @Nullable String str) {
        String substring;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.toLowerCase().startsWith("gs://")) {
            String valueOf = String.valueOf(C7435nc.m14490a(C7435nc.m14488c(str.substring(5))));
            return Uri.parse(valueOf.length() != 0 ? "gs://".concat(valueOf) : new String("gs://"));
        }
        Uri parse = Uri.parse(str);
        String lowerCase = parse.getScheme().toLowerCase();
        if (!m14483a(lowerCase, UriUtil.HTTP_SCHEME) && !m14483a(lowerCase, UriUtil.HTTPS_SCHEME)) {
            String valueOf2 = String.valueOf(lowerCase);
            Log.w("StorageUtil", valueOf2.length() != 0 ? "FirebaseStorage is unable to support the scheme:".concat(valueOf2) : new String("FirebaseStorage is unable to support the scheme:"));
            throw new IllegalArgumentException("Uri scheme");
        }
        try {
            int indexOf = parse.getAuthority().toLowerCase().indexOf(m14481b(c9751b));
            String m14489b = C7435nc.m14489b(parse.getEncodedPath());
            if (indexOf == 0 && m14489b.startsWith("/")) {
                int indexOf2 = m14489b.indexOf("/b/", 0);
                int indexOf3 = m14489b.indexOf("/", indexOf2 + 3);
                int indexOf4 = m14489b.indexOf("/o/", 0);
                if (indexOf2 == -1 || indexOf3 == -1) {
                    Log.w("StorageUtil", "Only URLs to firebasestorage.googleapis.com are supported.");
                    throw new IllegalArgumentException("Only URLs to firebasestorage.googleapis.com are supported.");
                }
                substring = m14489b.substring(indexOf2 + 3, indexOf3);
                m14489b = indexOf4 != -1 ? m14489b.substring(indexOf4 + 3) : "";
            } else if (indexOf <= 1) {
                Log.w("StorageUtil", "Only URLs to firebasestorage.googleapis.com are supported.");
                throw new IllegalArgumentException("Only URLs to firebasestorage.googleapis.com are supported.");
            } else {
                substring = parse.getAuthority().substring(0, indexOf - 1);
            }
            C4588d.m23624a(substring, (Object) "No bucket specified");
            return new Uri.Builder().scheme("gs").authority(substring).encodedPath(m14489b).build();
        } catch (RemoteException e) {
            throw new UnsupportedEncodingException("Could not parse Url because the Storage network layer did not load");
        }
    }

    @Nullable
    /* renamed from: a */
    public static String m14485a(C9751b c9751b) {
        String m7248a;
        try {
            m7248a = ((C9741o) C5290i.m20828a(c9751b.m7209b(false), NotificationOptions.f16268b, TimeUnit.MILLISECONDS)).m7248a();
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            String valueOf = String.valueOf(e);
            Log.e("StorageUtil", new StringBuilder(String.valueOf(valueOf).length() + 20).append("error getting token ").append(valueOf).toString());
        }
        if (!TextUtils.isEmpty(m7248a)) {
            return m7248a;
        }
        Log.w("StorageUtil", "no auth token for request");
        return null;
    }

    /* renamed from: a */
    public static boolean m14483a(@Nullable Object obj, @Nullable Object obj2) {
        return C4585c.m23634a(obj, obj2);
    }

    /* renamed from: b */
    private static String m14481b(C9751b c9751b) {
        return C7446nj.m14445a(c9751b).m14452a();
    }
}
