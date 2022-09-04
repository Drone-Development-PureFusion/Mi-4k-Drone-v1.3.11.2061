package com.google.android.gms.drive.events.internal;

import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.drive.events.AbstractC4825j;
import com.google.android.gms.drive.events.AbstractC4827l;
/* renamed from: com.google.android.gms.drive.events.internal.a */
/* loaded from: classes2.dex */
public class C4822a implements AbstractC4825j {

    /* renamed from: a */
    private final AbstractC4827l f17630a;

    /* renamed from: b */
    private final long f17631b;

    /* renamed from: c */
    private final long f17632c;

    public C4822a(TransferProgressData transferProgressData) {
        this.f17630a = new C4823b(transferProgressData);
        this.f17631b = transferProgressData.m22647d();
        this.f17632c = transferProgressData.m22646e();
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C4822a c4822a = (C4822a) obj;
        return C4585c.m23634a(this.f17630a, c4822a.f17630a) && this.f17631b == c4822a.f17631b && this.f17632c == c4822a.f17632c;
    }

    public int hashCode() {
        return C4585c.m23633a(Long.valueOf(this.f17632c), Long.valueOf(this.f17631b), Long.valueOf(this.f17632c));
    }

    public String toString() {
        return String.format("FileTransferProgress[FileTransferState: %s, BytesTransferred: %d, TotalBytes: %d]", this.f17630a.toString(), Long.valueOf(this.f17631b), Long.valueOf(this.f17632c));
    }
}
