.class public Lcom/google/android/gms/internal/ia;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable",
        "<",
        "Ljava/util/Map$Entry",
        "<",
        "Lcom/google/android/gms/internal/ij;",
        "Lcom/google/android/gms/internal/lh;",
        ">;>;"
    }
.end annotation


# static fields
.field static final synthetic a:Z

.field private static final b:Lcom/google/android/gms/internal/ia;


# instance fields
.field private final c:Lcom/google/android/gms/internal/ju;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ju",
            "<",
            "Lcom/google/android/gms/internal/lh;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-class v0, Lcom/google/android/gms/internal/ia;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/google/android/gms/internal/ia;->a:Z

    new-instance v0, Lcom/google/android/gms/internal/ia;

    new-instance v1, Lcom/google/android/gms/internal/ju;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ju;-><init>(Ljava/lang/Object;)V

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ia;-><init>(Lcom/google/android/gms/internal/ju;)V

    sput-object v0, Lcom/google/android/gms/internal/ia;->b:Lcom/google/android/gms/internal/ia;

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private constructor <init>(Lcom/google/android/gms/internal/ju;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ju",
            "<",
            "Lcom/google/android/gms/internal/lh;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ia;->c:Lcom/google/android/gms/internal/ju;

    return-void
.end method

.method public static a()Lcom/google/android/gms/internal/ia;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ia;->b:Lcom/google/android/gms/internal/ia;

    return-object v0
.end method

.method public static a(Ljava/util/Map;)Lcom/google/android/gms/internal/ia;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/google/android/gms/internal/ia;"
        }
    .end annotation

    invoke-static {}, Lcom/google/android/gms/internal/ju;->a()Lcom/google/android/gms/internal/ju;

    move-result-object v0

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move-object v1, v0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    new-instance v3, Lcom/google/android/gms/internal/ju;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4}, Lcom/google/android/gms/internal/li;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/lh;

    move-result-object v4

    invoke-direct {v3, v4}, Lcom/google/android/gms/internal/ju;-><init>(Ljava/lang/Object;)V

    new-instance v4, Lcom/google/android/gms/internal/ij;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-direct {v4, v0}, Lcom/google/android/gms/internal/ij;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v4, v3}, Lcom/google/android/gms/internal/ju;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/ju;)Lcom/google/android/gms/internal/ju;

    move-result-object v0

    move-object v1, v0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ia;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ia;-><init>(Lcom/google/android/gms/internal/ju;)V

    return-object v0
.end method

.method private a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/ju;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lh;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ij;",
            "Lcom/google/android/gms/internal/ju",
            "<",
            "Lcom/google/android/gms/internal/lh;",
            ">;",
            "Lcom/google/android/gms/internal/lh;",
            ")",
            "Lcom/google/android/gms/internal/lh;"
        }
    .end annotation

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ju;->b()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ju;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/lh;

    invoke-interface {p3, p1, v0}, Lcom/google/android/gms/internal/lh;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lh;

    move-result-object v3

    :cond_0
    :goto_0
    return-object v3

    :cond_1
    const/4 v2, 0x0

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ju;->c()Lcom/google/android/gms/internal/gz;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gz;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move-object v3, p3

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ju;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/kv;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/kv;->f()Z

    move-result v5

    if-eqz v5, :cond_3

    sget-boolean v0, Lcom/google/android/gms/internal/ia;->a:Z

    if-nez v0, :cond_2

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ju;->b()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "Priority writes must always be leaf nodes"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_2
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ju;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/lh;

    move-object v1, v3

    :goto_2
    move-object v2, v0

    move-object v3, v1

    goto :goto_1

    :cond_3
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ij;->a(Lcom/google/android/gms/internal/kv;)Lcom/google/android/gms/internal/ij;

    move-result-object v0

    invoke-direct {p0, v0, v1, v3}, Lcom/google/android/gms/internal/ia;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/ju;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    move-object v1, v0

    move-object v0, v2

    goto :goto_2

    :cond_4
    invoke-interface {v3, p1}, Lcom/google/android/gms/internal/lh;->a(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/lh;->b()Z

    move-result v0

    if-nez v0, :cond_0

    if-eqz v2, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/kv;->c()Lcom/google/android/gms/internal/kv;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ij;->a(Lcom/google/android/gms/internal/kv;)Lcom/google/android/gms/internal/ij;

    move-result-object v0

    invoke-interface {v3, v0, v2}, Lcom/google/android/gms/internal/lh;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lh;

    move-result-object v3

    goto :goto_0
.end method

.method public static b(Ljava/util/Map;)Lcom/google/android/gms/internal/ia;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/internal/ij;",
            "Lcom/google/android/gms/internal/lh;",
            ">;)",
            "Lcom/google/android/gms/internal/ia;"
        }
    .end annotation

    invoke-static {}, Lcom/google/android/gms/internal/ju;->a()Lcom/google/android/gms/internal/ju;

    move-result-object v0

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move-object v2, v0

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    new-instance v4, Lcom/google/android/gms/internal/ju;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/lh;

    invoke-direct {v4, v1}, Lcom/google/android/gms/internal/ju;-><init>(Ljava/lang/Object;)V

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ij;

    invoke-virtual {v2, v0, v4}, Lcom/google/android/gms/internal/ju;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/ju;)Lcom/google/android/gms/internal/ju;

    move-result-object v0

    move-object v2, v0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ia;

    invoke-direct {v0, v2}, Lcom/google/android/gms/internal/ia;-><init>(Lcom/google/android/gms/internal/ju;)V

    return-object v0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/ia;
    .locals 2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ij;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/ia;->b:Lcom/google/android/gms/internal/ia;

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ia;->c:Lcom/google/android/gms/internal/ju;

    invoke-static {}, Lcom/google/android/gms/internal/ju;->a()Lcom/google/android/gms/internal/ju;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Lcom/google/android/gms/internal/ju;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/ju;)Lcom/google/android/gms/internal/ju;

    move-result-object v1

    new-instance v0, Lcom/google/android/gms/internal/ia;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ia;-><init>(Lcom/google/android/gms/internal/ju;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/ia;)Lcom/google/android/gms/internal/ia;
    .locals 2

    iget-object v0, p2, Lcom/google/android/gms/internal/ia;->c:Lcom/google/android/gms/internal/ju;

    new-instance v1, Lcom/google/android/gms/internal/ia$1;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/ia$1;-><init>(Lcom/google/android/gms/internal/ia;Lcom/google/android/gms/internal/ij;)V

    invoke-virtual {v0, p0, v1}, Lcom/google/android/gms/internal/ju;->a(Ljava/lang/Object;Lcom/google/android/gms/internal/ju$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ia;

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/ia;
    .locals 4

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ij;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance p0, Lcom/google/android/gms/internal/ia;

    new-instance v0, Lcom/google/android/gms/internal/ju;

    invoke-direct {v0, p2}, Lcom/google/android/gms/internal/ju;-><init>(Ljava/lang/Object;)V

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ia;-><init>(Lcom/google/android/gms/internal/ju;)V

    :cond_0
    :goto_0
    return-object p0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ia;->c:Lcom/google/android/gms/internal/ju;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ju;->a(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/ij;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-static {v1, p1}, Lcom/google/android/gms/internal/ij;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/ij;

    move-result-object v2

    iget-object v0, p0, Lcom/google/android/gms/internal/ia;->c:Lcom/google/android/gms/internal/ju;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ju;->e(Lcom/google/android/gms/internal/ij;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/lh;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ij;->g()Lcom/google/android/gms/internal/kv;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lcom/google/android/gms/internal/kv;->f()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ij;->f()Lcom/google/android/gms/internal/ij;

    move-result-object v3

    invoke-interface {v0, v3}, Lcom/google/android/gms/internal/lh;->a(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/lh;

    move-result-object v3

    invoke-interface {v3}, Lcom/google/android/gms/internal/lh;->b()Z

    move-result v3

    if-nez v3, :cond_0

    :cond_2
    invoke-interface {v0, v2, p2}, Lcom/google/android/gms/internal/lh;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lh;

    move-result-object v2

    new-instance v0, Lcom/google/android/gms/internal/ia;

    iget-object v3, p0, Lcom/google/android/gms/internal/ia;->c:Lcom/google/android/gms/internal/ju;

    invoke-virtual {v3, v1, v2}, Lcom/google/android/gms/internal/ju;->a(Lcom/google/android/gms/internal/ij;Ljava/lang/Object;)Lcom/google/android/gms/internal/ju;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ia;-><init>(Lcom/google/android/gms/internal/ju;)V

    move-object p0, v0

    goto :goto_0

    :cond_3
    new-instance v0, Lcom/google/android/gms/internal/ju;

    invoke-direct {v0, p2}, Lcom/google/android/gms/internal/ju;-><init>(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ia;->c:Lcom/google/android/gms/internal/ju;

    invoke-virtual {v1, p1, v0}, Lcom/google/android/gms/internal/ju;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/ju;)Lcom/google/android/gms/internal/ju;

    move-result-object v0

    new-instance p0, Lcom/google/android/gms/internal/ia;

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/ia;-><init>(Lcom/google/android/gms/internal/ju;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/ia;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ij;

    const/4 v1, 0x1

    new-array v1, v1, [Lcom/google/android/gms/internal/kv;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ij;-><init>([Lcom/google/android/gms/internal/kv;)V

    invoke-virtual {p0, v0, p2}, Lcom/google/android/gms/internal/ia;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/ia;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lh;
    .locals 2

    invoke-static {}, Lcom/google/android/gms/internal/ij;->a()Lcom/google/android/gms/internal/ij;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ia;->c:Lcom/google/android/gms/internal/ju;

    invoke-direct {p0, v0, v1, p1}, Lcom/google/android/gms/internal/ia;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/ju;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    return-object v0
.end method

.method public a(Z)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Lcom/google/android/gms/internal/ia;->c:Lcom/google/android/gms/internal/ju;

    new-instance v2, Lcom/google/android/gms/internal/ia$2;

    invoke-direct {v2, p0, v0, p1}, Lcom/google/android/gms/internal/ia$2;-><init>(Lcom/google/android/gms/internal/ia;Ljava/util/Map;Z)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ju;->a(Lcom/google/android/gms/internal/ju$a;)V

    return-object v0
.end method

.method public b()Lcom/google/android/gms/internal/lh;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ia;->c:Lcom/google/android/gms/internal/ju;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ju;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/lh;

    return-object v0
.end method

.method public b(Lcom/google/android/gms/internal/ij;)Z
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ia;->c(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/lh;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ia;->c:Lcom/google/android/gms/internal/ju;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ju;->a(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/ij;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ia;->c:Lcom/google/android/gms/internal/ju;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ju;->e(Lcom/google/android/gms/internal/ij;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/lh;

    invoke-static {v1, p1}, Lcom/google/android/gms/internal/ij;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/ij;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/lh;->a(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/lg;",
            ">;"
        }
    .end annotation

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ia;->c:Lcom/google/android/gms/internal/ju;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ju;->b()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ia;->c:Lcom/google/android/gms/internal/ju;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ju;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/lh;

    invoke-interface {v0}, Lcom/google/android/gms/internal/lh;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/lg;

    new-instance v3, Lcom/google/android/gms/internal/lg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/lg;->c()Lcom/google/android/gms/internal/kv;

    move-result-object v4

    invoke-virtual {v0}, Lcom/google/android/gms/internal/lg;->d()Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-direct {v3, v4, v0}, Lcom/google/android/gms/internal/lg;-><init>(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ia;->c:Lcom/google/android/gms/internal/ju;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ju;->c()Lcom/google/android/gms/internal/gz;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gz;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ju;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ju;->b()Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_1

    new-instance v4, Lcom/google/android/gms/internal/lg;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/kv;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ju;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/lh;

    invoke-direct {v4, v0, v1}, Lcom/google/android/gms/internal/lg;-><init>(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;)V

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    return-object v2
.end method

.method public d(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/ia;
    .locals 2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ij;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    :goto_0
    return-object p0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ia;->c(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance p0, Lcom/google/android/gms/internal/ia;

    new-instance v1, Lcom/google/android/gms/internal/ju;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ju;-><init>(Ljava/lang/Object;)V

    invoke-direct {p0, v1}, Lcom/google/android/gms/internal/ia;-><init>(Lcom/google/android/gms/internal/ju;)V

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/ia;

    iget-object v1, p0, Lcom/google/android/gms/internal/ia;->c:Lcom/google/android/gms/internal/ju;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ju;->c(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/ju;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ia;-><init>(Lcom/google/android/gms/internal/ju;)V

    move-object p0, v0

    goto :goto_0
.end method

.method public d()Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/internal/kv;",
            "Lcom/google/android/gms/internal/ia;",
            ">;"
        }
    .end annotation

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ia;->c:Lcom/google/android/gms/internal/ju;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ju;->c()Lcom/google/android/gms/internal/gz;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gz;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/kv;

    new-instance v4, Lcom/google/android/gms/internal/ia;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ju;

    invoke-direct {v4, v0}, Lcom/google/android/gms/internal/ia;-><init>(Lcom/google/android/gms/internal/ju;)V

    invoke-interface {v2, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v2
.end method

.method public e()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ia;->c:Lcom/google/android/gms/internal/ju;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ju;->d()Z

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    :goto_0
    return v0

    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_2

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :cond_2
    check-cast p1, Lcom/google/android/gms/internal/ia;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ia;->a(Z)Ljava/util/Map;

    move-result-object v1

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ia;->a(Z)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Map;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ia;->a(Z)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->hashCode()I

    move-result v0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<",
            "Ljava/util/Map$Entry",
            "<",
            "Lcom/google/android/gms/internal/ij;",
            "Lcom/google/android/gms/internal/lh;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ia;->c:Lcom/google/android/gms/internal/ju;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ju;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ia;->a(Z)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, 0xf

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v2, "CompoundWrite{"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
