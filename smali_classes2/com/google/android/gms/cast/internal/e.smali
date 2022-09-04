.class public Lcom/google/android/gms/cast/internal/e;
.super Lcom/google/android/gms/common/internal/w;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/cast/internal/e$b;,
        Lcom/google/android/gms/cast/internal/e$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/common/internal/w",
        "<",
        "Lcom/google/android/gms/cast/internal/j;",
        ">;"
    }
.end annotation


# static fields
.field private static final A:Ljava/lang/Object;

.field private static final B:Ljava/lang/Object;

.field private static final a:Lcom/google/android/gms/cast/internal/m;


# instance fields
.field private e:Lcom/google/android/gms/cast/ApplicationMetadata;

.field private final f:Lcom/google/android/gms/cast/CastDevice;

.field private final g:Lcom/google/android/gms/cast/a$d;

.field private final h:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/cast/a$e;",
            ">;"
        }
    .end annotation
.end field

.field private final i:J

.field private j:Lcom/google/android/gms/cast/internal/e$b;

.field private k:Ljava/lang/String;

.field private l:Z

.field private m:Z

.field private n:Z

.field private o:Z

.field private p:D

.field private q:I

.field private r:I

.field private final s:Ljava/util/concurrent/atomic/AtomicLong;

.field private t:Ljava/lang/String;

.field private u:Ljava/lang/String;

.field private v:Landroid/os/Bundle;

.field private final w:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Long;",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;>;"
        }
    .end annotation
.end field

.field private x:Lcom/google/android/gms/cast/internal/j;

.field private y:Lcom/google/android/gms/internal/ahl$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/cast/a$a;",
            ">;"
        }
    .end annotation
.end field

.field private z:Lcom/google/android/gms/internal/ahl$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/cast/internal/m;

    const-string v1, "CastClientImpl"

    invoke-direct {v0, v1}, Lcom/google/android/gms/cast/internal/m;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/google/android/gms/cast/internal/e;->a:Lcom/google/android/gms/cast/internal/m;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/cast/internal/e;->A:Ljava/lang/Object;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/cast/internal/e;->B:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lcom/google/android/gms/common/internal/s;Lcom/google/android/gms/cast/CastDevice;JLcom/google/android/gms/cast/a$d;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;)V
    .locals 7

    const/16 v3, 0xa

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p8

    move-object/from16 v6, p9

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/common/internal/w;-><init>(Landroid/content/Context;Landroid/os/Looper;ILcom/google/android/gms/common/internal/s;Lcom/google/android/gms/common/api/g$b;Lcom/google/android/gms/common/api/g$c;)V

    iput-object p4, p0, Lcom/google/android/gms/cast/internal/e;->f:Lcom/google/android/gms/cast/CastDevice;

    iput-object p7, p0, Lcom/google/android/gms/cast/internal/e;->g:Lcom/google/android/gms/cast/a$d;

    iput-wide p5, p0, Lcom/google/android/gms/cast/internal/e;->i:J

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/cast/internal/e;->h:Ljava/util/Map;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v2, 0x0

    invoke-direct {v0, v2, v3}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    iput-object v0, p0, Lcom/google/android/gms/cast/internal/e;->s:Ljava/util/concurrent/atomic/AtomicLong;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/cast/internal/e;->w:Ljava/util/Map;

    invoke-direct {p0}, Lcom/google/android/gms/cast/internal/e;->K()V

    return-void
.end method

.method private K()V
    .locals 3

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v0, -0x1

    iput-boolean v2, p0, Lcom/google/android/gms/cast/internal/e;->o:Z

    iput v0, p0, Lcom/google/android/gms/cast/internal/e;->q:I

    iput v0, p0, Lcom/google/android/gms/cast/internal/e;->r:I

    iput-object v1, p0, Lcom/google/android/gms/cast/internal/e;->e:Lcom/google/android/gms/cast/ApplicationMetadata;

    iput-object v1, p0, Lcom/google/android/gms/cast/internal/e;->k:Ljava/lang/String;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/cast/internal/e;->p:D

    iput-boolean v2, p0, Lcom/google/android/gms/cast/internal/e;->l:Z

    return-void
.end method

.method private L()V
    .locals 3

    sget-object v0, Lcom/google/android/gms/cast/internal/e;->a:Lcom/google/android/gms/cast/internal/m;

    const-string v1, "removing all MessageReceivedCallbacks"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/cast/internal/m;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/google/android/gms/cast/internal/e;->h:Ljava/util/Map;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/cast/internal/e;->h:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method static synthetic a(Lcom/google/android/gms/cast/internal/e;Lcom/google/android/gms/cast/ApplicationMetadata;)Lcom/google/android/gms/cast/ApplicationMetadata;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/internal/e;->e:Lcom/google/android/gms/cast/ApplicationMetadata;

    return-object p1
.end method

.method static synthetic a(Lcom/google/android/gms/cast/internal/e;Lcom/google/android/gms/internal/ahl$b;)Lcom/google/android/gms/internal/ahl$b;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/internal/e;->y:Lcom/google/android/gms/internal/ahl$b;

    return-object p1
.end method

.method static synthetic a(Lcom/google/android/gms/cast/internal/e;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/internal/e;->t:Ljava/lang/String;

    return-object p1
.end method

.method private a(Lcom/google/android/gms/cast/internal/ApplicationStatus;)V
    .locals 7

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {p1}, Lcom/google/android/gms/cast/internal/ApplicationStatus;->b()Ljava/lang/String;

    move-result-object v0

    iget-object v3, p0, Lcom/google/android/gms/cast/internal/e;->k:Ljava/lang/String;

    invoke-static {v0, v3}, Lcom/google/android/gms/cast/internal/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    iput-object v0, p0, Lcom/google/android/gms/cast/internal/e;->k:Ljava/lang/String;

    move v0, v1

    :goto_0
    sget-object v3, Lcom/google/android/gms/cast/internal/e;->a:Lcom/google/android/gms/cast/internal/m;

    const-string v4, "hasChanged=%b, mFirstApplicationStatusUpdate=%b"

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    aput-object v6, v5, v2

    iget-boolean v6, p0, Lcom/google/android/gms/cast/internal/e;->m:Z

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    aput-object v6, v5, v1

    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/cast/internal/m;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/google/android/gms/cast/internal/e;->g:Lcom/google/android/gms/cast/a$d;

    if-eqz v1, :cond_1

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/cast/internal/e;->m:Z

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/cast/internal/e;->g:Lcom/google/android/gms/cast/a$d;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/a$d;->a()V

    :cond_1
    iput-boolean v2, p0, Lcom/google/android/gms/cast/internal/e;->m:Z

    return-void

    :cond_2
    move v0, v2

    goto :goto_0
.end method

.method private a(Lcom/google/android/gms/cast/internal/DeviceStatus;)V
    .locals 11

    const/4 v10, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {p1}, Lcom/google/android/gms/cast/internal/DeviceStatus;->f()Lcom/google/android/gms/cast/ApplicationMetadata;

    move-result-object v0

    iget-object v3, p0, Lcom/google/android/gms/cast/internal/e;->e:Lcom/google/android/gms/cast/ApplicationMetadata;

    invoke-static {v0, v3}, Lcom/google/android/gms/cast/internal/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    iput-object v0, p0, Lcom/google/android/gms/cast/internal/e;->e:Lcom/google/android/gms/cast/ApplicationMetadata;

    iget-object v0, p0, Lcom/google/android/gms/cast/internal/e;->g:Lcom/google/android/gms/cast/a$d;

    iget-object v3, p0, Lcom/google/android/gms/cast/internal/e;->e:Lcom/google/android/gms/cast/ApplicationMetadata;

    invoke-virtual {v0, v3}, Lcom/google/android/gms/cast/a$d;->a(Lcom/google/android/gms/cast/ApplicationMetadata;)V

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/cast/internal/DeviceStatus;->b()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-nez v0, :cond_a

    iget-wide v6, p0, Lcom/google/android/gms/cast/internal/e;->p:D

    sub-double v6, v4, v6

    invoke-static {v6, v7}, Ljava/lang/Math;->abs(D)D

    move-result-wide v6

    const-wide v8, 0x3e7ad7f29abcaf48L    # 1.0E-7

    cmpl-double v0, v6, v8

    if-lez v0, :cond_a

    iput-wide v4, p0, Lcom/google/android/gms/cast/internal/e;->p:D

    move v0, v1

    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/cast/internal/DeviceStatus;->c()Z

    move-result v3

    iget-boolean v4, p0, Lcom/google/android/gms/cast/internal/e;->l:Z

    if-eq v3, v4, :cond_1

    iput-boolean v3, p0, Lcom/google/android/gms/cast/internal/e;->l:Z

    move v0, v1

    :cond_1
    sget-object v3, Lcom/google/android/gms/cast/internal/e;->a:Lcom/google/android/gms/cast/internal/m;

    const-string v4, "hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b"

    new-array v5, v10, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    aput-object v6, v5, v2

    iget-boolean v6, p0, Lcom/google/android/gms/cast/internal/e;->n:Z

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    aput-object v6, v5, v1

    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/cast/internal/m;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v3, p0, Lcom/google/android/gms/cast/internal/e;->g:Lcom/google/android/gms/cast/a$d;

    if-eqz v3, :cond_3

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lcom/google/android/gms/cast/internal/e;->n:Z

    if-eqz v0, :cond_3

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/cast/internal/e;->g:Lcom/google/android/gms/cast/a$d;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/a$d;->b()V

    :cond_3
    invoke-virtual {p1}, Lcom/google/android/gms/cast/internal/DeviceStatus;->d()I

    move-result v0

    iget v3, p0, Lcom/google/android/gms/cast/internal/e;->q:I

    if-eq v0, v3, :cond_9

    iput v0, p0, Lcom/google/android/gms/cast/internal/e;->q:I

    move v0, v1

    :goto_1
    sget-object v3, Lcom/google/android/gms/cast/internal/e;->a:Lcom/google/android/gms/cast/internal/m;

    const-string v4, "hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b"

    new-array v5, v10, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    aput-object v6, v5, v2

    iget-boolean v6, p0, Lcom/google/android/gms/cast/internal/e;->n:Z

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    aput-object v6, v5, v1

    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/cast/internal/m;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v3, p0, Lcom/google/android/gms/cast/internal/e;->g:Lcom/google/android/gms/cast/a$d;

    if-eqz v3, :cond_5

    if-nez v0, :cond_4

    iget-boolean v0, p0, Lcom/google/android/gms/cast/internal/e;->n:Z

    if-eqz v0, :cond_5

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/cast/internal/e;->g:Lcom/google/android/gms/cast/a$d;

    iget v3, p0, Lcom/google/android/gms/cast/internal/e;->q:I

    invoke-virtual {v0, v3}, Lcom/google/android/gms/cast/a$d;->b(I)V

    :cond_5
    invoke-virtual {p1}, Lcom/google/android/gms/cast/internal/DeviceStatus;->e()I

    move-result v0

    iget v3, p0, Lcom/google/android/gms/cast/internal/e;->r:I

    if-eq v0, v3, :cond_8

    iput v0, p0, Lcom/google/android/gms/cast/internal/e;->r:I

    move v0, v1

    :goto_2
    sget-object v3, Lcom/google/android/gms/cast/internal/e;->a:Lcom/google/android/gms/cast/internal/m;

    const-string v4, "hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b"

    new-array v5, v10, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    aput-object v6, v5, v2

    iget-boolean v6, p0, Lcom/google/android/gms/cast/internal/e;->n:Z

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    aput-object v6, v5, v1

    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/cast/internal/m;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/google/android/gms/cast/internal/e;->g:Lcom/google/android/gms/cast/a$d;

    if-eqz v1, :cond_7

    if-nez v0, :cond_6

    iget-boolean v0, p0, Lcom/google/android/gms/cast/internal/e;->n:Z

    if-eqz v0, :cond_7

    :cond_6
    iget-object v0, p0, Lcom/google/android/gms/cast/internal/e;->g:Lcom/google/android/gms/cast/a$d;

    iget v1, p0, Lcom/google/android/gms/cast/internal/e;->r:I

    invoke-virtual {v0, v1}, Lcom/google/android/gms/cast/a$d;->c(I)V

    :cond_7
    iput-boolean v2, p0, Lcom/google/android/gms/cast/internal/e;->n:Z

    return-void

    :cond_8
    move v0, v2

    goto :goto_2

    :cond_9
    move v0, v2

    goto :goto_1

    :cond_a
    move v0, v2

    goto/16 :goto_0
.end method

.method static synthetic a(Lcom/google/android/gms/cast/internal/e;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/cast/internal/e;->K()V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/cast/internal/e;Lcom/google/android/gms/cast/internal/ApplicationStatus;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/cast/internal/e;->a(Lcom/google/android/gms/cast/internal/ApplicationStatus;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/cast/internal/e;Lcom/google/android/gms/cast/internal/DeviceStatus;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/cast/internal/e;->a(Lcom/google/android/gms/cast/internal/DeviceStatus;)V

    return-void
.end method

.method static synthetic b(Lcom/google/android/gms/cast/internal/e;)Lcom/google/android/gms/internal/ahl$b;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/internal/e;->y:Lcom/google/android/gms/internal/ahl$b;

    return-object v0
.end method

.method static synthetic b(Lcom/google/android/gms/cast/internal/e;Lcom/google/android/gms/internal/ahl$b;)Lcom/google/android/gms/internal/ahl$b;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/internal/e;->z:Lcom/google/android/gms/internal/ahl$b;

    return-object p1
.end method

.method static synthetic b(Lcom/google/android/gms/cast/internal/e;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/internal/e;->u:Ljava/lang/String;

    return-object p1
.end method

.method private b(Lcom/google/android/gms/internal/ahl$b;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/cast/a$a;",
            ">;)V"
        }
    .end annotation

    sget-object v1, Lcom/google/android/gms/cast/internal/e;->A:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/cast/internal/e;->y:Lcom/google/android/gms/internal/ahl$b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/internal/e;->y:Lcom/google/android/gms/internal/ahl$b;

    new-instance v2, Lcom/google/android/gms/cast/internal/e$a;

    new-instance v3, Lcom/google/android/gms/common/api/Status;

    const/16 v4, 0x7d2

    invoke-direct {v3, v4}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-direct {v2, v3}, Lcom/google/android/gms/cast/internal/e$a;-><init>(Lcom/google/android/gms/common/api/Status;)V

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/ahl$b;->a(Ljava/lang/Object;)V

    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/cast/internal/e;->y:Lcom/google/android/gms/internal/ahl$b;

    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method static synthetic c(Lcom/google/android/gms/cast/internal/e;)Lcom/google/android/gms/cast/a$d;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/internal/e;->g:Lcom/google/android/gms/cast/a$d;

    return-object v0
.end method

.method static synthetic c(Lcom/google/android/gms/cast/internal/e;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/internal/e;->k:Ljava/lang/String;

    return-object p1
.end method

.method private c(Lcom/google/android/gms/internal/ahl$b;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;)V"
        }
    .end annotation

    sget-object v1, Lcom/google/android/gms/cast/internal/e;->B:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/cast/internal/e;->z:Lcom/google/android/gms/internal/ahl$b;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const/16 v2, 0x7d1

    invoke-direct {v0, v2}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/ahl$b;->a(Ljava/lang/Object;)V

    monitor-exit v1

    :goto_0
    return-void

    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/cast/internal/e;->z:Lcom/google/android/gms/internal/ahl$b;

    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method static synthetic d(Lcom/google/android/gms/cast/internal/e;)Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/internal/e;->h:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic e(Lcom/google/android/gms/cast/internal/e;)Lcom/google/android/gms/cast/CastDevice;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/internal/e;->f:Lcom/google/android/gms/cast/CastDevice;

    return-object v0
.end method

.method static synthetic f(Lcom/google/android/gms/cast/internal/e;)Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/internal/e;->w:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic g(Lcom/google/android/gms/cast/internal/e;)Lcom/google/android/gms/internal/ahl$b;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/internal/e;->z:Lcom/google/android/gms/internal/ahl$b;

    return-object v0
.end method

.method static synthetic q()Lcom/google/android/gms/cast/internal/m;
    .locals 1

    sget-object v0, Lcom/google/android/gms/cast/internal/e;->a:Lcom/google/android/gms/cast/internal/m;

    return-object v0
.end method

.method static synthetic r()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lcom/google/android/gms/cast/internal/e;->A:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic s()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lcom/google/android/gms/cast/internal/e;->B:Ljava/lang/Object;

    return-object v0
.end method


# virtual methods
.method protected a(Landroid/os/IBinder;)Lcom/google/android/gms/cast/internal/j;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/cast/internal/j$a;->a(Landroid/os/IBinder;)Lcom/google/android/gms/cast/internal/j;

    move-result-object v0

    return-object v0
.end method

.method protected a()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    const-string v0, "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE"

    return-object v0
.end method

.method public a(D)V
    .locals 7

    invoke-static {p1, p2}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1, p2}, Ljava/lang/Double;->isNaN(D)Z

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

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/cast/internal/e;->h()Lcom/google/android/gms/cast/internal/j;

    move-result-object v1

    iget-wide v4, p0, Lcom/google/android/gms/cast/internal/e;->p:D

    iget-boolean v6, p0, Lcom/google/android/gms/cast/internal/e;->l:Z

    move-wide v2, p1

    invoke-interface/range {v1 .. v6}, Lcom/google/android/gms/cast/internal/j;->a(DDZ)V

    return-void
.end method

.method protected a(ILandroid/os/IBinder;Landroid/os/Bundle;I)V
    .locals 7

    const/16 v6, 0x3e9

    const/4 v0, 0x0

    const/4 v5, 0x1

    sget-object v1, Lcom/google/android/gms/cast/internal/e;->a:Lcom/google/android/gms/cast/internal/m;

    const-string v2, "in onPostInitHandler; statusCode=%d"

    new-array v3, v5, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v0

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/cast/internal/m;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz p1, :cond_0

    if-ne p1, v6, :cond_2

    :cond_0
    iput-boolean v5, p0, Lcom/google/android/gms/cast/internal/e;->o:Z

    iput-boolean v5, p0, Lcom/google/android/gms/cast/internal/e;->m:Z

    iput-boolean v5, p0, Lcom/google/android/gms/cast/internal/e;->n:Z

    :goto_0
    if-ne p1, v6, :cond_1

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    iput-object v1, p0, Lcom/google/android/gms/cast/internal/e;->v:Landroid/os/Bundle;

    iget-object v1, p0, Lcom/google/android/gms/cast/internal/e;->v:Landroid/os/Bundle;

    const-string v2, "com.google.android.gms.cast.EXTRA_APP_NO_LONGER_RUNNING"

    invoke-virtual {v1, v2, v5}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    move p1, v0

    :cond_1
    invoke-super {p0, p1, p2, p3, p4}, Lcom/google/android/gms/common/internal/w;->a(ILandroid/os/IBinder;Landroid/os/Bundle;I)V

    return-void

    :cond_2
    iput-boolean v0, p0, Lcom/google/android/gms/cast/internal/e;->o:Z

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/google/android/gms/common/internal/w;->a(Lcom/google/android/gms/common/ConnectionResult;)V

    invoke-direct {p0}, Lcom/google/android/gms/cast/internal/e;->L()V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ahl$b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lcom/google/android/gms/cast/internal/e;->c(Lcom/google/android/gms/internal/ahl$b;)V

    invoke-virtual {p0}, Lcom/google/android/gms/cast/internal/e;->h()Lcom/google/android/gms/cast/internal/j;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/cast/internal/j;->b()V

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 6

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Channel namespace cannot be null or empty"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/cast/internal/e;->h:Ljava/util/Map;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/cast/internal/e;->h:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/a$e;

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_1

    :try_start_1
    invoke-virtual {p0}, Lcom/google/android/gms/cast/internal/e;->h()Lcom/google/android/gms/cast/internal/j;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/google/android/gms/cast/internal/j;->c(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0

    :cond_1
    :goto_0
    return-void

    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :catch_0
    move-exception v0

    sget-object v1, Lcom/google/android/gms/cast/internal/e;->a:Lcom/google/android/gms/cast/internal/m;

    const-string v2, "Error unregistering namespace (%s): %s"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    const/4 v4, 0x1

    invoke-virtual {v0}, Ljava/lang/IllegalStateException;->getMessage()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-virtual {v1, v0, v2, v3}, Lcom/google/android/gms/cast/internal/m;->a(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public a(Ljava/lang/String;Lcom/google/android/gms/cast/LaunchOptions;Lcom/google/android/gms/internal/ahl$b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/cast/LaunchOptions;",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/cast/a$a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p3}, Lcom/google/android/gms/cast/internal/e;->b(Lcom/google/android/gms/internal/ahl$b;)V

    invoke-virtual {p0}, Lcom/google/android/gms/cast/internal/e;->h()Lcom/google/android/gms/cast/internal/j;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/cast/internal/j;->a(Ljava/lang/String;Lcom/google/android/gms/cast/LaunchOptions;)V

    return-void
.end method

.method public a(Ljava/lang/String;Lcom/google/android/gms/cast/a$e;)V
    .locals 2

    invoke-static {p1}, Lcom/google/android/gms/cast/internal/f;->a(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/google/android/gms/cast/internal/e;->a(Ljava/lang/String;)V

    if-eqz p2, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/cast/internal/e;->h:Ljava/util/Map;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/cast/internal/e;->h:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Lcom/google/android/gms/cast/internal/e;->h()Lcom/google/android/gms/cast/internal/j;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/google/android/gms/cast/internal/j;->b(Ljava/lang/String;)V

    :cond_0
    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public a(Ljava/lang/String;Lcom/google/android/gms/internal/ahl$b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p2}, Lcom/google/android/gms/cast/internal/e;->c(Lcom/google/android/gms/internal/ahl$b;)V

    invoke-virtual {p0}, Lcom/google/android/gms/cast/internal/e;->h()Lcom/google/android/gms/cast/internal/j;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/google/android/gms/cast/internal/j;->a(Ljava/lang/String;)V

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/cast/JoinOptions;Lcom/google/android/gms/internal/ahl$b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/cast/JoinOptions;",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/cast/a$a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p4}, Lcom/google/android/gms/cast/internal/e;->b(Lcom/google/android/gms/internal/ahl$b;)V

    if-nez p3, :cond_0

    new-instance p3, Lcom/google/android/gms/cast/JoinOptions;

    invoke-direct {p3}, Lcom/google/android/gms/cast/JoinOptions;-><init>()V

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/cast/internal/e;->h()Lcom/google/android/gms/cast/internal/j;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3}, Lcom/google/android/gms/cast/internal/j;->a(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/cast/JoinOptions;)V

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ahl$b;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;)V"
        }
    .end annotation

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The message payload cannot be null or empty"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    const/high16 v1, 0x10000

    if-le v0, v1, :cond_1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Message exceeds maximum size"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static {p1}, Lcom/google/android/gms/cast/internal/f;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/android/gms/cast/internal/e;->p()V

    iget-object v0, p0, Lcom/google/android/gms/cast/internal/e;->s:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    move-result-wide v2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/cast/internal/e;->w:Ljava/util/Map;

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/android/gms/cast/internal/e;->h()Lcom/google/android/gms/cast/internal/j;

    move-result-object v0

    invoke-interface {v0, p1, p2, v2, v3}, Lcom/google/android/gms/cast/internal/j;->a(Ljava/lang/String;Ljava/lang/String;J)V
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/cast/internal/e;->w:Ljava/util/Map;

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    throw v0
.end method

.method public a(Ljava/lang/String;ZLcom/google/android/gms/internal/ahl$b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/cast/a$a;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/cast/LaunchOptions;

    invoke-direct {v0}, Lcom/google/android/gms/cast/LaunchOptions;-><init>()V

    invoke-virtual {v0, p2}, Lcom/google/android/gms/cast/LaunchOptions;->a(Z)V

    invoke-virtual {p0, p1, v0, p3}, Lcom/google/android/gms/cast/internal/e;->a(Ljava/lang/String;Lcom/google/android/gms/cast/LaunchOptions;Lcom/google/android/gms/internal/ahl$b;)V

    return-void
.end method

.method public a(Z)V
    .locals 4

    invoke-virtual {p0}, Lcom/google/android/gms/cast/internal/e;->h()Lcom/google/android/gms/cast/internal/j;

    move-result-object v0

    iget-wide v2, p0, Lcom/google/android/gms/cast/internal/e;->p:D

    iget-boolean v1, p0, Lcom/google/android/gms/cast/internal/e;->l:Z

    invoke-interface {v0, p1, v2, v3, v1}, Lcom/google/android/gms/cast/internal/j;->a(ZDZ)V

    return-void
.end method

.method protected synthetic b(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/cast/internal/e;->a(Landroid/os/IBinder;)Lcom/google/android/gms/cast/internal/j;

    move-result-object v0

    return-object v0
.end method

.method protected b()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    const-string v0, "com.google.android.gms.cast.internal.ICastDeviceController"

    return-object v0
.end method

.method protected c()Landroid/os/Bundle;
    .locals 6

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    sget-object v1, Lcom/google/android/gms/cast/internal/e;->a:Lcom/google/android/gms/cast/internal/m;

    const-string v2, "getRemoteService(): mLastApplicationId=%s, mLastSessionId=%s"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/google/android/gms/cast/internal/e;->t:Ljava/lang/String;

    aput-object v5, v3, v4

    const/4 v4, 0x1

    iget-object v5, p0, Lcom/google/android/gms/cast/internal/e;->u:Ljava/lang/String;

    aput-object v5, v3, v4

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/cast/internal/m;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/google/android/gms/cast/internal/e;->f:Lcom/google/android/gms/cast/CastDevice;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/cast/CastDevice;->a(Landroid/os/Bundle;)V

    const-string v1, "com.google.android.gms.cast.EXTRA_CAST_FLAGS"

    iget-wide v2, p0, Lcom/google/android/gms/cast/internal/e;->i:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    new-instance v1, Lcom/google/android/gms/cast/internal/e$b;

    invoke-direct {v1, p0}, Lcom/google/android/gms/cast/internal/e$b;-><init>(Lcom/google/android/gms/cast/internal/e;)V

    iput-object v1, p0, Lcom/google/android/gms/cast/internal/e;->j:Lcom/google/android/gms/cast/internal/e$b;

    const-string v1, "listener"

    new-instance v2, Lcom/google/android/gms/common/internal/BinderWrapper;

    iget-object v3, p0, Lcom/google/android/gms/cast/internal/e;->j:Lcom/google/android/gms/cast/internal/e$b;

    invoke-virtual {v3}, Lcom/google/android/gms/cast/internal/e$b;->asBinder()Landroid/os/IBinder;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/google/android/gms/common/internal/BinderWrapper;-><init>(Landroid/os/IBinder;)V

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    iget-object v1, p0, Lcom/google/android/gms/cast/internal/e;->t:Ljava/lang/String;

    if-eqz v1, :cond_0

    const-string v1, "last_application_id"

    iget-object v2, p0, Lcom/google/android/gms/cast/internal/e;->t:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Lcom/google/android/gms/cast/internal/e;->u:Ljava/lang/String;

    if-eqz v1, :cond_0

    const-string v1, "last_session_id"

    iget-object v2, p0, Lcom/google/android/gms/cast/internal/e;->u:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-object v0
.end method

.method public f()V
    .locals 6

    const/4 v5, 0x1

    const/4 v4, 0x0

    sget-object v0, Lcom/google/android/gms/cast/internal/e;->a:Lcom/google/android/gms/cast/internal/m;

    const-string v1, "disconnect(); ServiceListener=%s, isConnected=%b"

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/google/android/gms/cast/internal/e;->j:Lcom/google/android/gms/cast/internal/e$b;

    aput-object v3, v2, v4

    invoke-virtual {p0}, Lcom/google/android/gms/cast/internal/e;->t()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    aput-object v3, v2, v5

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/cast/internal/m;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/cast/internal/e;->j:Lcom/google/android/gms/cast/internal/e$b;

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/google/android/gms/cast/internal/e;->j:Lcom/google/android/gms/cast/internal/e$b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/internal/e$b;->a()Lcom/google/android/gms/cast/internal/e;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    sget-object v0, Lcom/google/android/gms/cast/internal/e;->a:Lcom/google/android/gms/cast/internal/m;

    const-string v1, "already disposed, so short-circuiting"

    new-array v2, v4, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/cast/internal/m;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void

    :cond_1
    invoke-direct {p0}, Lcom/google/android/gms/cast/internal/e;->L()V

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/cast/internal/e;->h()Lcom/google/android/gms/cast/internal/j;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/cast/internal/j;->a()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-super {p0}, Lcom/google/android/gms/common/internal/w;->f()V

    goto :goto_0

    :catch_0
    move-exception v0

    :goto_1
    :try_start_1
    sget-object v1, Lcom/google/android/gms/cast/internal/e;->a:Lcom/google/android/gms/cast/internal/m;

    const-string v2, "Error while disconnecting the controller interface: %s"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v5

    aput-object v5, v3, v4

    invoke-virtual {v1, v0, v2, v3}, Lcom/google/android/gms/cast/internal/m;->a(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-super {p0}, Lcom/google/android/gms/common/internal/w;->f()V

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-super {p0}, Lcom/google/android/gms/common/internal/w;->f()V

    throw v0

    :catch_1
    move-exception v0

    goto :goto_1
.end method

.method public g()Landroid/os/Bundle;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/cast/internal/e;->v:Landroid/os/Bundle;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/internal/e;->v:Landroid/os/Bundle;

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/google/android/gms/cast/internal/e;->v:Landroid/os/Bundle;

    :goto_0
    return-object v0

    :cond_0
    invoke-super {p0}, Lcom/google/android/gms/common/internal/w;->g()Landroid/os/Bundle;

    move-result-object v0

    goto :goto_0
.end method

.method h()Lcom/google/android/gms/cast/internal/j;
    .locals 1

    const/4 v0, 0x0

    if-nez v0, :cond_0

    invoke-super {p0}, Lcom/google/android/gms/common/internal/w;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/internal/j;

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/cast/internal/e;->x:Lcom/google/android/gms/cast/internal/j;

    goto :goto_0
.end method

.method public i()V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/cast/internal/e;->h()Lcom/google/android/gms/cast/internal/j;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/cast/internal/j;->c()V

    return-void
.end method

.method public j()D
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/cast/internal/e;->p()V

    iget-wide v0, p0, Lcom/google/android/gms/cast/internal/e;->p:D

    return-wide v0
.end method

.method public k()Z
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/cast/internal/e;->p()V

    iget-boolean v0, p0, Lcom/google/android/gms/cast/internal/e;->l:Z

    return v0
.end method

.method public l()I
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/cast/internal/e;->p()V

    iget v0, p0, Lcom/google/android/gms/cast/internal/e;->q:I

    return v0
.end method

.method public m()I
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/cast/internal/e;->p()V

    iget v0, p0, Lcom/google/android/gms/cast/internal/e;->r:I

    return v0
.end method

.method public n()Lcom/google/android/gms/cast/ApplicationMetadata;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/cast/internal/e;->p()V

    iget-object v0, p0, Lcom/google/android/gms/cast/internal/e;->e:Lcom/google/android/gms/cast/ApplicationMetadata;

    return-object v0
.end method

.method public o()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/cast/internal/e;->p()V

    iget-object v0, p0, Lcom/google/android/gms/cast/internal/e;->k:Ljava/lang/String;

    return-object v0
.end method

.method p()V
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/gms/cast/internal/e;->o:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/internal/e;->j:Lcom/google/android/gms/cast/internal/e$b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/internal/e;->j:Lcom/google/android/gms/cast/internal/e$b;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/internal/e$b;->b()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not connected to a device"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return-void
.end method
