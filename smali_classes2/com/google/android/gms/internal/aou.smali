.class public Lcom/google/android/gms/internal/aou;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/aoz;


# static fields
.field private static a:Lcom/google/android/gms/internal/aou;

.field private static final b:Ljava/lang/Object;

.field private static final e:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private c:Lcom/google/android/gms/internal/apo;

.field private d:Lcom/google/android/gms/internal/apa;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/aou;->b:Ljava/lang/Object;

    new-instance v0, Ljava/util/HashSet;

    const/4 v1, 0x4

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    const-string v3, "GET"

    aput-object v3, v1, v2

    const/4 v2, 0x1

    const-string v3, "HEAD"

    aput-object v3, v1, v2

    const/4 v2, 0x2

    const-string v3, "POST"

    aput-object v3, v1, v2

    const/4 v2, 0x3

    const-string v3, "PUT"

    aput-object v3, v1, v2

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    sput-object v0, Lcom/google/android/gms/internal/aou;->e:Ljava/util/Set;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-static {p1}, Lcom/google/android/gms/internal/apb;->a(Landroid/content/Context;)Lcom/google/android/gms/internal/apb;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/aps;

    invoke-direct {v1}, Lcom/google/android/gms/internal/aps;-><init>()V

    invoke-direct {p0, v0, v1}, Lcom/google/android/gms/internal/aou;-><init>(Lcom/google/android/gms/internal/apa;Lcom/google/android/gms/internal/apo;)V

    return-void
.end method

.method constructor <init>(Lcom/google/android/gms/internal/apa;Lcom/google/android/gms/internal/apo;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/aou;->d:Lcom/google/android/gms/internal/apa;

    iput-object p2, p0, Lcom/google/android/gms/internal/aou;->c:Lcom/google/android/gms/internal/apo;

    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/google/android/gms/internal/aoz;
    .locals 2

    sget-object v1, Lcom/google/android/gms/internal/aou;->b:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/aou;->a:Lcom/google/android/gms/internal/aou;

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/aou;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/aou;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/google/android/gms/internal/aou;->a:Lcom/google/android/gms/internal/aou;

    :cond_0
    sget-object v0, Lcom/google/android/gms/internal/aou;->a:Lcom/google/android/gms/internal/aou;

    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method


# virtual methods
.method public a()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/apu;->b()Lcom/google/android/gms/internal/apu;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/apu;->d()V

    return-void
.end method

.method public a(Ljava/lang/String;)Z
    .locals 6

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v3, v2

    move-object v4, v2

    move-object v5, v2

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/aou;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 6

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move-object v4, v2

    move-object v5, v2

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/aou;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Z
    .locals 7
    .param p2    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p3    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p4    # Ljava/util/Map;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .param p5    # Ljava/lang/String;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            ")Z"
        }
    .end annotation

    const/4 v6, 0x1

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    sget-object v1, Lcom/google/android/gms/internal/aou;->e:Ljava/util/Set;

    invoke-interface {v1, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "Unsupport http method %s. Drop the hit."

    new-array v2, v6, [Ljava/lang/Object;

    aput-object p2, v2, v0

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/aph;->b(Ljava/lang/String;)V

    :goto_0
    return v0

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/apn;->a()Lcom/google/android/gms/internal/apn;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/apn;->b()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/aou;->c:Lcom/google/android/gms/internal/apo;

    invoke-interface {v1}, Lcom/google/android/gms/internal/apo;->a()Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "Too many hits sent too quickly (rate throttled)."

    invoke-static {v1}, Lcom/google/android/gms/internal/aph;->b(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/aou;->d:Lcom/google/android/gms/internal/apa;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/internal/apa;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V

    move v0, v6

    goto :goto_0
.end method
