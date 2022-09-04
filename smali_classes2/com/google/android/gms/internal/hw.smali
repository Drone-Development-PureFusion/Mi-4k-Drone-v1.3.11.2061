.class public Lcom/google/android/gms/internal/hw;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/hw$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/ScheduledExecutorService;

.field private final b:Lcom/google/android/gms/internal/ks;

.field private final c:J

.field private final d:J

.field private final e:D

.field private final f:D

.field private final g:Ljava/util/Random;

.field private h:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture",
            "<*>;"
        }
    .end annotation
.end field

.field private i:J

.field private j:Z


# direct methods
.method private constructor <init>(Ljava/util/concurrent/ScheduledExecutorService;Lcom/google/android/gms/internal/ks;JJDD)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/hw;->g:Ljava/util/Random;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/hw;->j:Z

    iput-object p1, p0, Lcom/google/android/gms/internal/hw;->a:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p2, p0, Lcom/google/android/gms/internal/hw;->b:Lcom/google/android/gms/internal/ks;

    iput-wide p3, p0, Lcom/google/android/gms/internal/hw;->c:J

    iput-wide p5, p0, Lcom/google/android/gms/internal/hw;->d:J

    iput-wide p7, p0, Lcom/google/android/gms/internal/hw;->f:D

    iput-wide p9, p0, Lcom/google/android/gms/internal/hw;->e:D

    return-void
.end method

.method synthetic constructor <init>(Ljava/util/concurrent/ScheduledExecutorService;Lcom/google/android/gms/internal/ks;JJDDLcom/google/android/gms/internal/hw$1;)V
    .locals 1

    invoke-direct/range {p0 .. p10}, Lcom/google/android/gms/internal/hw;-><init>(Ljava/util/concurrent/ScheduledExecutorService;Lcom/google/android/gms/internal/ks;JJDD)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/hw;Ljava/util/concurrent/ScheduledFuture;)Ljava/util/concurrent/ScheduledFuture;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/hw;->h:Ljava/util/concurrent/ScheduledFuture;

    return-object p1
.end method


# virtual methods
.method public a()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/hw;->j:Z

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/internal/hw;->i:J

    return-void
.end method

.method public a(Ljava/lang/Runnable;)V
    .locals 9

    const-wide/16 v0, 0x0

    const/4 v8, 0x0

    new-instance v2, Lcom/google/android/gms/internal/hw$1;

    invoke-direct {v2, p0, p1}, Lcom/google/android/gms/internal/hw$1;-><init>(Lcom/google/android/gms/internal/hw;Ljava/lang/Runnable;)V

    iget-object v3, p0, Lcom/google/android/gms/internal/hw;->h:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v3, :cond_0

    iget-object v3, p0, Lcom/google/android/gms/internal/hw;->b:Lcom/google/android/gms/internal/ks;

    const-string v4, "Cancelling previous scheduled retry"

    new-array v5, v8, [Ljava/lang/Object;

    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v3, p0, Lcom/google/android/gms/internal/hw;->h:Ljava/util/concurrent/ScheduledFuture;

    invoke-interface {v3, v8}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    const/4 v3, 0x0

    iput-object v3, p0, Lcom/google/android/gms/internal/hw;->h:Ljava/util/concurrent/ScheduledFuture;

    :cond_0
    iget-boolean v3, p0, Lcom/google/android/gms/internal/hw;->j:Z

    if-eqz v3, :cond_1

    :goto_0
    iput-boolean v8, p0, Lcom/google/android/gms/internal/hw;->j:Z

    iget-object v3, p0, Lcom/google/android/gms/internal/hw;->b:Lcom/google/android/gms/internal/ks;

    const-string v4, "Scheduling retry in %dms"

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    aput-object v6, v5, v8

    invoke-virtual {v3, v4, v5}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v3, p0, Lcom/google/android/gms/internal/hw;->a:Ljava/util/concurrent/ScheduledExecutorService;

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v3, v2, v0, v1, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/hw;->h:Ljava/util/concurrent/ScheduledFuture;

    return-void

    :cond_1
    iget-wide v4, p0, Lcom/google/android/gms/internal/hw;->i:J

    cmp-long v0, v4, v0

    if-nez v0, :cond_2

    iget-wide v0, p0, Lcom/google/android/gms/internal/hw;->c:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/hw;->i:J

    :goto_1
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    iget-wide v4, p0, Lcom/google/android/gms/internal/hw;->e:D

    sub-double/2addr v0, v4

    iget-wide v4, p0, Lcom/google/android/gms/internal/hw;->i:J

    long-to-double v4, v4

    mul-double/2addr v0, v4

    iget-wide v4, p0, Lcom/google/android/gms/internal/hw;->e:D

    iget-wide v6, p0, Lcom/google/android/gms/internal/hw;->i:J

    long-to-double v6, v6

    mul-double/2addr v4, v6

    iget-object v3, p0, Lcom/google/android/gms/internal/hw;->g:Ljava/util/Random;

    invoke-virtual {v3}, Ljava/util/Random;->nextDouble()D

    move-result-wide v6

    mul-double/2addr v4, v6

    add-double/2addr v0, v4

    double-to-long v0, v0

    goto :goto_0

    :cond_2
    iget-wide v0, p0, Lcom/google/android/gms/internal/hw;->i:J

    long-to-double v0, v0

    iget-wide v4, p0, Lcom/google/android/gms/internal/hw;->f:D

    mul-double/2addr v0, v4

    double-to-long v0, v0

    iget-wide v4, p0, Lcom/google/android/gms/internal/hw;->d:J

    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/internal/hw;->i:J

    goto :goto_1
.end method

.method public b()V
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/internal/hw;->d:J

    iput-wide v0, p0, Lcom/google/android/gms/internal/hw;->i:J

    return-void
.end method

.method public c()V
    .locals 4

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/hw;->h:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/hw;->b:Lcom/google/android/gms/internal/ks;

    const-string v1, "Cancelling existing retry attempt"

    new-array v2, v3, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/hw;->h:Ljava/util/concurrent/ScheduledFuture;

    invoke-interface {v0, v3}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/hw;->h:Ljava/util/concurrent/ScheduledFuture;

    :goto_0
    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/internal/hw;->i:J

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/hw;->b:Lcom/google/android/gms/internal/ks;

    const-string v1, "No existing retry attempt to cancel"

    new-array v2, v3, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method
