.class Lcom/google/android/gms/internal/hv$c;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/hv$b;
.implements Lcom/google/android/gms/internal/lt;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/hv;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/hv;

.field private b:Lcom/google/android/gms/internal/ls;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/hv;Lcom/google/android/gms/internal/ls;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/hv$c;->a:Lcom/google/android/gms/internal/hv;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/hv$c;->b:Lcom/google/android/gms/internal/ls;

    iget-object v0, p0, Lcom/google/android/gms/internal/hv$c;->b:Lcom/google/android/gms/internal/ls;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/ls;->a(Lcom/google/android/gms/internal/lt;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/hv;Lcom/google/android/gms/internal/ls;Lcom/google/android/gms/internal/hv$1;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/hv$c;-><init>(Lcom/google/android/gms/internal/hv;Lcom/google/android/gms/internal/ls;)V

    return-void
.end method

.method private e()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/hv$c;->b:Lcom/google/android/gms/internal/ls;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ls;->e()V

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/hv$c;->b:Lcom/google/android/gms/internal/ls;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ls;->g()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/internal/hv$c;->a:Lcom/google/android/gms/internal/hv;

    invoke-static {v1}, Lcom/google/android/gms/internal/hv;->b(Lcom/google/android/gms/internal/hv;)Lcom/google/android/gms/internal/ks;

    move-result-object v1

    const-string v2, "Interrupted while shutting down websocket threads"

    invoke-virtual {v1, v2, v0}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method


# virtual methods
.method public a()V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/hv$c;->b:Lcom/google/android/gms/internal/ls;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ls;->d()V
    :try_end_0
    .catch Lcom/google/android/gms/internal/lu; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lcom/google/android/gms/internal/hv$c;->a:Lcom/google/android/gms/internal/hv;

    invoke-static {v1}, Lcom/google/android/gms/internal/hv;->b(Lcom/google/android/gms/internal/hv;)Lcom/google/android/gms/internal/ks;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ks;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/hv$c;->a:Lcom/google/android/gms/internal/hv;

    invoke-static {v1}, Lcom/google/android/gms/internal/hv;->b(Lcom/google/android/gms/internal/hv;)Lcom/google/android/gms/internal/ks;

    move-result-object v1

    const-string v2, "Error connecting"

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v0, v3}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/hv$c;->e()V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/internal/lu;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/hv$c;->a:Lcom/google/android/gms/internal/hv;

    invoke-static {v0}, Lcom/google/android/gms/internal/hv;->d(Lcom/google/android/gms/internal/hv;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/hv$c$4;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/hv$c$4;-><init>(Lcom/google/android/gms/internal/hv$c;Lcom/google/android/gms/internal/lu;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/lw;)V
    .locals 5

    invoke-virtual {p1}, Lcom/google/android/gms/internal/lw;->a()Ljava/lang/String;

    move-result-object v1

    iget-object v0, p0, Lcom/google/android/gms/internal/hv$c;->a:Lcom/google/android/gms/internal/hv;

    invoke-static {v0}, Lcom/google/android/gms/internal/hv;->b(Lcom/google/android/gms/internal/hv;)Lcom/google/android/gms/internal/ks;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ks;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/hv$c;->a:Lcom/google/android/gms/internal/hv;

    invoke-static {v0}, Lcom/google/android/gms/internal/hv;->b(Lcom/google/android/gms/internal/hv;)Lcom/google/android/gms/internal/ks;

    move-result-object v2

    const-string v3, "ws message: "

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v2, v0, v3}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/hv$c;->a:Lcom/google/android/gms/internal/hv;

    invoke-static {v0}, Lcom/google/android/gms/internal/hv;->d(Lcom/google/android/gms/internal/hv;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    new-instance v2, Lcom/google/android/gms/internal/hv$c$2;

    invoke-direct {v2, p0, v1}, Lcom/google/android/gms/internal/hv$c$2;-><init>(Lcom/google/android/gms/internal/hv$c;Ljava/lang/String;)V

    invoke-interface {v0, v2}, Ljava/util/concurrent/ScheduledExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_1
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/hv$c;->b:Lcom/google/android/gms/internal/ls;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ls;->a(Ljava/lang/String;)V

    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/hv$c;->b:Lcom/google/android/gms/internal/ls;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ls;->e()V

    return-void
.end method

.method public c()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/hv$c;->a:Lcom/google/android/gms/internal/hv;

    invoke-static {v0}, Lcom/google/android/gms/internal/hv;->d(Lcom/google/android/gms/internal/hv;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/hv$c$1;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/hv$c$1;-><init>(Lcom/google/android/gms/internal/hv$c;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public d()V
    .locals 2

    const-string v0, "closed"

    iget-object v0, p0, Lcom/google/android/gms/internal/hv$c;->a:Lcom/google/android/gms/internal/hv;

    invoke-static {v0}, Lcom/google/android/gms/internal/hv;->d(Lcom/google/android/gms/internal/hv;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/hv$c$3;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/hv$c$3;-><init>(Lcom/google/android/gms/internal/hv$c;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledExecutorService;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
