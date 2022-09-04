.class public Lcom/google/android/gms/internal/it;
.super Ljava/lang/Object;


# static fields
.field static final synthetic a:Z


# instance fields
.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/internal/kf;",
            "Lcom/google/android/gms/internal/kh;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lcom/google/android/gms/internal/jp;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/google/android/gms/internal/it;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/google/android/gms/internal/it;->a:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/jp;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/it;->b:Ljava/util/Map;

    iput-object p1, p0, Lcom/google/android/gms/internal/it;->c:Lcom/google/android/gms/internal/jp;

    return-void
.end method

.method private a(Lcom/google/android/gms/internal/kh;Lcom/google/android/gms/internal/jh;Lcom/google/android/gms/internal/jc;Lcom/google/android/gms/internal/lh;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/kh;",
            "Lcom/google/android/gms/internal/jh;",
            "Lcom/google/android/gms/internal/jc;",
            "Lcom/google/android/gms/internal/lh;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/kb;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1, p2, p3, p4}, Lcom/google/android/gms/internal/kh;->a(Lcom/google/android/gms/internal/jh;Lcom/google/android/gms/internal/jc;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/kh$a;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kh;->a()Lcom/google/android/gms/internal/kg;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/kg;->e()Z

    move-result v0

    if-nez v0, :cond_4

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    iget-object v0, v1, Lcom/google/android/gms/internal/kh$a;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ka;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ka;->b()Lcom/google/android/gms/internal/kc$a;

    move-result-object v5

    sget-object v6, Lcom/google/android/gms/internal/kc$a;->b:Lcom/google/android/gms/internal/kc$a;

    if-ne v5, v6, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ka;->a()Lcom/google/android/gms/internal/kv;

    move-result-object v0

    invoke-interface {v3, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    sget-object v6, Lcom/google/android/gms/internal/kc$a;->a:Lcom/google/android/gms/internal/kc$a;

    if-ne v5, v6, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ka;->a()Lcom/google/android/gms/internal/kv;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {v3}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v2}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/it;->c:Lcom/google/android/gms/internal/jp;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kh;->a()Lcom/google/android/gms/internal/kg;

    move-result-object v4

    invoke-interface {v0, v4, v3, v2}, Lcom/google/android/gms/internal/jp;->a(Lcom/google/android/gms/internal/kg;Ljava/util/Set;Ljava/util/Set;)V

    :cond_4
    iget-object v0, v1, Lcom/google/android/gms/internal/kh$a;->a:Ljava/util/List;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/kg;)Lcom/google/android/gms/internal/kh;
    .locals 2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kg;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/it;->d()Lcom/google/android/gms/internal/kh;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/it;->b:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kg;->b()Lcom/google/android/gms/internal/kf;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/kh;

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/lh;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/it;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/kh;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/kh;->a(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/lh;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/kh;->a(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/internal/kg;Lcom/google/android/gms/internal/ie;Lcom/google/firebase/database/c;)Lcom/google/android/gms/internal/mh;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/kg;",
            "Lcom/google/android/gms/internal/ie;",
            "Lcom/google/firebase/database/c;",
            ")",
            "Lcom/google/android/gms/internal/mh",
            "<",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/kg;",
            ">;",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/kc;",
            ">;>;"
        }
    .end annotation

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/it;->c()Z

    move-result v3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kg;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/it;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/kh;

    invoke-virtual {v0, p2, p3}, Lcom/google/android/gms/internal/kh;->a(Lcom/google/android/gms/internal/ie;Lcom/google/firebase/database/c;)Ljava/util/List;

    move-result-object v5

    invoke-interface {v2, v5}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v0}, Lcom/google/android/gms/internal/kh;->d()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->remove()V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/kh;->a()Lcom/google/android/gms/internal/kg;

    move-result-object v5

    invoke-virtual {v5}, Lcom/google/android/gms/internal/kg;->e()Z

    move-result v5

    if-nez v5, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/kh;->a()Lcom/google/android/gms/internal/kg;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/it;->b:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kg;->b()Lcom/google/android/gms/internal/kf;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/kh;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p2, p3}, Lcom/google/android/gms/internal/kh;->a(Lcom/google/android/gms/internal/ie;Lcom/google/firebase/database/c;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v0}, Lcom/google/android/gms/internal/kh;->d()Z

    move-result v4

    if-eqz v4, :cond_2

    iget-object v4, p0, Lcom/google/android/gms/internal/it;->b:Ljava/util/Map;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kg;->b()Lcom/google/android/gms/internal/kf;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/kh;->a()Lcom/google/android/gms/internal/kg;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/android/gms/internal/kg;->e()Z

    move-result v4

    if-nez v4, :cond_2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/kh;->a()Lcom/google/android/gms/internal/kg;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    if-eqz v3, :cond_3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/it;->c()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kg;->a()Lcom/google/android/gms/internal/ij;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/kg;->a(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/kg;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_3
    new-instance v0, Lcom/google/android/gms/internal/mh;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/mh;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/ie;Lcom/google/android/gms/internal/jc;Lcom/google/android/gms/internal/jy;)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ie;",
            "Lcom/google/android/gms/internal/jc;",
            "Lcom/google/android/gms/internal/jy;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/kb;",
            ">;"
        }
    .end annotation

    const/4 v1, 0x0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ie;->a()Lcom/google/android/gms/internal/kg;

    move-result-object v3

    iget-object v0, p0, Lcom/google/android/gms/internal/it;->b:Ljava/util/Map;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/kg;->b()Lcom/google/android/gms/internal/kf;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/kh;

    if-nez v0, :cond_4

    invoke-virtual {p3}, Lcom/google/android/gms/internal/jy;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p3}, Lcom/google/android/gms/internal/jy;->c()Lcom/google/android/gms/internal/lh;

    move-result-object v0

    :goto_0
    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/jc;->a(Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lh;

    move-result-object v2

    if-eqz v2, :cond_1

    const/4 v0, 0x1

    :goto_1
    invoke-virtual {v3}, Lcom/google/android/gms/internal/kg;->c()Lcom/google/android/gms/internal/lb;

    move-result-object v4

    invoke-static {v2, v4}, Lcom/google/android/gms/internal/lc;->a(Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/lb;)Lcom/google/android/gms/internal/lc;

    move-result-object v2

    new-instance v4, Lcom/google/android/gms/internal/ki;

    new-instance v5, Lcom/google/android/gms/internal/jy;

    invoke-direct {v5, v2, v0, v1}, Lcom/google/android/gms/internal/jy;-><init>(Lcom/google/android/gms/internal/lc;ZZ)V

    invoke-direct {v4, v5, p3}, Lcom/google/android/gms/internal/ki;-><init>(Lcom/google/android/gms/internal/jy;Lcom/google/android/gms/internal/jy;)V

    new-instance v1, Lcom/google/android/gms/internal/kh;

    invoke-direct {v1, v3, v4}, Lcom/google/android/gms/internal/kh;-><init>(Lcom/google/android/gms/internal/kg;Lcom/google/android/gms/internal/ki;)V

    invoke-virtual {v3}, Lcom/google/android/gms/internal/kg;->e()Z

    move-result v0

    if-nez v0, :cond_3

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {v1}, Lcom/google/android/gms/internal/kh;->c()Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/lh;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/lg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/lg;->c()Lcom/google/android/gms/internal/kv;

    move-result-object v0

    invoke-interface {v2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {p3}, Lcom/google/android/gms/internal/jy;->c()Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/jc;->b(Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    move-object v2, v0

    move v0, v1

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/it;->c:Lcom/google/android/gms/internal/jp;

    invoke-interface {v0, v3, v2}, Lcom/google/android/gms/internal/jp;->a(Lcom/google/android/gms/internal/kg;Ljava/util/Set;)V

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/it;->b:Ljava/util/Map;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/kg;->b()Lcom/google/android/gms/internal/kf;

    move-result-object v2

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v0, v1

    :cond_4
    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/kh;->a(Lcom/google/android/gms/internal/ie;)V

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/kh;->b(Lcom/google/android/gms/internal/ie;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/jh;Lcom/google/android/gms/internal/jc;Lcom/google/android/gms/internal/lh;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/jh;",
            "Lcom/google/android/gms/internal/jc;",
            "Lcom/google/android/gms/internal/lh;",
            ")",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/kb;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/internal/jh;->d()Lcom/google/android/gms/internal/ji;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ji;->d()Lcom/google/android/gms/internal/kf;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/google/android/gms/internal/it;->b:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/kh;

    sget-boolean v1, Lcom/google/android/gms/internal/it;->a:Z

    if-nez v1, :cond_0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0

    :cond_0
    invoke-direct {p0, v0, p1, p2, p3}, Lcom/google/android/gms/internal/it;->a(Lcom/google/android/gms/internal/kh;Lcom/google/android/gms/internal/jh;Lcom/google/android/gms/internal/jc;Lcom/google/android/gms/internal/lh;)Ljava/util/List;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/internal/it;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/kh;

    invoke-direct {p0, v0, p1, p2, p3}, Lcom/google/android/gms/internal/it;->a(Lcom/google/android/gms/internal/kh;Lcom/google/android/gms/internal/jh;Lcom/google/android/gms/internal/jc;Lcom/google/android/gms/internal/lh;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    :cond_2
    move-object v0, v1

    goto :goto_0
.end method

.method public a()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/it;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public b()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/internal/kh;",
            ">;"
        }
    .end annotation

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/internal/it;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/kh;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/kh;->a()Lcom/google/android/gms/internal/kg;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/kg;->e()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public b(Lcom/google/android/gms/internal/kg;)Z
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/it;->a(Lcom/google/android/gms/internal/kg;)Lcom/google/android/gms/internal/kh;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c()Z
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/it;->d()Lcom/google/android/gms/internal/kh;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public d()Lcom/google/android/gms/internal/kh;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/it;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/kh;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/kh;->a()Lcom/google/android/gms/internal/kg;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/kg;->e()Z

    move-result v2

    if-eqz v2, :cond_0

    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
