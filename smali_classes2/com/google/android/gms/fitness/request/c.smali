.class public Lcom/google/android/gms/fitness/request/c;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/fitness/request/c$a;
    }
.end annotation


# static fields
.field public static final a:I = 0x1

.field public static final b:I = 0x2

.field public static final c:I = 0x3


# instance fields
.field private final d:Lcom/google/android/gms/fitness/data/DataSource;

.field private final e:Lcom/google/android/gms/fitness/data/DataType;

.field private final f:J

.field private final g:J

.field private final h:J

.field private final i:I

.field private final j:Lcom/google/android/gms/location/LocationRequest;

.field private final k:J


# direct methods
.method private constructor <init>(Lcom/google/android/gms/fitness/data/DataSource;Lcom/google/android/gms/location/LocationRequest;)V
    .locals 6

    const-wide v4, 0x7fffffffffffffffL

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/fitness/request/c;->j:Lcom/google/android/gms/location/LocationRequest;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p2}, Lcom/google/android/gms/location/LocationRequest;->c()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMicros(J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/fitness/request/c;->f:J

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p2}, Lcom/google/android/gms/location/LocationRequest;->e()J

    move-result-wide v2

    invoke-virtual {v0, v2, v3}, Ljava/util/concurrent/TimeUnit;->toMicros(J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/fitness/request/c;->g:J

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/c;->f:J

    iput-wide v0, p0, Lcom/google/android/gms/fitness/request/c;->h:J

    invoke-virtual {p1}, Lcom/google/android/gms/fitness/data/DataSource;->a()Lcom/google/android/gms/fitness/data/DataType;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/c;->e:Lcom/google/android/gms/fitness/data/DataType;

    invoke-static {p2}, Lcom/google/android/gms/fitness/request/c;->a(Lcom/google/android/gms/location/LocationRequest;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/fitness/request/c;->i:I

    iput-object p1, p0, Lcom/google/android/gms/fitness/request/c;->d:Lcom/google/android/gms/fitness/data/DataSource;

    invoke-virtual {p2}, Lcom/google/android/gms/location/LocationRequest;->f()J

    move-result-wide v0

    cmp-long v2, v0, v4

    if-nez v2, :cond_0

    iput-wide v4, p0, Lcom/google/android/gms/fitness/request/c;->k:J

    :goto_0
    return-void

    :cond_0
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v4

    sub-long/2addr v0, v4

    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/TimeUnit;->toMicros(J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/fitness/request/c;->k:J

    goto :goto_0
.end method

.method private constructor <init>(Lcom/google/android/gms/fitness/request/c$a;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/fitness/request/c$a;->a(Lcom/google/android/gms/fitness/request/c$a;)Lcom/google/android/gms/fitness/data/DataSource;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/c;->d:Lcom/google/android/gms/fitness/data/DataSource;

    invoke-static {p1}, Lcom/google/android/gms/fitness/request/c$a;->b(Lcom/google/android/gms/fitness/request/c$a;)Lcom/google/android/gms/fitness/data/DataType;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/c;->e:Lcom/google/android/gms/fitness/data/DataType;

    invoke-static {p1}, Lcom/google/android/gms/fitness/request/c$a;->c(Lcom/google/android/gms/fitness/request/c$a;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/fitness/request/c;->f:J

    invoke-static {p1}, Lcom/google/android/gms/fitness/request/c$a;->d(Lcom/google/android/gms/fitness/request/c$a;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/fitness/request/c;->g:J

    invoke-static {p1}, Lcom/google/android/gms/fitness/request/c$a;->e(Lcom/google/android/gms/fitness/request/c$a;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/fitness/request/c;->h:J

    invoke-static {p1}, Lcom/google/android/gms/fitness/request/c$a;->f(Lcom/google/android/gms/fitness/request/c$a;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/fitness/request/c;->i:I

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/c;->j:Lcom/google/android/gms/location/LocationRequest;

    invoke-static {p1}, Lcom/google/android/gms/fitness/request/c$a;->g(Lcom/google/android/gms/fitness/request/c$a;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/fitness/request/c;->k:J

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/fitness/request/c$a;Lcom/google/android/gms/fitness/request/c$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/request/c;-><init>(Lcom/google/android/gms/fitness/request/c$a;)V

    return-void
.end method

.method private static a(Lcom/google/android/gms/location/LocationRequest;)I
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/location/LocationRequest;->b()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    const/4 v0, 0x2

    :goto_0
    return v0

    :sswitch_0
    const/4 v0, 0x3

    goto :goto_0

    :sswitch_1
    const/4 v0, 0x1

    goto :goto_0

    nop

    :sswitch_data_0
    .sparse-switch
        0x64 -> :sswitch_0
        0x68 -> :sswitch_1
    .end sparse-switch
.end method

.method public static a(Lcom/google/android/gms/fitness/data/DataSource;Lcom/google/android/gms/location/LocationRequest;)Lcom/google/android/gms/fitness/request/c;
    .locals 1

    new-instance v0, Lcom/google/android/gms/fitness/request/c;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/fitness/request/c;-><init>(Lcom/google/android/gms/fitness/data/DataSource;Lcom/google/android/gms/location/LocationRequest;)V

    return-object v0
.end method

.method private a(Lcom/google/android/gms/fitness/request/c;)Z
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/c;->d:Lcom/google/android/gms/fitness/data/DataSource;

    iget-object v1, p1, Lcom/google/android/gms/fitness/request/c;->d:Lcom/google/android/gms/fitness/data/DataSource;

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/c;->e:Lcom/google/android/gms/fitness/data/DataType;

    iget-object v1, p1, Lcom/google/android/gms/fitness/request/c;->e:Lcom/google/android/gms/fitness/data/DataType;

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/c;->f:J

    iget-wide v2, p1, Lcom/google/android/gms/fitness/request/c;->f:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/c;->g:J

    iget-wide v2, p1, Lcom/google/android/gms/fitness/request/c;->g:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/c;->h:J

    iget-wide v2, p1, Lcom/google/android/gms/fitness/request/c;->h:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget v0, p0, Lcom/google/android/gms/fitness/request/c;->i:I

    iget v1, p1, Lcom/google/android/gms/fitness/request/c;->i:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/c;->j:Lcom/google/android/gms/location/LocationRequest;

    iget-object v1, p1, Lcom/google/android/gms/fitness/request/c;->j:Lcom/google/android/gms/location/LocationRequest;

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/c;->k:J

    iget-wide v2, p1, Lcom/google/android/gms/fitness/request/c;->k:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public a(Ljava/util/concurrent/TimeUnit;)J
    .locals 3

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/c;->f:J

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MICROSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v0

    return-wide v0
.end method

.method public a()Lcom/google/android/gms/fitness/data/DataSource;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/c;->d:Lcom/google/android/gms/fitness/data/DataSource;

    return-object v0
.end method

.method public b(Ljava/util/concurrent/TimeUnit;)J
    .locals 3

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/c;->g:J

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MICROSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v0

    return-wide v0
.end method

.method public b()Lcom/google/android/gms/fitness/data/DataType;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/c;->e:Lcom/google/android/gms/fitness/data/DataType;

    return-object v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/fitness/request/c;->i:I

    return v0
.end method

.method public c(Ljava/util/concurrent/TimeUnit;)J
    .locals 3

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/c;->h:J

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MICROSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->convert(JLjava/util/concurrent/TimeUnit;)J

    move-result-wide v0

    return-wide v0
.end method

.method public d()J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/c;->k:J

    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-eq p0, p1, :cond_0

    instance-of v0, p1, Lcom/google/android/gms/fitness/request/c;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/google/android/gms/fitness/request/c;

    invoke-direct {p0, p1}, Lcom/google/android/gms/fitness/request/c;->a(Lcom/google/android/gms/fitness/request/c;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 4

    const/16 v0, 0x8

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/c;->d:Lcom/google/android/gms/fitness/data/DataSource;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/c;->e:Lcom/google/android/gms/fitness/data/DataType;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-wide v2, p0, Lcom/google/android/gms/fitness/request/c;->f:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x3

    iget-wide v2, p0, Lcom/google/android/gms/fitness/request/c;->g:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x4

    iget-wide v2, p0, Lcom/google/android/gms/fitness/request/c;->h:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x5

    iget v2, p0, Lcom/google/android/gms/fitness/request/c;->i:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x6

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/c;->j:Lcom/google/android/gms/location/LocationRequest;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    iget-wide v2, p0, Lcom/google/android/gms/fitness/request/c;->k:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/c;->a([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    invoke-static {p0}, Lcom/google/android/gms/common/internal/c;->a(Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "dataSource"

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/c;->d:Lcom/google/android/gms/fitness/data/DataSource;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "dataType"

    iget-object v2, p0, Lcom/google/android/gms/fitness/request/c;->e:Lcom/google/android/gms/fitness/data/DataType;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "samplingRateMicros"

    iget-wide v2, p0, Lcom/google/android/gms/fitness/request/c;->f:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "deliveryLatencyMicros"

    iget-wide v2, p0, Lcom/google/android/gms/fitness/request/c;->h:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    const-string v1, "timeOutMicros"

    iget-wide v2, p0, Lcom/google/android/gms/fitness/request/c;->k:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/internal/c$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/google/android/gms/common/internal/c$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/internal/c$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
