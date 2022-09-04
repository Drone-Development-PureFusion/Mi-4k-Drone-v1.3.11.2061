.class Lcom/google/android/gms/internal/hv;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/hv$c;,
        Lcom/google/android/gms/internal/hv$b;,
        Lcom/google/android/gms/internal/hv$a;
    }
.end annotation


# static fields
.field private static a:J


# instance fields
.field private b:Lcom/google/android/gms/internal/hv$b;

.field private c:Z

.field private d:Z

.field private e:J

.field private f:Lcom/google/android/gms/internal/hx;

.field private g:Lcom/google/android/gms/internal/hv$a;

.field private h:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture",
            "<*>;"
        }
    .end annotation
.end field

.field private i:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture",
            "<*>;"
        }
    .end annotation
.end field

.field private final j:Lcom/google/android/gms/internal/hn;

.field private final k:Ljava/util/concurrent/ScheduledExecutorService;

.field private final l:Lcom/google/android/gms/internal/ks;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide/16 v0, 0x0

    sput-wide v0, Lcom/google/android/gms/internal/hv;->a:J

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/hn;Lcom/google/android/gms/internal/hp;Ljava/lang/String;Lcom/google/android/gms/internal/hv$a;Ljava/lang/String;)V
    .locals 7

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean v0, p0, Lcom/google/android/gms/internal/hv;->c:Z

    iput-boolean v0, p0, Lcom/google/android/gms/internal/hv;->d:Z

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lcom/google/android/gms/internal/hv;->e:J

    iput-object p1, p0, Lcom/google/android/gms/internal/hv;->j:Lcom/google/android/gms/internal/hn;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/hn;->c()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/hv;->k:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p4, p0, Lcom/google/android/gms/internal/hv;->g:Lcom/google/android/gms/internal/hv$a;

    sget-wide v0, Lcom/google/android/gms/internal/hv;->a:J

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    sput-wide v2, Lcom/google/android/gms/internal/hv;->a:J

    new-instance v2, Lcom/google/android/gms/internal/ks;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/hn;->a()Lcom/google/android/gms/internal/kt;

    move-result-object v3

    const-string v4, "WebSocket"

    new-instance v5, Ljava/lang/StringBuilder;

    const/16 v6, 0x17

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v6, "ws_"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v3, v4, v0}, Lcom/google/android/gms/internal/ks;-><init>(Lcom/google/android/gms/internal/kt;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v2, p0, Lcom/google/android/gms/internal/hv;->l:Lcom/google/android/gms/internal/ks;

    invoke-direct {p0, p2, p3, p5}, Lcom/google/android/gms/internal/hv;->a(Lcom/google/android/gms/internal/hp;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/hv$b;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/hv;->b:Lcom/google/android/gms/internal/hv$b;

    return-void
.end method

.method private a(Lcom/google/android/gms/internal/hp;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/hv$b;
    .locals 5

    const/4 v4, 0x0

    if-eqz p2, :cond_0

    :goto_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/hp;->c()Z

    move-result v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/hp;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {p2, v0, v1, p3}, Lcom/google/android/gms/internal/hp;->a(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Ljava/net/URI;

    move-result-object v0

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const-string v2, "User-Agent"

    iget-object v3, p0, Lcom/google/android/gms/internal/hv;->j:Lcom/google/android/gms/internal/hn;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/hn;->f()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lcom/google/android/gms/internal/ls;

    invoke-direct {v2, v0, v4, v1}, Lcom/google/android/gms/internal/ls;-><init>(Ljava/net/URI;Ljava/lang/String;Ljava/util/Map;)V

    new-instance v0, Lcom/google/android/gms/internal/hv$c;

    invoke-direct {v0, p0, v2, v4}, Lcom/google/android/gms/internal/hv$c;-><init>(Lcom/google/android/gms/internal/hv;Lcom/google/android/gms/internal/ls;Lcom/google/android/gms/internal/hv$1;)V

    return-object v0

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/hp;->a()Ljava/lang/String;

    move-result-object p2

    goto :goto_0
.end method

.method static synthetic a(Lcom/google/android/gms/internal/hv;)Ljava/util/concurrent/ScheduledFuture;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/hv;->i:Ljava/util/concurrent/ScheduledFuture;

    return-object v0
.end method

.method private a(I)V
    .locals 5

    int-to-long v0, p1

    iput-wide v0, p0, Lcom/google/android/gms/internal/hv;->e:J

    new-instance v0, Lcom/google/android/gms/internal/hx;

    invoke-direct {v0}, Lcom/google/android/gms/internal/hx;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/hv;->f:Lcom/google/android/gms/internal/hx;

    iget-object v0, p0, Lcom/google/android/gms/internal/hv;->l:Lcom/google/android/gms/internal/ks;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ks;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/hv;->l:Lcom/google/android/gms/internal/ks;

    iget-wide v2, p0, Lcom/google/android/gms/internal/hv;->e:J

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v4, 0x29

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "HandleNewFrameCount: "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/internal/hv;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/hv;->c(Ljava/lang/String;)V

    return-void
.end method

.method private a(Ljava/lang/String;)V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/hv;->f:Lcom/google/android/gms/internal/hx;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/hx;->a(Ljava/lang/String;)V

    iget-wide v0, p0, Lcom/google/android/gms/internal/hv;->e:J

    const-wide/16 v2, 0x1

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lcom/google/android/gms/internal/hv;->e:J

    iget-wide v0, p0, Lcom/google/android/gms/internal/hv;->e:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/hv;->f:Lcom/google/android/gms/internal/hx;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/hx;->a()V

    iget-object v0, p0, Lcom/google/android/gms/internal/hv;->f:Lcom/google/android/gms/internal/hx;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/hx;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/mb;->a(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/google/android/gms/internal/hv;->f:Lcom/google/android/gms/internal/hx;

    iget-object v1, p0, Lcom/google/android/gms/internal/hv;->l:Lcom/google/android/gms/internal/ks;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ks;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/hv;->l:Lcom/google/android/gms/internal/ks;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/lit8 v4, v4, 0x24

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "handleIncomingFrame complete frame: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/hv;->g:Lcom/google/android/gms/internal/hv$a;

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/hv$a;->a(Ljava/util/Map;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_1

    :cond_1
    :goto_0
    return-void

    :catch_0
    move-exception v0

    move-object v1, v0

    iget-object v2, p0, Lcom/google/android/gms/internal/hv;->l:Lcom/google/android/gms/internal/ks;

    const-string v3, "Error parsing frame: "

    iget-object v0, p0, Lcom/google/android/gms/internal/hv;->f:Lcom/google/android/gms/internal/hx;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/hx;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-virtual {v2, v0, v1}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/hv;->c()V

    invoke-direct {p0}, Lcom/google/android/gms/internal/hv;->h()V

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :catch_1
    move-exception v0

    move-object v1, v0

    iget-object v2, p0, Lcom/google/android/gms/internal/hv;->l:Lcom/google/android/gms/internal/ks;

    const-string v3, "Error parsing frame (cast error): "

    iget-object v0, p0, Lcom/google/android/gms/internal/hv;->f:Lcom/google/android/gms/internal/hx;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/hx;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_2
    invoke-virtual {v2, v0, v1}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/hv;->c()V

    invoke-direct {p0}, Lcom/google/android/gms/internal/hv;->h()V

    goto :goto_0

    :cond_3
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_2
.end method

.method static synthetic a(Lcom/google/android/gms/internal/hv;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/hv;->c:Z

    return p1
.end method

.method private static a(Ljava/lang/String;I)[Ljava/lang/String;
    .locals 4

    const/4 v0, 0x0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-gt v1, p1, :cond_0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    aput-object p0, v1, v0

    move-object v0, v1

    :goto_0
    return-object v0

    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v0, v2, :cond_1

    add-int v2, v0, p1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-virtual {p0, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/2addr v0, p1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v0, v0, [Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    goto :goto_0
.end method

.method static synthetic b(Lcom/google/android/gms/internal/hv;)Lcom/google/android/gms/internal/ks;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/hv;->l:Lcom/google/android/gms/internal/ks;

    return-object v0
.end method

.method private b(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x6

    if-gt v0, v1, :cond_1

    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/hv;->a(I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1

    :catch_0
    move-exception v0

    :cond_1
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/hv;->a(I)V

    goto :goto_0
.end method

.method static synthetic c(Lcom/google/android/gms/internal/hv;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/hv;->d()V

    return-void
.end method

.method private c(Ljava/lang/String;)V
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/hv;->d:Z

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/internal/hv;->d()V

    invoke-direct {p0}, Lcom/google/android/gms/internal/hv;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/hv;->a(Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/hv;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/hv;->a(Ljava/lang/String;)V

    goto :goto_0
.end method

.method static synthetic d(Lcom/google/android/gms/internal/hv;)Ljava/util/concurrent/ScheduledExecutorService;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/hv;->k:Ljava/util/concurrent/ScheduledExecutorService;

    return-object v0
.end method

.method private d()V
    .locals 6

    const/4 v5, 0x0

    iget-boolean v0, p0, Lcom/google/android/gms/internal/hv;->d:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/hv;->h:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/hv;->h:Ljava/util/concurrent/ScheduledFuture;

    invoke-interface {v0, v5}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/hv;->l:Lcom/google/android/gms/internal/ks;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ks;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/hv;->l:Lcom/google/android/gms/internal/ks;

    iget-object v1, p0, Lcom/google/android/gms/internal/hv;->h:Ljava/util/concurrent/ScheduledFuture;

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v1, v2}, Ljava/util/concurrent/ScheduledFuture;->getDelay(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v2

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v4, 0x30

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v4, "Reset keepAlive. Remaining: "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v2, v5, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/internal/hv;->k:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-direct {p0}, Lcom/google/android/gms/internal/hv;->e()Ljava/lang/Runnable;

    move-result-object v1

    const-wide/32 v2, 0xafc8

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, v2, v3, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/hv;->h:Ljava/util/concurrent/ScheduledFuture;

    :cond_1
    return-void

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/hv;->l:Lcom/google/android/gms/internal/ks;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ks;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/hv;->l:Lcom/google/android/gms/internal/ks;

    const-string v1, "Reset keepAlive"

    new-array v2, v5, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0
.end method

.method private e()Ljava/lang/Runnable;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/hv$2;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/hv$2;-><init>(Lcom/google/android/gms/internal/hv;)V

    return-object v0
.end method

.method static synthetic e(Lcom/google/android/gms/internal/hv;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/hv;->g()V

    return-void
.end method

.method static synthetic f(Lcom/google/android/gms/internal/hv;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/hv;->i()V

    return-void
.end method

.method private f()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/hv;->f:Lcom/google/android/gms/internal/hx;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic g(Lcom/google/android/gms/internal/hv;)Lcom/google/android/gms/internal/hv$b;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/hv;->b:Lcom/google/android/gms/internal/hv$b;

    return-object v0
.end method

.method private g()V
    .locals 4

    const/4 v3, 0x0

    iget-boolean v0, p0, Lcom/google/android/gms/internal/hv;->d:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/hv;->l:Lcom/google/android/gms/internal/ks;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ks;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/hv;->l:Lcom/google/android/gms/internal/ks;

    const-string v1, "closing itself"

    new-array v2, v3, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/hv;->h()V

    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/hv;->b:Lcom/google/android/gms/internal/hv$b;

    iget-object v0, p0, Lcom/google/android/gms/internal/hv;->h:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/hv;->h:Ljava/util/concurrent/ScheduledFuture;

    invoke-interface {v0, v3}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    :cond_2
    return-void
.end method

.method private h()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/internal/hv;->d:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/hv;->g:Lcom/google/android/gms/internal/hv$a;

    iget-boolean v1, p0, Lcom/google/android/gms/internal/hv;->c:Z

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/hv$a;->a(Z)V

    return-void
.end method

.method private i()V
    .locals 3

    iget-boolean v0, p0, Lcom/google/android/gms/internal/hv;->c:Z

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/hv;->d:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/hv;->l:Lcom/google/android/gms/internal/ks;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ks;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/hv;->l:Lcom/google/android/gms/internal/ks;

    const-string v1, "timed out on connect"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/hv;->b:Lcom/google/android/gms/internal/hv$b;

    invoke-interface {v0}, Lcom/google/android/gms/internal/hv$b;->b()V

    :cond_1
    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/hv;->b:Lcom/google/android/gms/internal/hv$b;

    invoke-interface {v0}, Lcom/google/android/gms/internal/hv$b;->a()V

    iget-object v0, p0, Lcom/google/android/gms/internal/hv;->k:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lcom/google/android/gms/internal/hv$1;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/hv$1;-><init>(Lcom/google/android/gms/internal/hv;)V

    const-wide/16 v2, 0x7530

    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, v2, v3, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/hv;->i:Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method

.method public a(Ljava/util/Map;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/hv;->d()V

    :try_start_0
    invoke-static {p1}, Lcom/google/android/gms/internal/mb;->a(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x4000

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/hv;->a(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v1

    array-length v0, v1

    const/4 v2, 0x1

    if-le v0, v2, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/hv;->b:Lcom/google/android/gms/internal/hv$b;

    array-length v2, v1

    new-instance v3, Ljava/lang/StringBuilder;

    const/16 v4, 0xb

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/hv$b;->a(Ljava/lang/String;)V

    :cond_0
    const/4 v0, 0x0

    :goto_0
    array-length v2, v1

    if-ge v0, v2, :cond_1

    iget-object v2, p0, Lcom/google/android/gms/internal/hv;->b:Lcom/google/android/gms/internal/hv$b;

    aget-object v3, v1, v0

    invoke-interface {v2, v3}, Lcom/google/android/gms/internal/hv$b;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :catch_0
    move-exception v0

    move-object v1, v0

    iget-object v2, p0, Lcom/google/android/gms/internal/hv;->l:Lcom/google/android/gms/internal/ks;

    const-string v3, "Failed to serialize message: "

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    invoke-virtual {v2, v0, v1}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {p0}, Lcom/google/android/gms/internal/hv;->h()V

    :cond_1
    return-void

    :cond_2
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v3}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_1
.end method

.method public b()V
    .locals 0

    return-void
.end method

.method public c()V
    .locals 4

    const/4 v3, 0x1

    iget-object v0, p0, Lcom/google/android/gms/internal/hv;->l:Lcom/google/android/gms/internal/ks;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ks;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/hv;->l:Lcom/google/android/gms/internal/ks;

    const-string v1, "websocket is being closed"

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ks;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iput-boolean v3, p0, Lcom/google/android/gms/internal/hv;->d:Z

    iget-object v0, p0, Lcom/google/android/gms/internal/hv;->b:Lcom/google/android/gms/internal/hv$b;

    invoke-interface {v0}, Lcom/google/android/gms/internal/hv$b;->b()V

    iget-object v0, p0, Lcom/google/android/gms/internal/hv;->i:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/hv;->i:Ljava/util/concurrent/ScheduledFuture;

    invoke-interface {v0, v3}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/hv;->h:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/hv;->h:Ljava/util/concurrent/ScheduledFuture;

    invoke-interface {v0, v3}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    :cond_2
    return-void
.end method
