.class public Lcom/google/android/gms/cast/g;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/cast/a$e;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "MissingRemoteException"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/cast/g$g;,
        Lcom/google/android/gms/cast/g$h;,
        Lcom/google/android/gms/cast/g$a;,
        Lcom/google/android/gms/cast/g$f;,
        Lcom/google/android/gms/cast/g$c;,
        Lcom/google/android/gms/cast/g$d;,
        Lcom/google/android/gms/cast/g$b;,
        Lcom/google/android/gms/cast/g$e;
    }
.end annotation


# static fields
.field public static final a:Ljava/lang/String;

.field public static final b:I = 0x0

.field public static final c:I = 0x1

.field public static final d:I = 0x2

.field public static final e:I = 0x0

.field public static final f:I = 0x834

.field public static final g:I = 0x835

.field public static final h:I = 0x836

.field public static final i:I = 0x837


# instance fields
.field private final j:Ljava/lang/Object;

.field private final k:Lcom/google/android/gms/cast/internal/n;

.field private final l:Lcom/google/android/gms/cast/g$f;

.field private m:Lcom/google/android/gms/cast/g$c;

.field private n:Lcom/google/android/gms/cast/g$d;

.field private o:Lcom/google/android/gms/cast/g$b;

.field private p:Lcom/google/android/gms/cast/g$e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/google/android/gms/cast/internal/n;->g:Ljava/lang/String;

    sput-object v0, Lcom/google/android/gms/cast/g;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/cast/internal/n;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/cast/internal/n;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/cast/g;-><init>(Lcom/google/android/gms/cast/internal/n;)V

    return-void
.end method

.method constructor <init>(Lcom/google/android/gms/cast/internal/n;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/cast/g;->j:Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/cast/g;->k:Lcom/google/android/gms/cast/internal/n;

    iget-object v0, p0, Lcom/google/android/gms/cast/g;->k:Lcom/google/android/gms/cast/internal/n;

    new-instance v1, Lcom/google/android/gms/cast/g$1;

    invoke-direct {v1, p0}, Lcom/google/android/gms/cast/g$1;-><init>(Lcom/google/android/gms/cast/g;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/cast/internal/n;->a(Lcom/google/android/gms/cast/internal/n$a;)V

    new-instance v0, Lcom/google/android/gms/cast/g$f;

    invoke-direct {v0, p0}, Lcom/google/android/gms/cast/g$f;-><init>(Lcom/google/android/gms/cast/g;)V

    iput-object v0, p0, Lcom/google/android/gms/cast/g;->l:Lcom/google/android/gms/cast/g$f;

    iget-object v0, p0, Lcom/google/android/gms/cast/g;->k:Lcom/google/android/gms/cast/internal/n;

    iget-object v1, p0, Lcom/google/android/gms/cast/g;->l:Lcom/google/android/gms/cast/g$f;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/cast/internal/n;->a(Lcom/google/android/gms/cast/internal/o;)V

    return-void
.end method

.method private a(I)I
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/cast/g;->c()Lcom/google/android/gms/cast/MediaStatus;

    move-result-object v1

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v1}, Lcom/google/android/gms/cast/MediaStatus;->q()I

    move-result v2

    if-ge v0, v2, :cond_1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/cast/MediaStatus;->b(I)Lcom/google/android/gms/cast/MediaQueueItem;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/cast/MediaQueueItem;->c()I

    move-result v2

    if-ne v2, p1, :cond_0

    :goto_1
    return v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    goto :goto_1
.end method

.method static synthetic a(Lcom/google/android/gms/cast/g;I)I
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/cast/g;->a(I)I

    move-result v0

    return v0
.end method

.method static synthetic a(Lcom/google/android/gms/cast/g;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/cast/g;->f()V

    return-void
.end method

.method static synthetic b(Lcom/google/android/gms/cast/g;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/cast/g;->g()V

    return-void
.end method

.method static synthetic c(Lcom/google/android/gms/cast/g;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/cast/g;->h()V

    return-void
.end method

.method static synthetic d(Lcom/google/android/gms/cast/g;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/cast/g;->i()V

    return-void
.end method

.method static synthetic e(Lcom/google/android/gms/cast/g;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/g;->j:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic f(Lcom/google/android/gms/cast/g;)Lcom/google/android/gms/cast/g$f;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/g;->l:Lcom/google/android/gms/cast/g$f;

    return-object v0
.end method

.method private f()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/g;->p:Lcom/google/android/gms/cast/g$e;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/g;->p:Lcom/google/android/gms/cast/g$e;

    invoke-interface {v0}, Lcom/google/android/gms/cast/g$e;->a()V

    :cond_0
    return-void
.end method

.method static synthetic g(Lcom/google/android/gms/cast/g;)Lcom/google/android/gms/cast/internal/n;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/g;->k:Lcom/google/android/gms/cast/internal/n;

    return-object v0
.end method

.method private g()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/g;->o:Lcom/google/android/gms/cast/g$b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/g;->o:Lcom/google/android/gms/cast/g$b;

    invoke-interface {v0}, Lcom/google/android/gms/cast/g$b;->a()V

    :cond_0
    return-void
.end method

.method private h()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/g;->n:Lcom/google/android/gms/cast/g$d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/g;->n:Lcom/google/android/gms/cast/g$d;

    invoke-interface {v0}, Lcom/google/android/gms/cast/g$d;->a()V

    :cond_0
    return-void
.end method

.method private i()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/g;->m:Lcom/google/android/gms/cast/g$c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/g;->m:Lcom/google/android/gms/cast/g$c;

    invoke-interface {v0}, Lcom/google/android/gms/cast/g$c;->a()V

    :cond_0
    return-void
.end method


# virtual methods
.method public a()J
    .locals 4

    iget-object v1, p0, Lcom/google/android/gms/cast/g;->j:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/cast/g;->k:Lcom/google/android/gms/cast/internal/n;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/internal/n;->d()J

    move-result-wide v2

    monitor-exit v1

    return-wide v2

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/g$a;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/cast/g;->a(Lcom/google/android/gms/common/api/g;Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;D)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "D)",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/g$a;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/google/android/gms/cast/g;->a(Lcom/google/android/gms/common/api/g;DLorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;DLorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "D",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/g$a;",
            ">;"
        }
    .end annotation

    invoke-static {p2, p3}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p2, p3}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x29

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Volume cannot be "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2, p3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Lcom/google/android/gms/cast/g$14;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p1

    move-wide v4, p2

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/cast/g$14;-><init>(Lcom/google/android/gms/cast/g;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/common/api/g;DLorg/json/JSONObject;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;IILorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "II",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/g$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/cast/g$8;

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p1

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/cast/g$8;-><init>(Lcom/google/android/gms/cast/g;Lcom/google/android/gms/common/api/g;IILcom/google/android/gms/common/api/g;Lorg/json/JSONObject;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;IJLorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "IJ",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/g$a;",
            ">;"
        }
    .end annotation

    new-instance v1, Lcom/google/android/gms/cast/g$7;

    move-object v2, p0

    move-object v3, p1

    move v4, p2

    move-object v5, p1

    move-wide v6, p3

    move-object v8, p5

    invoke-direct/range {v1 .. v8}, Lcom/google/android/gms/cast/g$7;-><init>(Lcom/google/android/gms/cast/g;Lcom/google/android/gms/common/api/g;ILcom/google/android/gms/common/api/g;JLorg/json/JSONObject;)V

    invoke-virtual {p1, v1}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;ILorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "I",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/g$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/cast/g$5;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p1

    move v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/cast/g$5;-><init>(Lcom/google/android/gms/cast/g;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/common/api/g;ILorg/json/JSONObject;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;J)Lcom/google/android/gms/common/api/i;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "J)",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/g$a;",
            ">;"
        }
    .end annotation

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/cast/g;->a(Lcom/google/android/gms/common/api/g;JILorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;JI)Lcom/google/android/gms/common/api/i;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "JI)",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/g$a;",
            ">;"
        }
    .end annotation

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p2

    move v4, p4

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/cast/g;->a(Lcom/google/android/gms/common/api/g;JILorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;JILorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "JI",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/g$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/cast/g$13;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p1

    move-wide v4, p2

    move v6, p4

    move-object v7, p5

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/cast/g$13;-><init>(Lcom/google/android/gms/cast/g;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/common/api/g;JILorg/json/JSONObject;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/cast/MediaInfo;)Lcom/google/android/gms/common/api/i;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/cast/MediaInfo;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/g$a;",
            ">;"
        }
    .end annotation

    const/4 v6, 0x0

    const/4 v3, 0x1

    const-wide/16 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v7, v6

    invoke-virtual/range {v0 .. v7}, Lcom/google/android/gms/cast/g;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/cast/MediaInfo;ZJ[JLorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/cast/MediaInfo;Z)Lcom/google/android/gms/common/api/i;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/cast/MediaInfo;",
            "Z)",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/g$a;",
            ">;"
        }
    .end annotation

    const/4 v6, 0x0

    const-wide/16 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v7, v6

    invoke-virtual/range {v0 .. v7}, Lcom/google/android/gms/cast/g;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/cast/MediaInfo;ZJ[JLorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/cast/MediaInfo;ZJ)Lcom/google/android/gms/common/api/i;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/cast/MediaInfo;",
            "ZJ)",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/g$a;",
            ">;"
        }
    .end annotation

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-wide v4, p4

    move-object v7, v6

    invoke-virtual/range {v0 .. v7}, Lcom/google/android/gms/cast/g;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/cast/MediaInfo;ZJ[JLorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/cast/MediaInfo;ZJLorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/cast/MediaInfo;",
            "ZJ",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/g$a;",
            ">;"
        }
    .end annotation

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-wide v4, p4

    move-object v7, p6

    invoke-virtual/range {v0 .. v7}, Lcom/google/android/gms/cast/g;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/cast/MediaInfo;ZJ[JLorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/cast/MediaInfo;ZJ[JLorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/cast/MediaInfo;",
            "ZJ[J",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/g$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/cast/g$4;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    move-wide v6, p4

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    invoke-direct/range {v0 .. v9}, Lcom/google/android/gms/cast/g$4;-><init>(Lcom/google/android/gms/cast/g;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/cast/MediaInfo;ZJ[JLorg/json/JSONObject;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/cast/MediaQueueItem;IJLorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/cast/MediaQueueItem;",
            "IJ",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/g$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/cast/g$20;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    move-wide v6, p4

    move-object/from16 v8, p6

    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/cast/g$20;-><init>(Lcom/google/android/gms/cast/g;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/cast/MediaQueueItem;IJLorg/json/JSONObject;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/cast/MediaQueueItem;ILorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/cast/MediaQueueItem;",
            "I",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/g$a;",
            ">;"
        }
    .end annotation

    const-wide/16 v4, -0x1

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v6, p4

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/cast/g;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/cast/MediaQueueItem;IJLorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/cast/MediaQueueItem;Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/cast/MediaQueueItem;",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/g$a;",
            ">;"
        }
    .end annotation

    const/4 v1, 0x0

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/google/android/gms/cast/MediaQueueItem;

    aput-object p2, v0, v1

    invoke-virtual {p0, p1, v0, v1, p3}, Lcom/google/android/gms/cast/g;->a(Lcom/google/android/gms/common/api/g;[Lcom/google/android/gms/cast/MediaQueueItem;ILorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/cast/TextTrackStyle;)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/cast/TextTrackStyle;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/g$a;",
            ">;"
        }
    .end annotation

    if-nez p2, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "trackStyle cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/cast/g$17;

    invoke-direct {v0, p0, p1, p1, p2}, Lcom/google/android/gms/cast/g$17;-><init>(Lcom/google/android/gms/cast/g;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/cast/TextTrackStyle;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/g$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/cast/g$9;

    invoke-direct {v0, p0, p1, p1, p2}, Lcom/google/android/gms/cast/g$9;-><init>(Lcom/google/android/gms/cast/g;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/common/api/g;Lorg/json/JSONObject;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Z)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Z)",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/g$a;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/google/android/gms/cast/g;->a(Lcom/google/android/gms/common/api/g;ZLorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;ZLorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Z",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/g$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/cast/g$15;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p1

    move v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/cast/g$15;-><init>(Lcom/google/android/gms/cast/g;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/common/api/g;ZLorg/json/JSONObject;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;[IILorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "[II",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/g$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/cast/g$23;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/cast/g$23;-><init>(Lcom/google/android/gms/cast/g;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/common/api/g;[IILorg/json/JSONObject;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;[ILorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "[I",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/g$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/cast/g$22;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/cast/g$22;-><init>(Lcom/google/android/gms/cast/g;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/common/api/g;[ILorg/json/JSONObject;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;[J)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "[J)",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/g$a;",
            ">;"
        }
    .end annotation

    if-nez p2, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "trackIds cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/cast/g$12;

    invoke-direct {v0, p0, p1, p1, p2}, Lcom/google/android/gms/cast/g$12;-><init>(Lcom/google/android/gms/cast/g;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/common/api/g;[J)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;[Lcom/google/android/gms/cast/MediaQueueItem;IIJLorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "[",
            "Lcom/google/android/gms/cast/MediaQueueItem;",
            "IIJ",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/g$a;",
            ">;"
        }
    .end annotation

    new-instance v1, Lcom/google/android/gms/cast/g$18;

    move-object v2, p0

    move-object v3, p1

    move-object v4, p1

    move-object v5, p2

    move v6, p3

    move v7, p4

    move-wide/from16 v8, p5

    move-object/from16 v10, p7

    invoke-direct/range {v1 .. v10}, Lcom/google/android/gms/cast/g$18;-><init>(Lcom/google/android/gms/cast/g;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/common/api/g;[Lcom/google/android/gms/cast/MediaQueueItem;IIJLorg/json/JSONObject;)V

    invoke-virtual {p1, v1}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;[Lcom/google/android/gms/cast/MediaQueueItem;IILorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "[",
            "Lcom/google/android/gms/cast/MediaQueueItem;",
            "II",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/g$a;",
            ">;"
        }
    .end annotation

    const-wide/16 v6, -0x1

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move-object v8, p5

    invoke-virtual/range {v1 .. v8}, Lcom/google/android/gms/cast/g;->a(Lcom/google/android/gms/common/api/g;[Lcom/google/android/gms/cast/MediaQueueItem;IIJLorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;[Lcom/google/android/gms/cast/MediaQueueItem;ILorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "[",
            "Lcom/google/android/gms/cast/MediaQueueItem;",
            "I",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/g$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/cast/g$19;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p1

    move-object v4, p2

    move v5, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/cast/g$19;-><init>(Lcom/google/android/gms/cast/g;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/common/api/g;[Lcom/google/android/gms/cast/MediaQueueItem;ILorg/json/JSONObject;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;[Lcom/google/android/gms/cast/MediaQueueItem;Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "[",
            "Lcom/google/android/gms/cast/MediaQueueItem;",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/g$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/cast/g$21;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/cast/g$21;-><init>(Lcom/google/android/gms/cast/g;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/common/api/g;[Lcom/google/android/gms/cast/MediaQueueItem;Lorg/json/JSONObject;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/cast/CastDevice;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/g;->k:Lcom/google/android/gms/cast/internal/n;

    invoke-virtual {v0, p3}, Lcom/google/android/gms/cast/internal/n;->b(Ljava/lang/String;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/cast/g$b;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/g;->o:Lcom/google/android/gms/cast/g$b;

    return-void
.end method

.method public a(Lcom/google/android/gms/cast/g$c;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/g;->m:Lcom/google/android/gms/cast/g$c;

    return-void
.end method

.method public a(Lcom/google/android/gms/cast/g$d;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/g;->n:Lcom/google/android/gms/cast/g$d;

    return-void
.end method

.method public a(Lcom/google/android/gms/cast/g$e;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/g;->p:Lcom/google/android/gms/cast/g$e;

    return-void
.end method

.method public b()J
    .locals 4

    iget-object v1, p0, Lcom/google/android/gms/cast/g;->j:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/cast/g;->k:Lcom/google/android/gms/cast/internal/n;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/internal/n;->e()J

    move-result-wide v2

    monitor-exit v1

    return-wide v2

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public b(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/g$a;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/cast/g;->b(Lcom/google/android/gms/common/api/g;Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/google/android/gms/common/api/g;ILorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "I",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/g$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/cast/g$6;

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p1

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/cast/g$6;-><init>(Lcom/google/android/gms/cast/g;Lcom/google/android/gms/common/api/g;ILcom/google/android/gms/common/api/g;Lorg/json/JSONObject;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/google/android/gms/common/api/g;Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/g$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/cast/g$10;

    invoke-direct {v0, p0, p1, p1, p2}, Lcom/google/android/gms/cast/g$10;-><init>(Lcom/google/android/gms/cast/g;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/common/api/g;Lorg/json/JSONObject;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public c()Lcom/google/android/gms/cast/MediaStatus;
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/cast/g;->j:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/cast/g;->k:Lcom/google/android/gms/cast/internal/n;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/internal/n;->f()Lcom/google/android/gms/cast/MediaStatus;

    move-result-object v0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public c(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/g$a;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/cast/g;->c(Lcom/google/android/gms/common/api/g;Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public c(Lcom/google/android/gms/common/api/g;ILorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "I",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/g$a;",
            ">;"
        }
    .end annotation

    const-wide/16 v4, -0x1

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v6, p3

    invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/cast/g;->a(Lcom/google/android/gms/common/api/g;IJLorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public c(Lcom/google/android/gms/common/api/g;Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/g$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/cast/g$11;

    invoke-direct {v0, p0, p1, p1, p2}, Lcom/google/android/gms/cast/g$11;-><init>(Lcom/google/android/gms/cast/g;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/common/api/g;Lorg/json/JSONObject;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public d()Lcom/google/android/gms/cast/MediaInfo;
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/cast/g;->j:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/cast/g;->k:Lcom/google/android/gms/cast/internal/n;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/internal/n;->g()Lcom/google/android/gms/cast/MediaInfo;

    move-result-object v0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public d(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/g$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/cast/g$16;

    invoke-direct {v0, p0, p1, p1}, Lcom/google/android/gms/cast/g$16;-><init>(Lcom/google/android/gms/cast/g;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/common/api/g;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public d(Lcom/google/android/gms/common/api/g;Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/g$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/cast/g$2;

    invoke-direct {v0, p0, p1, p1, p2}, Lcom/google/android/gms/cast/g$2;-><init>(Lcom/google/android/gms/cast/g;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/common/api/g;Lorg/json/JSONObject;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public e(Lcom/google/android/gms/common/api/g;Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/g$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/cast/g$3;

    invoke-direct {v0, p0, p1, p1, p2}, Lcom/google/android/gms/cast/g$3;-><init>(Lcom/google/android/gms/cast/g;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/common/api/g;Lorg/json/JSONObject;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/g;->k:Lcom/google/android/gms/cast/internal/n;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/internal/n;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
