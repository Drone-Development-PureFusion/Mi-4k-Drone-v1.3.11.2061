.class public Lcom/google/android/gms/fitness/request/c$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/fitness/request/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Lcom/google/android/gms/fitness/data/DataSource;

.field private b:Lcom/google/android/gms/fitness/data/DataType;

.field private c:J

.field private d:J

.field private e:J

.field private f:Z

.field private g:I

.field private h:J


# direct methods
.method public constructor <init>()V
    .locals 4

    const-wide/16 v2, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/google/android/gms/fitness/request/c$a;->c:J

    iput-wide v2, p0, Lcom/google/android/gms/fitness/request/c$a;->d:J

    iput-wide v2, p0, Lcom/google/android/gms/fitness/request/c$a;->e:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/fitness/request/c$a;->f:Z

    const/4 v0, 0x2

    iput v0, p0, Lcom/google/android/gms/fitness/request/c$a;->g:I

    const-wide v0, 0x7fffffffffffffffL

    iput-wide v0, p0, Lcom/google/android/gms/fitness/request/c$a;->h:J

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/fitness/request/c$a;)Lcom/google/android/gms/fitness/data/DataSource;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/c$a;->a:Lcom/google/android/gms/fitness/data/DataSource;

    return-object v0
.end method

.method static synthetic b(Lcom/google/android/gms/fitness/request/c$a;)Lcom/google/android/gms/fitness/data/DataType;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/c$a;->b:Lcom/google/android/gms/fitness/data/DataType;

    return-object v0
.end method

.method static synthetic c(Lcom/google/android/gms/fitness/request/c$a;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/c$a;->c:J

    return-wide v0
.end method

.method static synthetic d(Lcom/google/android/gms/fitness/request/c$a;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/c$a;->d:J

    return-wide v0
.end method

.method static synthetic e(Lcom/google/android/gms/fitness/request/c$a;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/c$a;->e:J

    return-wide v0
.end method

.method static synthetic f(Lcom/google/android/gms/fitness/request/c$a;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/fitness/request/c$a;->g:I

    return v0
.end method

.method static synthetic g(Lcom/google/android/gms/fitness/request/c$a;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/c$a;->h:J

    return-wide v0
.end method


# virtual methods
.method public a(I)Lcom/google/android/gms/fitness/request/c$a;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/internal/akj;->a(I)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/fitness/request/c$a;->g:I

    return-object p0
.end method

.method public a(ILjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/fitness/request/c$a;
    .locals 3

    const/4 v1, 0x1

    if-ltz p1, :cond_0

    move v0, v1

    :goto_0
    const-string v2, "Cannot use a negative interval"

    invoke-static {v0, v2}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    iput-boolean v1, p0, Lcom/google/android/gms/fitness/request/c$a;->f:Z

    int-to-long v0, p1

    invoke-virtual {p2, v0, v1}, Ljava/util/concurrent/TimeUnit;->toMicros(J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/fitness/request/c$a;->d:J

    return-object p0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(JLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/fitness/request/c$a;
    .locals 5

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    const-string v1, "Cannot use a negative sampling interval"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toMicros(J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/fitness/request/c$a;->c:J

    iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/c$a;->f:Z

    if-nez v0, :cond_0

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/c$a;->c:J

    const-wide/16 v2, 0x2

    div-long/2addr v0, v2

    iput-wide v0, p0, Lcom/google/android/gms/fitness/request/c$a;->d:J

    :cond_0
    return-object p0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/fitness/data/DataSource;)Lcom/google/android/gms/fitness/request/c$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/fitness/request/c$a;->a:Lcom/google/android/gms/fitness/data/DataSource;

    return-object p0
.end method

.method public a(Lcom/google/android/gms/fitness/data/DataType;)Lcom/google/android/gms/fitness/request/c$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/fitness/request/c$a;->b:Lcom/google/android/gms/fitness/data/DataType;

    return-object p0
.end method

.method public a()Lcom/google/android/gms/fitness/request/c;
    .locals 4

    const/4 v2, 0x1

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/c$a;->a:Lcom/google/android/gms/fitness/data/DataSource;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/c$a;->b:Lcom/google/android/gms/fitness/data/DataType;

    if-eqz v0, :cond_3

    :cond_0
    move v0, v2

    :goto_0
    const-string v3, "Must call setDataSource() or setDataType()"

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/d;->a(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/c$a;->b:Lcom/google/android/gms/fitness/data/DataType;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/c$a;->a:Lcom/google/android/gms/fitness/data/DataSource;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/c$a;->b:Lcom/google/android/gms/fitness/data/DataType;

    iget-object v3, p0, Lcom/google/android/gms/fitness/request/c$a;->a:Lcom/google/android/gms/fitness/data/DataSource;

    invoke-virtual {v3}, Lcom/google/android/gms/fitness/data/DataSource;->a()Lcom/google/android/gms/fitness/data/DataType;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/google/android/gms/fitness/data/DataType;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    move v1, v2

    :cond_2
    const-string v0, "Specified data type is incompatible with specified data source"

    invoke-static {v1, v0}, Lcom/google/android/gms/common/internal/d;->a(ZLjava/lang/Object;)V

    new-instance v0, Lcom/google/android/gms/fitness/request/c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/fitness/request/c;-><init>(Lcom/google/android/gms/fitness/request/c$a;Lcom/google/android/gms/fitness/request/c$1;)V

    return-object v0

    :cond_3
    move v0, v1

    goto :goto_0
.end method

.method public b(ILjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/fitness/request/c$a;
    .locals 2

    if-ltz p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "Cannot use a negative delivery interval"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    int-to-long v0, p1

    invoke-virtual {p2, v0, v1}, Ljava/util/concurrent/TimeUnit;->toMicros(J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/fitness/request/c$a;->e:J

    return-object p0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b(JLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/fitness/request/c$a;
    .locals 7

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-wide/16 v4, 0x0

    cmp-long v0, p1, v4

    if-lez v0, :cond_0

    move v0, v1

    :goto_0
    const-string v3, "Invalid time out value specified: %d"

    new-array v4, v1, [Ljava/lang/Object;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v4, v2

    invoke-static {v0, v3, v4}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    if-eqz p3, :cond_1

    :goto_1
    const-string v0, "Invalid time unit specified"

    invoke-static {v1, v0}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toMicros(J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/fitness/request/c$a;->h:J

    return-object p0

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    move v1, v2

    goto :goto_1
.end method
