.class public Lcom/google/android/gms/fitness/request/DataReadRequest$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/fitness/request/DataReadRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataType;",
            ">;"
        }
    .end annotation
.end field

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataSource;",
            ">;"
        }
    .end annotation
.end field

.field private c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataType;",
            ">;"
        }
    .end annotation
.end field

.field private d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/DataSource;",
            ">;"
        }
    .end annotation
.end field

.field private e:Lcom/google/android/gms/fitness/data/DataSource;

.field private f:J

.field private g:J

.field private h:I

.field private i:J

.field private j:I

.field private k:Z

.field private l:Z

.field private final m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/fitness/data/Device;",
            ">;"
        }
    .end annotation
.end field

.field private final n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v2, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->a:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->b:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->c:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->d:Ljava/util/List;

    iput v2, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->h:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->i:J

    iput v2, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->j:I

    iput-boolean v2, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->k:Z

    iput-boolean v2, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->l:Z

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->m:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->n:Ljava/util/List;

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/fitness/request/DataReadRequest$a;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->a:Ljava/util/List;

    return-object v0
.end method

.method static synthetic b(Lcom/google/android/gms/fitness/request/DataReadRequest$a;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->b:Ljava/util/List;

    return-object v0
.end method

.method static synthetic c(Lcom/google/android/gms/fitness/request/DataReadRequest$a;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->f:J

    return-wide v0
.end method

.method static synthetic d(Lcom/google/android/gms/fitness/request/DataReadRequest$a;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->g:J

    return-wide v0
.end method

.method static synthetic e(Lcom/google/android/gms/fitness/request/DataReadRequest$a;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->c:Ljava/util/List;

    return-object v0
.end method

.method static synthetic f(Lcom/google/android/gms/fitness/request/DataReadRequest$a;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->d:Ljava/util/List;

    return-object v0
.end method

.method static synthetic g(Lcom/google/android/gms/fitness/request/DataReadRequest$a;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->h:I

    return v0
.end method

.method static synthetic h(Lcom/google/android/gms/fitness/request/DataReadRequest$a;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->i:J

    return-wide v0
.end method

.method static synthetic i(Lcom/google/android/gms/fitness/request/DataReadRequest$a;)Lcom/google/android/gms/fitness/data/DataSource;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->e:Lcom/google/android/gms/fitness/data/DataSource;

    return-object v0
.end method

.method static synthetic j(Lcom/google/android/gms/fitness/request/DataReadRequest$a;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->j:I

    return v0
.end method

.method static synthetic k(Lcom/google/android/gms/fitness/request/DataReadRequest$a;)Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method static synthetic l(Lcom/google/android/gms/fitness/request/DataReadRequest$a;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->l:Z

    return v0
.end method

.method static synthetic m(Lcom/google/android/gms/fitness/request/DataReadRequest$a;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->m:Ljava/util/List;

    return-object v0
.end method

.method static synthetic n(Lcom/google/android/gms/fitness/request/DataReadRequest$a;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->n:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public a()Lcom/google/android/gms/fitness/request/DataReadRequest$a;
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->l:Z

    return-object p0
.end method

.method public a(I)Lcom/google/android/gms/fitness/request/DataReadRequest$a;
    .locals 5

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-lez p1, :cond_0

    move v0, v1

    :goto_0
    const-string v3, "Invalid limit %d is specified"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v1, v2

    invoke-static {v0, v3, v1}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    iput p1, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->j:I

    return-object p0

    :cond_0
    move v0, v2

    goto :goto_0
.end method

.method public a(ILjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/fitness/request/DataReadRequest$a;
    .locals 6

    const/4 v2, 0x0

    const/4 v1, 0x1

    iget v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->h:I

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    const-string v3, "Bucketing strategy already set to %s"

    new-array v4, v1, [Ljava/lang/Object;

    iget v5, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->h:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v2

    invoke-static {v0, v3, v4}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    if-lez p1, :cond_1

    move v0, v1

    :goto_1
    const-string v3, "Must specify a valid minimum duration for an activity segment: %d"

    new-array v4, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v2

    invoke-static {v0, v3, v4}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    iput v1, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->h:I

    int-to-long v0, p1

    invoke-virtual {p2, v0, v1}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->i:J

    return-object p0

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v2

    goto :goto_1
.end method

.method public a(ILjava/util/concurrent/TimeUnit;Lcom/google/android/gms/fitness/data/DataSource;)Lcom/google/android/gms/fitness/request/DataReadRequest$a;
    .locals 6

    const/4 v1, 0x1

    const/4 v2, 0x0

    iget v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->h:I

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    const-string v3, "Bucketing strategy already set to %s"

    new-array v4, v1, [Ljava/lang/Object;

    iget v5, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->h:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v2

    invoke-static {v0, v3, v4}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    if-lez p1, :cond_1

    move v0, v1

    :goto_1
    const-string v3, "Must specify a valid minimum duration for an activity segment: %d"

    new-array v4, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v2

    invoke-static {v0, v3, v4}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    if-eqz p3, :cond_2

    move v0, v1

    :goto_2
    const-string v3, "Invalid activity data source specified"

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    invoke-virtual {p3}, Lcom/google/android/gms/fitness/data/DataSource;->a()Lcom/google/android/gms/fitness/data/DataType;

    move-result-object v0

    sget-object v3, Lcom/google/android/gms/fitness/data/DataType;->e:Lcom/google/android/gms/fitness/data/DataType;

    invoke-virtual {v0, v3}, Lcom/google/android/gms/fitness/data/DataType;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v3, "Invalid activity data source specified: %s"

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p3, v1, v2

    invoke-static {v0, v3, v1}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    iput-object p3, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->e:Lcom/google/android/gms/fitness/data/DataSource;

    const/4 v0, 0x3

    iput v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->h:I

    int-to-long v0, p1

    invoke-virtual {p2, v0, v1}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->i:J

    return-object p0

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v2

    goto :goto_1

    :cond_2
    move v0, v2

    goto :goto_2
.end method

.method public a(JJLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/fitness/request/DataReadRequest$a;
    .locals 3

    invoke-virtual {p5, p1, p2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->f:J

    invoke-virtual {p5, p3, p4}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->g:J

    return-object p0
.end method

.method public a(Lcom/google/android/gms/fitness/data/DataSource;)Lcom/google/android/gms/fitness/request/DataReadRequest$a;
    .locals 2

    const-string v0, "Attempting to add a null data source"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    const-string v1, "Cannot add the same data source as aggregated and detailed"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object p0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/fitness/data/DataSource;Lcom/google/android/gms/fitness/data/DataType;)Lcom/google/android/gms/fitness/request/DataReadRequest$a;
    .locals 6

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-string v0, "Attempting to add a null data source"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->b:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    move v0, v1

    :goto_0
    const-string v3, "Cannot add the same data source for aggregated and detailed"

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/d;->a(ZLjava/lang/Object;)V

    invoke-virtual {p1}, Lcom/google/android/gms/fitness/data/DataSource;->a()Lcom/google/android/gms/fitness/data/DataType;

    move-result-object v0

    sget-object v3, Lcom/google/android/gms/fitness/data/DataType;->W:Ljava/util/Set;

    invoke-interface {v3, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    const-string v4, "Unsupported input data type specified for aggregation: %s"

    new-array v5, v1, [Ljava/lang/Object;

    aput-object v0, v5, v2

    invoke-static {v3, v4, v5}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-static {v0}, Lcom/google/android/gms/fitness/data/DataType;->a(Lcom/google/android/gms/fitness/data/DataType;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    const-string v4, "Invalid output aggregate data type specified: %s -> %s"

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    aput-object v0, v5, v2

    aput-object p2, v5, v1

    invoke-static {v3, v4, v5}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object p0

    :cond_1
    move v0, v2

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/fitness/data/DataType;)Lcom/google/android/gms/fitness/request/DataReadRequest$a;
    .locals 2

    const-string v0, "Attempting to use a null data type"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    const-string v1, "Cannot add the same data type as aggregated and detailed"

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->a(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object p0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/fitness/data/DataType;Lcom/google/android/gms/fitness/data/DataType;)Lcom/google/android/gms/fitness/request/DataReadRequest$a;
    .locals 5

    const/4 v1, 0x1

    const/4 v2, 0x0

    const-string v0, "Attempting to use a null data type"

    invoke-static {p1, v0}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    move v0, v1

    :goto_0
    const-string v3, "Cannot add the same data type as aggregated and detailed"

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/d;->a(ZLjava/lang/Object;)V

    sget-object v0, Lcom/google/android/gms/fitness/data/DataType;->W:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    const-string v3, "Unsupported input data type specified for aggregation: %s"

    new-array v4, v1, [Ljava/lang/Object;

    aput-object p1, v4, v2

    invoke-static {v0, v3, v4}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-static {p1}, Lcom/google/android/gms/fitness/data/DataType;->a(Lcom/google/android/gms/fitness/data/DataType;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    const-string v3, "Invalid output aggregate data type specified: %s -> %s"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    aput-object p1, v4, v2

    aput-object p2, v4, v1

    invoke-static {v0, v3, v4}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object p0

    :cond_1
    move v0, v2

    goto :goto_0
.end method

.method public b(ILjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/fitness/request/DataReadRequest$a;
    .locals 6

    const/4 v1, 0x1

    const/4 v2, 0x0

    iget v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->h:I

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    const-string v3, "Bucketing strategy already set to %s"

    new-array v4, v1, [Ljava/lang/Object;

    iget v5, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->h:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v2

    invoke-static {v0, v3, v4}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    if-lez p1, :cond_1

    move v0, v1

    :goto_1
    const-string v3, "Must specify a valid minimum duration for an activity segment: %d"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v1, v2

    invoke-static {v0, v3, v1}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x3

    iput v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->h:I

    int-to-long v0, p1

    invoke-virtual {p2, v0, v1}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->i:J

    return-object p0

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v2

    goto :goto_1
.end method

.method public b(ILjava/util/concurrent/TimeUnit;Lcom/google/android/gms/fitness/data/DataSource;)Lcom/google/android/gms/fitness/request/DataReadRequest$a;
    .locals 6

    const/4 v1, 0x1

    const/4 v2, 0x0

    iget v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->h:I

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    const-string v3, "Bucketing strategy already set to %s"

    new-array v4, v1, [Ljava/lang/Object;

    iget v5, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->h:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v2

    invoke-static {v0, v3, v4}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    if-lez p1, :cond_1

    move v0, v1

    :goto_1
    const-string v3, "Must specify a valid minimum duration for an activity segment: %d"

    new-array v4, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v2

    invoke-static {v0, v3, v4}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    if-eqz p3, :cond_2

    move v0, v1

    :goto_2
    const-string v3, "Invalid activity data source specified"

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    invoke-virtual {p3}, Lcom/google/android/gms/fitness/data/DataSource;->a()Lcom/google/android/gms/fitness/data/DataType;

    move-result-object v0

    sget-object v3, Lcom/google/android/gms/fitness/data/DataType;->e:Lcom/google/android/gms/fitness/data/DataType;

    invoke-virtual {v0, v3}, Lcom/google/android/gms/fitness/data/DataType;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v3, "Invalid activity data source specified: %s"

    new-array v1, v1, [Ljava/lang/Object;

    aput-object p3, v1, v2

    invoke-static {v0, v3, v1}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    iput-object p3, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->e:Lcom/google/android/gms/fitness/data/DataSource;

    const/4 v0, 0x4

    iput v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->h:I

    int-to-long v0, p1

    invoke-virtual {p2, v0, v1}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->i:J

    return-object p0

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v2

    goto :goto_1

    :cond_2
    move v0, v2

    goto :goto_2
.end method

.method public b()Lcom/google/android/gms/fitness/request/DataReadRequest;
    .locals 10

    const-wide/16 v8, 0x0

    const/4 v2, 0x1

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    :cond_0
    move v0, v2

    :goto_0
    const-string v3, "Must add at least one data source (aggregated or detailed)"

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/d;->a(ZLjava/lang/Object;)V

    iget-wide v4, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->f:J

    cmp-long v0, v4, v8

    if-lez v0, :cond_4

    move v0, v2

    :goto_1
    const-string v3, "Invalid start time: %s"

    new-array v4, v2, [Ljava/lang/Object;

    iget-wide v6, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->f:J

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v4, v1

    invoke-static {v0, v3, v4}, Lcom/google/android/gms/common/internal/d;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-wide v4, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->g:J

    cmp-long v0, v4, v8

    if-lez v0, :cond_5

    iget-wide v4, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->g:J

    iget-wide v6, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->f:J

    cmp-long v0, v4, v6

    if-lez v0, :cond_5

    move v0, v2

    :goto_2
    const-string v3, "Invalid end time: %s"

    new-array v4, v2, [Ljava/lang/Object;

    iget-wide v6, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->g:J

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    aput-object v5, v4, v1

    invoke-static {v0, v3, v4}, Lcom/google/android/gms/common/internal/d;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_6

    move v0, v2

    :goto_3
    if-eqz v0, :cond_1

    iget v3, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->h:I

    if-eqz v3, :cond_2

    :cond_1
    if-nez v0, :cond_7

    iget v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->h:I

    if-eqz v0, :cond_7

    :cond_2
    :goto_4
    const-string v0, "Must specify a valid bucketing strategy while requesting aggregation"

    invoke-static {v2, v0}, Lcom/google/android/gms/common/internal/d;->a(ZLjava/lang/Object;)V

    new-instance v0, Lcom/google/android/gms/fitness/request/DataReadRequest;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/fitness/request/DataReadRequest;-><init>(Lcom/google/android/gms/fitness/request/DataReadRequest$a;Lcom/google/android/gms/fitness/request/DataReadRequest$1;)V

    return-object v0

    :cond_3
    move v0, v1

    goto :goto_0

    :cond_4
    move v0, v1

    goto :goto_1

    :cond_5
    move v0, v1

    goto :goto_2

    :cond_6
    move v0, v1

    goto :goto_3

    :cond_7
    move v2, v1

    goto :goto_4
.end method

.method public c(ILjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/fitness/request/DataReadRequest$a;
    .locals 6

    const/4 v1, 0x1

    const/4 v2, 0x0

    iget v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->h:I

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    const-string v3, "Bucketing strategy already set to %s"

    new-array v4, v1, [Ljava/lang/Object;

    iget v5, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->h:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v2

    invoke-static {v0, v3, v4}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    if-lez p1, :cond_1

    move v0, v1

    :goto_1
    const-string v3, "Must specify a valid minimum duration for an activity segment: %d"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v1, v2

    invoke-static {v0, v3, v1}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x4

    iput v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->h:I

    int-to-long v0, p1

    invoke-virtual {p2, v0, v1}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->i:J

    return-object p0

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v2

    goto :goto_1
.end method

.method public d(ILjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/fitness/request/DataReadRequest$a;
    .locals 6

    const/4 v1, 0x1

    const/4 v2, 0x0

    iget v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->h:I

    if-nez v0, :cond_0

    move v0, v1

    :goto_0
    const-string v3, "Bucketing strategy already set to %s"

    new-array v4, v1, [Ljava/lang/Object;

    iget v5, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->h:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v2

    invoke-static {v0, v3, v4}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    if-lez p1, :cond_1

    move v0, v1

    :goto_1
    const-string v3, "Must specify a valid minimum duration for an activity segment: %d"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v1, v2

    invoke-static {v0, v3, v1}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x2

    iput v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->h:I

    int-to-long v0, p1

    invoke-virtual {p2, v0, v1}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/fitness/request/DataReadRequest$a;->i:J

    return-object p0

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    move v0, v2

    goto :goto_1
.end method
