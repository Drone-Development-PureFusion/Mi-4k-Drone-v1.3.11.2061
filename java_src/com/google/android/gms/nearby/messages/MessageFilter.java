package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4588d;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.messages.devices.NearbyDeviceFilter;
import com.google.android.gms.nearby.messages.internal.MessageType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import org.p356d.AbstractC11759f;
/* loaded from: classes2.dex */
public class MessageFilter extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MessageFilter> CREATOR = new C8912p();

    /* renamed from: a */
    public static final MessageFilter f28177a = new C8823a().m9972a().m9968b();

    /* renamed from: b */
    final int f28178b;

    /* renamed from: c */
    private final List<MessageType> f28179c;

    /* renamed from: d */
    private final List<NearbyDeviceFilter> f28180d;

    /* renamed from: e */
    private final boolean f28181e;

    /* renamed from: com.google.android.gms.nearby.messages.MessageFilter$a */
    /* loaded from: classes2.dex */
    public static final class C8823a {

        /* renamed from: a */
        private final List<MessageType> f28182a = new ArrayList();

        /* renamed from: b */
        private final List<NearbyDeviceFilter> f28183b = new ArrayList();

        /* renamed from: c */
        private boolean f28184c;

        /* renamed from: c */
        private C8823a m9966c(String str, String str2) {
            this.f28182a.add(new MessageType(str, str2));
            return this;
        }

        /* renamed from: a */
        public C8823a m9972a() {
            this.f28184c = true;
            return this;
        }

        /* renamed from: a */
        public C8823a m9971a(MessageFilter messageFilter) {
            this.f28182a.addAll(messageFilter.m9975a());
            this.f28183b.addAll(messageFilter.m9973c());
            this.f28184c |= messageFilter.m9974b();
            return this;
        }

        /* renamed from: a */
        public C8823a m9970a(String str, String str2) {
            C4588d.m23617b(str != null && !str.isEmpty() && !str.contains(AbstractC11759f.f37104a), "namespace(%s) cannot be null, empty or contain (*).", str);
            C4588d.m23617b(str2 != null && !str2.contains(AbstractC11759f.f37104a), "type(%s) cannot be null or contain (*).", str2);
            return m9966c(str, str2);
        }

        /* renamed from: a */
        public C8823a m9969a(UUID uuid, @Nullable Short sh, @Nullable Short sh2) {
            m9966c(Message.f28167c, Message.f28169e);
            this.f28183b.add(NearbyDeviceFilter.m9943a(uuid, sh, sh2));
            return this;
        }

        /* renamed from: b */
        public C8823a m9967b(String str, @Nullable String str2) {
            m9966c(Message.f28167c, Message.f28168d);
            this.f28183b.add(NearbyDeviceFilter.m9944a(str, str2));
            return this;
        }

        /* renamed from: b */
        public MessageFilter m9968b() {
            C4588d.m23622a(this.f28184c || !this.f28182a.isEmpty(), "At least one of the include methods must be called.");
            return new MessageFilter(this.f28182a, this.f28183b, this.f28184c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MessageFilter(int i, List<MessageType> list, List<NearbyDeviceFilter> list2, boolean z) {
        this.f28178b = i;
        this.f28179c = Collections.unmodifiableList((List) C4588d.m23627a(list));
        this.f28181e = z;
        this.f28180d = Collections.unmodifiableList(list2 == null ? Collections.emptyList() : list2);
    }

    private MessageFilter(List<MessageType> list, List<NearbyDeviceFilter> list2, boolean z) {
        this(1, list, list2, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public List<MessageType> m9975a() {
        return this.f28179c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m9974b() {
        return this.f28181e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public List<NearbyDeviceFilter> m9973c() {
        return this.f28180d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageFilter)) {
            return false;
        }
        MessageFilter messageFilter = (MessageFilter) obj;
        return this.f28181e == messageFilter.f28181e && C4585c.m23634a(this.f28179c, messageFilter.f28179c) && C4585c.m23634a(this.f28180d, messageFilter.f28180d);
    }

    public int hashCode() {
        return C4585c.m23633a(this.f28179c, this.f28180d, Boolean.valueOf(this.f28181e));
    }

    public String toString() {
        boolean z = this.f28181e;
        String valueOf = String.valueOf(this.f28179c);
        return new StringBuilder(String.valueOf(valueOf).length() + 53).append("MessageFilter{includeAllMyTypes=").append(z).append(", messageTypes=").append(valueOf).append("}").toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C8912p.m9748a(this, parcel, i);
    }
}
