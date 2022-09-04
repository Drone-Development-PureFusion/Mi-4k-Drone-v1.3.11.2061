package com.google.android.gms.nearby.messages.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.Message;
/* loaded from: classes2.dex */
public class MessageWrapper extends AbstractSafeParcelable {
    public static final C8870r CREATOR = new C8870r();

    /* renamed from: a */
    final int f28276a;

    /* renamed from: b */
    public final Message f28277b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MessageWrapper(int i, Message message) {
        this.f28276a = i;
        this.f28277b = (Message) C4588d.m23627a(message);
    }

    /* renamed from: a */
    public static final MessageWrapper m9912a(Message message) {
        return new MessageWrapper(1, message);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MessageWrapper) {
            return C4585c.m23634a(this.f28277b, ((MessageWrapper) obj).f28277b);
        }
        return false;
    }

    public int hashCode() {
        return C4585c.m23633a(this.f28277b);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f28277b.toString());
        return new StringBuilder(String.valueOf(valueOf).length() + 24).append("MessageWrapper{message=").append(valueOf).append("}").toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8870r c8870r = CREATOR;
        C8870r.m9844a(this, parcel, i);
    }
}
