.class public Lcom/google/android/gms/internal/afq;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/cast/framework/media/c$a;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/google/android/gms/cast/framework/CastOptions;

.field private final c:Lcom/google/android/gms/internal/afm;

.field private final d:Landroid/content/ComponentName;

.field private e:Lcom/google/android/gms/cast/framework/media/c;

.field private f:Lcom/google/android/gms/cast/CastDevice;

.field private g:Landroid/support/v4/media/session/MediaSessionCompat;

.field private h:Landroid/support/v4/media/session/MediaSessionCompat$Callback;

.field private i:Lcom/google/android/gms/internal/afn;

.field private j:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/cast/framework/CastOptions;Lcom/google/android/gms/internal/afm;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/afq;->a:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/afq;->b:Lcom/google/android/gms/cast/framework/CastOptions;

    iput-object p3, p0, Lcom/google/android/gms/internal/afq;->c:Lcom/google/android/gms/internal/afm;

    iget-object v0, p0, Lcom/google/android/gms/internal/afq;->b:Lcom/google/android/gms/cast/framework/CastOptions;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/CastOptions;->g()Lcom/google/android/gms/cast/framework/media/CastMediaOptions;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/afq;->b:Lcom/google/android/gms/cast/framework/CastOptions;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/CastOptions;->g()Lcom/google/android/gms/cast/framework/media/CastMediaOptions;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/CastMediaOptions;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Landroid/content/ComponentName;

    iget-object v1, p0, Lcom/google/android/gms/internal/afq;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/internal/afq;->b:Lcom/google/android/gms/cast/framework/CastOptions;

    invoke-virtual {v2}, Lcom/google/android/gms/cast/framework/CastOptions;->g()Lcom/google/android/gms/cast/framework/media/CastMediaOptions;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/cast/framework/media/CastMediaOptions;->d()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/afq;->d:Landroid/content/ComponentName;

    :goto_0
    return-void

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/afq;->d:Landroid/content/ComponentName;

    goto :goto_0
.end method

.method private a(Lcom/google/android/gms/cast/MediaMetadata;)Landroid/net/Uri;
    .locals 3

    const/4 v1, 0x0

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/afq;->b:Lcom/google/android/gms/cast/framework/CastOptions;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/CastOptions;->g()Lcom/google/android/gms/cast/framework/media/CastMediaOptions;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/CastMediaOptions;->e()Lcom/google/android/gms/cast/framework/media/a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/afq;->b:Lcom/google/android/gms/cast/framework/CastOptions;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/CastOptions;->g()Lcom/google/android/gms/cast/framework/media/CastMediaOptions;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/CastMediaOptions;->e()Lcom/google/android/gms/cast/framework/media/a;

    move-result-object v0

    invoke-virtual {v0, p1, v2}, Lcom/google/android/gms/cast/framework/media/a;->a(Lcom/google/android/gms/cast/MediaMetadata;I)Lcom/google/android/gms/common/images/WebImage;

    move-result-object v0

    :goto_0
    if-nez v0, :cond_2

    :goto_1
    return-object v1

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/cast/MediaMetadata;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/cast/MediaMetadata;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/images/WebImage;

    goto :goto_0

    :cond_1
    move-object v0, v1

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Lcom/google/android/gms/common/images/WebImage;->b()Landroid/net/Uri;

    move-result-object v1

    goto :goto_1
.end method

.method static synthetic a(Landroid/support/v4/media/MediaMetadataCompat$Builder;Landroid/graphics/Bitmap;)Landroid/support/v4/media/MediaMetadataCompat$Builder;
    .locals 1

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/afq;->b(Landroid/support/v4/media/MediaMetadataCompat$Builder;Landroid/graphics/Bitmap;)Landroid/support/v4/media/MediaMetadataCompat$Builder;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/afq;)Lcom/google/android/gms/cast/framework/media/c;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/afq;->e:Lcom/google/android/gms/cast/framework/media/c;

    return-object v0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/afq;Lcom/google/android/gms/internal/afn;)Lcom/google/android/gms/internal/afn;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/afq;->i:Lcom/google/android/gms/internal/afn;

    return-object p1
.end method

.method private a(ILcom/google/android/gms/cast/MediaInfo;)V
    .locals 6

    const-wide/16 v4, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    if-nez p1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/afq;->g:Landroid/support/v4/media/session/MediaSessionCompat;

    new-instance v1, Landroid/support/v4/media/session/PlaybackStateCompat$Builder;

    invoke-direct {v1}, Landroid/support/v4/media/session/PlaybackStateCompat$Builder;-><init>()V

    const/4 v2, 0x0

    invoke-virtual {v1, v2, v4, v5, v3}, Landroid/support/v4/media/session/PlaybackStateCompat$Builder;->setState(IJF)Landroid/support/v4/media/session/PlaybackStateCompat$Builder;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/media/session/PlaybackStateCompat$Builder;->build()Landroid/support/v4/media/session/PlaybackStateCompat;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v4/media/session/MediaSessionCompat;->setPlaybackState(Landroid/support/v4/media/session/PlaybackStateCompat;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/afq;->g:Landroid/support/v4/media/session/MediaSessionCompat;

    new-instance v1, Landroid/support/v4/media/MediaMetadataCompat$Builder;

    invoke-direct {v1}, Landroid/support/v4/media/MediaMetadataCompat$Builder;-><init>()V

    invoke-virtual {v1}, Landroid/support/v4/media/MediaMetadataCompat$Builder;->build()Landroid/support/v4/media/MediaMetadataCompat;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v4/media/session/MediaSessionCompat;->setMetadata(Landroid/support/v4/media/MediaMetadataCompat;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/afq;->g:Landroid/support/v4/media/session/MediaSessionCompat;

    new-instance v1, Landroid/support/v4/media/session/PlaybackStateCompat$Builder;

    invoke-direct {v1}, Landroid/support/v4/media/session/PlaybackStateCompat$Builder;-><init>()V

    invoke-virtual {v1, p1, v4, v5, v3}, Landroid/support/v4/media/session/PlaybackStateCompat$Builder;->setState(IJF)Landroid/support/v4/media/session/PlaybackStateCompat$Builder;

    move-result-object v1

    const-wide/16 v2, 0x200

    invoke-virtual {v1, v2, v3}, Landroid/support/v4/media/session/PlaybackStateCompat$Builder;->setActions(J)Landroid/support/v4/media/session/PlaybackStateCompat$Builder;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/media/session/PlaybackStateCompat$Builder;->build()Landroid/support/v4/media/session/PlaybackStateCompat;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v4/media/session/MediaSessionCompat;->setPlaybackState(Landroid/support/v4/media/session/PlaybackStateCompat;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/afq;->g:Landroid/support/v4/media/session/MediaSessionCompat;

    invoke-direct {p0}, Lcom/google/android/gms/internal/afq;->m()Landroid/app/PendingIntent;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v4/media/session/MediaSessionCompat;->setSessionActivity(Landroid/app/PendingIntent;)V

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/afq;->a(Lcom/google/android/gms/cast/MediaInfo;)V

    goto :goto_0
.end method

.method private a(Lcom/google/android/gms/cast/MediaInfo;)V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/internal/afq;->i:Lcom/google/android/gms/internal/afn;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/afq;->i:Lcom/google/android/gms/internal/afn;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/afn;->cancel(Z)Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/afq;->i:Lcom/google/android/gms/internal/afn;

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/cast/MediaInfo;->e()Lcom/google/android/gms/cast/MediaMetadata;

    move-result-object v0

    invoke-direct {p0}, Lcom/google/android/gms/internal/afq;->h()Landroid/support/v4/media/MediaMetadataCompat$Builder;

    move-result-object v1

    const-string v2, "android.media.metadata.TITLE"

    const-string v3, "com.google.android.gms.cast.metadata.TITLE"

    invoke-virtual {v0, v3}, Lcom/google/android/gms/cast/MediaMetadata;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/support/v4/media/MediaMetadataCompat$Builder;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/support/v4/media/MediaMetadataCompat$Builder;

    move-result-object v1

    const-string v2, "android.media.metadata.DISPLAY_TITLE"

    const-string v3, "com.google.android.gms.cast.metadata.TITLE"

    invoke-virtual {v0, v3}, Lcom/google/android/gms/cast/MediaMetadata;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/support/v4/media/MediaMetadataCompat$Builder;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/support/v4/media/MediaMetadataCompat$Builder;

    move-result-object v1

    const-string v2, "android.media.metadata.DISPLAY_SUBTITLE"

    const-string v3, "com.google.android.gms.cast.metadata.SUBTITLE"

    invoke-virtual {v0, v3}, Lcom/google/android/gms/cast/MediaMetadata;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/support/v4/media/MediaMetadataCompat$Builder;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/support/v4/media/MediaMetadataCompat$Builder;

    move-result-object v1

    const-string v2, "android.media.metadata.DURATION"

    invoke-virtual {p1}, Lcom/google/android/gms/cast/MediaInfo;->f()J

    move-result-wide v4

    invoke-virtual {v1, v2, v4, v5}, Landroid/support/v4/media/MediaMetadataCompat$Builder;->putLong(Ljava/lang/String;J)Landroid/support/v4/media/MediaMetadataCompat$Builder;

    move-result-object v1

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/afq;->a(Lcom/google/android/gms/cast/MediaMetadata;)Landroid/net/Uri;

    move-result-object v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/afq;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x12

    if-le v0, v3, :cond_1

    sget v0, Lcom/google/android/gms/R$drawable;->cast_album_art_placeholder_large:I

    :goto_0
    invoke-static {v2, v0}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/internal/afq;->g:Landroid/support/v4/media/session/MediaSessionCompat;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/afq;->b(Landroid/support/v4/media/MediaMetadataCompat$Builder;Landroid/graphics/Bitmap;)Landroid/support/v4/media/MediaMetadataCompat$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/media/MediaMetadataCompat$Builder;->build()Landroid/support/v4/media/MediaMetadataCompat;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/support/v4/media/session/MediaSessionCompat;->setMetadata(Landroid/support/v4/media/MediaMetadataCompat;)V

    :goto_1
    return-void

    :cond_1
    sget v0, Lcom/google/android/gms/R$drawable;->cast_album_art_placeholder:I

    goto :goto_0

    :cond_2
    iget-object v2, p0, Lcom/google/android/gms/internal/afq;->g:Landroid/support/v4/media/session/MediaSessionCompat;

    invoke-virtual {v1}, Landroid/support/v4/media/MediaMetadataCompat$Builder;->build()Landroid/support/v4/media/MediaMetadataCompat;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/support/v4/media/session/MediaSessionCompat;->setMetadata(Landroid/support/v4/media/MediaMetadataCompat;)V

    new-instance v1, Lcom/google/android/gms/internal/afq$2;

    iget-object v2, p0, Lcom/google/android/gms/internal/afq;->a:Landroid/content/Context;

    invoke-direct {v1, p0, v2}, Lcom/google/android/gms/internal/afq$2;-><init>(Lcom/google/android/gms/internal/afq;Landroid/content/Context;)V

    iput-object v1, p0, Lcom/google/android/gms/internal/afq;->i:Lcom/google/android/gms/internal/afn;

    iget-object v1, p0, Lcom/google/android/gms/internal/afq;->i:Lcom/google/android/gms/internal/afn;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/afn;->a(Landroid/net/Uri;)Landroid/os/AsyncTask;

    goto :goto_1
.end method

.method private static b(Landroid/support/v4/media/MediaMetadataCompat$Builder;Landroid/graphics/Bitmap;)Landroid/support/v4/media/MediaMetadataCompat$Builder;
    .locals 2

    const-string v0, "android.media.metadata.ALBUM_ART"

    invoke-virtual {p0, v0, p1}, Landroid/support/v4/media/MediaMetadataCompat$Builder;->putBitmap(Ljava/lang/String;Landroid/graphics/Bitmap;)Landroid/support/v4/media/MediaMetadataCompat$Builder;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-ge v0, v1, :cond_0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    const-string v1, "android.media.metadata.DISPLAY_ICON"

    invoke-virtual {p0, v1, v0}, Landroid/support/v4/media/MediaMetadataCompat$Builder;->putBitmap(Ljava/lang/String;Landroid/graphics/Bitmap;)Landroid/support/v4/media/MediaMetadataCompat$Builder;

    :cond_0
    return-object p0
.end method

.method static synthetic b(Lcom/google/android/gms/internal/afq;)Lcom/google/android/gms/internal/afn;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/afq;->i:Lcom/google/android/gms/internal/afn;

    return-object v0
.end method

.method static synthetic c(Lcom/google/android/gms/internal/afq;)Landroid/support/v4/media/MediaMetadataCompat$Builder;
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/afq;->h()Landroid/support/v4/media/MediaMetadataCompat$Builder;

    move-result-object v0

    return-object v0
.end method

.method static synthetic d(Lcom/google/android/gms/internal/afq;)Landroid/support/v4/media/session/MediaSessionCompat;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/afq;->g:Landroid/support/v4/media/session/MediaSessionCompat;

    return-object v0
.end method

.method private g()V
    .locals 10

    const/4 v3, 0x6

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/afq;->e:Lcom/google/android/gms/cast/framework/media/c;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c;->g()Lcom/google/android/gms/cast/MediaStatus;

    move-result-object v7

    if-nez v7, :cond_2

    const/4 v6, 0x0

    :goto_0
    if-nez v6, :cond_3

    const/4 v0, 0x0

    :goto_1
    if-eqz v7, :cond_0

    if-eqz v6, :cond_0

    if-nez v0, :cond_4

    :cond_0
    move v0, v2

    move-object v1, v6

    :goto_2
    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/afq;->a(ILcom/google/android/gms/cast/MediaInfo;)V

    if-nez v0, :cond_a

    invoke-direct {p0}, Lcom/google/android/gms/internal/afq;->j()V

    invoke-direct {p0}, Lcom/google/android/gms/internal/afq;->l()V

    :cond_1
    :goto_3
    return-void

    :cond_2
    invoke-virtual {v7}, Lcom/google/android/gms/cast/MediaStatus;->f()Lcom/google/android/gms/cast/MediaInfo;

    move-result-object v6

    goto :goto_0

    :cond_3
    invoke-virtual {v6}, Lcom/google/android/gms/cast/MediaInfo;->e()Lcom/google/android/gms/cast/MediaMetadata;

    move-result-object v0

    goto :goto_1

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/afq;->e:Lcom/google/android/gms/cast/framework/media/c;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c;->i()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    move v0, v2

    move-object v1, v6

    goto :goto_2

    :pswitch_0
    move v0, v3

    move-object v1, v6

    goto :goto_2

    :pswitch_1
    move v0, v4

    move-object v1, v6

    goto :goto_2

    :pswitch_2
    move v0, v5

    move-object v1, v6

    goto :goto_2

    :pswitch_3
    invoke-virtual {v7}, Lcom/google/android/gms/cast/MediaStatus;->d()I

    move-result v8

    iget-object v0, p0, Lcom/google/android/gms/internal/afq;->e:Lcom/google/android/gms/cast/framework/media/c;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c;->k()Z

    move-result v0

    if-eqz v0, :cond_6

    if-ne v8, v5, :cond_6

    move v0, v1

    :goto_4
    invoke-virtual {v7}, Lcom/google/android/gms/cast/MediaStatus;->m()I

    move-result v9

    if-eqz v9, :cond_7

    if-eq v8, v1, :cond_5

    if-ne v8, v4, :cond_7

    :cond_5
    :goto_5
    if-eqz v0, :cond_8

    move v2, v1

    move v0, v5

    move-object v1, v6

    goto :goto_2

    :cond_6
    move v0, v2

    goto :goto_4

    :cond_7
    move v1, v2

    goto :goto_5

    :cond_8
    if-eqz v1, :cond_9

    invoke-virtual {v7, v9}, Lcom/google/android/gms/cast/MediaStatus;->a(I)Lcom/google/android/gms/cast/MediaQueueItem;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/MediaQueueItem;->b()Lcom/google/android/gms/cast/MediaInfo;

    move-result-object v0

    move v2, v1

    move-object v1, v0

    move v0, v3

    goto :goto_2

    :cond_9
    move v0, v2

    move v2, v1

    move-object v1, v6

    goto :goto_2

    :cond_a
    invoke-direct {p0}, Lcom/google/android/gms/internal/afq;->i()V

    if-nez v2, :cond_1

    invoke-direct {p0}, Lcom/google/android/gms/internal/afq;->k()V

    goto :goto_3

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method

.method private h()Landroid/support/v4/media/MediaMetadataCompat$Builder;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/afq;->g:Landroid/support/v4/media/session/MediaSessionCompat;

    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaSessionCompat;->getController()Landroid/support/v4/media/session/MediaControllerCompat;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaControllerCompat;->getMetadata()Landroid/support/v4/media/MediaMetadataCompat;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance v0, Landroid/support/v4/media/MediaMetadataCompat$Builder;

    invoke-direct {v0}, Landroid/support/v4/media/MediaMetadataCompat$Builder;-><init>()V

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Landroid/support/v4/media/MediaMetadataCompat$Builder;

    invoke-direct {v0, v1}, Landroid/support/v4/media/MediaMetadataCompat$Builder;-><init>(Landroid/support/v4/media/MediaMetadataCompat;)V

    goto :goto_0
.end method

.method private i()V
    .locals 6

    const/4 v2, 0x0

    const/4 v1, 0x1

    iget-object v0, p0, Lcom/google/android/gms/internal/afq;->b:Lcom/google/android/gms/cast/framework/CastOptions;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/CastOptions;->g()Lcom/google/android/gms/cast/framework/media/CastMediaOptions;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/CastMediaOptions;->c()Lcom/google/android/gms/cast/framework/media/NotificationOptions;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/afq;->e:Lcom/google/android/gms/cast/framework/media/c;

    if-eqz v0, :cond_0

    new-instance v3, Landroid/content/Intent;

    iget-object v0, p0, Lcom/google/android/gms/internal/afq;->a:Landroid/content/Context;

    const-class v4, Lcom/google/android/gms/cast/framework/media/MediaNotificationService;

    invoke-direct {v3, v0, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/afq;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "com.google.android.gms.cast.framework.action.UPDATE_NOTIFICATION"

    invoke-virtual {v3, v0}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string v0, "extra_media_info"

    iget-object v4, p0, Lcom/google/android/gms/internal/afq;->e:Lcom/google/android/gms/cast/framework/media/c;

    invoke-virtual {v4}, Lcom/google/android/gms/cast/framework/media/c;->h()Lcom/google/android/gms/cast/MediaInfo;

    move-result-object v4

    invoke-virtual {v3, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string v0, "extra_remote_media_client_player_state"

    iget-object v4, p0, Lcom/google/android/gms/internal/afq;->e:Lcom/google/android/gms/cast/framework/media/c;

    invoke-virtual {v4}, Lcom/google/android/gms/cast/framework/media/c;->i()I

    move-result v4

    invoke-virtual {v3, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    const-string v0, "extra_cast_device"

    iget-object v4, p0, Lcom/google/android/gms/internal/afq;->f:Lcom/google/android/gms/cast/CastDevice;

    invoke-virtual {v3, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string v0, "extra_media_session_token"

    invoke-virtual {p0}, Lcom/google/android/gms/internal/afq;->f()Landroid/support/v4/media/session/MediaSessionCompat$Token;

    move-result-object v4

    invoke-virtual {v3, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    iget-object v0, p0, Lcom/google/android/gms/internal/afq;->e:Lcom/google/android/gms/cast/framework/media/c;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c;->g()Lcom/google/android/gms/cast/MediaStatus;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Lcom/google/android/gms/cast/MediaStatus;->o()I

    move-result v0

    packed-switch v0, :pswitch_data_0

    invoke-virtual {v4}, Lcom/google/android/gms/cast/MediaStatus;->l()I

    move-result v0

    invoke-virtual {v4, v0}, Lcom/google/android/gms/cast/MediaStatus;->e(I)Ljava/lang/Integer;

    move-result-object v5

    if-eqz v5, :cond_5

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-lez v0, :cond_4

    move v0, v1

    :goto_1
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-virtual {v4}, Lcom/google/android/gms/cast/MediaStatus;->q()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    if-ge v5, v4, :cond_3

    :goto_2
    const-string v2, "extra_can_skip_next"

    invoke-virtual {v3, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const-string v1, "extra_can_skip_prev"

    invoke-virtual {v3, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/afq;->a:Landroid/content/Context;

    invoke-virtual {v0, v3}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    goto :goto_0

    :pswitch_0
    move v0, v1

    goto :goto_2

    :cond_3
    move v1, v2

    goto :goto_2

    :cond_4
    move v0, v2

    goto :goto_1

    :cond_5
    move v0, v2

    move v1, v2

    goto :goto_2

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private j()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/afq;->b:Lcom/google/android/gms/cast/framework/CastOptions;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/CastOptions;->g()Lcom/google/android/gms/cast/framework/media/CastMediaOptions;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/CastMediaOptions;->c()Lcom/google/android/gms/cast/framework/media/NotificationOptions;

    move-result-object v0

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/google/android/gms/internal/afq;->a:Landroid/content/Context;

    const-class v2, Lcom/google/android/gms/cast/framework/media/MediaNotificationService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/afq;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "com.google.android.gms.cast.framework.action.UPDATE_NOTIFICATION"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    iget-object v1, p0, Lcom/google/android/gms/internal/afq;->a:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z

    goto :goto_0
.end method

.method private k()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/afq;->b:Lcom/google/android/gms/cast/framework/CastOptions;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/CastOptions;->h()Z

    move-result v0

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/google/android/gms/internal/afq;->a:Landroid/content/Context;

    const-class v2, Lcom/google/android/gms/cast/framework/ReconnectionService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/afq;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    iget-object v1, p0, Lcom/google/android/gms/internal/afq;->a:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    goto :goto_0
.end method

.method private l()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/afq;->b:Lcom/google/android/gms/cast/framework/CastOptions;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/CastOptions;->h()Z

    move-result v0

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/google/android/gms/internal/afq;->a:Landroid/content/Context;

    const-class v2, Lcom/google/android/gms/cast/framework/ReconnectionService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/afq;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    iget-object v1, p0, Lcom/google/android/gms/internal/afq;->a:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z

    goto :goto_0
.end method

.method private m()Landroid/app/PendingIntent;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/afq;->d:Landroid/content/ComponentName;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/afq;->d:Landroid/content/ComponentName;

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    iget-object v1, p0, Lcom/google/android/gms/internal/afq;->a:Landroid/content/Context;

    const/4 v2, 0x0

    const/high16 v3, 0x8000000

    invoke-static {v1, v2, v0, v3}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public a()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/afq;->g()V

    return-void
.end method

.method public a(I)V
    .locals 4

    const/4 v3, 0x0

    const/4 v2, 0x0

    iget-boolean v0, p0, Lcom/google/android/gms/internal/afq;->j:Z

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iput-boolean v3, p0, Lcom/google/android/gms/internal/afq;->j:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/afq;->e:Lcom/google/android/gms/cast/framework/media/c;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/afq;->e:Lcom/google/android/gms/cast/framework/media/c;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/cast/framework/media/c;->b(Lcom/google/android/gms/cast/framework/media/c$a;)V

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/afq;->a:Landroid/content/Context;

    const-string v1, "audio"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/AudioManager;

    invoke-virtual {v0, v2}, Landroid/media/AudioManager;->abandonAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;)I

    iget-object v0, p0, Lcom/google/android/gms/internal/afq;->c:Lcom/google/android/gms/internal/afm;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/afm;->a(Landroid/support/v4/media/session/MediaSessionCompat;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/afq;->i:Lcom/google/android/gms/internal/afn;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/afq;->i:Lcom/google/android/gms/internal/afn;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/afn;->cancel(Z)Z

    iput-object v2, p0, Lcom/google/android/gms/internal/afq;->i:Lcom/google/android/gms/internal/afn;

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/afq;->g:Landroid/support/v4/media/session/MediaSessionCompat;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/internal/afq;->g:Landroid/support/v4/media/session/MediaSessionCompat;

    invoke-virtual {v0, v2}, Landroid/support/v4/media/session/MediaSessionCompat;->setSessionActivity(Landroid/app/PendingIntent;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/afq;->g:Landroid/support/v4/media/session/MediaSessionCompat;

    invoke-virtual {v0, v2}, Landroid/support/v4/media/session/MediaSessionCompat;->setCallback(Landroid/support/v4/media/session/MediaSessionCompat$Callback;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/afq;->g:Landroid/support/v4/media/session/MediaSessionCompat;

    new-instance v1, Landroid/support/v4/media/MediaMetadataCompat$Builder;

    invoke-direct {v1}, Landroid/support/v4/media/MediaMetadataCompat$Builder;-><init>()V

    invoke-virtual {v1}, Landroid/support/v4/media/MediaMetadataCompat$Builder;->build()Landroid/support/v4/media/MediaMetadataCompat;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v4/media/session/MediaSessionCompat;->setMetadata(Landroid/support/v4/media/MediaMetadataCompat;)V

    invoke-direct {p0, v3, v2}, Lcom/google/android/gms/internal/afq;->a(ILcom/google/android/gms/cast/MediaInfo;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/afq;->g:Landroid/support/v4/media/session/MediaSessionCompat;

    invoke-virtual {v0, v3}, Landroid/support/v4/media/session/MediaSessionCompat;->setActive(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/afq;->g:Landroid/support/v4/media/session/MediaSessionCompat;

    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaSessionCompat;->release()V

    iput-object v2, p0, Lcom/google/android/gms/internal/afq;->g:Landroid/support/v4/media/session/MediaSessionCompat;

    :cond_4
    iput-object v2, p0, Lcom/google/android/gms/internal/afq;->e:Lcom/google/android/gms/cast/framework/media/c;

    iput-object v2, p0, Lcom/google/android/gms/internal/afq;->f:Lcom/google/android/gms/cast/CastDevice;

    iput-object v2, p0, Lcom/google/android/gms/internal/afq;->h:Landroid/support/v4/media/session/MediaSessionCompat$Callback;

    invoke-direct {p0}, Lcom/google/android/gms/internal/afq;->j()V

    if-nez p1, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/afq;->l()V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/cast/framework/media/c;Lcom/google/android/gms/cast/CastDevice;)V
    .locals 9

    const/4 v6, 0x0

    const/4 v5, 0x3

    const/4 v8, 0x1

    const/4 v7, 0x0

    iget-boolean v0, p0, Lcom/google/android/gms/internal/afq;->j:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/afq;->b:Lcom/google/android/gms/cast/framework/CastOptions;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/afq;->b:Lcom/google/android/gms/cast/framework/CastOptions;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/CastOptions;->g()Lcom/google/android/gms/cast/framework/media/CastMediaOptions;

    move-result-object v0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    if-nez p2, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iput-object p1, p0, Lcom/google/android/gms/internal/afq;->e:Lcom/google/android/gms/cast/framework/media/c;

    iget-object v0, p0, Lcom/google/android/gms/internal/afq;->e:Lcom/google/android/gms/cast/framework/media/c;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/cast/framework/media/c;->a(Lcom/google/android/gms/cast/framework/media/c$a;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/afq;->f:Lcom/google/android/gms/cast/CastDevice;

    iget-object v0, p0, Lcom/google/android/gms/internal/afq;->a:Landroid/content/Context;

    const-string v1, "audio"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/AudioManager;

    invoke-virtual {v0, v6, v5, v5}, Landroid/media/AudioManager;->requestAudioFocus(Landroid/media/AudioManager$OnAudioFocusChangeListener;II)I

    new-instance v0, Landroid/content/ComponentName;

    iget-object v1, p0, Lcom/google/android/gms/internal/afq;->a:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/internal/afq;->b:Lcom/google/android/gms/cast/framework/CastOptions;

    invoke-virtual {v2}, Lcom/google/android/gms/cast/framework/CastOptions;->g()Lcom/google/android/gms/cast/framework/media/CastMediaOptions;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/cast/framework/media/CastMediaOptions;->b()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.MEDIA_BUTTON"

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    iget-object v2, p0, Lcom/google/android/gms/internal/afq;->a:Landroid/content/Context;

    invoke-static {v2, v7, v1, v7}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    new-instance v2, Landroid/support/v4/media/session/MediaSessionCompat;

    iget-object v3, p0, Lcom/google/android/gms/internal/afq;->a:Landroid/content/Context;

    const-string v4, "CastMediaSession"

    invoke-direct {v2, v3, v4, v0, v1}, Landroid/support/v4/media/session/MediaSessionCompat;-><init>(Landroid/content/Context;Ljava/lang/String;Landroid/content/ComponentName;Landroid/app/PendingIntent;)V

    iput-object v2, p0, Lcom/google/android/gms/internal/afq;->g:Landroid/support/v4/media/session/MediaSessionCompat;

    iget-object v0, p0, Lcom/google/android/gms/internal/afq;->g:Landroid/support/v4/media/session/MediaSessionCompat;

    invoke-virtual {v0, v5}, Landroid/support/v4/media/session/MediaSessionCompat;->setFlags(I)V

    invoke-direct {p0, v7, v6}, Lcom/google/android/gms/internal/afq;->a(ILcom/google/android/gms/cast/MediaInfo;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/afq;->f:Lcom/google/android/gms/cast/CastDevice;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/afq;->f:Lcom/google/android/gms/cast/CastDevice;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/CastDevice;->e()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/afq;->g:Landroid/support/v4/media/session/MediaSessionCompat;

    new-instance v1, Landroid/support/v4/media/MediaMetadataCompat$Builder;

    invoke-direct {v1}, Landroid/support/v4/media/MediaMetadataCompat$Builder;-><init>()V

    const-string v2, "android.media.metadata.ALBUM_ARTIST"

    iget-object v3, p0, Lcom/google/android/gms/internal/afq;->a:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/google/android/gms/R$string;->cast_casting_to_device:I

    new-array v5, v8, [Ljava/lang/Object;

    iget-object v6, p0, Lcom/google/android/gms/internal/afq;->f:Lcom/google/android/gms/cast/CastDevice;

    invoke-virtual {v6}, Lcom/google/android/gms/cast/CastDevice;->e()Ljava/lang/String;

    move-result-object v6

    aput-object v6, v5, v7

    invoke-virtual {v3, v4, v5}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/support/v4/media/MediaMetadataCompat$Builder;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/support/v4/media/MediaMetadataCompat$Builder;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/media/MediaMetadataCompat$Builder;->build()Landroid/support/v4/media/MediaMetadataCompat;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v4/media/session/MediaSessionCompat;->setMetadata(Landroid/support/v4/media/MediaMetadataCompat;)V

    :cond_2
    new-instance v0, Lcom/google/android/gms/internal/afq$1;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/afq$1;-><init>(Lcom/google/android/gms/internal/afq;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/afq;->h:Landroid/support/v4/media/session/MediaSessionCompat$Callback;

    iget-object v0, p0, Lcom/google/android/gms/internal/afq;->g:Landroid/support/v4/media/session/MediaSessionCompat;

    iget-object v1, p0, Lcom/google/android/gms/internal/afq;->h:Landroid/support/v4/media/session/MediaSessionCompat$Callback;

    invoke-virtual {v0, v1}, Landroid/support/v4/media/session/MediaSessionCompat;->setCallback(Landroid/support/v4/media/session/MediaSessionCompat$Callback;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/afq;->g:Landroid/support/v4/media/session/MediaSessionCompat;

    invoke-virtual {v0, v8}, Landroid/support/v4/media/session/MediaSessionCompat;->setActive(Z)V

    iget-object v0, p0, Lcom/google/android/gms/internal/afq;->c:Lcom/google/android/gms/internal/afm;

    iget-object v1, p0, Lcom/google/android/gms/internal/afq;->g:Landroid/support/v4/media/session/MediaSessionCompat;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/afm;->a(Landroid/support/v4/media/session/MediaSessionCompat;)V

    iput-boolean v8, p0, Lcom/google/android/gms/internal/afq;->j:Z

    invoke-direct {p0}, Lcom/google/android/gms/internal/afq;->g()V

    goto/16 :goto_0
.end method

.method public b()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/afq;->g()V

    return-void
.end method

.method public c()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/afq;->g()V

    return-void
.end method

.method public d()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/afq;->g()V

    return-void
.end method

.method public e()V
    .locals 0

    return-void
.end method

.method public f()Landroid/support/v4/media/session/MediaSessionCompat$Token;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/afq;->g:Landroid/support/v4/media/session/MediaSessionCompat;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/afq;->g:Landroid/support/v4/media/session/MediaSessionCompat;

    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaSessionCompat;->getSessionToken()Landroid/support/v4/media/session/MediaSessionCompat$Token;

    move-result-object v0

    goto :goto_0
.end method
