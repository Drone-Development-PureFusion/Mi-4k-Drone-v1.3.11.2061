.class public final Lcom/google/android/gms/cast/MediaStatus;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/cast/MediaStatus;",
            ">;"
        }
    .end annotation
.end field

.field public static final a:J = 0x1L

.field public static final b:J = 0x2L

.field public static final c:J = 0x4L

.field public static final d:J = 0x8L

.field public static final e:J = 0x10L

.field public static final f:J = 0x20L

.field public static final g:I = 0x0

.field public static final h:I = 0x1

.field public static final i:I = 0x2

.field public static final j:I = 0x3

.field public static final k:I = 0x4

.field public static final l:I = 0x0

.field public static final m:I = 0x1

.field public static final n:I = 0x2

.field public static final o:I = 0x3

.field public static final p:I = 0x4

.field public static final q:I = 0x0

.field public static final r:I = 0x1

.field public static final s:I = 0x2

.field public static final t:I = 0x3


# instance fields
.field private A:J

.field private B:I

.field private C:D

.field private D:I

.field private E:I

.field private F:J

.field private G:D

.field private H:Z

.field private I:[J

.field private J:I

.field private K:I

.field private L:Lorg/json/JSONObject;

.field private M:Z

.field private final N:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field u:J

.field v:Ljava/lang/String;

.field w:I

.field final x:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/cast/MediaQueueItem;",
            ">;"
        }
    .end annotation
.end field

.field private final y:I

.field private z:Lcom/google/android/gms/cast/MediaInfo;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/cast/p;

    invoke-direct {v0}, Lcom/google/android/gms/cast/p;-><init>()V

    sput-object v0, Lcom/google/android/gms/cast/MediaStatus;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method constructor <init>(ILcom/google/android/gms/cast/MediaInfo;JIDIIJJDZ[JIILjava/lang/String;ILjava/util/List;Z)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lcom/google/android/gms/cast/MediaInfo;",
            "JIDIIJJDZ[JII",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/cast/MediaQueueItem;",
            ">;Z)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lcom/google/android/gms/cast/MediaStatus;->x:Ljava/util/ArrayList;

    new-instance v2, Landroid/util/SparseArray;

    invoke-direct {v2}, Landroid/util/SparseArray;-><init>()V

    iput-object v2, p0, Lcom/google/android/gms/cast/MediaStatus;->N:Landroid/util/SparseArray;

    iput p1, p0, Lcom/google/android/gms/cast/MediaStatus;->y:I

    iput-object p2, p0, Lcom/google/android/gms/cast/MediaStatus;->z:Lcom/google/android/gms/cast/MediaInfo;

    iput-wide p3, p0, Lcom/google/android/gms/cast/MediaStatus;->A:J

    iput p5, p0, Lcom/google/android/gms/cast/MediaStatus;->B:I

    iput-wide p6, p0, Lcom/google/android/gms/cast/MediaStatus;->C:D

    iput p8, p0, Lcom/google/android/gms/cast/MediaStatus;->D:I

    iput p9, p0, Lcom/google/android/gms/cast/MediaStatus;->E:I

    iput-wide p10, p0, Lcom/google/android/gms/cast/MediaStatus;->F:J

    move-wide/from16 v0, p12

    iput-wide v0, p0, Lcom/google/android/gms/cast/MediaStatus;->u:J

    move-wide/from16 v0, p14

    iput-wide v0, p0, Lcom/google/android/gms/cast/MediaStatus;->G:D

    move/from16 v0, p16

    iput-boolean v0, p0, Lcom/google/android/gms/cast/MediaStatus;->H:Z

    move-object/from16 v0, p17

    iput-object v0, p0, Lcom/google/android/gms/cast/MediaStatus;->I:[J

    move/from16 v0, p18

    iput v0, p0, Lcom/google/android/gms/cast/MediaStatus;->J:I

    move/from16 v0, p19

    iput v0, p0, Lcom/google/android/gms/cast/MediaStatus;->K:I

    move-object/from16 v0, p20

    iput-object v0, p0, Lcom/google/android/gms/cast/MediaStatus;->v:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/cast/MediaStatus;->v:Ljava/lang/String;

    if-eqz v2, :cond_1

    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    iget-object v3, p0, Lcom/google/android/gms/cast/MediaStatus;->v:Ljava/lang/String;

    invoke-direct {v2, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    iput-object v2, p0, Lcom/google/android/gms/cast/MediaStatus;->L:Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    move/from16 v0, p21

    iput v0, p0, Lcom/google/android/gms/cast/MediaStatus;->w:I

    if-eqz p22, :cond_0

    invoke-interface/range {p22 .. p22}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-interface/range {p22 .. p22}, Ljava/util/List;->size()I

    move-result v2

    new-array v2, v2, [Lcom/google/android/gms/cast/MediaQueueItem;

    move-object/from16 v0, p22

    invoke-interface {v0, v2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Lcom/google/android/gms/cast/MediaQueueItem;

    invoke-direct {p0, v2}, Lcom/google/android/gms/cast/MediaStatus;->a([Lcom/google/android/gms/cast/MediaQueueItem;)V

    :cond_0
    move/from16 v0, p23

    iput-boolean v0, p0, Lcom/google/android/gms/cast/MediaStatus;->M:Z

    return-void

    :catch_0
    move-exception v2

    const/4 v2, 0x0

    iput-object v2, p0, Lcom/google/android/gms/cast/MediaStatus;->L:Lorg/json/JSONObject;

    const/4 v2, 0x0

    iput-object v2, p0, Lcom/google/android/gms/cast/MediaStatus;->v:Ljava/lang/String;

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    iput-object v2, p0, Lcom/google/android/gms/cast/MediaStatus;->L:Lorg/json/JSONObject;

    goto :goto_0
.end method

.method public constructor <init>(Lorg/json/JSONObject;)V
    .locals 26

    const/4 v3, 0x1

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const-wide/16 v14, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    move-object/from16 v2, p0

    invoke-direct/range {v2 .. v25}, Lcom/google/android/gms/cast/MediaStatus;-><init>(ILcom/google/android/gms/cast/MediaInfo;JIDIIJJDZ[JIILjava/lang/String;ILjava/util/List;Z)V

    const/4 v2, 0x0

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/cast/MediaStatus;->a(Lorg/json/JSONObject;I)I

    return-void
.end method

.method private a([Lcom/google/android/gms/cast/MediaQueueItem;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/cast/MediaStatus;->x:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lcom/google/android/gms/cast/MediaStatus;->N:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    const/4 v0, 0x0

    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_0

    aget-object v1, p1, v0

    iget-object v2, p0, Lcom/google/android/gms/cast/MediaStatus;->x:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v2, p0, Lcom/google/android/gms/cast/MediaStatus;->N:Landroid/util/SparseArray;

    invoke-virtual {v1}, Lcom/google/android/gms/cast/MediaQueueItem;->c()I

    move-result v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private a(IIII)Z
    .locals 3

    const/4 v1, 0x0

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    move v0, v1

    :cond_0
    :goto_0
    return v0

    :cond_1
    packed-switch p2, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    if-eqz p3, :cond_0

    move v0, v1

    goto :goto_0

    :pswitch_1
    const/4 v2, 0x2

    if-ne p4, v2, :cond_0

    move v0, v1

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private a(Lcom/google/android/gms/cast/MediaStatus;)Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/cast/MediaStatus;->L:Lorg/json/JSONObject;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/google/android/gms/cast/MediaStatus;->L:Lorg/json/JSONObject;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/MediaStatus;->L:Lorg/json/JSONObject;

    iget-object v1, p1, Lcom/google/android/gms/cast/MediaStatus;->L:Lorg/json/JSONObject;

    invoke-static {v0, v1}, Lcom/google/android/gms/common/util/p;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private s()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/cast/MediaStatus;->w:I

    iget-object v0, p0, Lcom/google/android/gms/cast/MediaStatus;->x:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lcom/google/android/gms/cast/MediaStatus;->N:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    return-void
.end method


# virtual methods
.method a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/MediaStatus;->y:I

    return v0
.end method

.method public a(Lorg/json/JSONObject;I)I
    .locals 13

    const/4 v6, 0x4

    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-string v0, "mediaSessionId"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v8

    iget-wide v10, p0, Lcom/google/android/gms/cast/MediaStatus;->A:J

    cmp-long v0, v8, v10

    if-eqz v0, :cond_1f

    iput-wide v8, p0, Lcom/google/android/gms/cast/MediaStatus;->A:J

    move v0, v1

    :goto_0
    const-string v3, "playerState"

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    const-string v3, "playerState"

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v7, "IDLE"

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    move v3, v1

    :goto_1
    iget v7, p0, Lcom/google/android/gms/cast/MediaStatus;->D:I

    if-eq v3, v7, :cond_0

    iput v3, p0, Lcom/google/android/gms/cast/MediaStatus;->D:I

    or-int/lit8 v0, v0, 0x2

    :cond_0
    if-ne v3, v1, :cond_1

    const-string v3, "idleReason"

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    const-string v3, "idleReason"

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v7, "CANCELLED"

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_a

    :goto_2
    iget v3, p0, Lcom/google/android/gms/cast/MediaStatus;->E:I

    if-eq v4, v3, :cond_1

    iput v4, p0, Lcom/google/android/gms/cast/MediaStatus;->E:I

    or-int/lit8 v0, v0, 0x2

    :cond_1
    const-string v3, "playbackRate"

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    const-string v3, "playbackRate"

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v4

    iget-wide v6, p0, Lcom/google/android/gms/cast/MediaStatus;->C:D

    cmpl-double v3, v6, v4

    if-eqz v3, :cond_2

    iput-wide v4, p0, Lcom/google/android/gms/cast/MediaStatus;->C:D

    or-int/lit8 v0, v0, 0x2

    :cond_2
    const-string v3, "currentTime"

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    and-int/lit8 v3, p2, 0x2

    if-nez v3, :cond_3

    const-string v3, "currentTime"

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v4

    invoke-static {v4, v5}, Lcom/google/android/gms/cast/internal/f;->a(D)J

    move-result-wide v4

    iget-wide v6, p0, Lcom/google/android/gms/cast/MediaStatus;->F:J

    cmp-long v3, v4, v6

    if-eqz v3, :cond_3

    iput-wide v4, p0, Lcom/google/android/gms/cast/MediaStatus;->F:J

    or-int/lit8 v0, v0, 0x2

    :cond_3
    const-string v3, "supportedMediaCommands"

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    const-string v3, "supportedMediaCommands"

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v4

    iget-wide v6, p0, Lcom/google/android/gms/cast/MediaStatus;->u:J

    cmp-long v3, v4, v6

    if-eqz v3, :cond_4

    iput-wide v4, p0, Lcom/google/android/gms/cast/MediaStatus;->u:J

    or-int/lit8 v0, v0, 0x2

    :cond_4
    const-string v3, "volume"

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_6

    and-int/lit8 v3, p2, 0x1

    if-nez v3, :cond_6

    const-string v3, "volume"

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    const-string v4, "level"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v4

    iget-wide v6, p0, Lcom/google/android/gms/cast/MediaStatus;->G:D

    cmpl-double v6, v4, v6

    if-eqz v6, :cond_5

    iput-wide v4, p0, Lcom/google/android/gms/cast/MediaStatus;->G:D

    or-int/lit8 v0, v0, 0x2

    :cond_5
    const-string v4, "muted"

    invoke-virtual {v3, v4}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v3

    iget-boolean v4, p0, Lcom/google/android/gms/cast/MediaStatus;->H:Z

    if-eq v3, v4, :cond_6

    iput-boolean v3, p0, Lcom/google/android/gms/cast/MediaStatus;->H:Z

    or-int/lit8 v0, v0, 0x2

    :cond_6
    const/4 v3, 0x0

    const-string v4, "activeTrackIds"

    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_18

    const-string v3, "activeTrackIds"

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v5

    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    move-result v6

    new-array v3, v6, [J

    move v4, v2

    :goto_3
    if-ge v4, v6, :cond_d

    invoke-virtual {v5, v4}, Lorg/json/JSONArray;->getLong(I)J

    move-result-wide v8

    aput-wide v8, v3, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_3

    :cond_7
    const-string v7, "PLAYING"

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    move v3, v4

    goto/16 :goto_1

    :cond_8
    const-string v7, "PAUSED"

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_9

    move v3, v5

    goto/16 :goto_1

    :cond_9
    const-string v7, "BUFFERING"

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1e

    move v3, v6

    goto/16 :goto_1

    :cond_a
    const-string v4, "INTERRUPTED"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_b

    move v4, v5

    goto/16 :goto_2

    :cond_b
    const-string v4, "FINISHED"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_c

    move v4, v1

    goto/16 :goto_2

    :cond_c
    const-string v4, "ERROR"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1d

    move v4, v6

    goto/16 :goto_2

    :cond_d
    iget-object v4, p0, Lcom/google/android/gms/cast/MediaStatus;->I:[J

    if-nez v4, :cond_17

    :cond_e
    :goto_4
    if-eqz v1, :cond_f

    iput-object v3, p0, Lcom/google/android/gms/cast/MediaStatus;->I:[J

    :cond_f
    move-object v12, v3

    move v3, v1

    move-object v1, v12

    :goto_5
    if-eqz v3, :cond_10

    iput-object v1, p0, Lcom/google/android/gms/cast/MediaStatus;->I:[J

    or-int/lit8 v0, v0, 0x2

    :cond_10
    const-string v1, "customData"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_11

    const-string v1, "customData"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/cast/MediaStatus;->L:Lorg/json/JSONObject;

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/google/android/gms/cast/MediaStatus;->v:Ljava/lang/String;

    or-int/lit8 v0, v0, 0x2

    :cond_11
    const-string v1, "media"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_12

    const-string v1, "media"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    new-instance v3, Lcom/google/android/gms/cast/MediaInfo;

    invoke-direct {v3, v1}, Lcom/google/android/gms/cast/MediaInfo;-><init>(Lorg/json/JSONObject;)V

    iput-object v3, p0, Lcom/google/android/gms/cast/MediaStatus;->z:Lcom/google/android/gms/cast/MediaInfo;

    or-int/lit8 v0, v0, 0x2

    const-string v3, "metadata"

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_12

    or-int/lit8 v0, v0, 0x4

    :cond_12
    const-string v1, "currentItemId"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_13

    const-string v1, "currentItemId"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    iget v3, p0, Lcom/google/android/gms/cast/MediaStatus;->B:I

    if-eq v3, v1, :cond_13

    iput v1, p0, Lcom/google/android/gms/cast/MediaStatus;->B:I

    or-int/lit8 v0, v0, 0x2

    :cond_13
    const-string v1, "preloadedItemId"

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v1

    iget v3, p0, Lcom/google/android/gms/cast/MediaStatus;->K:I

    if-eq v3, v1, :cond_14

    iput v1, p0, Lcom/google/android/gms/cast/MediaStatus;->K:I

    or-int/lit8 v0, v0, 0x10

    :cond_14
    const-string v1, "loadingItemId"

    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v1

    iget v3, p0, Lcom/google/android/gms/cast/MediaStatus;->J:I

    if-eq v3, v1, :cond_15

    iput v1, p0, Lcom/google/android/gms/cast/MediaStatus;->J:I

    or-int/lit8 v0, v0, 0x2

    :cond_15
    iget-object v1, p0, Lcom/google/android/gms/cast/MediaStatus;->z:Lcom/google/android/gms/cast/MediaInfo;

    if-nez v1, :cond_19

    const/4 v1, -0x1

    :goto_6
    iget v3, p0, Lcom/google/android/gms/cast/MediaStatus;->D:I

    iget v4, p0, Lcom/google/android/gms/cast/MediaStatus;->E:I

    iget v5, p0, Lcom/google/android/gms/cast/MediaStatus;->J:I

    invoke-direct {p0, v3, v4, v5, v1}, Lcom/google/android/gms/cast/MediaStatus;->a(IIII)Z

    move-result v1

    if-nez v1, :cond_1a

    invoke-virtual {p0, p1}, Lcom/google/android/gms/cast/MediaStatus;->a(Lorg/json/JSONObject;)Z

    move-result v1

    if-eqz v1, :cond_16

    or-int/lit8 v0, v0, 0x8

    :cond_16
    :goto_7
    return v0

    :cond_17
    iget-object v4, p0, Lcom/google/android/gms/cast/MediaStatus;->I:[J

    array-length v4, v4

    if-ne v4, v6, :cond_e

    move v4, v2

    :goto_8
    if-ge v4, v6, :cond_1c

    iget-object v5, p0, Lcom/google/android/gms/cast/MediaStatus;->I:[J

    aget-wide v8, v5, v4

    aget-wide v10, v3, v4

    cmp-long v5, v8, v10

    if-nez v5, :cond_e

    add-int/lit8 v4, v4, 0x1

    goto :goto_8

    :cond_18
    iget-object v4, p0, Lcom/google/android/gms/cast/MediaStatus;->I:[J

    if-eqz v4, :cond_1b

    move-object v12, v3

    move v3, v1

    move-object v1, v12

    goto/16 :goto_5

    :cond_19
    iget-object v1, p0, Lcom/google/android/gms/cast/MediaStatus;->z:Lcom/google/android/gms/cast/MediaInfo;

    invoke-virtual {v1}, Lcom/google/android/gms/cast/MediaInfo;->c()I

    move-result v1

    goto :goto_6

    :cond_1a
    iput v2, p0, Lcom/google/android/gms/cast/MediaStatus;->B:I

    iput v2, p0, Lcom/google/android/gms/cast/MediaStatus;->J:I

    iput v2, p0, Lcom/google/android/gms/cast/MediaStatus;->K:I

    iget-object v1, p0, Lcom/google/android/gms/cast/MediaStatus;->x:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_16

    invoke-direct {p0}, Lcom/google/android/gms/cast/MediaStatus;->s()V

    or-int/lit8 v0, v0, 0x8

    goto :goto_7

    :cond_1b
    move-object v1, v3

    move v3, v2

    goto/16 :goto_5

    :cond_1c
    move v1, v2

    goto/16 :goto_4

    :cond_1d
    move v4, v2

    goto/16 :goto_2

    :cond_1e
    move v3, v2

    goto/16 :goto_1

    :cond_1f
    move v0, v2

    goto/16 :goto_0
.end method

.method public a(I)Lcom/google/android/gms/cast/MediaQueueItem;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/cast/MediaStatus;->c(I)Lcom/google/android/gms/cast/MediaQueueItem;

    move-result-object v0

    return-object v0
.end method

.method public a(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/cast/MediaStatus;->M:Z

    return-void
.end method

.method public a(J)Z
    .locals 5

    iget-wide v0, p0, Lcom/google/android/gms/cast/MediaStatus;->u:J

    and-long/2addr v0, p1

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method a(Lorg/json/JSONObject;)Z
    .locals 10

    const/4 v3, 0x3

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x1

    const-string v4, "repeatMode"

    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_8

    iget v4, p0, Lcom/google/android/gms/cast/MediaStatus;->w:I

    const-string v5, "repeatMode"

    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/4 v5, -0x1

    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    move-result v7

    sparse-switch v7, :sswitch_data_0

    :cond_0
    :goto_0
    packed-switch v5, :pswitch_data_0

    move v0, v4

    :goto_1
    :pswitch_0
    iget v3, p0, Lcom/google/android/gms/cast/MediaStatus;->w:I

    if-eq v3, v0, :cond_8

    iput v0, p0, Lcom/google/android/gms/cast/MediaStatus;->w:I

    move v0, v2

    :goto_2
    const-string v3, "items"

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_7

    const-string v3, "items"

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v5

    new-instance v6, Landroid/util/SparseArray;

    invoke-direct {v6}, Landroid/util/SparseArray;-><init>()V

    move v3, v1

    :goto_3
    if-ge v3, v5, :cond_1

    invoke-virtual {v4, v3}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v7

    const-string v8, "itemId"

    invoke-virtual {v7, v8}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v6, v3, v7}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :sswitch_0
    const-string v7, "REPEAT_OFF"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    move v5, v1

    goto :goto_0

    :sswitch_1
    const-string v7, "REPEAT_ALL"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    move v5, v2

    goto :goto_0

    :sswitch_2
    const-string v7, "REPEAT_SINGLE"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    move v5, v0

    goto :goto_0

    :sswitch_3
    const-string v7, "REPEAT_ALL_AND_SHUFFLE"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    move v5, v3

    goto :goto_0

    :pswitch_1
    move v0, v1

    goto :goto_1

    :pswitch_2
    move v0, v2

    goto :goto_1

    :pswitch_3
    move v0, v3

    goto :goto_1

    :cond_1
    new-array v7, v5, [Lcom/google/android/gms/cast/MediaQueueItem;

    move v3, v1

    move v1, v0

    :goto_4
    if-ge v3, v5, :cond_4

    invoke-virtual {v6, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v4, v3}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v8

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-virtual {p0, v9}, Lcom/google/android/gms/cast/MediaStatus;->c(I)Lcom/google/android/gms/cast/MediaQueueItem;

    move-result-object v9

    if-eqz v9, :cond_2

    invoke-virtual {v9, v8}, Lcom/google/android/gms/cast/MediaQueueItem;->a(Lorg/json/JSONObject;)Z

    move-result v8

    or-int/2addr v1, v8

    aput-object v9, v7, v3

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/cast/MediaStatus;->e(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-eq v3, v0, :cond_6

    move v0, v2

    :goto_5
    add-int/lit8 v1, v3, 0x1

    move v3, v1

    move v1, v0

    goto :goto_4

    :cond_2
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget v1, p0, Lcom/google/android/gms/cast/MediaStatus;->B:I

    if-ne v0, v1, :cond_3

    new-instance v0, Lcom/google/android/gms/cast/MediaQueueItem$a;

    iget-object v1, p0, Lcom/google/android/gms/cast/MediaStatus;->z:Lcom/google/android/gms/cast/MediaInfo;

    invoke-direct {v0, v1}, Lcom/google/android/gms/cast/MediaQueueItem$a;-><init>(Lcom/google/android/gms/cast/MediaInfo;)V

    invoke-virtual {v0}, Lcom/google/android/gms/cast/MediaQueueItem$a;->b()Lcom/google/android/gms/cast/MediaQueueItem;

    move-result-object v0

    aput-object v0, v7, v3

    aget-object v0, v7, v3

    invoke-virtual {v0, v8}, Lcom/google/android/gms/cast/MediaQueueItem;->a(Lorg/json/JSONObject;)Z

    move v0, v2

    goto :goto_5

    :cond_3
    new-instance v0, Lcom/google/android/gms/cast/MediaQueueItem;

    invoke-direct {v0, v8}, Lcom/google/android/gms/cast/MediaQueueItem;-><init>(Lorg/json/JSONObject;)V

    aput-object v0, v7, v3

    move v0, v2

    goto :goto_5

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/cast/MediaStatus;->x:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-eq v0, v5, :cond_5

    :goto_6
    invoke-direct {p0, v7}, Lcom/google/android/gms/cast/MediaStatus;->a([Lcom/google/android/gms/cast/MediaQueueItem;)V

    :goto_7
    return v2

    :cond_5
    move v2, v1

    goto :goto_6

    :cond_6
    move v0, v1

    goto :goto_5

    :cond_7
    move v2, v0

    goto :goto_7

    :cond_8
    move v0, v1

    goto/16 :goto_2

    :sswitch_data_0
    .sparse-switch
        -0x42a82c11 -> :sswitch_3
        -0x3964a094 -> :sswitch_2
        0x621b08dd -> :sswitch_1
        0x621b3cab -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method

.method public b()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/cast/MediaStatus;->A:J

    return-wide v0
.end method

.method public b(I)Lcom/google/android/gms/cast/MediaQueueItem;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/cast/MediaStatus;->d(I)Lcom/google/android/gms/cast/MediaQueueItem;

    move-result-object v0

    return-object v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/MediaStatus;->D:I

    return v0
.end method

.method public c(I)Lcom/google/android/gms/cast/MediaQueueItem;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/cast/MediaStatus;->N:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/cast/MediaStatus;->x:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/MediaQueueItem;

    goto :goto_0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/MediaStatus;->E:I

    return v0
.end method

.method public d(I)Lcom/google/android/gms/cast/MediaQueueItem;
    .locals 1

    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/MediaStatus;->x:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt p1, v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/cast/MediaStatus;->x:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/MediaQueueItem;

    goto :goto_0
.end method

.method public e()D
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/cast/MediaStatus;->C:D

    return-wide v0
.end method

.method public e(I)Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/MediaStatus;->N:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 8

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ne p0, p1, :cond_1

    :cond_0
    :goto_0
    return v1

    :cond_1
    instance-of v0, p1, Lcom/google/android/gms/cast/MediaStatus;

    if-nez v0, :cond_2

    move v1, v2

    goto :goto_0

    :cond_2
    check-cast p1, Lcom/google/android/gms/cast/MediaStatus;

    iget-object v0, p0, Lcom/google/android/gms/cast/MediaStatus;->L:Lorg/json/JSONObject;

    if-nez v0, :cond_3

    move v0, v1

    :goto_1
    iget-object v3, p1, Lcom/google/android/gms/cast/MediaStatus;->L:Lorg/json/JSONObject;

    if-nez v3, :cond_4

    move v3, v1

    :goto_2
    if-eq v0, v3, :cond_5

    move v1, v2

    goto :goto_0

    :cond_3
    move v0, v2

    goto :goto_1

    :cond_4
    move v3, v2

    goto :goto_2

    :cond_5
    iget-wide v4, p0, Lcom/google/android/gms/cast/MediaStatus;->A:J

    iget-wide v6, p1, Lcom/google/android/gms/cast/MediaStatus;->A:J

    cmp-long v0, v4, v6

    if-nez v0, :cond_6

    iget v0, p0, Lcom/google/android/gms/cast/MediaStatus;->B:I

    iget v3, p1, Lcom/google/android/gms/cast/MediaStatus;->B:I

    if-ne v0, v3, :cond_6

    iget-wide v4, p0, Lcom/google/android/gms/cast/MediaStatus;->C:D

    iget-wide v6, p1, Lcom/google/android/gms/cast/MediaStatus;->C:D

    cmpl-double v0, v4, v6

    if-nez v0, :cond_6

    iget v0, p0, Lcom/google/android/gms/cast/MediaStatus;->D:I

    iget v3, p1, Lcom/google/android/gms/cast/MediaStatus;->D:I

    if-ne v0, v3, :cond_6

    iget v0, p0, Lcom/google/android/gms/cast/MediaStatus;->E:I

    iget v3, p1, Lcom/google/android/gms/cast/MediaStatus;->E:I

    if-ne v0, v3, :cond_6

    iget-wide v4, p0, Lcom/google/android/gms/cast/MediaStatus;->F:J

    iget-wide v6, p1, Lcom/google/android/gms/cast/MediaStatus;->F:J

    cmp-long v0, v4, v6

    if-nez v0, :cond_6

    iget-wide v4, p0, Lcom/google/android/gms/cast/MediaStatus;->G:D

    iget-wide v6, p1, Lcom/google/android/gms/cast/MediaStatus;->G:D

    cmpl-double v0, v4, v6

    if-nez v0, :cond_6

    iget-boolean v0, p0, Lcom/google/android/gms/cast/MediaStatus;->H:Z

    iget-boolean v3, p1, Lcom/google/android/gms/cast/MediaStatus;->H:Z

    if-ne v0, v3, :cond_6

    iget v0, p0, Lcom/google/android/gms/cast/MediaStatus;->J:I

    iget v3, p1, Lcom/google/android/gms/cast/MediaStatus;->J:I

    if-ne v0, v3, :cond_6

    iget v0, p0, Lcom/google/android/gms/cast/MediaStatus;->K:I

    iget v3, p1, Lcom/google/android/gms/cast/MediaStatus;->K:I

    if-ne v0, v3, :cond_6

    iget v0, p0, Lcom/google/android/gms/cast/MediaStatus;->w:I

    iget v3, p1, Lcom/google/android/gms/cast/MediaStatus;->w:I

    if-ne v0, v3, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/cast/MediaStatus;->I:[J

    iget-object v3, p1, Lcom/google/android/gms/cast/MediaStatus;->I:[J

    invoke-static {v0, v3}, Ljava/util/Arrays;->equals([J[J)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-wide v4, p0, Lcom/google/android/gms/cast/MediaStatus;->u:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iget-wide v4, p1, Lcom/google/android/gms/cast/MediaStatus;->u:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/google/android/gms/cast/internal/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/cast/MediaStatus;->x:Ljava/util/ArrayList;

    iget-object v3, p1, Lcom/google/android/gms/cast/MediaStatus;->x:Ljava/util/ArrayList;

    invoke-static {v0, v3}, Lcom/google/android/gms/cast/internal/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/cast/MediaStatus;->z:Lcom/google/android/gms/cast/MediaInfo;

    iget-object v3, p1, Lcom/google/android/gms/cast/MediaStatus;->z:Lcom/google/android/gms/cast/MediaInfo;

    invoke-static {v0, v3}, Lcom/google/android/gms/cast/internal/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-direct {p0, p1}, Lcom/google/android/gms/cast/MediaStatus;->a(Lcom/google/android/gms/cast/MediaStatus;)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-boolean v0, p0, Lcom/google/android/gms/cast/MediaStatus;->M:Z

    invoke-virtual {p1}, Lcom/google/android/gms/cast/MediaStatus;->r()Z

    move-result v3

    if-eq v0, v3, :cond_0

    :cond_6
    move v1, v2

    goto/16 :goto_0
.end method

.method public f()Lcom/google/android/gms/cast/MediaInfo;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/MediaStatus;->z:Lcom/google/android/gms/cast/MediaInfo;

    return-object v0
.end method

.method public g()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/cast/MediaStatus;->F:J

    return-wide v0
.end method

.method public h()D
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/cast/MediaStatus;->G:D

    return-wide v0
.end method

.method public hashCode()I
    .locals 4

    const/16 v0, 0x11

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/android/gms/cast/MediaStatus;->z:Lcom/google/android/gms/cast/MediaInfo;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-wide v2, p0, Lcom/google/android/gms/cast/MediaStatus;->A:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget v2, p0, Lcom/google/android/gms/cast/MediaStatus;->B:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x3

    iget-wide v2, p0, Lcom/google/android/gms/cast/MediaStatus;->C:D

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x4

    iget v2, p0, Lcom/google/android/gms/cast/MediaStatus;->D:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x5

    iget v2, p0, Lcom/google/android/gms/cast/MediaStatus;->E:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x6

    iget-wide v2, p0, Lcom/google/android/gms/cast/MediaStatus;->F:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x7

    iget-wide v2, p0, Lcom/google/android/gms/cast/MediaStatus;->u:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0x8

    iget-wide v2, p0, Lcom/google/android/gms/cast/MediaStatus;->G:D

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0x9

    iget-boolean v2, p0, Lcom/google/android/gms/cast/MediaStatus;->H:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0xa

    iget-object v2, p0, Lcom/google/android/gms/cast/MediaStatus;->I:[J

    invoke-static {v2}, Ljava/util/Arrays;->hashCode([J)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0xb

    iget v2, p0, Lcom/google/android/gms/cast/MediaStatus;->J:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0xc

    iget v2, p0, Lcom/google/android/gms/cast/MediaStatus;->K:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0xd

    iget-object v2, p0, Lcom/google/android/gms/cast/MediaStatus;->L:Lorg/json/JSONObject;

    aput-object v2, v0, v1

    const/16 v1, 0xe

    iget v2, p0, Lcom/google/android/gms/cast/MediaStatus;->w:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/16 v1, 0xf

    iget-object v2, p0, Lcom/google/android/gms/cast/MediaStatus;->x:Ljava/util/ArrayList;

    aput-object v2, v0, v1

    const/16 v1, 0x10

    iget-boolean v2, p0, Lcom/google/android/gms/cast/MediaStatus;->M:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/c;->a([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public i()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/cast/MediaStatus;->H:Z

    return v0
.end method

.method public j()[J
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/MediaStatus;->I:[J

    return-object v0
.end method

.method public k()Lorg/json/JSONObject;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/MediaStatus;->L:Lorg/json/JSONObject;

    return-object v0
.end method

.method public l()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/MediaStatus;->B:I

    return v0
.end method

.method public m()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/MediaStatus;->J:I

    return v0
.end method

.method public n()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/MediaStatus;->K:I

    return v0
.end method

.method public o()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/cast/MediaStatus;->w:I

    return v0
.end method

.method public p()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/cast/MediaQueueItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/cast/MediaStatus;->x:Ljava/util/ArrayList;

    return-object v0
.end method

.method public q()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/MediaStatus;->x:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public r()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/cast/MediaStatus;->M:Z

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/MediaStatus;->L:Lorg/json/JSONObject;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lcom/google/android/gms/cast/MediaStatus;->v:Ljava/lang/String;

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/cast/p;->a(Lcom/google/android/gms/cast/MediaStatus;Landroid/os/Parcel;I)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/cast/MediaStatus;->L:Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method
