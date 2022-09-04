.class public Lcom/google/android/gms/fitness/request/SessionReadRequest$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/fitness/request/SessionReadRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:J

.field private d:J

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataType;",
            ">;"
        }
    .end annotation
.end field

.field private f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataSource;",
            ">;"
        }
    .end annotation
.end field

.field private g:Z

.field private h:Z

.field private i:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 4

    const-wide/16 v2, 0x0

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide v2, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$a;->c:J

    iput-wide v2, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$a;->d:J

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$a;->e:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$a;->f:Ljava/util/List;

    iput-boolean v1, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$a;->g:Z

    iput-boolean v1, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$a;->h:Z

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$a;->i:Ljava/util/List;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/fitness/request/SessionReadRequest$a;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$a;->a:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic b(Lcom/google/android/gms/fitness/request/SessionReadRequest$a;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$a;->b:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic c(Lcom/google/android/gms/fitness/request/SessionReadRequest$a;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$a;->c:J

    return-wide v0
.end method

.method static synthetic d(Lcom/google/android/gms/fitness/request/SessionReadRequest$a;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$a;->d:J

    return-wide v0
.end method

.method static synthetic e(Lcom/google/android/gms/fitness/request/SessionReadRequest$a;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$a;->e:Ljava/util/List;

    return-object v0
.end method

.method static synthetic f(Lcom/google/android/gms/fitness/request/SessionReadRequest$a;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$a;->f:Ljava/util/List;

    return-object v0
.end method

.method static synthetic g(Lcom/google/android/gms/fitness/request/SessionReadRequest$a;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$a;->g:Z

    return v0
.end method

.method static synthetic h(Lcom/google/android/gms/fitness/request/SessionReadRequest$a;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$a;->h:Z

    return v0
.end method

.method static synthetic i(Lcom/google/android/gms/fitness/request/SessionReadRequest$a;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$a;->i:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public a()Lcom/google/android/gms/fitness/request/SessionReadRequest$a;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$a;->g:Z

    return-object p0
.end method

.method public a(JJLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/fitness/request/SessionReadRequest$a;
    .locals 3

    invoke-virtual {p5, p1, p2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$a;->c:J

    invoke-virtual {p5, p3, p4}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$a;->d:J

    return-object p0
.end method

.method public a(Lcom/google/android/gms/fitness/data/DataSource;)Lcom/google/android/gms/fitness/request/SessionReadRequest$a;
    .locals 1

    const-string v0, "Attempting to add a null data source"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$a;->f:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$a;->f:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object p0
.end method

.method public a(Lcom/google/android/gms/fitness/data/DataType;)Lcom/google/android/gms/fitness/request/SessionReadRequest$a;
    .locals 1

    const-string v0, "Attempting to use a null data type"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$a;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$a;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object p0
.end method

.method public a(Ljava/lang/String;)Lcom/google/android/gms/fitness/request/SessionReadRequest$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$a;->a:Ljava/lang/String;

    return-object p0
.end method

.method public b()Lcom/google/android/gms/fitness/request/SessionReadRequest$a;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$a;->h:Z

    return-object p0
.end method

.method public b(Ljava/lang/String;)Lcom/google/android/gms/fitness/request/SessionReadRequest$a;
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$a;->b:Ljava/lang/String;

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lcom/google/android/gms/fitness/request/SessionReadRequest$a;
    .locals 1

    const-string v0, "Attempting to use a null package name"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$a;->i:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$a;->i:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object p0
.end method

.method public c()Lcom/google/android/gms/fitness/request/SessionReadRequest;
    .locals 10

    const-wide/16 v8, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    iget-wide v4, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$a;->c:J

    cmp-long v0, v4, v8

    if-lez v0, :cond_0

    move v0, v1

    :goto_0
    const-string v3, "Invalid start time: %s"

    new-array v4, v1, [Ljava/lang/Object;

    iget-wide v6, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$a;->c:J

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v4, v2

    invoke-static {v0, v3, v4}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-wide v4, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$a;->d:J

    cmp-long v0, v4, v8

    if-lez v0, :cond_1

    iget-wide v4, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$a;->d:J

    iget-wide v6, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$a;->c:J

    cmp-long v0, v4, v6

    if-lez v0, :cond_1

    move v0, v1

    :goto_1
    const-string v3, "Invalid end time: %s"

    new-array v1, v1, [Ljava/lang/Object;

    iget-wide v4, p0, Lcom/google/android/gms/fitness/request/SessionReadRequest$a;->d:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    aput-object v4, v1, v2

    invoke-static {v0, v3, v1}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Lcom/google/android/gms/fitness/request/SessionReadRequest;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/fitness/request/SessionReadRequest;-><init>(Lcom/google/android/gms/fitness/request/SessionReadRequest$a;Lcom/google/android/gms/fitness/request/SessionReadRequest$1;)V

    return-object v0

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v2

    goto :goto_1
.end method
