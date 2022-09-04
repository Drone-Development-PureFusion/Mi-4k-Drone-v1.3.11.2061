.class Lcom/google/android/gms/internal/aoq$e;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/aoq;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "e"
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/aoq;

.field private final b:Lcom/google/android/gms/internal/dm;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/aoq;Lcom/google/android/gms/internal/dm;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/aoq$e;->a:Lcom/google/android/gms/internal/aoq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/aoq$e;->b:Lcom/google/android/gms/internal/dm;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8
    .annotation build Landroid/support/annotation/WorkerThread;
    .end annotation

    const/4 v2, 0x1

    iget-object v0, p0, Lcom/google/android/gms/internal/aoq$e;->b:Lcom/google/android/gms/internal/dm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dm;->b()Lcom/google/android/gms/internal/dm$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dm$a;->c()Lcom/google/android/gms/internal/dv;

    move-result-object v3

    iget-object v0, p0, Lcom/google/android/gms/internal/aoq$e;->b:Lcom/google/android/gms/internal/dm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dm;->c()Lcom/google/android/gms/internal/dy;

    move-result-object v4

    iget-object v0, p0, Lcom/google/android/gms/internal/aoq$e;->a:Lcom/google/android/gms/internal/aoq;

    invoke-static {v0}, Lcom/google/android/gms/internal/aoq;->b(Lcom/google/android/gms/internal/aoq;)Lcom/google/android/gms/internal/app;

    move-result-object v0

    if-nez v0, :cond_0

    move v1, v2

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/aoq$e;->a:Lcom/google/android/gms/internal/aoq;

    iget-object v5, p0, Lcom/google/android/gms/internal/aoq$e;->a:Lcom/google/android/gms/internal/aoq;

    invoke-static {v5}, Lcom/google/android/gms/internal/aoq;->l(Lcom/google/android/gms/internal/aoq;)Lcom/google/android/gms/internal/apq;

    move-result-object v5

    invoke-virtual {v5, v3, v4}, Lcom/google/android/gms/internal/apq;->a(Lcom/google/android/gms/internal/dv;Lcom/google/android/gms/internal/dy;)Lcom/google/android/gms/internal/app;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/google/android/gms/internal/aoq;->a(Lcom/google/android/gms/internal/aoq;Lcom/google/android/gms/internal/app;)Lcom/google/android/gms/internal/app;

    iget-object v0, p0, Lcom/google/android/gms/internal/aoq$e;->a:Lcom/google/android/gms/internal/aoq;

    const/4 v3, 0x2

    invoke-static {v0, v3}, Lcom/google/android/gms/internal/aoq;->a(Lcom/google/android/gms/internal/aoq;I)I

    iget-object v0, p0, Lcom/google/android/gms/internal/aoq$e;->a:Lcom/google/android/gms/internal/aoq;

    invoke-static {v0}, Lcom/google/android/gms/internal/aoq;->d(Lcom/google/android/gms/internal/aoq;)Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x30

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "Container "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, " loaded during runtime initialization."

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/aph;->d(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/aoq$e;->a:Lcom/google/android/gms/internal/aoq;

    invoke-static {v0}, Lcom/google/android/gms/internal/aoq;->i(Lcom/google/android/gms/internal/aoq;)Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/aoq$e;->a:Lcom/google/android/gms/internal/aoq;

    invoke-static {v0}, Lcom/google/android/gms/internal/aoq;->i(Lcom/google/android/gms/internal/aoq;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/aow;

    const-string v5, "Evaluating tags for pending event "

    invoke-virtual {v0}, Lcom/google/android/gms/internal/aow;->d()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v6

    if-eqz v6, :cond_1

    invoke-virtual {v5, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    :goto_2
    invoke-static {v3}, Lcom/google/android/gms/internal/aph;->d(Ljava/lang/String;)V

    iget-object v3, p0, Lcom/google/android/gms/internal/aoq$e;->a:Lcom/google/android/gms/internal/aoq;

    invoke-static {v3}, Lcom/google/android/gms/internal/aoq;->b(Lcom/google/android/gms/internal/aoq;)Lcom/google/android/gms/internal/app;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/google/android/gms/internal/app;->a(Lcom/google/android/gms/internal/aow;)V

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    move v1, v0

    goto/16 :goto_0

    :cond_1
    new-instance v3, Ljava/lang/String;

    invoke-direct {v3, v5}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/aoq$e;->a:Lcom/google/android/gms/internal/aoq;

    const/4 v3, 0x0

    invoke-static {v0, v3}, Lcom/google/android/gms/internal/aoq;->a(Lcom/google/android/gms/internal/aoq;Ljava/util/List;)Ljava/util/List;

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/aoq$e;->a:Lcom/google/android/gms/internal/aoq;

    invoke-static {v0}, Lcom/google/android/gms/internal/aoq;->b(Lcom/google/android/gms/internal/aoq;)Lcom/google/android/gms/internal/app;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/app;->a()V

    const-string v3, "Runtime initialized successfully for container "

    iget-object v0, p0, Lcom/google/android/gms/internal/aoq$e;->a:Lcom/google/android/gms/internal/aoq;

    invoke-static {v0}, Lcom/google/android/gms/internal/aoq;->d(Lcom/google/android/gms/internal/aoq;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-eqz v4, :cond_4

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_3
    invoke-static {v0}, Lcom/google/android/gms/internal/aph;->d(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/aoq$e;->b:Lcom/google/android/gms/internal/dm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dm;->b()Lcom/google/android/gms/internal/dm$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dm$a;->d()J

    move-result-wide v4

    iget-object v0, p0, Lcom/google/android/gms/internal/aoq$e;->a:Lcom/google/android/gms/internal/aoq;

    invoke-static {v0}, Lcom/google/android/gms/internal/aoq;->g(Lcom/google/android/gms/internal/aoq;)Lcom/google/android/gms/internal/aos;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/aos;->a()J

    move-result-wide v6

    add-long/2addr v4, v6

    if-eqz v1, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/internal/aoq$e;->a:Lcom/google/android/gms/internal/aoq;

    invoke-static {v0}, Lcom/google/android/gms/internal/aoq;->k(Lcom/google/android/gms/internal/aoq;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/internal/aoq$e;->b:Lcom/google/android/gms/internal/dm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dm;->d()I

    move-result v0

    if-ne v0, v2, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/internal/aoq$e;->a:Lcom/google/android/gms/internal/aoq;

    invoke-static {v0}, Lcom/google/android/gms/internal/aoq;->m(Lcom/google/android/gms/internal/aoq;)Lcom/google/android/gms/common/util/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/common/util/e;->a()J

    move-result-wide v0

    cmp-long v0, v4, v0

    if-gez v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/internal/aoq$e;->a:Lcom/google/android/gms/internal/aoq;

    iget-object v1, p0, Lcom/google/android/gms/internal/aoq$e;->a:Lcom/google/android/gms/internal/aoq;

    invoke-static {v1}, Lcom/google/android/gms/internal/aoq;->g(Lcom/google/android/gms/internal/aoq;)Lcom/google/android/gms/internal/aos;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/aos;->c()J

    move-result-wide v2

    invoke-static {v0, v2, v3}, Lcom/google/android/gms/internal/aoq;->a(Lcom/google/android/gms/internal/aoq;J)V

    :goto_4
    return-void

    :cond_4
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_3

    :cond_5
    iget-object v0, p0, Lcom/google/android/gms/internal/aoq$e;->a:Lcom/google/android/gms/internal/aoq;

    const-wide/32 v2, 0xdbba0

    iget-object v1, p0, Lcom/google/android/gms/internal/aoq$e;->a:Lcom/google/android/gms/internal/aoq;

    invoke-static {v1}, Lcom/google/android/gms/internal/aoq;->m(Lcom/google/android/gms/internal/aoq;)Lcom/google/android/gms/common/util/e;

    move-result-object v1

    invoke-interface {v1}, Lcom/google/android/gms/common/util/e;->a()J

    move-result-wide v6

    sub-long/2addr v4, v6

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    invoke-static {v0, v2, v3}, Lcom/google/android/gms/internal/aoq;->a(Lcom/google/android/gms/internal/aoq;J)V

    goto :goto_4
.end method
