.class public Lcom/google/android/gms/internal/lc;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable",
        "<",
        "Lcom/google/android/gms/internal/lg;",
        ">;"
    }
.end annotation


# static fields
.field private static final a:Lcom/google/android/gms/internal/hb;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/hb",
            "<",
            "Lcom/google/android/gms/internal/lg;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Lcom/google/android/gms/internal/lh;

.field private c:Lcom/google/android/gms/internal/hb;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/hb",
            "<",
            "Lcom/google/android/gms/internal/lg;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lcom/google/android/gms/internal/lb;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/hb;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/hb;-><init>(Ljava/util/List;Ljava/util/Comparator;)V

    sput-object v0, Lcom/google/android/gms/internal/lc;->a:Lcom/google/android/gms/internal/hb;

    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/lb;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/lc;->d:Lcom/google/android/gms/internal/lb;

    iput-object p1, p0, Lcom/google/android/gms/internal/lc;->b:Lcom/google/android/gms/internal/lh;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/lc;->c:Lcom/google/android/gms/internal/hb;

    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/lb;Lcom/google/android/gms/internal/hb;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/lh;",
            "Lcom/google/android/gms/internal/lb;",
            "Lcom/google/android/gms/internal/hb",
            "<",
            "Lcom/google/android/gms/internal/lg;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/internal/lc;->d:Lcom/google/android/gms/internal/lb;

    iput-object p1, p0, Lcom/google/android/gms/internal/lc;->b:Lcom/google/android/gms/internal/lh;

    iput-object p3, p0, Lcom/google/android/gms/internal/lc;->c:Lcom/google/android/gms/internal/hb;

    return-void
.end method

.method public static a(Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lc;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/lc;

    invoke-static {}, Lcom/google/android/gms/internal/lk;->d()Lcom/google/android/gms/internal/lk;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/lc;-><init>(Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/lb;)V

    return-object v0
.end method

.method public static a(Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/lb;)Lcom/google/android/gms/internal/lc;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/lc;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/lc;-><init>(Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/lb;)V

    return-object v0
.end method

.method private e()V
    .locals 7

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/lc;->c:Lcom/google/android/gms/internal/hb;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/lc;->d:Lcom/google/android/gms/internal/lb;

    invoke-static {}, Lcom/google/android/gms/internal/ld;->d()Lcom/google/android/gms/internal/ld;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/google/android/gms/internal/lc;->a:Lcom/google/android/gms/internal/hb;

    iput-object v0, p0, Lcom/google/android/gms/internal/lc;->c:Lcom/google/android/gms/internal/hb;

    :cond_0
    :goto_0
    return-void

    :cond_1
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/internal/lc;->b:Lcom/google/android/gms/internal/lh;

    invoke-interface {v0}, Lcom/google/android/gms/internal/lh;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v1, v2

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/lg;

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/google/android/gms/internal/lc;->d:Lcom/google/android/gms/internal/lb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/lg;->d()Lcom/google/android/gms/internal/lh;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/google/android/gms/internal/lb;->a(Lcom/google/android/gms/internal/lh;)Z

    move-result v1

    if-eqz v1, :cond_3

    :cond_2
    const/4 v1, 0x1

    :goto_2
    new-instance v5, Lcom/google/android/gms/internal/lg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/lg;->c()Lcom/google/android/gms/internal/kv;

    move-result-object v6

    invoke-virtual {v0}, Lcom/google/android/gms/internal/lg;->d()Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-direct {v5, v6, v0}, Lcom/google/android/gms/internal/lg;-><init>(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;)V

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    move v1, v2

    goto :goto_2

    :cond_4
    if-eqz v1, :cond_5

    new-instance v0, Lcom/google/android/gms/internal/hb;

    iget-object v1, p0, Lcom/google/android/gms/internal/lc;->d:Lcom/google/android/gms/internal/lb;

    invoke-direct {v0, v3, v1}, Lcom/google/android/gms/internal/hb;-><init>(Ljava/util/List;Ljava/util/Comparator;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/lc;->c:Lcom/google/android/gms/internal/hb;

    goto :goto_0

    :cond_5
    sget-object v0, Lcom/google/android/gms/internal/lc;->a:Lcom/google/android/gms/internal/hb;

    iput-object v0, p0, Lcom/google/android/gms/internal/lc;->c:Lcom/google/android/gms/internal/hb;

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/lb;)Lcom/google/android/gms/internal/kv;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/lc;->d:Lcom/google/android/gms/internal/lb;

    invoke-static {}, Lcom/google/android/gms/internal/ld;->d()Lcom/google/android/gms/internal/ld;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/lc;->d:Lcom/google/android/gms/internal/lb;

    invoke-virtual {v0, p3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Index not available in IndexedNode!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/lc;->e()V

    iget-object v0, p0, Lcom/google/android/gms/internal/lc;->c:Lcom/google/android/gms/internal/hb;

    sget-object v1, Lcom/google/android/gms/internal/lc;->a:Lcom/google/android/gms/internal/hb;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/lc;->b:Lcom/google/android/gms/internal/lh;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/lh;->b(Lcom/google/android/gms/internal/kv;)Lcom/google/android/gms/internal/kv;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/lc;->c:Lcom/google/android/gms/internal/hb;

    new-instance v1, Lcom/google/android/gms/internal/lg;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/internal/lg;-><init>(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/hb;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/lg;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/lg;->c()Lcom/google/android/gms/internal/kv;

    move-result-object v0

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lc;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/lc;->b:Lcom/google/android/gms/internal/lh;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/lh;->a(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lh;

    move-result-object v2

    iget-object v0, p0, Lcom/google/android/gms/internal/lc;->c:Lcom/google/android/gms/internal/hb;

    sget-object v1, Lcom/google/android/gms/internal/lc;->a:Lcom/google/android/gms/internal/hb;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/lc;->d:Lcom/google/android/gms/internal/lb;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/lb;->a(Lcom/google/android/gms/internal/lh;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/lc;

    iget-object v1, p0, Lcom/google/android/gms/internal/lc;->d:Lcom/google/android/gms/internal/lb;

    sget-object v3, Lcom/google/android/gms/internal/lc;->a:Lcom/google/android/gms/internal/hb;

    invoke-direct {v0, v2, v1, v3}, Lcom/google/android/gms/internal/lc;-><init>(Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/lb;Lcom/google/android/gms/internal/hb;)V

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/lc;->c:Lcom/google/android/gms/internal/hb;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/lc;->c:Lcom/google/android/gms/internal/hb;

    sget-object v1, Lcom/google/android/gms/internal/lc;->a:Lcom/google/android/gms/internal/hb;

    if-ne v0, v1, :cond_2

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/lc;

    iget-object v1, p0, Lcom/google/android/gms/internal/lc;->d:Lcom/google/android/gms/internal/lb;

    const/4 v3, 0x0

    invoke-direct {v0, v2, v1, v3}, Lcom/google/android/gms/internal/lc;-><init>(Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/lb;Lcom/google/android/gms/internal/hb;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/lc;->b:Lcom/google/android/gms/internal/lh;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/lh;->c(Lcom/google/android/gms/internal/kv;)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/lc;->c:Lcom/google/android/gms/internal/hb;

    new-instance v3, Lcom/google/android/gms/internal/lg;

    invoke-direct {v3, p1, v0}, Lcom/google/android/gms/internal/lg;-><init>(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;)V

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/hb;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/hb;

    move-result-object v0

    invoke-interface {p2}, Lcom/google/android/gms/internal/lh;->b()Z

    move-result v1

    if-nez v1, :cond_3

    new-instance v1, Lcom/google/android/gms/internal/lg;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/internal/lg;-><init>(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/hb;->b(Ljava/lang/Object;)Lcom/google/android/gms/internal/hb;

    move-result-object v0

    :cond_3
    new-instance v1, Lcom/google/android/gms/internal/lc;

    iget-object v3, p0, Lcom/google/android/gms/internal/lc;->d:Lcom/google/android/gms/internal/lb;

    invoke-direct {v1, v2, v3, v0}, Lcom/google/android/gms/internal/lc;-><init>(Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/lb;Lcom/google/android/gms/internal/hb;)V

    move-object v0, v1

    goto :goto_0
.end method

.method public a()Lcom/google/android/gms/internal/lh;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/lc;->b:Lcom/google/android/gms/internal/lh;

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/lb;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/lc;->d:Lcom/google/android/gms/internal/lb;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public b(Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lc;
    .locals 4

    new-instance v0, Lcom/google/android/gms/internal/lc;

    iget-object v1, p0, Lcom/google/android/gms/internal/lc;->b:Lcom/google/android/gms/internal/lh;

    invoke-interface {v1, p1}, Lcom/google/android/gms/internal/lh;->b(Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lh;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/lc;->d:Lcom/google/android/gms/internal/lb;

    iget-object v3, p0, Lcom/google/android/gms/internal/lc;->c:Lcom/google/android/gms/internal/hb;

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/internal/lc;-><init>(Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/lb;Lcom/google/android/gms/internal/hb;)V

    return-object v0
.end method

.method public b()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<",
            "Lcom/google/android/gms/internal/lg;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/lc;->e()V

    iget-object v0, p0, Lcom/google/android/gms/internal/lc;->c:Lcom/google/android/gms/internal/hb;

    sget-object v1, Lcom/google/android/gms/internal/lc;->a:Lcom/google/android/gms/internal/hb;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/lc;->b:Lcom/google/android/gms/internal/lh;

    invoke-interface {v0}, Lcom/google/android/gms/internal/lh;->i()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/lc;->c:Lcom/google/android/gms/internal/hb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/hb;->c()Ljava/util/Iterator;

    move-result-object v0

    goto :goto_0
.end method

.method public c()Lcom/google/android/gms/internal/lg;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/lc;->b:Lcom/google/android/gms/internal/lh;

    instance-of v0, v0, Lcom/google/android/gms/internal/kw;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/lc;->e()V

    iget-object v0, p0, Lcom/google/android/gms/internal/lc;->c:Lcom/google/android/gms/internal/hb;

    sget-object v1, Lcom/google/android/gms/internal/lc;->a:Lcom/google/android/gms/internal/hb;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/lc;->b:Lcom/google/android/gms/internal/lh;

    check-cast v0, Lcom/google/android/gms/internal/kw;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/kw;->g()Lcom/google/android/gms/internal/kv;

    move-result-object v1

    new-instance v0, Lcom/google/android/gms/internal/lg;

    iget-object v2, p0, Lcom/google/android/gms/internal/lc;->b:Lcom/google/android/gms/internal/lh;

    invoke-interface {v2, v1}, Lcom/google/android/gms/internal/lh;->c(Lcom/google/android/gms/internal/kv;)Lcom/google/android/gms/internal/lh;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/lg;-><init>(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/lc;->c:Lcom/google/android/gms/internal/hb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/hb;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/lg;

    goto :goto_0
.end method

.method public d()Lcom/google/android/gms/internal/lg;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/lc;->b:Lcom/google/android/gms/internal/lh;

    instance-of v0, v0, Lcom/google/android/gms/internal/kw;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/internal/lc;->e()V

    iget-object v0, p0, Lcom/google/android/gms/internal/lc;->c:Lcom/google/android/gms/internal/hb;

    sget-object v1, Lcom/google/android/gms/internal/lc;->a:Lcom/google/android/gms/internal/hb;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/lc;->b:Lcom/google/android/gms/internal/lh;

    check-cast v0, Lcom/google/android/gms/internal/kw;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/kw;->h()Lcom/google/android/gms/internal/kv;

    move-result-object v1

    new-instance v0, Lcom/google/android/gms/internal/lg;

    iget-object v2, p0, Lcom/google/android/gms/internal/lc;->b:Lcom/google/android/gms/internal/lh;

    invoke-interface {v2, v1}, Lcom/google/android/gms/internal/lh;->c(Lcom/google/android/gms/internal/kv;)Lcom/google/android/gms/internal/lh;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/lg;-><init>(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/lc;->c:Lcom/google/android/gms/internal/hb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/hb;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/lg;

    goto :goto_0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<",
            "Lcom/google/android/gms/internal/lg;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/lc;->e()V

    iget-object v0, p0, Lcom/google/android/gms/internal/lc;->c:Lcom/google/android/gms/internal/hb;

    sget-object v1, Lcom/google/android/gms/internal/lc;->a:Lcom/google/android/gms/internal/hb;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/lc;->b:Lcom/google/android/gms/internal/lh;

    invoke-interface {v0}, Lcom/google/android/gms/internal/lh;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/lc;->c:Lcom/google/android/gms/internal/hb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/hb;->iterator()Ljava/util/Iterator;

    move-result-object v0

    goto :goto_0
.end method
