package com.google.android.gms.drive.events.internal;

import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.events.AbstractC4827l;
/* renamed from: com.google.android.gms.drive.events.internal.b */
/* loaded from: classes2.dex */
public class C4823b implements AbstractC4827l {

    /* renamed from: a */
    private final DriveId f17633a;

    /* renamed from: b */
    private final int f17634b;

    /* renamed from: c */
    private final int f17635c;

    public C4823b(TransferProgressData transferProgressData) {
        this.f17633a = transferProgressData.m22649b();
        this.f17634b = transferProgressData.m22650a();
        this.f17635c = transferProgressData.m22648c();
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C4823b c4823b = (C4823b) obj;
        return C4585c.m23634a(this.f17633a, c4823b.f17633a) && this.f17634b == c4823b.f17634b && this.f17635c == c4823b.f17635c;
    }

    public int hashCode() {
        return C4585c.m23633a(this.f17633a, Integer.valueOf(this.f17634b), Integer.valueOf(this.f17635c));
    }

    public String toString() {
        return String.format("FileTransferState[TransferType: %d, DriveId: %s, status: %d]", Integer.valueOf(this.f17634b), this.f17633a, Integer.valueOf(this.f17635c));
    }
}
