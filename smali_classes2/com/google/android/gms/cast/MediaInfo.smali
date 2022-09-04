.class public final Lcom/google/android/gms/cast/MediaInfo;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;

# interfaces
.implements Lcom/google/android/gms/common/internal/ReflectedParcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/cast/MediaInfo$a;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/cast/MediaInfo;",
            ">;"
        }
    .end annotation
.end field

.field public static final a:I = 0x0

.field public static final b:I = 0x1

.field public static final c:I = 0x2

.field public static final d:I = -0x1

.field public static final e:J = -0x1L


# instance fields
.field f:Ljava/lang/String;

.field private final g:I

.field private final h:Ljava/lang/String;

.field private i:I

.field private j:Ljava/lang/String;

.field private k:Lcom/google/android/gms/cast/MediaMetadata;

.field private l:J

.field private m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/cast/MediaTrack;",
            ">;"
        }
    .end annotation
.end field

.field private n:Lcom/google/android/gms/cast/TextTrackStyle;

.field private o:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/cast/AdBreakInfo;",
            ">;"
        }
    .end annotation
.end field

.field private p:Lorg/json/JSONObject;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/cast/m;

    invoke-direct {v0}, Lcom/google/android/gms/cast/m;-><init>()V

    sput-object v0, Lcom/google/android/gms/cast/MediaInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILjava/lang/String;ILjava/lang/String;Lcom/google/android/gms/cast/MediaMetadata;JLjava/util/List;Lcom/google/android/gms/cast/TextTrackStyle;Ljava/lang/String;Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/cast/MediaMetadata;",
            "J",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/cast/MediaTrack;",
            ">;",
            "Lcom/google/android/gms/cast/TextTrackStyle;",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/cast/AdBreakInfo;",
            ">;)V"
        }
    .end annotation

    const/4 v2, 0x0

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/cast/MediaInfo;->g:I

    iput-object p2, p0, Lcom/google/android/gms/cast/MediaInfo;->h:Ljava/lang/String;

    iput p3, p0, Lcom/google/android/gms/cast/MediaInfo;->i:I

    iput-object p4, p0, Lcom/google/android/gms/cast/MediaInfo;->j:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/cast/MediaInfo;->k:Lcom/google/android/gms/cast/MediaMetadata;

    iput-wide p6, p0, Lcom/google/android/gms/cast/MediaInfo;->l:J

    iput-object p8, p0, Lcom/google/android/gms/cast/MediaInfo;->m:Ljava/util/List;

    iput-object p9, p0, Lcom/google/android/gms/cast/MediaInfo;->n:Lcom/google/android/gms/cast/TextTrackStyle;

    iput-object p10, p0, Lcom/google/android/gms/cast/MediaInfo;->f:Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/cast/MediaInfo;->f:Ljava/lang/String;

    if-eqz v0, :cond_0

    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    iget-object v1, p0, Lcom/google/android/gms/cast/MediaInfo;->f:Ljava/lang/String;

    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/gms/cast/MediaInfo;->p:Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    iput-object p11, p0, Lcom/google/android/gms/cast/MediaInfo;->o:Ljava/util/List;

    return-void

    :catch_0
    move-exception v0

    iput-object v2, p0, Lcom/google/android/gms/cast/MediaInfo;->p:Lorg/json/JSONObject;

    iput-object v2, p0, Lcom/google/android/gms/cast/MediaInfo;->f:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iput-object v2, p0, Lcom/google/android/gms/cast/MediaInfo;->p:Lorg/json/JSONObject;

    goto :goto_0
.end method

.method constructor <init>(Ljava/lang/String;)V
    .locals 12

    const/4 v4, 0x0

    const/4 v1, 0x1

    const/4 v3, -0x1

    const-wide/16 v6, -0x1

    move-object v0, p0

    move-object v2, p1

    move-object v5, v4

    move-object v8, v4

    move-object v9, v4

    move-object v10, v4

    move-object v11, v4

    invoke-direct/range {v0 .. v11}, Lcom/google/android/gms/cast/MediaInfo;-><init>(ILjava/lang/String;ILjava/lang/String;Lcom/google/android/gms/cast/MediaMetadata;JLjava/util/List;Lcom/google/android/gms/cast/TextTrackStyle;Ljava/lang/String;Ljava/util/List;)V

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "content ID cannot be null or empty"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    return-void
.end method

.method constructor <init>(Lorg/json/JSONObject;)V
    .locals 13

    const-wide/16 v6, -0x1

    const/4 v1, 0x1

    const/4 v12, 0x0

    const/4 v3, -0x1

    const/4 v4, 0x0

    const-string v0, "contentId"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object v0, p0

    move-object v5, v4

    move-object v8, v4

    move-object v9, v4

    move-object v10, v4

    move-object v11, v4

    invoke-direct/range {v0 .. v11}, Lcom/google/android/gms/cast/MediaInfo;-><init>(ILjava/lang/String;ILjava/lang/String;Lcom/google/android/gms/cast/MediaMetadata;JLjava/util/List;Lcom/google/android/gms/cast/TextTrackStyle;Ljava/lang/String;Ljava/util/List;)V

    const-string v0, "streamType"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "NONE"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iput v12, p0, Lcom/google/android/gms/cast/MediaInfo;->i:I

    :goto_0
    const-string v0, "contentType"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/cast/MediaInfo;->j:Ljava/lang/String;

    const-string v0, "metadata"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "metadata"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    const-string v1, "metadataType"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    new-instance v2, Lcom/google/android/gms/cast/MediaMetadata;

    invoke-direct {v2, v1}, Lcom/google/android/gms/cast/MediaMetadata;-><init>(I)V

    iput-object v2, p0, Lcom/google/android/gms/cast/MediaInfo;->k:Lcom/google/android/gms/cast/MediaMetadata;

    iget-object v1, p0, Lcom/google/android/gms/cast/MediaInfo;->k:Lcom/google/android/gms/cast/MediaMetadata;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/cast/MediaMetadata;->a(Lorg/json/JSONObject;)V

    :cond_0
    iput-wide v6, p0, Lcom/google/android/gms/cast/MediaInfo;->l:J

    const-string v0, "duration"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "duration"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->isNull(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "duration"

    const-wide/16 v2, 0x0

    invoke-virtual {p1, v0, v2, v3}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-static {v0, v1}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-static {v0, v1}, Lcom/google/android/gms/cast/internal/f;->a(D)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/cast/MediaInfo;->l:J

    :cond_1
    const-string v0, "tracks"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/cast/MediaInfo;->m:Ljava/util/List;

    const-string v0, "tracks"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    move v0, v12

    :goto_1
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v0, v2, :cond_6

    invoke-virtual {v1, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/cast/MediaTrack;

    invoke-direct {v3, v2}, Lcom/google/android/gms/cast/MediaTrack;-><init>(Lorg/json/JSONObject;)V

    iget-object v2, p0, Lcom/google/android/gms/cast/MediaInfo;->m:Ljava/util/List;

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    const-string v2, "BUFFERED"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iput v1, p0, Lcom/google/android/gms/cast/MediaInfo;->i:I

    goto/16 :goto_0

    :cond_3
    const-string v1, "LIVE"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/4 v0, 0x2

    iput v0, p0, Lcom/google/android/gms/cast/MediaInfo;->i:I

    goto/16 :goto_0

    :cond_4
    iput v3, p0, Lcom/google/android/gms/cast/MediaInfo;->i:I

    goto/16 :goto_0

    :cond_5
    iput-object v4, p0, Lcom/google/android/gms/cast/MediaInfo;->m:Ljava/util/List;

    :cond_6
    const-string v0, "textTrackStyle"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_7

    const-string v0, "textTrackStyle"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/cast/TextTrackStyle;

    invoke-direct {v1}, Lcom/google/android/gms/cast/TextTrackStyle;-><init>()V

    invoke-virtual {v1, v0}, Lcom/google/android/gms/cast/TextTrackStyle;->b(Lorg/json/JSONObject;)V

    iput-object v1, p0, Lcom/google/android/gms/cast/MediaInfo;->n:Lcom/google/android/gms/cast/TextTrackStyle;

    :goto_2
    const-string v0, "customData"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/cast/MediaInfo;->p:Lorg/json/JSONObject;

    return-void

    :cond_7
    iput-object v4, p0, Lcom/google/android/gms/cast/MediaInfo;->n:Lcom/google/android/gms/cast/TextTrackStyle;

    goto :goto_2
.end method


# virtual methods
.method a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/MediaInfo;->g:I

    return v0
.end method

.method a(I)V
    .locals 2

    const/4 v0, -0x1

    if-lt p1, v0, :cond_0

    const/4 v0, 0x2

    if-le p1, v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "invalid stream type"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iput p1, p0, Lcom/google/android/gms/cast/MediaInfo;->i:I

    return-void
.end method

.method a(J)V
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-gez v0, :cond_0

    const-wide/16 v0, -0x1

    cmp-long v0, p1, v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid stream duration"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iput-wide p1, p0, Lcom/google/android/gms/cast/MediaInfo;->l:J

    return-void
.end method

.method a(Lcom/google/android/gms/cast/MediaMetadata;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/MediaInfo;->k:Lcom/google/android/gms/cast/MediaMetadata;

    return-void
.end method

.method public a(Lcom/google/android/gms/cast/TextTrackStyle;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/MediaInfo;->n:Lcom/google/android/gms/cast/TextTrackStyle;

    return-void
.end method

.method a(Ljava/lang/String;)V
    .locals 2

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "content type cannot be null or empty"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/cast/MediaInfo;->j:Ljava/lang/String;

    return-void
.end method

.method a(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/cast/MediaTrack;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/cast/MediaInfo;->m:Ljava/util/List;

    return-void
.end method

.method a(Lorg/json/JSONObject;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/MediaInfo;->p:Lorg/json/JSONObject;

    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/MediaInfo;->h:Ljava/lang/String;

    return-object v0
.end method

.method public b(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/cast/AdBreakInfo;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/cast/MediaInfo;->o:Ljava/util/List;

    return-void
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/MediaInfo;->i:I

    return v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/MediaInfo;->j:Ljava/lang/String;

    return-object v0
.end method

.method public e()Lcom/google/android/gms/cast/MediaMetadata;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/MediaInfo;->k:Lcom/google/android/gms/cast/MediaMetadata;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 8

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne p0, p1, :cond_1

    move v2, v1

    :cond_0
    :goto_0
    return v2

    :cond_1
    instance-of v0, p1, Lcom/google/android/gms/cast/MediaInfo;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/google/android/gms/cast/MediaInfo;

    iget-object v0, p0, Lcom/google/android/gms/cast/MediaInfo;->p:Lorg/json/JSONObject;

    if-nez v0, :cond_3

    move v0, v1

    :goto_1
    iget-object v3, p1, Lcom/google/android/gms/cast/MediaInfo;->p:Lorg/json/JSONObject;

    if-nez v3, :cond_4

    move v3, v1

    :goto_2
    if-ne v0, v3, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/MediaInfo;->p:Lorg/json/JSONObject;

    if-eqz v0, :cond_2

    iget-object v0, p1, Lcom/google/android/gms/cast/MediaInfo;->p:Lorg/json/JSONObject;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/cast/MediaInfo;->p:Lorg/json/JSONObject;

    iget-object v3, p1, Lcom/google/android/gms/cast/MediaInfo;->p:Lorg/json/JSONObject;

    invoke-static {v0, v3}, Lcom/google/android/gms/common/util/p;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/cast/MediaInfo;->h:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/cast/MediaInfo;->h:Ljava/lang/String;

    invoke-static {v0, v3}, Lcom/google/android/gms/cast/internal/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget v0, p0, Lcom/google/android/gms/cast/MediaInfo;->i:I

    iget v3, p1, Lcom/google/android/gms/cast/MediaInfo;->i:I

    if-ne v0, v3, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/cast/MediaInfo;->j:Ljava/lang/String;

    iget-object v3, p1, Lcom/google/android/gms/cast/MediaInfo;->j:Ljava/lang/String;

    invoke-static {v0, v3}, Lcom/google/android/gms/cast/internal/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/cast/MediaInfo;->k:Lcom/google/android/gms/cast/MediaMetadata;

    iget-object v3, p1, Lcom/google/android/gms/cast/MediaInfo;->k:Lcom/google/android/gms/cast/MediaMetadata;

    invoke-static {v0, v3}, Lcom/google/android/gms/cast/internal/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-wide v4, p0, Lcom/google/android/gms/cast/MediaInfo;->l:J

    iget-wide v6, p1, Lcom/google/android/gms/cast/MediaInfo;->l:J

    cmp-long v0, v4, v6

    if-nez v0, :cond_5

    :goto_3
    move v2, v1

    goto :goto_0

    :cond_3
    move v0, v2

    goto :goto_1

    :cond_4
    move v3, v2

    goto :goto_2

    :cond_5
    move v1, v2

    goto :goto_3
.end method

.method public f()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/cast/MediaInfo;->l:J

    return-wide v0
.end method

.method public g()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/cast/MediaTrack;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/cast/MediaInfo;->m:Ljava/util/List;

    return-object v0
.end method

.method public h()Lcom/google/android/gms/cast/TextTrackStyle;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/MediaInfo;->n:Lcom/google/android/gms/cast/TextTrackStyle;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    const/4 v0, 0x6

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/android/gms/cast/MediaInfo;->h:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget v2, p0, Lcom/google/android/gms/cast/MediaInfo;->i:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/google/android/gms/cast/MediaInfo;->j:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/google/android/gms/cast/MediaInfo;->k:Lcom/google/android/gms/cast/MediaMetadata;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    iget-wide v2, p0, Lcom/google/android/gms/cast/MediaInfo;->l:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/google/android/gms/cast/MediaInfo;->p:Lorg/json/JSONObject;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/c;->a([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public i()Lorg/json/JSONObject;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/MediaInfo;->p:Lorg/json/JSONObject;

    return-object v0
.end method

.method public j()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/cast/AdBreakInfo;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/cast/MediaInfo;->o:Ljava/util/List;

    return-object v0
.end method

.method k()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/cast/MediaInfo;->h:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "content ID cannot be null or empty"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/cast/MediaInfo;->j:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "content type cannot be null or empty"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget v0, p0, Lcom/google/android/gms/cast/MediaInfo;->i:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_2

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "a valid stream type must be specified"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    return-void
.end method

.method public l()Lorg/json/JSONObject;
    .locals 6

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v0, "contentId"

    iget-object v2, p0, Lcom/google/android/gms/cast/MediaInfo;->h:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget v0, p0, Lcom/google/android/gms/cast/MediaInfo;->i:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "NONE"

    :goto_0
    const-string v2, "streamType"

    invoke-virtual {v1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v0, p0, Lcom/google/android/gms/cast/MediaInfo;->j:Ljava/lang/String;

    if-eqz v0, :cond_0

    const-string v0, "contentType"

    iget-object v2, p0, Lcom/google/android/gms/cast/MediaInfo;->j:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/cast/MediaInfo;->k:Lcom/google/android/gms/cast/MediaMetadata;

    if-eqz v0, :cond_1

    const-string v0, "metadata"

    iget-object v2, p0, Lcom/google/android/gms/cast/MediaInfo;->k:Lcom/google/android/gms/cast/MediaMetadata;

    invoke-virtual {v2}, Lcom/google/android/gms/cast/MediaMetadata;->e()Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_1
    iget-wide v2, p0, Lcom/google/android/gms/cast/MediaInfo;->l:J

    const-wide/16 v4, -0x1

    cmp-long v0, v2, v4

    if-gtz v0, :cond_3

    const-string v0, "duration"

    sget-object v2, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :goto_1
    iget-object v0, p0, Lcom/google/android/gms/cast/MediaInfo;->m:Ljava/util/List;

    if-eqz v0, :cond_5

    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/cast/MediaInfo;->m:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/MediaTrack;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/MediaTrack;->j()Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {v2, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_2

    :catch_0
    move-exception v0

    :cond_2
    :goto_3
    return-object v1

    :pswitch_0
    const-string v0, "BUFFERED"

    goto :goto_0

    :pswitch_1
    const-string v0, "LIVE"

    goto :goto_0

    :cond_3
    const-string v0, "duration"

    iget-wide v2, p0, Lcom/google/android/gms/cast/MediaInfo;->l:J

    invoke-static {v2, v3}, Lcom/google/android/gms/cast/internal/f;->a(J)D

    move-result-wide v2

    invoke-virtual {v1, v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    goto :goto_1

    :cond_4
    const-string v0, "tracks"

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/cast/MediaInfo;->n:Lcom/google/android/gms/cast/TextTrackStyle;

    if-eqz v0, :cond_6

    const-string v0, "textTrackStyle"

    iget-object v2, p0, Lcom/google/android/gms/cast/MediaInfo;->n:Lcom/google/android/gms/cast/TextTrackStyle;

    invoke-virtual {v2}, Lcom/google/android/gms/cast/TextTrackStyle;->n()Lorg/json/JSONObject;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/cast/MediaInfo;->p:Lorg/json/JSONObject;

    if-eqz v0, :cond_2

    const-string v0, "customData"

    iget-object v2, p0, Lcom/google/android/gms/cast/MediaInfo;->p:Lorg/json/JSONObject;

    invoke-virtual {v1, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/MediaInfo;->p:Lorg/json/JSONObject;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lcom/google/android/gms/cast/MediaInfo;->f:Ljava/lang/String;

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/cast/m;->a(Lcom/google/android/gms/cast/MediaInfo;Landroid/os/Parcel;I)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/cast/MediaInfo;->p:Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method
