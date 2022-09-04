package com.google.android.gms.appdatasearch;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.appdatasearch.DocumentContents;
import com.google.android.gms.appdatasearch.RegisterSectionInfo;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.AbstractC7649rd;
import com.google.android.gms.internal.amm;
import com.google.android.gms.p231b.AbstractC4151d;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Locale;
import java.util.zip.CRC32;
/* loaded from: classes2.dex */
public class UsageInfo extends AbstractSafeParcelable {
    public static final C3962j CREATOR = new C3962j();

    /* renamed from: a */
    final int f15278a;

    /* renamed from: b */
    final DocumentId f15279b;

    /* renamed from: c */
    final long f15280c;

    /* renamed from: d */
    int f15281d;

    /* renamed from: e */
    public final String f15282e;

    /* renamed from: f */
    final DocumentContents f15283f;

    /* renamed from: g */
    final boolean f15284g;

    /* renamed from: h */
    int f15285h;

    /* renamed from: i */
    int f15286i;

    /* renamed from: com.google.android.gms.appdatasearch.UsageInfo$a */
    /* loaded from: classes2.dex */
    public static final class C3951a {

        /* renamed from: a */
        private DocumentId f15287a;

        /* renamed from: d */
        private DocumentContents f15290d;

        /* renamed from: b */
        private long f15288b = -1;

        /* renamed from: c */
        private int f15289c = -1;

        /* renamed from: f */
        private int f15292f = -1;

        /* renamed from: e */
        private boolean f15291e = false;

        /* renamed from: g */
        private int f15293g = 0;

        /* renamed from: a */
        public C3951a m25935a(int i) {
            this.f15289c = i;
            return this;
        }

        /* renamed from: a */
        public C3951a m25934a(long j) {
            this.f15288b = j;
            return this;
        }

        /* renamed from: a */
        public C3951a m25933a(DocumentContents documentContents) {
            this.f15290d = documentContents;
            return this;
        }

        /* renamed from: a */
        public C3951a m25932a(DocumentId documentId) {
            this.f15287a = documentId;
            return this;
        }

        /* renamed from: a */
        public C3951a m25931a(boolean z) {
            this.f15291e = z;
            return this;
        }

        /* renamed from: a */
        public UsageInfo m25936a() {
            return new UsageInfo(this.f15287a, this.f15288b, this.f15289c, (String) null, this.f15290d, this.f15291e, this.f15292f, this.f15293g);
        }

        /* renamed from: b */
        public C3951a m25930b(int i) {
            this.f15293g = i;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public UsageInfo(int i, DocumentId documentId, long j, int i2, String str, DocumentContents documentContents, boolean z, int i3, int i4) {
        this.f15278a = i;
        this.f15279b = documentId;
        this.f15280c = j;
        this.f15281d = i2;
        this.f15282e = str;
        this.f15283f = documentContents;
        this.f15284g = z;
        this.f15285h = i3;
        this.f15286i = i4;
    }

    private UsageInfo(DocumentId documentId, long j, int i, String str, DocumentContents documentContents, boolean z, int i2, int i3) {
        this(1, documentId, j, i, str, documentContents, z, i2, i3);
    }

    public UsageInfo(String str, Intent intent, String str2, Uri uri, String str3, List<AbstractC4151d.C4153b> list, int i) {
        this(1, m25940a(str, intent), System.currentTimeMillis(), 0, (String) null, m25943a(intent, str2, uri, str3, list).m25957a(), false, -1, i);
    }

    /* renamed from: a */
    public static DocumentContents.C3948a m25943a(Intent intent, String str, Uri uri, String str2, List<AbstractC4151d.C4153b> list) {
        String string;
        DocumentContents.C3948a c3948a = new DocumentContents.C3948a();
        c3948a.m25955a(m25941a(str));
        if (uri != null) {
            c3948a.m25955a(m25942a(uri));
        }
        if (list != null) {
            c3948a.m25955a(m25938a(list));
        }
        String action = intent.getAction();
        if (action != null) {
            c3948a.m25955a(m25937b("intent_action", action));
        }
        String dataString = intent.getDataString();
        if (dataString != null) {
            c3948a.m25955a(m25937b("intent_data", dataString));
        }
        ComponentName component = intent.getComponent();
        if (component != null) {
            c3948a.m25955a(m25937b("intent_activity", component.getClassName()));
        }
        Bundle extras = intent.getExtras();
        if (extras != null && (string = extras.getString("intent_extra_data_key")) != null) {
            c3948a.m25955a(m25937b("intent_extra_data", string));
        }
        return c3948a.m25954a(str2).m25953a(true);
    }

    /* renamed from: a */
    public static DocumentId m25940a(String str, Intent intent) {
        return m25939a(str, m25944a(intent));
    }

    /* renamed from: a */
    private static DocumentId m25939a(String str, String str2) {
        return new DocumentId(str, "", str2);
    }

    /* renamed from: a */
    private static DocumentSection m25942a(Uri uri) {
        return new DocumentSection(uri.toString(), new RegisterSectionInfo.C3949a("web_url").m25949a(4).m25947a(true).m25946b("url").m25950a());
    }

    /* renamed from: a */
    private static DocumentSection m25941a(String str) {
        return new DocumentSection(str, new RegisterSectionInfo.C3949a("title").m25949a(1).m25945b(true).m25946b("name").m25950a(), "text1");
    }

    /* renamed from: a */
    private static DocumentSection m25938a(List<AbstractC4151d.C4153b> list) {
        amm.C6570a c6570a = new amm.C6570a();
        amm.C6570a.C6571a[] c6571aArr = new amm.C6570a.C6571a[list.size()];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= c6571aArr.length) {
                c6570a.f22285a = c6571aArr;
                return new DocumentSection(AbstractC7649rd.m13857a(c6570a), new RegisterSectionInfo.C3949a("outlinks").m25947a(true).m25946b(".private:outLinks").m25948a("blob").m25950a());
            }
            c6571aArr[i2] = new amm.C6570a.C6571a();
            AbstractC4151d.C4153b c4153b = list.get(i2);
            c6571aArr[i2].f22287a = c4153b.f15743a.toString();
            c6571aArr[i2].f22289c = c4153b.f15745c;
            if (c4153b.f15744b != null) {
                c6571aArr[i2].f22288b = c4153b.f15744b.toString();
            }
            i = i2 + 1;
        }
    }

    /* renamed from: a */
    private static String m25944a(Intent intent) {
        String uri = intent.toUri(1);
        CRC32 crc32 = new CRC32();
        try {
            crc32.update(uri.getBytes("UTF-8"));
            return Long.toHexString(crc32.getValue());
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: b */
    private static DocumentSection m25937b(String str, String str2) {
        return new DocumentSection(str2, new RegisterSectionInfo.C3949a(str).m25947a(true).m25950a(), str);
    }

    public String toString() {
        return String.format(Locale.US, "UsageInfo[documentId=%s, timestamp=%d, usageType=%d, status=%d]", this.f15279b, Long.valueOf(this.f15280c), Integer.valueOf(this.f15281d), Integer.valueOf(this.f15286i));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3962j c3962j = CREATOR;
        C3962j.m25902a(this, parcel, i);
    }
}
