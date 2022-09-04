package com.google.android.gms.internal;

import android.util.Base64;
import java.net.URI;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import org.p286a.p287a.C11086e;
import p005b.p006a.p007a.p008a.p026n.C0363a;
/* renamed from: com.google.android.gms.internal.lv */
/* loaded from: classes2.dex */
class C7372lv {

    /* renamed from: a */
    private URI f24580a;

    /* renamed from: b */
    private String f24581b;

    /* renamed from: c */
    private String f24582c;

    /* renamed from: d */
    private Map<String, String> f24583d;

    public C7372lv(URI uri, String str, Map<String, String> map) {
        this.f24580a = null;
        this.f24581b = null;
        this.f24582c = null;
        this.f24583d = null;
        this.f24580a = uri;
        this.f24581b = str;
        this.f24583d = map;
        this.f24582c = m14662b();
    }

    /* renamed from: a */
    private int m14666a(int i, int i2) {
        return (int) ((Math.random() * i2) + i);
    }

    /* renamed from: a */
    private String m14663a(LinkedHashMap<String, String> linkedHashMap) {
        String str = new String();
        Iterator<String> it2 = linkedHashMap.keySet().iterator();
        while (true) {
            String str2 = str;
            if (it2.hasNext()) {
                String next = it2.next();
                String valueOf = String.valueOf(str2);
                String str3 = linkedHashMap.get(next);
                str = new StringBuilder(String.valueOf(valueOf).length() + 4 + String.valueOf(next).length() + String.valueOf(str3).length()).append(valueOf).append(next).append(": ").append(str3).append("\r\n").toString();
            } else {
                return str2;
            }
        }
    }

    /* renamed from: b */
    private String m14662b() {
        byte[] bArr = new byte[16];
        for (int i = 0; i < 16; i++) {
            bArr[i] = (byte) m14666a(0, 255);
        }
        return Base64.encodeToString(bArr, 2);
    }

    /* renamed from: a */
    public void m14665a(String str) {
        int intValue = Integer.valueOf(str.substring(9, 12)).intValue();
        if (intValue == 407) {
            throw new C7371lu("connection failed: proxy authentication not supported");
        }
        if (intValue == 404) {
            throw new C7371lu("connection failed: 404 not found");
        }
        if (intValue == 101) {
            return;
        }
        throw new C7371lu(new StringBuilder(50).append("connection failed: unknown status code ").append(intValue).toString());
    }

    /* renamed from: a */
    public void m14664a(HashMap<String, String> hashMap) {
        if (!hashMap.get(C11086e.f35702X).toLowerCase(Locale.US).equals("websocket")) {
            throw new C7371lu("connection failed: missing header field in server handshake: Upgrade");
        }
        if (hashMap.get(C11086e.f35717j).toLowerCase(Locale.US).equals("upgrade")) {
            return;
        }
        throw new C7371lu("connection failed: missing header field in server handshake: Connection");
    }

    /* renamed from: a */
    public byte[] m14667a() {
        String concat;
        String path = this.f24580a.getPath();
        String query = this.f24580a.getQuery();
        String valueOf = String.valueOf(path);
        if (query == null) {
            concat = "";
        } else {
            String valueOf2 = String.valueOf(query);
            concat = valueOf2.length() != 0 ? C0363a.f360a.concat(valueOf2) : new String(C0363a.f360a);
        }
        String valueOf3 = String.valueOf(concat);
        String concat2 = valueOf3.length() != 0 ? valueOf.concat(valueOf3) : new String(valueOf);
        String host = this.f24580a.getHost();
        if (this.f24580a.getPort() != -1) {
            String valueOf4 = String.valueOf(host);
            host = new StringBuilder(String.valueOf(valueOf4).length() + 12).append(valueOf4).append(":").append(this.f24580a.getPort()).toString();
        }
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(C11086e.f35733z, host);
        linkedHashMap.put(C11086e.f35702X, "websocket");
        linkedHashMap.put(C11086e.f35717j, C11086e.f35702X);
        linkedHashMap.put("Sec-WebSocket-Version", "13");
        linkedHashMap.put("Sec-WebSocket-Key", this.f24582c);
        if (this.f24581b != null) {
            linkedHashMap.put("Sec-WebSocket-Protocol", this.f24581b);
        }
        if (this.f24583d != null) {
            for (String str : this.f24583d.keySet()) {
                if (!linkedHashMap.containsKey(str)) {
                    linkedHashMap.put(str, this.f24583d.get(str));
                }
            }
        }
        String valueOf5 = String.valueOf(new StringBuilder(String.valueOf(concat2).length() + 15).append("GET ").append(concat2).append(" HTTP/1.1\r\n").toString());
        String valueOf6 = String.valueOf(m14663a(linkedHashMap));
        String concat3 = String.valueOf(valueOf6.length() != 0 ? valueOf5.concat(valueOf6) : new String(valueOf5)).concat("\r\n");
        byte[] bArr = new byte[concat3.getBytes().length];
        System.arraycopy(concat3.getBytes(), 0, bArr, 0, concat3.getBytes().length);
        return bArr;
    }
}
