package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.devices.NearbyDevice;
import java.util.Arrays;
/* loaded from: classes.dex */
public class Message extends AbstractSafeParcelable {

    /* renamed from: a */
    public static final int f28165a = 102400;

    /* renamed from: b */
    public static final int f28166b = 32;

    /* renamed from: c */
    public static final String f28167c = "__reserved_namespace";

    /* renamed from: d */
    public static final String f28168d = "__eddystone_uid";

    /* renamed from: e */
    public static final String f28169e = "__i_beacon_id";

    /* renamed from: f */
    final int f28171f;

    /* renamed from: h */
    private final byte[] f28172h;

    /* renamed from: i */
    private final String f28173i;

    /* renamed from: j */
    private final String f28174j;

    /* renamed from: k */
    private final NearbyDevice[] f28175k;

    /* renamed from: l */
    private final long f28176l;
    public static final Parcelable.Creator<Message> CREATOR = new C8911o();

    /* renamed from: g */
    private static final NearbyDevice[] f28170g = {NearbyDevice.f28216a};

    /* JADX INFO: Access modifiers changed from: package-private */
    public Message(int i, @Nullable byte[] bArr, @Nullable String str, String str2, @Nullable NearbyDevice[] nearbyDeviceArr, long j) {
        this.f28171f = i;
        this.f28173i = (String) C4588d.m23627a(str2);
        this.f28174j = str == null ? "" : str;
        this.f28176l = 0L;
        if (m9981a(this.f28174j, this.f28173i)) {
            C4588d.m23618b(bArr == null, "Content must be null for a device presence message.");
        } else {
            C4588d.m23627a(bArr);
            C4588d.m23617b(bArr.length <= 102400, "Content length(%d) must not exceed MAX_CONTENT_SIZE_BYTES(%d)", Integer.valueOf(bArr.length), Integer.valueOf((int) f28165a));
        }
        this.f28172h = bArr;
        this.f28175k = (nearbyDeviceArr == null || nearbyDeviceArr.length == 0) ? f28170g : nearbyDeviceArr;
        C4588d.m23617b(str2.length() <= 32, "Type length(%d) must not exceed MAX_TYPE_LENGTH(%d)", Integer.valueOf(str2.length()), 32);
    }

    public Message(byte[] bArr) {
        this(bArr, "", "");
    }

    public Message(byte[] bArr, String str) {
        this(bArr, "", str);
    }

    public Message(byte[] bArr, String str, String str2) {
        this(bArr, str, str2, f28170g);
    }

    public Message(byte[] bArr, String str, String str2, NearbyDevice[] nearbyDeviceArr) {
        this(bArr, str, str2, nearbyDeviceArr, 0L);
    }

    public Message(byte[] bArr, String str, String str2, NearbyDevice[] nearbyDeviceArr, long j) {
        this(2, bArr, str, str2, nearbyDeviceArr, j);
    }

    @Deprecated
    /* renamed from: a */
    public static boolean m9981a(String str, String str2) {
        return str.equals(f28167c) && str2.equals("__device_presence");
    }

    /* renamed from: a */
    public boolean m9983a() {
        return f28167c.equals(m9979c());
    }

    /* renamed from: a */
    public boolean m9982a(String str) {
        return m9983a() && str.equals(m9980b());
    }

    /* renamed from: b */
    public String m9980b() {
        return this.f28173i;
    }

    /* renamed from: c */
    public String m9979c() {
        return this.f28174j;
    }

    /* renamed from: d */
    public byte[] m9978d() {
        return this.f28172h;
    }

    /* renamed from: e */
    public NearbyDevice[] m9977e() {
        return this.f28175k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Message)) {
            return false;
        }
        Message message = (Message) obj;
        return TextUtils.equals(this.f28174j, message.f28174j) && TextUtils.equals(this.f28173i, message.f28173i) && Arrays.equals(this.f28172h, message.f28172h) && 0 == 0;
    }

    /* renamed from: f */
    public long m9976f() {
        return 0L;
    }

    public int hashCode() {
        return C4585c.m23633a(this.f28174j, this.f28173i, Integer.valueOf(Arrays.hashCode(this.f28172h)), 0L);
    }

    public String toString() {
        String str = this.f28174j;
        String str2 = this.f28173i;
        int length = this.f28172h == null ? 0 : this.f28172h.length;
        String valueOf = String.valueOf(Arrays.toString(m9977e()));
        return new StringBuilder(String.valueOf(str).length() + 69 + String.valueOf(str2).length() + String.valueOf(valueOf).length()).append("Message{namespace='").append(str).append("', type='").append(str2).append("', content=[").append(length).append(" bytes], devices=").append(valueOf).append("}").toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8911o.m9751a(this, parcel, i);
    }
}
