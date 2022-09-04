.class Lcom/google/android/gms/internal/aoq$d;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/di$a;
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/aoq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "d"
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/aoq;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/aoq;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/aoq$d;->a:Lcom/google/android/gms/internal/aoq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/aoq;Lcom/google/android/gms/internal/aoq$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/aoq$d;-><init>(Lcom/google/android/gms/internal/aoq;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/dm;)V
    .locals 4

    invoke-virtual {p1}, Lcom/google/android/gms/internal/dm;->a()Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/common/api/Status;->a:Lcom/google/android/gms/common/api/Status;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/aoq$d;->a:Lcom/google/android/gms/internal/aoq;

    invoke-static {v0}, Lcom/google/android/gms/internal/aoq;->d(Lcom/google/android/gms/internal/aoq;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0x2f

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Refreshed container "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ". Reinitializing runtime..."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/aph;->d(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/aoq$d;->a:Lcom/google/android/gms/internal/aoq;

    invoke-static {v0}, Lcom/google/android/gms/internal/aoq;->c(Lcom/google/android/gms/internal/aoq;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/aoq$e;

    iget-object v2, p0, Lcom/google/android/gms/internal/aoq$d;->a:Lcom/google/android/gms/internal/aoq;

    invoke-direct {v1, v2, p1}, Lcom/google/android/gms/internal/aoq$e;-><init>(Lcom/google/android/gms/internal/aoq;Lcom/google/android/gms/internal/dm;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ExecutorService;->execute(Ljava/lang/Runnable;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/aoq$d;->a:Lcom/google/android/gms/internal/aoq;

    iget-object v1, p0, Lcom/google/android/gms/internal/aoq$d;->a:Lcom/google/android/gms/internal/aoq;

    invoke-static {v1}, Lcom/google/android/gms/internal/aoq;->g(Lcom/google/android/gms/internal/aoq;)Lcom/google/android/gms/internal/aos;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/aos;->b()J

    move-result-wide v2

    invoke-static {v0, v2, v3}, Lcom/google/android/gms/internal/aoq;->a(Lcom/google/android/gms/internal/aoq;J)V

    goto :goto_0
.end method

.method public run()V
    .locals 7
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/aoq$d;->a:Lcom/google/android/gms/internal/aoq;

    invoke-static {v0}, Lcom/google/android/gms/internal/aoq;->a(Lcom/google/android/gms/internal/aoq;)I

    move-result v0

    const/4 v2, 0x2

    if-ne v0, v2, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/common/internal/d;->a(Z)V

    invoke-static {}, Lcom/google/android/gms/internal/apn;->a()Lcom/google/android/gms/internal/apn;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/gms/internal/aoq$d;->a:Lcom/google/android/gms/internal/aoq;

    invoke-static {v2}, Lcom/google/android/gms/internal/aoq;->d(Lcom/google/android/gms/internal/aoq;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/apn;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :goto_1
    return-void

    :cond_0
    move v0, v1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/aoq$d;->a:Lcom/google/android/gms/internal/aoq;

    invoke-static {v0}, Lcom/google/android/gms/internal/aoq;->d(Lcom/google/android/gms/internal/aoq;)Ljava/lang/String;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x18

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Refreshing container "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "..."

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/aph;->d(Ljava/lang/String;)V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/aoq$d;->a:Lcom/google/android/gms/internal/aoq;

    invoke-static {v0}, Lcom/google/android/gms/internal/aoq;->h(Lcom/google/android/gms/internal/aoq;)Lcom/google/android/gms/internal/di;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/aoq$d;->a:Lcom/google/android/gms/internal/aoq;

    invoke-static {v1}, Lcom/google/android/gms/internal/aoq;->d(Lcom/google/android/gms/internal/aoq;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/aoq$d;->a:Lcom/google/android/gms/internal/aoq;

    invoke-static {v2}, Lcom/google/android/gms/internal/aoq;->e(Lcom/google/android/gms/internal/aoq;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/aoq$d;->a:Lcom/google/android/gms/internal/aoq;

    invoke-static {v3}, Lcom/google/android/gms/internal/aoq;->f(Lcom/google/android/gms/internal/aoq;)Ljava/lang/String;

    move-result-object v3

    iget-object v5, p0, Lcom/google/android/gms/internal/aoq$d;->a:Lcom/google/android/gms/internal/aoq;

    invoke-static {v5}, Lcom/google/android/gms/internal/aoq;->g(Lcom/google/android/gms/internal/aoq;)Lcom/google/android/gms/internal/aos;

    move-result-object v6

    move-object v5, p0

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/internal/di;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/google/android/gms/internal/di$a;Lcom/google/android/gms/internal/aos;)V

    goto :goto_1
.end method
