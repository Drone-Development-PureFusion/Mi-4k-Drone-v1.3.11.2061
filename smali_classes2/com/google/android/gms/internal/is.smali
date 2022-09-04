.class Lcom/google/android/gms/internal/is;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/is$a;,
        Lcom/google/android/gms/internal/is$b;
    }
.end annotation


# instance fields
.field private a:Lcom/google/android/gms/internal/lh;

.field private b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/internal/kv;",
            "Lcom/google/android/gms/internal/is;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/is;->a:Lcom/google/android/gms/internal/lh;

    iput-object v0, p0, Lcom/google/android/gms/internal/is;->b:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/is$b;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/is;->a:Lcom/google/android/gms/internal/lh;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/is;->a:Lcom/google/android/gms/internal/lh;

    invoke-interface {p2, p1, v0}, Lcom/google/android/gms/internal/is$b;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;)V

    :goto_0
    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/is$2;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/is$2;-><init>(Lcom/google/android/gms/internal/is;Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/is$b;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/is;->a(Lcom/google/android/gms/internal/is$a;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;)V
    .locals 3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ij;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p2, p0, Lcom/google/android/gms/internal/is;->a:Lcom/google/android/gms/internal/lh;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/internal/is;->b:Ljava/util/Map;

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/is;->a:Lcom/google/android/gms/internal/lh;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/is;->a:Lcom/google/android/gms/internal/lh;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/lh;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/is;->a:Lcom/google/android/gms/internal/lh;

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/is;->b:Ljava/util/Map;

    if-nez v0, :cond_2

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/is;->b:Ljava/util/Map;

    :cond_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ij;->d()Lcom/google/android/gms/internal/kv;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/is;->b:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, Lcom/google/android/gms/internal/is;->b:Ljava/util/Map;

    new-instance v2, Lcom/google/android/gms/internal/is;

    invoke-direct {v2}, Lcom/google/android/gms/internal/is;-><init>()V

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/internal/is;->b:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/is;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ij;->e()Lcom/google/android/gms/internal/ij;

    move-result-object v1

    invoke-virtual {v0, v1, p2}, Lcom/google/android/gms/internal/is;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;)V

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/internal/is$a;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/is;->b:Ljava/util/Map;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/is;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/kv;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/is;

    invoke-interface {p1, v1, v0}, Lcom/google/android/gms/internal/is$a;->a(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/is;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ij;)Z
    .locals 6

    const/4 v2, 0x0

    const/4 v1, 0x1

    const/4 v5, 0x0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ij;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object v5, p0, Lcom/google/android/gms/internal/is;->a:Lcom/google/android/gms/internal/lh;

    iput-object v5, p0, Lcom/google/android/gms/internal/is;->b:Ljava/util/Map;

    move v0, v1

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/is;->a:Lcom/google/android/gms/internal/lh;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/is;->a:Lcom/google/android/gms/internal/lh;

    invoke-interface {v0}, Lcom/google/android/gms/internal/lh;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    move v0, v2

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/is;->a:Lcom/google/android/gms/internal/lh;

    check-cast v0, Lcom/google/android/gms/internal/kw;

    iput-object v5, p0, Lcom/google/android/gms/internal/is;->a:Lcom/google/android/gms/internal/lh;

    new-instance v1, Lcom/google/android/gms/internal/is$1;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/internal/is$1;-><init>(Lcom/google/android/gms/internal/is;Lcom/google/android/gms/internal/ij;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/kw;->a(Lcom/google/android/gms/internal/kw$a;)V

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/is;->a(Lcom/google/android/gms/internal/ij;)Z

    move-result v0

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/is;->b:Ljava/util/Map;

    if-eqz v0, :cond_5

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ij;->d()Lcom/google/android/gms/internal/kv;

    move-result-object v3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ij;->e()Lcom/google/android/gms/internal/ij;

    move-result-object v4

    iget-object v0, p0, Lcom/google/android/gms/internal/is;->b:Ljava/util/Map;

    invoke-interface {v0, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/is;->b:Ljava/util/Map;

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/is;

    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/is;->a(Lcom/google/android/gms/internal/ij;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/is;->b:Ljava/util/Map;

    invoke-interface {v0, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/is;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    iput-object v5, p0, Lcom/google/android/gms/internal/is;->b:Ljava/util/Map;

    move v0, v1

    goto :goto_0

    :cond_4
    move v0, v2

    goto :goto_0

    :cond_5
    move v0, v1

    goto :goto_0
.end method
