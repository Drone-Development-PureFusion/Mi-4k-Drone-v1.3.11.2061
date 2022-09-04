.class public Lcom/google/android/gms/fitness/data/Session$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/fitness/data/Session;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:J

.field private b:J

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:I

.field private g:Ljava/lang/Long;


# direct methods
.method public constructor <init>()V
    .locals 2

    const-wide/16 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide v0, p0, Lcom/google/android/gms/fitness/data/Session$a;->a:J

    iput-wide v0, p0, Lcom/google/android/gms/fitness/data/Session$a;->b:J

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/fitness/data/Session$a;->c:Ljava/lang/String;

    const/4 v0, 0x4

    iput v0, p0, Lcom/google/android/gms/fitness/data/Session$a;->f:I

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/fitness/data/Session$a;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/fitness/data/Session$a;->a:J

    return-wide v0
.end method

.method static synthetic b(Lcom/google/android/gms/fitness/data/Session$a;)J
    .locals 2

    iget-wide v0, p0, Lcom/google/android/gms/fitness/data/Session$a;->b:J

    return-wide v0
.end method

.method static synthetic c(Lcom/google/android/gms/fitness/data/Session$a;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/Session$a;->c:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic d(Lcom/google/android/gms/fitness/data/Session$a;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/Session$a;->d:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic e(Lcom/google/android/gms/fitness/data/Session$a;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/Session$a;->e:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic f(Lcom/google/android/gms/fitness/data/Session$a;)I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/fitness/data/Session$a;->f:I

    return v0
.end method

.method static synthetic g(Lcom/google/android/gms/fitness/data/Session$a;)Lcom/google/android/gms/fitness/data/Application;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method static synthetic h(Lcom/google/android/gms/fitness/data/Session$a;)Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/Session$a;->g:Ljava/lang/Long;

    return-object v0
.end method


# virtual methods
.method public a(I)Lcom/google/android/gms/fitness/data/Session$a;
    .locals 0

    iput p1, p0, Lcom/google/android/gms/fitness/data/Session$a;->f:I

    return-object p0
.end method

.method public a(JLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/fitness/data/Session$a;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "Start time should be positive."

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->a(ZLjava/lang/Object;)V

    invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/fitness/data/Session$a;->a:J

    return-object p0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Ljava/lang/String;)Lcom/google/android/gms/fitness/data/Session$a;
    .locals 5

    const/16 v4, 0x64

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-gt v0, v4, :cond_0

    move v0, v1

    :goto_0
    const-string v3, "Session name cannot exceed %d characters"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v1, v2

    invoke-static {v0, v3, v1}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/google/android/gms/fitness/data/Session$a;->c:Ljava/lang/String;

    return-object p0

    :cond_0
    move v0, v2

    goto :goto_0
.end method

.method public a()Lcom/google/android/gms/fitness/data/Session;
    .locals 8

    const-wide/16 v6, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    iget-wide v4, p0, Lcom/google/android/gms/fitness/data/Session$a;->a:J

    cmp-long v0, v4, v6

    if-lez v0, :cond_4

    move v0, v1

    :goto_0
    const-string v3, "Start time should be specified."

    invoke-static {v0, v3}, Lcom/google/android/gms/common/internal/d;->a(ZLjava/lang/Object;)V

    iget-wide v4, p0, Lcom/google/android/gms/fitness/data/Session$a;->b:J

    cmp-long v0, v4, v6

    if-eqz v0, :cond_0

    iget-wide v4, p0, Lcom/google/android/gms/fitness/data/Session$a;->b:J

    iget-wide v6, p0, Lcom/google/android/gms/fitness/data/Session$a;->a:J

    cmp-long v0, v4, v6

    if-lez v0, :cond_1

    :cond_0
    move v2, v1

    :cond_1
    const-string v0, "End time should be later than start time."

    invoke-static {v2, v0}, Lcom/google/android/gms/common/internal/d;->a(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/Session$a;->d:Ljava/lang/String;

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/fitness/data/Session$a;->c:Ljava/lang/String;

    if-nez v0, :cond_5

    const-string v0, ""

    :goto_1
    iget-wide v2, p0, Lcom/google/android/gms/fitness/data/Session$a;->a:J

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x14

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/fitness/data/Session$a;->d:Ljava/lang/String;

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/fitness/data/Session$a;->e:Ljava/lang/String;

    if-nez v0, :cond_3

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/fitness/data/Session$a;->e:Ljava/lang/String;

    :cond_3
    new-instance v0, Lcom/google/android/gms/fitness/data/Session;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/fitness/data/Session;-><init>(Lcom/google/android/gms/fitness/data/Session$a;Lcom/google/android/gms/fitness/data/Session$1;)V

    return-object v0

    :cond_4
    move v0, v2

    goto :goto_0

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/fitness/data/Session$a;->c:Ljava/lang/String;

    goto :goto_1
.end method

.method public b(JLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/fitness/data/Session$a;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "End time should be positive."

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->a(ZLjava/lang/Object;)V

    invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/google/android/gms/fitness/data/Session$a;->b:J

    return-object p0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b(Ljava/lang/String;)Lcom/google/android/gms/fitness/data/Session$a;
    .locals 1

    if-eqz p1, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->b(Z)V

    iput-object p1, p0, Lcom/google/android/gms/fitness/data/Session$a;->d:Ljava/lang/String;

    return-object p0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c(JLjava/util/concurrent/TimeUnit;)Lcom/google/android/gms/fitness/data/Session$a;
    .locals 3

    invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/fitness/data/Session$a;->g:Ljava/lang/Long;

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lcom/google/android/gms/fitness/data/Session$a;
    .locals 5

    const/16 v4, 0x3e8

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-gt v0, v4, :cond_0

    move v0, v1

    :goto_0
    const-string v3, "Session description cannot exceed %d characters"

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v1, v2

    invoke-static {v0, v3, v1}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/String;[Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/google/android/gms/fitness/data/Session$a;->e:Ljava/lang/String;

    return-object p0

    :cond_0
    move v0, v2

    goto :goto_0
.end method

.method public d(Ljava/lang/String;)Lcom/google/android/gms/fitness/data/Session$a;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/fitness/d;->a(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/fitness/data/Session$a;->a(I)Lcom/google/android/gms/fitness/data/Session$a;

    move-result-object v0

    return-object v0
.end method
