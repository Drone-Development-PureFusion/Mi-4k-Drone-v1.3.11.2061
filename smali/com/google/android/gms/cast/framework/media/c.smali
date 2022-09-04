.class public Lcom/google/android/gms/cast/framework/media/c;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/cast/a$e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/cast/framework/media/c$h;,
        Lcom/google/android/gms/cast/framework/media/c$f;,
        Lcom/google/android/gms/cast/framework/media/c$g;,
        Lcom/google/android/gms/cast/framework/media/c$b;,
        Lcom/google/android/gms/cast/framework/media/c$e;,
        Lcom/google/android/gms/cast/framework/media/c$c;,
        Lcom/google/android/gms/cast/framework/media/c$d;,
        Lcom/google/android/gms/cast/framework/media/c$a;
    }
.end annotation


# static fields
.field public static final a:Ljava/lang/String;

.field public static final b:I = 0x0

.field public static final c:I = 0x1

.field public static final d:I = 0x2

.field public static final e:I = 0x0

.field public static final f:I = 0x834

.field public static final g:I = 0x837


# instance fields
.field private final h:Ljava/lang/Object;

.field private final i:Landroid/os/Handler;

.field private final j:Lcom/google/android/gms/cast/internal/n;

.field private final k:Lcom/google/android/gms/cast/framework/media/c$e;

.field private final l:Lcom/google/android/gms/cast/a$b;

.field private m:Lcom/google/android/gms/common/api/g;

.field private final n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/cast/framework/media/c$a;",
            ">;"
        }
    .end annotation
.end field

.field private final o:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/cast/framework/media/c$d;",
            "Lcom/google/android/gms/cast/framework/media/c$h;",
            ">;"
        }
    .end annotation
.end field

.field private final p:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/Long;",
            "Lcom/google/android/gms/cast/framework/media/c$h;",
            ">;"
        }
    .end annotation
.end field

.field private q:Lcom/google/android/gms/cast/framework/media/c$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/google/android/gms/cast/internal/n;->g:Ljava/lang/String;

    sput-object v0, Lcom/google/android/gms/cast/framework/media/c;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/cast/internal/n;Lcom/google/android/gms/cast/a$b;)V
    .locals 2
    .param p1    # Lcom/google/android/gms/cast/internal/n;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
    .param p2    # Lcom/google/android/gms/cast/a$b;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/google/android/gms/cast/framework/media/c;->i:Landroid/os/Handler;

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/cast/framework/media/c;->n:Ljava/util/List;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/cast/framework/media/c;->o:Ljava/util/Map;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/cast/framework/media/c;->p:Ljava/util/Map;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/cast/framework/media/c;->h:Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/cast/framework/media/c$e;

    invoke-direct {v0, p0}, Lcom/google/android/gms/cast/framework/media/c$e;-><init>(Lcom/google/android/gms/cast/framework/media/c;)V

    iput-object v0, p0, Lcom/google/android/gms/cast/framework/media/c;->k:Lcom/google/android/gms/cast/framework/media/c$e;

    iput-object p2, p0, Lcom/google/android/gms/cast/framework/media/c;->l:Lcom/google/android/gms/cast/a$b;

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/internal/n;

    iput-object v0, p0, Lcom/google/android/gms/cast/framework/media/c;->j:Lcom/google/android/gms/cast/internal/n;

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/c;->j:Lcom/google/android/gms/cast/internal/n;

    new-instance v1, Lcom/google/android/gms/cast/framework/media/c$1;

    invoke-direct {v1, p0}, Lcom/google/android/gms/cast/framework/media/c$1;-><init>(Lcom/google/android/gms/cast/framework/media/c;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/cast/internal/n;->a(Lcom/google/android/gms/cast/internal/n$a;)V

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/c;->j:Lcom/google/android/gms/cast/internal/n;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/c;->k:Lcom/google/android/gms/cast/framework/media/c$e;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/cast/internal/n;->a(Lcom/google/android/gms/cast/internal/o;)V

    return-void
.end method

.method private a(I)I
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/c;->g()Lcom/google/android/gms/cast/MediaStatus;

    move-result-object v1

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v1}, Lcom/google/android/gms/cast/MediaStatus;->q()I

    move-result v2

    if-ge v0, v2, :cond_1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/cast/MediaStatus;->b(I)Lcom/google/android/gms/cast/MediaQueueItem;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/cast/MediaQueueItem;->c()I

    move-result v2

    if-ne v2, p1, :cond_0

    :goto_1
    return v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    goto :goto_1
.end method

.method static synthetic a(Lcom/google/android/gms/cast/framework/media/c;I)I
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/android/gms/cast/framework/media/c;->a(I)I

    move-result v0

    return v0
.end method

.method private a(Lcom/google/android/gms/cast/framework/media/c$f;)Lcom/google/android/gms/cast/framework/media/c$f;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/c;->m:Lcom/google/android/gms/common/api/g;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    return-object p1

    :catch_0
    move-exception v0

    :try_start_1
    new-instance v0, Lcom/google/android/gms/common/api/Status;

    const/16 v1, 0x834

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/cast/framework/media/c$f;->b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/framework/media/c$b;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/cast/framework/media/c$f;->b(Lcom/google/android/gms/common/api/m;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_0
.end method

.method static synthetic a(Lcom/google/android/gms/cast/framework/media/c;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/c;->x()V

    return-void
.end method

.method static synthetic a(Lcom/google/android/gms/cast/framework/media/c;Ljava/util/Set;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/cast/framework/media/c;->a(Ljava/util/Set;)V

    return-void
.end method

.method private a(Ljava/util/Set;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Lcom/google/android/gms/cast/framework/media/c$d;",
            ">;)V"
        }
    .end annotation

    const-wide/16 v6, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/c;->n()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/c;->m()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    return-void

    :cond_1
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0, p1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/c;->l()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/framework/media/c$d;

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/c;->e()J

    move-result-wide v2

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/c;->f()J

    move-result-wide v4

    invoke-interface {v0, v2, v3, v4, v5}, Lcom/google/android/gms/cast/framework/media/c$d;->a(JJ)V

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/c;->o()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/c;->q()Lcom/google/android/gms/cast/MediaQueueItem;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/google/android/gms/cast/MediaQueueItem;->b()Lcom/google/android/gms/cast/MediaInfo;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/framework/media/c$d;

    invoke-virtual {v1}, Lcom/google/android/gms/cast/MediaQueueItem;->b()Lcom/google/android/gms/cast/MediaInfo;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/cast/MediaInfo;->f()J

    move-result-wide v4

    invoke-interface {v0, v6, v7, v4, v5}, Lcom/google/android/gms/cast/framework/media/c$d;->a(JJ)V

    goto :goto_1

    :cond_3
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/framework/media/c$d;

    invoke-interface {v0, v6, v7, v6, v7}, Lcom/google/android/gms/cast/framework/media/c$d;->a(JJ)V

    goto :goto_2
.end method

.method static synthetic b(Lcom/google/android/gms/cast/framework/media/c;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/c;->n:Ljava/util/List;

    return-object v0
.end method

.method static synthetic c(Lcom/google/android/gms/cast/framework/media/c;)Lcom/google/android/gms/cast/framework/media/c$c;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/c;->q:Lcom/google/android/gms/cast/framework/media/c$c;

    return-object v0
.end method

.method static synthetic d(Lcom/google/android/gms/cast/framework/media/c;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/c;->h:Ljava/lang/Object;

    return-object v0
.end method

.method static synthetic e(Lcom/google/android/gms/cast/framework/media/c;)Lcom/google/android/gms/cast/internal/n;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/c;->j:Lcom/google/android/gms/cast/internal/n;

    return-object v0
.end method

.method static synthetic f(Lcom/google/android/gms/cast/framework/media/c;)Lcom/google/android/gms/cast/a$b;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/c;->l:Lcom/google/android/gms/cast/a$b;

    return-object v0
.end method

.method static synthetic g(Lcom/google/android/gms/cast/framework/media/c;)Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/c;->i:Landroid/os/Handler;

    return-object v0
.end method

.method private w()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/c;->m:Lcom/google/android/gms/common/api/g;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No connection"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    return-void
.end method

.method private x()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/c;->p:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/framework/media/c$h;

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/c;->t()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c$h;->e()Z

    move-result v2

    if-nez v2, :cond_3

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c$h;->c()V

    :cond_1
    :goto_1
    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c$h;->e()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/c;->n()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/c;->m()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/c;->o()Z

    move-result v2

    if-eqz v2, :cond_0

    :cond_2
    invoke-static {v0}, Lcom/google/android/gms/cast/framework/media/c$h;->a(Lcom/google/android/gms/cast/framework/media/c$h;)Ljava/util/Set;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/cast/framework/media/c;->a(Ljava/util/Set;)V

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/c;->t()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c$h;->e()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c$h;->d()V

    goto :goto_1

    :cond_4
    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/framework/media/c$b;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/cast/framework/media/c;->a(Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public a(D)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(D)",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/framework/media/c$b;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lcom/google/android/gms/cast/framework/media/c;->a(DLorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public a(DLorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(D",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/framework/media/c$b;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/c;->w()V

    invoke-static {p1, p2}, Ljava/lang/Double;->isInfinite(D)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1, p2}, Ljava/lang/Double;->isNaN(D)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0x29

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "Volume cannot be "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v1, Lcom/google/android/gms/cast/framework/media/c$14;

    iget-object v3, p0, Lcom/google/android/gms/cast/framework/media/c;->m:Lcom/google/android/gms/common/api/g;

    move-object v2, p0

    move-wide v4, p1

    move-object v6, p3

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/cast/framework/media/c$14;-><init>(Lcom/google/android/gms/cast/framework/media/c;Lcom/google/android/gms/common/api/g;DLorg/json/JSONObject;)V

    invoke-direct {p0, v1}, Lcom/google/android/gms/cast/framework/media/c;->a(Lcom/google/android/gms/cast/framework/media/c$f;)Lcom/google/android/gms/cast/framework/media/c$f;

    move-result-object v0

    return-object v0
.end method

.method public a(IILorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/framework/media/c$b;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/c;->w()V

    new-instance v0, Lcom/google/android/gms/cast/framework/media/c$8;

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/media/c;->m:Lcom/google/android/gms/common/api/g;

    move-object v1, p0

    move v3, p1

    move v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/cast/framework/media/c$8;-><init>(Lcom/google/android/gms/cast/framework/media/c;Lcom/google/android/gms/common/api/g;IILorg/json/JSONObject;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/cast/framework/media/c;->a(Lcom/google/android/gms/cast/framework/media/c$f;)Lcom/google/android/gms/cast/framework/media/c$f;

    move-result-object v0

    return-object v0
.end method

.method public a(IJLorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IJ",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/framework/media/c$b;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/c;->w()V

    new-instance v0, Lcom/google/android/gms/cast/framework/media/c$7;

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/media/c;->m:Lcom/google/android/gms/common/api/g;

    move-object v1, p0

    move v3, p1

    move-wide v4, p2

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/cast/framework/media/c$7;-><init>(Lcom/google/android/gms/cast/framework/media/c;Lcom/google/android/gms/common/api/g;IJLorg/json/JSONObject;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/cast/framework/media/c;->a(Lcom/google/android/gms/cast/framework/media/c$f;)Lcom/google/android/gms/cast/framework/media/c$f;

    move-result-object v0

    return-object v0
.end method

.method public a(ILorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/framework/media/c$b;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/c;->w()V

    new-instance v0, Lcom/google/android/gms/cast/framework/media/c$5;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/c;->m:Lcom/google/android/gms/common/api/g;

    invoke-direct {v0, p0, v1, p1, p2}, Lcom/google/android/gms/cast/framework/media/c$5;-><init>(Lcom/google/android/gms/cast/framework/media/c;Lcom/google/android/gms/common/api/g;ILorg/json/JSONObject;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/cast/framework/media/c;->a(Lcom/google/android/gms/cast/framework/media/c$f;)Lcom/google/android/gms/cast/framework/media/c$f;

    move-result-object v0

    return-object v0
.end method

.method public a(J)Lcom/google/android/gms/common/api/i;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/framework/media/c$b;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/google/android/gms/cast/framework/media/c;->a(JILorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public a(JI)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JI)",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/framework/media/c$b;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, p3, v0}, Lcom/google/android/gms/cast/framework/media/c;->a(JILorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public a(JILorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JI",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/framework/media/c$b;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/c;->w()V

    new-instance v1, Lcom/google/android/gms/cast/framework/media/c$13;

    iget-object v3, p0, Lcom/google/android/gms/cast/framework/media/c;->m:Lcom/google/android/gms/common/api/g;

    move-object v2, p0

    move-wide v4, p1

    move v6, p3

    move-object v7, p4

    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/cast/framework/media/c$13;-><init>(Lcom/google/android/gms/cast/framework/media/c;Lcom/google/android/gms/common/api/g;JILorg/json/JSONObject;)V

    invoke-direct {p0, v1}, Lcom/google/android/gms/cast/framework/media/c;->a(Lcom/google/android/gms/cast/framework/media/c$f;)Lcom/google/android/gms/cast/framework/media/c$f;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/cast/MediaInfo;)Lcom/google/android/gms/common/api/i;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/cast/MediaInfo;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/framework/media/c$b;",
            ">;"
        }
    .end annotation

    const/4 v6, 0x0

    const/4 v3, 0x1

    const-wide/16 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v7, v6

    invoke-virtual/range {v1 .. v7}, Lcom/google/android/gms/cast/framework/media/c;->a(Lcom/google/android/gms/cast/MediaInfo;ZJ[JLorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/cast/MediaInfo;Z)Lcom/google/android/gms/common/api/i;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/cast/MediaInfo;",
            "Z)",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/framework/media/c$b;",
            ">;"
        }
    .end annotation

    const/4 v6, 0x0

    const-wide/16 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v7, v6

    invoke-virtual/range {v1 .. v7}, Lcom/google/android/gms/cast/framework/media/c;->a(Lcom/google/android/gms/cast/MediaInfo;ZJ[JLorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/cast/MediaInfo;ZJ)Lcom/google/android/gms/common/api/i;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/cast/MediaInfo;",
            "ZJ)",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/framework/media/c$b;",
            ">;"
        }
    .end annotation

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-wide v4, p3

    move-object v7, v6

    invoke-virtual/range {v1 .. v7}, Lcom/google/android/gms/cast/framework/media/c;->a(Lcom/google/android/gms/cast/MediaInfo;ZJ[JLorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/cast/MediaInfo;ZJLorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/cast/MediaInfo;",
            "ZJ",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/framework/media/c$b;",
            ">;"
        }
    .end annotation

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-wide v4, p3

    move-object v7, p5

    invoke-virtual/range {v1 .. v7}, Lcom/google/android/gms/cast/framework/media/c;->a(Lcom/google/android/gms/cast/MediaInfo;ZJ[JLorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/cast/MediaInfo;ZJ[JLorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/cast/MediaInfo;",
            "ZJ[J",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/framework/media/c$b;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/c;->w()V

    new-instance v1, Lcom/google/android/gms/cast/framework/media/c$4;

    iget-object v3, p0, Lcom/google/android/gms/cast/framework/media/c;->m:Lcom/google/android/gms/common/api/g;

    move-object v2, p0

    move-object v4, p1

    move v5, p2

    move-wide v6, p3

    move-object/from16 v8, p5

    move-object/from16 v9, p6

    invoke-direct/range {v1 .. v9}, Lcom/google/android/gms/cast/framework/media/c$4;-><init>(Lcom/google/android/gms/cast/framework/media/c;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/cast/MediaInfo;ZJ[JLorg/json/JSONObject;)V

    invoke-direct {p0, v1}, Lcom/google/android/gms/cast/framework/media/c;->a(Lcom/google/android/gms/cast/framework/media/c$f;)Lcom/google/android/gms/cast/framework/media/c$f;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/cast/MediaQueueItem;IJLorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/cast/MediaQueueItem;",
            "IJ",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/framework/media/c$b;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/c;->w()V

    new-instance v1, Lcom/google/android/gms/cast/framework/media/c$20;

    iget-object v3, p0, Lcom/google/android/gms/cast/framework/media/c;->m:Lcom/google/android/gms/common/api/g;

    move-object v2, p0

    move-object v4, p1

    move v5, p2

    move-wide v6, p3

    move-object v8, p5

    invoke-direct/range {v1 .. v8}, Lcom/google/android/gms/cast/framework/media/c$20;-><init>(Lcom/google/android/gms/cast/framework/media/c;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/cast/MediaQueueItem;IJLorg/json/JSONObject;)V

    invoke-direct {p0, v1}, Lcom/google/android/gms/cast/framework/media/c;->a(Lcom/google/android/gms/cast/framework/media/c$f;)Lcom/google/android/gms/cast/framework/media/c$f;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/cast/MediaQueueItem;ILorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/cast/MediaQueueItem;",
            "I",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/framework/media/c$b;",
            ">;"
        }
    .end annotation

    const-wide/16 v4, -0x1

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v6, p3

    invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/cast/framework/media/c;->a(Lcom/google/android/gms/cast/MediaQueueItem;IJLorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/cast/MediaQueueItem;Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/cast/MediaQueueItem;",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/framework/media/c$b;",
            ">;"
        }
    .end annotation

    const/4 v1, 0x0

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/google/android/gms/cast/MediaQueueItem;

    aput-object p1, v0, v1

    invoke-virtual {p0, v0, v1, p2}, Lcom/google/android/gms/cast/framework/media/c;->a([Lcom/google/android/gms/cast/MediaQueueItem;ILorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/cast/TextTrackStyle;)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/cast/TextTrackStyle;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/framework/media/c$b;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/c;->w()V

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "trackStyle cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/cast/framework/media/c$17;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/c;->m:Lcom/google/android/gms/common/api/g;

    invoke-direct {v0, p0, v1, p1}, Lcom/google/android/gms/cast/framework/media/c$17;-><init>(Lcom/google/android/gms/cast/framework/media/c;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/cast/TextTrackStyle;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/cast/framework/media/c;->a(Lcom/google/android/gms/cast/framework/media/c$f;)Lcom/google/android/gms/cast/framework/media/c$f;

    move-result-object v0

    return-object v0
.end method

.method public a(Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/framework/media/c$b;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/c;->w()V

    new-instance v0, Lcom/google/android/gms/cast/framework/media/c$9;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/c;->m:Lcom/google/android/gms/common/api/g;

    invoke-direct {v0, p0, v1, p1}, Lcom/google/android/gms/cast/framework/media/c$9;-><init>(Lcom/google/android/gms/cast/framework/media/c;Lcom/google/android/gms/common/api/g;Lorg/json/JSONObject;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/cast/framework/media/c;->a(Lcom/google/android/gms/cast/framework/media/c$f;)Lcom/google/android/gms/cast/framework/media/c$f;

    move-result-object v0

    return-object v0
.end method

.method public a(Z)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/framework/media/c$b;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/cast/framework/media/c;->a(ZLorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public a(ZLorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/framework/media/c$b;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/c;->w()V

    new-instance v0, Lcom/google/android/gms/cast/framework/media/c$15;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/c;->m:Lcom/google/android/gms/common/api/g;

    invoke-direct {v0, p0, v1, p1, p2}, Lcom/google/android/gms/cast/framework/media/c$15;-><init>(Lcom/google/android/gms/cast/framework/media/c;Lcom/google/android/gms/common/api/g;ZLorg/json/JSONObject;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/cast/framework/media/c;->a(Lcom/google/android/gms/cast/framework/media/c$f;)Lcom/google/android/gms/cast/framework/media/c$f;

    move-result-object v0

    return-object v0
.end method

.method public a([IILorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([II",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/framework/media/c$b;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/c;->w()V

    new-instance v0, Lcom/google/android/gms/cast/framework/media/c$23;

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/media/c;->m:Lcom/google/android/gms/common/api/g;

    move-object v1, p0

    move-object v3, p1

    move v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/cast/framework/media/c$23;-><init>(Lcom/google/android/gms/cast/framework/media/c;Lcom/google/android/gms/common/api/g;[IILorg/json/JSONObject;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/cast/framework/media/c;->a(Lcom/google/android/gms/cast/framework/media/c$f;)Lcom/google/android/gms/cast/framework/media/c$f;

    move-result-object v0

    return-object v0
.end method

.method public a([ILorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([I",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/framework/media/c$b;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/c;->w()V

    new-instance v0, Lcom/google/android/gms/cast/framework/media/c$22;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/c;->m:Lcom/google/android/gms/common/api/g;

    invoke-direct {v0, p0, v1, p1, p2}, Lcom/google/android/gms/cast/framework/media/c$22;-><init>(Lcom/google/android/gms/cast/framework/media/c;Lcom/google/android/gms/common/api/g;[ILorg/json/JSONObject;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/cast/framework/media/c;->a(Lcom/google/android/gms/cast/framework/media/c$f;)Lcom/google/android/gms/cast/framework/media/c$f;

    move-result-object v0

    return-object v0
.end method

.method public a([J)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([J)",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/framework/media/c$b;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/c;->w()V

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "trackIds cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/cast/framework/media/c$12;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/c;->m:Lcom/google/android/gms/common/api/g;

    invoke-direct {v0, p0, v1, p1}, Lcom/google/android/gms/cast/framework/media/c$12;-><init>(Lcom/google/android/gms/cast/framework/media/c;Lcom/google/android/gms/common/api/g;[J)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/cast/framework/media/c;->a(Lcom/google/android/gms/cast/framework/media/c$f;)Lcom/google/android/gms/cast/framework/media/c$f;

    move-result-object v0

    return-object v0
.end method

.method public a([Lcom/google/android/gms/cast/MediaQueueItem;IIJLorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/google/android/gms/cast/MediaQueueItem;",
            "IIJ",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/framework/media/c$b;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/c;->w()V

    new-instance v0, Lcom/google/android/gms/cast/framework/media/c$18;

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/media/c;->m:Lcom/google/android/gms/common/api/g;

    move-object v1, p0

    move-object v3, p1

    move v4, p2

    move v5, p3

    move-wide v6, p4

    move-object/from16 v8, p6

    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/cast/framework/media/c$18;-><init>(Lcom/google/android/gms/cast/framework/media/c;Lcom/google/android/gms/common/api/g;[Lcom/google/android/gms/cast/MediaQueueItem;IIJLorg/json/JSONObject;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/cast/framework/media/c;->a(Lcom/google/android/gms/cast/framework/media/c$f;)Lcom/google/android/gms/cast/framework/media/c$f;

    move-result-object v0

    return-object v0
.end method

.method public a([Lcom/google/android/gms/cast/MediaQueueItem;IILorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/google/android/gms/cast/MediaQueueItem;",
            "II",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/framework/media/c$b;",
            ">;"
        }
    .end annotation

    const-wide/16 v4, -0x1

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v6, p4

    invoke-virtual/range {v0 .. v6}, Lcom/google/android/gms/cast/framework/media/c;->a([Lcom/google/android/gms/cast/MediaQueueItem;IIJLorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public a([Lcom/google/android/gms/cast/MediaQueueItem;ILorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/google/android/gms/cast/MediaQueueItem;",
            "I",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/framework/media/c$b;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/c;->w()V

    new-instance v0, Lcom/google/android/gms/cast/framework/media/c$19;

    iget-object v2, p0, Lcom/google/android/gms/cast/framework/media/c;->m:Lcom/google/android/gms/common/api/g;

    move-object v1, p0

    move-object v3, p1

    move v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/cast/framework/media/c$19;-><init>(Lcom/google/android/gms/cast/framework/media/c;Lcom/google/android/gms/common/api/g;[Lcom/google/android/gms/cast/MediaQueueItem;ILorg/json/JSONObject;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/cast/framework/media/c;->a(Lcom/google/android/gms/cast/framework/media/c$f;)Lcom/google/android/gms/cast/framework/media/c$f;

    move-result-object v0

    return-object v0
.end method

.method public a([Lcom/google/android/gms/cast/MediaQueueItem;Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/google/android/gms/cast/MediaQueueItem;",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/framework/media/c$b;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/c;->w()V

    new-instance v0, Lcom/google/android/gms/cast/framework/media/c$21;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/c;->m:Lcom/google/android/gms/common/api/g;

    invoke-direct {v0, p0, v1, p1, p2}, Lcom/google/android/gms/cast/framework/media/c$21;-><init>(Lcom/google/android/gms/cast/framework/media/c;Lcom/google/android/gms/common/api/g;[Lcom/google/android/gms/cast/MediaQueueItem;Lorg/json/JSONObject;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/cast/framework/media/c;->a(Lcom/google/android/gms/cast/framework/media/c$f;)Lcom/google/android/gms/cast/framework/media/c$f;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/cast/CastDevice;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/c;->j:Lcom/google/android/gms/cast/internal/n;

    invoke-virtual {v0, p3}, Lcom/google/android/gms/cast/internal/n;->b(Ljava/lang/String;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/cast/framework/media/c$a;)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/c;->n:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public a(Lcom/google/android/gms/cast/framework/media/c$c;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/framework/media/c;->q:Lcom/google/android/gms/cast/framework/media/c$c;

    return-void
.end method

.method public a(Lcom/google/android/gms/cast/framework/media/c$d;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/c;->o:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/framework/media/c$h;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/cast/framework/media/c$h;->b(Lcom/google/android/gms/cast/framework/media/c$d;)V

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c$h;->b()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/c;->p:Ljava/util/Map;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c$h;->a()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c$h;->d()V

    :cond_0
    return-void
.end method

.method public a(Lcom/google/android/gms/common/api/g;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/c;->m:Lcom/google/android/gms/common/api/g;

    if-ne v0, p1, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/c;->m:Lcom/google/android/gms/common/api/g;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/c;->j:Lcom/google/android/gms/cast/internal/n;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/internal/n;->a()V

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/c;->l:Lcom/google/android/gms/cast/a$b;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/c;->m:Lcom/google/android/gms/common/api/g;

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/c;->v()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/cast/a$b;->d(Lcom/google/android/gms/common/api/g;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/c;->k:Lcom/google/android/gms/cast/framework/media/c$e;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/cast/framework/media/c$e;->a(Lcom/google/android/gms/common/api/g;)V

    :cond_2
    iput-object p1, p0, Lcom/google/android/gms/cast/framework/media/c;->m:Lcom/google/android/gms/common/api/g;

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/c;->m:Lcom/google/android/gms/common/api/g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/c;->l:Lcom/google/android/gms/cast/a$b;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/c;->m:Lcom/google/android/gms/common/api/g;

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/c;->v()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2, p0}, Lcom/google/android/gms/cast/a$b;->a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;Lcom/google/android/gms/cast/a$e;)V

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/c;->k:Lcom/google/android/gms/cast/framework/media/c$e;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/c;->m:Lcom/google/android/gms/common/api/g;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/cast/framework/media/c$e;->a(Lcom/google/android/gms/common/api/g;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/cast/framework/media/c$d;J)Z
    .locals 4

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/c;->o:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/c;->p:Ljava/util/Map;

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/framework/media/c$h;

    if-nez v0, :cond_2

    new-instance v0, Lcom/google/android/gms/cast/framework/media/c$h;

    invoke-direct {v0, p0, p2, p3}, Lcom/google/android/gms/cast/framework/media/c$h;-><init>(Lcom/google/android/gms/cast/framework/media/c;J)V

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/c;->p:Ljava/util/Map;

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    invoke-virtual {v0, p1}, Lcom/google/android/gms/cast/framework/media/c$h;->a(Lcom/google/android/gms/cast/framework/media/c$d;)V

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/c;->o:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/c;->t()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c$h;->c()V

    :cond_3
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public b()Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/framework/media/c$b;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/cast/framework/media/c;->b(Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public b(ILorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/framework/media/c$b;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/c;->w()V

    new-instance v0, Lcom/google/android/gms/cast/framework/media/c$6;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/c;->m:Lcom/google/android/gms/common/api/g;

    invoke-direct {v0, p0, v1, p1, p2}, Lcom/google/android/gms/cast/framework/media/c$6;-><init>(Lcom/google/android/gms/cast/framework/media/c;Lcom/google/android/gms/common/api/g;ILorg/json/JSONObject;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/cast/framework/media/c;->a(Lcom/google/android/gms/cast/framework/media/c$f;)Lcom/google/android/gms/cast/framework/media/c$f;

    move-result-object v0

    return-object v0
.end method

.method public b(Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/framework/media/c$b;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/c;->w()V

    new-instance v0, Lcom/google/android/gms/cast/framework/media/c$10;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/c;->m:Lcom/google/android/gms/common/api/g;

    invoke-direct {v0, p0, v1, p1}, Lcom/google/android/gms/cast/framework/media/c$10;-><init>(Lcom/google/android/gms/cast/framework/media/c;Lcom/google/android/gms/common/api/g;Lorg/json/JSONObject;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/cast/framework/media/c;->a(Lcom/google/android/gms/cast/framework/media/c$f;)Lcom/google/android/gms/cast/framework/media/c$f;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/google/android/gms/cast/framework/media/c$a;)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/c;->n:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public c()Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/framework/media/c$b;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/cast/framework/media/c;->c(Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public c(ILorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/framework/media/c$b;",
            ">;"
        }
    .end annotation

    const-wide/16 v0, -0x1

    invoke-virtual {p0, p1, v0, v1, p2}, Lcom/google/android/gms/cast/framework/media/c;->a(IJLorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;

    move-result-object v0

    return-object v0
.end method

.method public c(Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/framework/media/c$b;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/c;->w()V

    new-instance v0, Lcom/google/android/gms/cast/framework/media/c$11;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/c;->m:Lcom/google/android/gms/common/api/g;

    invoke-direct {v0, p0, v1, p1}, Lcom/google/android/gms/cast/framework/media/c$11;-><init>(Lcom/google/android/gms/cast/framework/media/c;Lcom/google/android/gms/common/api/g;Lorg/json/JSONObject;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/cast/framework/media/c;->a(Lcom/google/android/gms/cast/framework/media/c$f;)Lcom/google/android/gms/cast/framework/media/c$f;

    move-result-object v0

    return-object v0
.end method

.method public d()Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/framework/media/c$b;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/c;->w()V

    new-instance v0, Lcom/google/android/gms/cast/framework/media/c$16;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/c;->m:Lcom/google/android/gms/common/api/g;

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/cast/framework/media/c$16;-><init>(Lcom/google/android/gms/cast/framework/media/c;Lcom/google/android/gms/common/api/g;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/cast/framework/media/c;->a(Lcom/google/android/gms/cast/framework/media/c$f;)Lcom/google/android/gms/cast/framework/media/c$f;

    move-result-object v0

    return-object v0
.end method

.method public d(Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/framework/media/c$b;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/c;->w()V

    new-instance v0, Lcom/google/android/gms/cast/framework/media/c$2;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/c;->m:Lcom/google/android/gms/common/api/g;

    invoke-direct {v0, p0, v1, p1}, Lcom/google/android/gms/cast/framework/media/c$2;-><init>(Lcom/google/android/gms/cast/framework/media/c;Lcom/google/android/gms/common/api/g;Lorg/json/JSONObject;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/cast/framework/media/c;->a(Lcom/google/android/gms/cast/framework/media/c$f;)Lcom/google/android/gms/cast/framework/media/c$f;

    move-result-object v0

    return-object v0
.end method

.method public e()J
    .locals 4

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/c;->h:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/c;->j:Lcom/google/android/gms/cast/internal/n;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/internal/n;->d()J

    move-result-wide v2

    monitor-exit v1

    return-wide v2

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public e(Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/cast/framework/media/c$b;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/cast/framework/media/c;->w()V

    new-instance v0, Lcom/google/android/gms/cast/framework/media/c$3;

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/c;->m:Lcom/google/android/gms/common/api/g;

    invoke-direct {v0, p0, v1, p1}, Lcom/google/android/gms/cast/framework/media/c$3;-><init>(Lcom/google/android/gms/cast/framework/media/c;Lcom/google/android/gms/common/api/g;Lorg/json/JSONObject;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/cast/framework/media/c;->a(Lcom/google/android/gms/cast/framework/media/c$f;)Lcom/google/android/gms/cast/framework/media/c$f;

    move-result-object v0

    return-object v0
.end method

.method public f()J
    .locals 4

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/c;->h:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/c;->j:Lcom/google/android/gms/cast/internal/n;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/internal/n;->e()J

    move-result-wide v2

    monitor-exit v1

    return-wide v2

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public g()Lcom/google/android/gms/cast/MediaStatus;
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/c;->h:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/c;->j:Lcom/google/android/gms/cast/internal/n;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/internal/n;->f()Lcom/google/android/gms/cast/MediaStatus;

    move-result-object v0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public h()Lcom/google/android/gms/cast/MediaInfo;
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/c;->h:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/c;->j:Lcom/google/android/gms/cast/internal/n;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/internal/n;->g()Lcom/google/android/gms/cast/MediaInfo;

    move-result-object v0

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public i()I
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/c;->h:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/c;->g()Lcom/google/android/gms/cast/MediaStatus;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/MediaStatus;->c()I

    move-result v0

    :goto_0
    monitor-exit v1

    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public j()I
    .locals 2

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/c;->h:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/c;->g()Lcom/google/android/gms/cast/MediaStatus;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/MediaStatus;->d()I

    move-result v0

    :goto_0
    monitor-exit v1

    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public k()Z
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/c;->h()Lcom/google/android/gms/cast/MediaInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/MediaInfo;->c()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public l()Z
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/c;->g()Lcom/google/android/gms/cast/MediaStatus;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/MediaStatus;->c()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public m()Z
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/c;->g()Lcom/google/android/gms/cast/MediaStatus;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/cast/MediaStatus;->c()I

    move-result v0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/c;->k()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/c;->j()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public n()Z
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/c;->g()Lcom/google/android/gms/cast/MediaStatus;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/MediaStatus;->c()I

    move-result v0

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public o()Z
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/c;->g()Lcom/google/android/gms/cast/MediaStatus;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/MediaStatus;->m()I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public p()Lcom/google/android/gms/cast/MediaQueueItem;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/c;->g()Lcom/google/android/gms/cast/MediaStatus;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/cast/MediaStatus;->l()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/cast/MediaStatus;->a(I)Lcom/google/android/gms/cast/MediaQueueItem;

    move-result-object v0

    goto :goto_0
.end method

.method public q()Lcom/google/android/gms/cast/MediaQueueItem;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/c;->g()Lcom/google/android/gms/cast/MediaStatus;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/cast/MediaStatus;->m()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/cast/MediaStatus;->a(I)Lcom/google/android/gms/cast/MediaQueueItem;

    move-result-object v0

    goto :goto_0
.end method

.method public r()Lcom/google/android/gms/cast/MediaQueueItem;
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/c;->g()Lcom/google/android/gms/cast/MediaStatus;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {v0}, Lcom/google/android/gms/cast/MediaStatus;->n()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/cast/MediaStatus;->a(I)Lcom/google/android/gms/cast/MediaQueueItem;

    move-result-object v0

    goto :goto_0
.end method

.method public s()V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/c;->i()I

    move-result v0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    :cond_0
    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/c;->a()Lcom/google/android/gms/common/api/i;

    :goto_0
    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/c;->c()Lcom/google/android/gms/common/api/i;

    goto :goto_0
.end method

.method public t()Z
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/c;->n()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/c;->l()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/c;->m()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/c;->o()Z

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

.method public u()Z
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/cast/framework/media/c;->g()Lcom/google/android/gms/cast/MediaStatus;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/MediaStatus;->r()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public v()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/c;->j:Lcom/google/android/gms/cast/internal/n;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/internal/n;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
