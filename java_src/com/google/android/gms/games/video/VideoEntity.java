package com.google.android.gms.games.video;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4585c;
import com.google.android.gms.common.internal.C4598n;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* loaded from: classes2.dex */
public final class VideoEntity extends AbstractSafeParcelable implements Video {
    public static final Parcelable.Creator<VideoEntity> CREATOR = new C6036e();

    /* renamed from: a */
    private final int f20455a;

    /* renamed from: b */
    private final int f20456b;

    /* renamed from: c */
    private final String f20457c;

    /* renamed from: d */
    private final long f20458d;

    /* renamed from: e */
    private final long f20459e;

    /* renamed from: f */
    private final String f20460f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public VideoEntity(int i, int i2, String str, long j, long j2, String str2) {
        this.f20455a = i;
        this.f20456b = i2;
        this.f20457c = str;
        this.f20458d = j;
        this.f20459e = j2;
        this.f20460f = str2;
    }

    public VideoEntity(Video video) {
        this.f20455a = 1;
        this.f20456b = video.mo18998c();
        this.f20457c = video.mo18997d();
        this.f20458d = video.mo18996e();
        this.f20459e = video.mo18995f();
        this.f20460f = video.mo18994g();
        C4598n.m23595a((Object) this.f20457c);
        C4598n.m23595a((Object) this.f20460f);
    }

    /* renamed from: a */
    static int m19003a(Video video) {
        return C4585c.m23633a(Integer.valueOf(video.mo18998c()), video.mo18997d(), Long.valueOf(video.mo18996e()), Long.valueOf(video.mo18995f()), video.mo18994g());
    }

    /* renamed from: a */
    static boolean m19002a(Video video, Object obj) {
        if (!(obj instanceof Video)) {
            return false;
        }
        if (video == obj) {
            return true;
        }
        Video video2 = (Video) obj;
        return C4585c.m23634a(Integer.valueOf(video2.mo18998c()), Integer.valueOf(video.mo18998c())) && C4585c.m23634a(video2.mo18997d(), video.mo18997d()) && C4585c.m23634a(Long.valueOf(video2.mo18996e()), Long.valueOf(video.mo18996e())) && C4585c.m23634a(Long.valueOf(video2.mo18995f()), Long.valueOf(video.mo18995f())) && C4585c.m23634a(video2.mo18994g(), video.mo18994g());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m19001b(Video video) {
        return C4585c.m23635a(video).m23632a("Duration", Integer.valueOf(video.mo18998c())).m23632a("File path", video.mo18997d()).m23632a("File size", Long.valueOf(video.mo18996e())).m23632a("Start time", Long.valueOf(video.mo18995f())).m23632a("Package name", video.mo18994g()).toString();
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: b */
    public boolean mo7790b() {
        return true;
    }

    @Override // com.google.android.gms.games.video.Video
    /* renamed from: c */
    public int mo18998c() {
        return this.f20456b;
    }

    @Override // com.google.android.gms.games.video.Video
    /* renamed from: d */
    public String mo18997d() {
        return this.f20457c;
    }

    @Override // com.google.android.gms.games.video.Video
    /* renamed from: e */
    public long mo18996e() {
        return this.f20458d;
    }

    public boolean equals(Object obj) {
        return m19002a(this, obj);
    }

    @Override // com.google.android.gms.games.video.Video
    /* renamed from: f */
    public long mo18995f() {
        return this.f20459e;
    }

    @Override // com.google.android.gms.games.video.Video
    /* renamed from: g */
    public String mo18994g() {
        return this.f20460f;
    }

    /* renamed from: h */
    public int m19000h() {
        return this.f20455a;
    }

    public int hashCode() {
        return m19003a(this);
    }

    @Override // com.google.android.gms.common.data.AbstractC4527f
    /* renamed from: i */
    public Video mo7785a() {
        return this;
    }

    public String toString() {
        return m19001b(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C6036e.m18977a(this, parcel, i);
    }
}
