package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public class MessageType extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MessageType> CREATOR = new C8869q();

    /* renamed from: a */
    final int f28273a;

    /* renamed from: b */
    public final String f28274b;

    /* renamed from: c */
    public final String f28275c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MessageType(int i, String str, String str2) {
        this.f28273a = i;
        this.f28274b = str;
        this.f28275c = str2;
    }

    public MessageType(String str, String str2) {
        this(1, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageType)) {
            return false;
        }
        MessageType messageType = (MessageType) obj;
        return C4585c.m23634a(this.f28274b, messageType.f28274b) && C4585c.m23634a(this.f28275c, messageType.f28275c);
    }

    public int hashCode() {
        return C4585c.m23633a(this.f28274b, this.f28275c);
    }

    public String toString() {
        String str = this.f28274b;
        String str2 = this.f28275c;
        return new StringBuilder(String.valueOf(str).length() + 17 + String.valueOf(str2).length()).append("namespace=").append(str).append(", type=").append(str2).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8869q.m9847a(this, parcel, i);
    }
}
