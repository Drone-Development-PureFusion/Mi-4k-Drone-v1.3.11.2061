package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.support.p004v7.media.MediaItemMetadata;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.google.android.gms.C3424R;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaMetadata;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.ReconnectionService;
import com.google.android.gms.cast.framework.media.C4298c;
import com.google.android.gms.cast.framework.media.MediaNotificationService;
import com.google.android.gms.common.images.WebImage;
/* loaded from: classes2.dex */
public class afq implements C4298c.AbstractC4322a {

    /* renamed from: a */
    private final Context f21476a;

    /* renamed from: b */
    private final CastOptions f21477b;

    /* renamed from: c */
    private final afm f21478c;

    /* renamed from: d */
    private final ComponentName f21479d;

    /* renamed from: e */
    private C4298c f21480e;

    /* renamed from: f */
    private CastDevice f21481f;

    /* renamed from: g */
    private MediaSessionCompat f21482g;

    /* renamed from: h */
    private MediaSessionCompat.Callback f21483h;

    /* renamed from: i */
    private afn f21484i;

    /* renamed from: j */
    private boolean f21485j;

    public afq(Context context, CastOptions castOptions, afm afmVar) {
        this.f21476a = context;
        this.f21477b = castOptions;
        this.f21478c = afmVar;
        if (this.f21477b.m24907g() == null || TextUtils.isEmpty(this.f21477b.m24907g().m24700d())) {
            this.f21479d = null;
        } else {
            this.f21479d = new ComponentName(this.f21476a, this.f21477b.m24907g().m24700d());
        }
    }

    /* renamed from: a */
    private Uri m17748a(MediaMetadata mediaMetadata) {
        WebImage m24634a = this.f21477b.m24907g().m24699e() != null ? this.f21477b.m24907g().m24699e().m24634a(mediaMetadata, 0) : mediaMetadata.m25101g() ? mediaMetadata.m25103f().get(0) : null;
        if (m24634a == null) {
            return null;
        }
        return m24634a.m23763b();
    }

    /* renamed from: a */
    private void m17751a(int i, MediaInfo mediaInfo) {
        if (i == 0) {
            this.f21482g.setPlaybackState(new PlaybackStateCompat.Builder().setState(0, 0L, 1.0f).build());
            this.f21482g.setMetadata(new MediaMetadataCompat.Builder().build());
            return;
        }
        this.f21482g.setPlaybackState(new PlaybackStateCompat.Builder().setState(i, 0L, 1.0f).setActions(512L).build());
        this.f21482g.setSessionActivity(m17729m());
        m17749a(mediaInfo);
    }

    /* renamed from: a */
    private void m17749a(MediaInfo mediaInfo) {
        if (this.f21484i != null) {
            this.f21484i.cancel(true);
            this.f21484i = null;
        }
        MediaMetadata m25139e = mediaInfo.m25139e();
        MediaMetadataCompat.Builder putLong = m17734h().putString(MediaItemMetadata.KEY_TITLE, m25139e.m25112b(MediaMetadata.f15884k)).putString("android.media.metadata.DISPLAY_TITLE", m25139e.m25112b(MediaMetadata.f15884k)).putString("android.media.metadata.DISPLAY_SUBTITLE", m25139e.m25112b(MediaMetadata.f15885l)).putLong(MediaItemMetadata.KEY_DURATION, mediaInfo.m25138f());
        Uri m17748a = m17748a(m25139e);
        if (m17748a == null) {
            this.f21482g.setMetadata(m17743b(putLong, BitmapFactory.decodeResource(this.f21476a.getResources(), Build.VERSION.SDK_INT > 18 ? C3424R.C3425drawable.cast_album_art_placeholder_large : C3424R.C3425drawable.cast_album_art_placeholder)).build());
            return;
        }
        this.f21482g.setMetadata(putLong.build());
        this.f21484i = new afn(this.f21476a) { // from class: com.google.android.gms.internal.afq.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* renamed from: a */
            public void onPostExecute(Bitmap bitmap) {
                if (afq.this.f21484i == this) {
                    afq.this.f21484i = null;
                    if (bitmap == null) {
                        return;
                    }
                    afq.this.f21482g.setMetadata(afq.m17743b(afq.this.m17734h(), bitmap).build());
                }
            }
        };
        this.f21484i.m17762a(m17748a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static MediaMetadataCompat.Builder m17743b(MediaMetadataCompat.Builder builder, Bitmap bitmap) {
        builder.putBitmap("android.media.metadata.ALBUM_ART", bitmap);
        if (Build.VERSION.SDK_INT < 21) {
            builder.putBitmap("android.media.metadata.DISPLAY_ICON", bitmap.copy(bitmap.getConfig(), true));
        }
        return builder;
    }

    /* renamed from: g */
    private void m17735g() {
        int i;
        MediaInfo mediaInfo;
        boolean z = true;
        boolean z2 = false;
        MediaStatus m24529g = this.f21480e.m24529g();
        MediaInfo m25051f = m24529g == null ? null : m24529g.m25051f();
        MediaMetadata m25139e = m25051f == null ? null : m25051f.m25139e();
        if (m24529g != null && m25051f != null && m25139e != null) {
            switch (this.f21480e.m24526i()) {
                case 1:
                    int m25055d = m24529g.m25055d();
                    boolean z3 = this.f21480e.m24524k() && m25055d == 2;
                    int m25044m = m24529g.m25044m();
                    if (m25044m == 0 || (m25055d != 1 && m25055d != 3)) {
                        z = false;
                    }
                    if (!z3) {
                        if (!z) {
                            i = 0;
                            z2 = z;
                            mediaInfo = m25051f;
                            break;
                        } else {
                            z2 = z;
                            mediaInfo = m24529g.m25067a(m25044m).m25089b();
                            i = 6;
                            break;
                        }
                    } else {
                        z2 = z;
                        i = 2;
                        mediaInfo = m25051f;
                        break;
                    }
                case 2:
                    i = 3;
                    mediaInfo = m25051f;
                    break;
                case 3:
                    i = 2;
                    mediaInfo = m25051f;
                    break;
                case 4:
                    i = 6;
                    mediaInfo = m25051f;
                    break;
                default:
                    i = 0;
                    mediaInfo = m25051f;
                    break;
            }
        } else {
            i = 0;
            mediaInfo = m25051f;
        }
        m17751a(i, mediaInfo);
        if (i == 0) {
            m17732j();
            m17730l();
            return;
        }
        m17733i();
        if (z2) {
            return;
        }
        m17731k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public MediaMetadataCompat.Builder m17734h() {
        MediaMetadataCompat metadata = this.f21482g.getController().getMetadata();
        return metadata == null ? new MediaMetadataCompat.Builder() : new MediaMetadataCompat.Builder(metadata);
    }

    /* renamed from: i */
    private void m17733i() {
        boolean z;
        boolean z2 = true;
        if (this.f21477b.m24907g().m24701c() == null || this.f21480e == null) {
            return;
        }
        Intent intent = new Intent(this.f21476a, MediaNotificationService.class);
        intent.setPackage(this.f21476a.getPackageName());
        intent.setAction(MediaNotificationService.f16264a);
        intent.putExtra("extra_media_info", this.f21480e.m24527h());
        intent.putExtra("extra_remote_media_client_player_state", this.f21480e.m24526i());
        intent.putExtra("extra_cast_device", this.f21481f);
        intent.putExtra("extra_media_session_token", (Parcelable) m17736f());
        MediaStatus m24529g = this.f21480e.m24529g();
        if (m24529g != null) {
            switch (m24529g.m25042o()) {
                case 1:
                case 2:
                case 3:
                    z = true;
                    break;
                default:
                    Integer m25052e = m24529g.m25052e(m24529g.m25045l());
                    if (m25052e == null) {
                        z = false;
                        z2 = false;
                        break;
                    } else {
                        z = m25052e.intValue() > 0;
                        if (m25052e.intValue() >= m24529g.m25040q() - 1) {
                            z2 = false;
                            break;
                        }
                    }
                    break;
            }
            intent.putExtra("extra_can_skip_next", z2);
            intent.putExtra("extra_can_skip_prev", z);
        }
        this.f21476a.startService(intent);
    }

    /* renamed from: j */
    private void m17732j() {
        if (this.f21477b.m24907g().m24701c() == null) {
            return;
        }
        Intent intent = new Intent(this.f21476a, MediaNotificationService.class);
        intent.setPackage(this.f21476a.getPackageName());
        intent.setAction(MediaNotificationService.f16264a);
        this.f21476a.stopService(intent);
    }

    /* renamed from: k */
    private void m17731k() {
        if (!this.f21477b.m24906h()) {
            return;
        }
        Intent intent = new Intent(this.f21476a, ReconnectionService.class);
        intent.setPackage(this.f21476a.getPackageName());
        this.f21476a.startService(intent);
    }

    /* renamed from: l */
    private void m17730l() {
        if (!this.f21477b.m24906h()) {
            return;
        }
        Intent intent = new Intent(this.f21476a, ReconnectionService.class);
        intent.setPackage(this.f21476a.getPackageName());
        this.f21476a.stopService(intent);
    }

    /* renamed from: m */
    private PendingIntent m17729m() {
        if (this.f21479d == null) {
            return null;
        }
        Intent intent = new Intent();
        intent.setComponent(this.f21479d);
        return PendingIntent.getActivity(this.f21476a, 0, intent, 134217728);
    }

    @Override // com.google.android.gms.cast.framework.media.C4298c.AbstractC4322a
    /* renamed from: a */
    public void mo17753a() {
        m17735g();
    }

    /* renamed from: a */
    public void m17752a(int i) {
        if (!this.f21485j) {
            return;
        }
        this.f21485j = false;
        if (this.f21480e != null) {
            this.f21480e.m24544b(this);
        }
        ((AudioManager) this.f21476a.getSystemService("audio")).abandonAudioFocus(null);
        this.f21478c.m17769a((MediaSessionCompat) null);
        if (this.f21484i != null) {
            this.f21484i.cancel(true);
            this.f21484i = null;
        }
        if (this.f21482g != null) {
            this.f21482g.setSessionActivity((PendingIntent) null);
            this.f21482g.setCallback((MediaSessionCompat.Callback) null);
            this.f21482g.setMetadata(new MediaMetadataCompat.Builder().build());
            m17751a(0, (MediaInfo) null);
            this.f21482g.setActive(false);
            this.f21482g.release();
            this.f21482g = null;
        }
        this.f21480e = null;
        this.f21481f = null;
        this.f21483h = null;
        m17732j();
        if (i != 0) {
            return;
        }
        m17730l();
    }

    /* renamed from: a */
    public void m17747a(C4298c c4298c, CastDevice castDevice) {
        if (this.f21485j || this.f21477b == null || this.f21477b.m24907g() == null || c4298c == null || castDevice == null) {
            return;
        }
        this.f21480e = c4298c;
        this.f21480e.m24566a(this);
        this.f21481f = castDevice;
        ((AudioManager) this.f21476a.getSystemService("audio")).requestAudioFocus(null, 3, 3);
        ComponentName componentName = new ComponentName(this.f21476a, this.f21477b.m24907g().m24702b());
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setComponent(componentName);
        this.f21482g = new MediaSessionCompat(this.f21476a, "CastMediaSession", componentName, PendingIntent.getBroadcast(this.f21476a, 0, intent, 0));
        this.f21482g.setFlags(3);
        m17751a(0, (MediaInfo) null);
        if (this.f21481f != null && !TextUtils.isEmpty(this.f21481f.m25240e())) {
            this.f21482g.setMetadata(new MediaMetadataCompat.Builder().putString(MediaItemMetadata.KEY_ALBUM_ARTIST, this.f21476a.getResources().getString(C3424R.C3427string.cast_casting_to_device, this.f21481f.m25240e())).build());
        }
        this.f21483h = new MediaSessionCompat.Callback() { // from class: com.google.android.gms.internal.afq.1
            /* renamed from: a */
            public void m17728a() {
                afq.this.f21480e.m24516s();
            }

            /* renamed from: a */
            public boolean m17727a(Intent intent2) {
                KeyEvent keyEvent = (KeyEvent) intent2.getParcelableExtra("android.intent.extra.KEY_EVENT");
                if (keyEvent != null) {
                    if (keyEvent.getKeyCode() != 127 && keyEvent.getKeyCode() != 126) {
                        return true;
                    }
                    afq.this.f21480e.m24516s();
                    return true;
                }
                return true;
            }

            /* renamed from: b */
            public void m17726b() {
                afq.this.f21480e.m24516s();
            }
        };
        this.f21482g.setCallback(this.f21483h);
        this.f21482g.setActive(true);
        this.f21478c.m17769a(this.f21482g);
        this.f21485j = true;
        m17735g();
    }

    @Override // com.google.android.gms.cast.framework.media.C4298c.AbstractC4322a
    /* renamed from: b */
    public void mo17744b() {
        m17735g();
    }

    @Override // com.google.android.gms.cast.framework.media.C4298c.AbstractC4322a
    /* renamed from: c */
    public void mo17741c() {
        m17735g();
    }

    @Override // com.google.android.gms.cast.framework.media.C4298c.AbstractC4322a
    /* renamed from: d */
    public void mo17739d() {
        m17735g();
    }

    @Override // com.google.android.gms.cast.framework.media.C4298c.AbstractC4322a
    /* renamed from: e */
    public void mo17737e() {
    }

    /* renamed from: f */
    public MediaSessionCompat.Token m17736f() {
        if (this.f21482g == null) {
            return null;
        }
        return this.f21482g.getSessionToken();
    }
}
