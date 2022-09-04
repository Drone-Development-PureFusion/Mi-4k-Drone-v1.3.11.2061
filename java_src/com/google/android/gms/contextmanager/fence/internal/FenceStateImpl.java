package com.google.android.gms.contextmanager.fence.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.awareness.fence.FenceState;
import com.google.android.gms.internal.C7715sw;
/* loaded from: classes.dex */
public class FenceStateImpl extends FenceState {
    public static final Parcelable.Creator<FenceStateImpl> CREATOR = new C4744i();

    /* renamed from: d */
    private final int f17369d;

    /* renamed from: e */
    private final int f17370e;

    /* renamed from: f */
    private final long f17371f;

    /* renamed from: g */
    private final String f17372g;

    /* renamed from: h */
    private final int f17373h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FenceStateImpl(int i, int i2, long j, String str, int i3) {
        this.f17369d = i;
        this.f17370e = i2;
        this.f17371f = j;
        this.f17372g = str;
        this.f17373h = i3;
    }

    public FenceStateImpl(int i, long j, String str, int i2) {
        this(1, i, j, str, i2);
    }

    /* renamed from: a */
    public static int m22970a(int i, String str) {
        switch (i) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            default:
                C7715sw.m13666a(str, new StringBuilder(43).append("Invalid fence evaluation state: ").append(i).toString());
                return 0;
        }
    }

    /* renamed from: b */
    public static FenceState m22968b(Intent intent) {
        return new FenceStateImpl(m22970a(intent.getIntExtra("context_fence_current_state", 0), "FenceState"), intent.getLongExtra("context_fence_last_updated_time", 0L), intent.getStringExtra("context_fence_key"), m22970a(intent.getIntExtra("context_fence_previous_state", 0), "FenceState"));
    }

    @Override // com.google.android.gms.awareness.fence.FenceState
    /* renamed from: a */
    public int mo22971a() {
        return this.f17370e;
    }

    @Override // com.google.android.gms.awareness.fence.FenceState
    /* renamed from: b */
    public int mo22969b() {
        return this.f17373h;
    }

    @Override // com.google.android.gms.awareness.fence.FenceState
    /* renamed from: c */
    public long mo22967c() {
        return this.f17371f;
    }

    @Override // com.google.android.gms.awareness.fence.FenceState
    /* renamed from: d */
    public String mo22966d() {
        return this.f17372g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int m22965e() {
        return this.f17369d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C4744i.m22911a(this, parcel, i);
    }
}
