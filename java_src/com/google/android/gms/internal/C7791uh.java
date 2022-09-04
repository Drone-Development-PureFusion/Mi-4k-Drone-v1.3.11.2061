package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C3779u;
import com.tencent.p263mm.sdk.platformtools.LocaleUtil;
import com.tencent.tauth.AuthActivity;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
@aaa
/* renamed from: com.google.android.gms.internal.uh */
/* loaded from: classes.dex */
public class C7791uh {

    /* renamed from: a */
    BlockingQueue<C7801un> f25915a;

    /* renamed from: b */
    ExecutorService f25916b;

    /* renamed from: e */
    String f25919e;

    /* renamed from: f */
    final Context f25920f;

    /* renamed from: g */
    final String f25921g;

    /* renamed from: i */
    private File f25923i;

    /* renamed from: c */
    LinkedHashMap<String, String> f25917c = new LinkedHashMap<>();

    /* renamed from: d */
    Map<String, AbstractC7795uk> f25918d = new HashMap();

    /* renamed from: h */
    private AtomicBoolean f25922h = new AtomicBoolean(false);

    public C7791uh(Context context, String str, String str2, Map<String, String> map) {
        File externalStorageDirectory;
        this.f25920f = context;
        this.f25921g = str;
        this.f25919e = str2;
        this.f25922h.set(C7788uf.f25731P.m13486c().booleanValue());
        if (this.f25922h.get() && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
            this.f25923i = new File(externalStorageDirectory, "sdk_csi_data.txt");
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.f25917c.put(entry.getKey(), entry.getValue());
        }
        this.f25915a = new ArrayBlockingQueue(30);
        this.f25916b = Executors.newSingleThreadExecutor();
        this.f25916b.execute(new Runnable() { // from class: com.google.android.gms.internal.uh.1
            @Override // java.lang.Runnable
            public void run() {
                C7791uh.this.m13462a();
            }
        });
        this.f25918d.put(AuthActivity.ACTION_KEY, AbstractC7795uk.f25926b);
        this.f25918d.put("ad_format", AbstractC7795uk.f25926b);
        this.f25918d.put("e", AbstractC7795uk.f25927c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m13462a() {
        while (true) {
            try {
                C7801un take = this.f25915a.take();
                String m13431c = take.m13431c();
                if (!TextUtils.isEmpty(m13431c)) {
                    m13455a(m13454a(this.f25917c, take.m13430d()), m13431c);
                }
            } catch (InterruptedException e) {
                abr.d("CsiReporter:reporter interrupted", e);
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m13459a(@Nullable File file, String str) {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        if (file == null) {
            abr.d("CsiReporter: File doesn't exists. Cannot write CSI data to file.");
            return;
        }
        try {
            try {
                fileOutputStream2 = new FileOutputStream(file, true);
                try {
                    fileOutputStream2.write(str.getBytes());
                    fileOutputStream2.write(10);
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                            fileOutputStream = fileOutputStream2;
                        } catch (IOException e) {
                            String str2 = "CsiReporter: Cannot close file: sdk_csi_data.txt.";
                            abr.d(str2, e);
                            fileOutputStream = str2;
                        }
                    }
                } catch (IOException e2) {
                    e = e2;
                    abr.d("CsiReporter: Cannot write to file: sdk_csi_data.txt.", e);
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream2 != null) {
                        try {
                            fileOutputStream2.close();
                            fileOutputStream = fileOutputStream2;
                        } catch (IOException e3) {
                            String str3 = "CsiReporter: Cannot close file: sdk_csi_data.txt.";
                            abr.d(str3, e3);
                            fileOutputStream = str3;
                        }
                    }
                }
            } catch (Throwable th) {
                th = th;
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e4) {
                        abr.d("CsiReporter: Cannot close file: sdk_csi_data.txt.", e4);
                    }
                }
                throw th;
            }
        } catch (IOException e5) {
            e = e5;
            fileOutputStream2 = null;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
            if (fileOutputStream != null) {
            }
            throw th;
        }
    }

    /* renamed from: a */
    private void m13455a(Map<String, String> map, String str) {
        String m13457a = m13457a(this.f25919e, map, str);
        if (this.f25922h.get()) {
            m13459a(this.f25923i, m13457a);
        } else {
            C3779u.m26890e().m18370a(this.f25920f, this.f25921g, m13457a);
        }
    }

    /* renamed from: a */
    public AbstractC7795uk m13458a(String str) {
        AbstractC7795uk abstractC7795uk = this.f25918d.get(str);
        return abstractC7795uk != null ? abstractC7795uk : AbstractC7795uk.f25925a;
    }

    /* renamed from: a */
    String m13457a(String str, Map<String, String> map, @NonNull String str2) {
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        StringBuilder sb = new StringBuilder(buildUpon.build().toString());
        sb.append("&").append(LocaleUtil.ITALIAN).append("=").append(str2);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public Map<String, String> m13454a(Map<String, String> map, @Nullable Map<String, String> map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        if (map2 == null) {
            return linkedHashMap;
        }
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            String key = entry.getKey();
            String str = (String) linkedHashMap.get(key);
            linkedHashMap.put(key, m13458a(key).mo13446a(str, entry.getValue()));
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public void m13456a(@Nullable List<String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        this.f25917c.put("e", TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, list));
    }

    /* renamed from: a */
    public boolean m13460a(C7801un c7801un) {
        return this.f25915a.offer(c7801un);
    }
}
