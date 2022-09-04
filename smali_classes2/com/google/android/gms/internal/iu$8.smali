.class Lcom/google/android/gms/internal/iu$8;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/iu;->a(Lcom/google/android/gms/internal/ie;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable",
        "<",
        "Ljava/util/List",
        "<+",
        "Lcom/google/android/gms/internal/kc;",
        ">;>;"
    }
.end annotation


# static fields
.field static final synthetic a:Z


# instance fields
.field final synthetic b:Lcom/google/android/gms/internal/ie;

.field final synthetic c:Lcom/google/android/gms/internal/iu;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/google/android/gms/internal/iu;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/google/android/gms/internal/iu$8;->a:Z

    return-void

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method constructor <init>(Lcom/google/android/gms/internal/iu;Lcom/google/android/gms/internal/ie;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/iu$8;->c:Lcom/google/android/gms/internal/iu;

    iput-object p2, p0, Lcom/google/android/gms/internal/iu$8;->b:Lcom/google/android/gms/internal/ie;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<+",
            "Lcom/google/android/gms/internal/kc;",
            ">;"
        }
    .end annotation

    const/4 v1, 0x1

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/iu$8;->b:Lcom/google/android/gms/internal/ie;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ie;->a()Lcom/google/android/gms/internal/kg;

    move-result-object v8

    invoke-virtual {v8}, Lcom/google/android/gms/internal/kg;->a()Lcom/google/android/gms/internal/ij;

    move-result-object v6

    const/4 v4, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/iu$8;->c:Lcom/google/android/gms/internal/iu;

    invoke-static {v0}, Lcom/google/android/gms/internal/iu;->d(Lcom/google/android/gms/internal/iu;)Lcom/google/android/gms/internal/ju;

    move-result-object v0

    move-object v5, v6

    move-object v7, v0

    move v3, v2

    :goto_0
    invoke-virtual {v7}, Lcom/google/android/gms/internal/ju;->d()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {v7}, Lcom/google/android/gms/internal/ju;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/it;

    if-eqz v0, :cond_12

    if-eqz v4, :cond_1

    :goto_1
    if-nez v3, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/it;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_0
    move v0, v1

    :goto_2
    move-object v3, v4

    :goto_3
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ij;->h()Z

    move-result v4

    if-eqz v4, :cond_3

    const-string v4, ""

    invoke-static {v4}, Lcom/google/android/gms/internal/kv;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/kv;

    move-result-object v4

    :goto_4
    invoke-virtual {v7, v4}, Lcom/google/android/gms/internal/ju;->a(Lcom/google/android/gms/internal/kv;)Lcom/google/android/gms/internal/ju;

    move-result-object v7

    invoke-virtual {v5}, Lcom/google/android/gms/internal/ij;->e()Lcom/google/android/gms/internal/ij;

    move-result-object v4

    move-object v5, v4

    move-object v4, v3

    move v3, v0

    goto :goto_0

    :cond_1
    invoke-virtual {v0, v5}, Lcom/google/android/gms/internal/it;->a(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/lh;

    move-result-object v4

    goto :goto_1

    :cond_2
    move v0, v2

    goto :goto_2

    :cond_3
    invoke-virtual {v5}, Lcom/google/android/gms/internal/ij;->d()Lcom/google/android/gms/internal/kv;

    move-result-object v4

    goto :goto_4

    :cond_4
    iget-object v0, p0, Lcom/google/android/gms/internal/iu$8;->c:Lcom/google/android/gms/internal/iu;

    invoke-static {v0}, Lcom/google/android/gms/internal/iu;->d(Lcom/google/android/gms/internal/iu;)Lcom/google/android/gms/internal/ju;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/google/android/gms/internal/ju;->e(Lcom/google/android/gms/internal/ij;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/it;

    if-nez v0, :cond_5

    new-instance v0, Lcom/google/android/gms/internal/it;

    iget-object v5, p0, Lcom/google/android/gms/internal/iu$8;->c:Lcom/google/android/gms/internal/iu;

    invoke-static {v5}, Lcom/google/android/gms/internal/iu;->b(Lcom/google/android/gms/internal/iu;)Lcom/google/android/gms/internal/jp;

    move-result-object v5

    invoke-direct {v0, v5}, Lcom/google/android/gms/internal/it;-><init>(Lcom/google/android/gms/internal/jp;)V

    iget-object v5, p0, Lcom/google/android/gms/internal/iu$8;->c:Lcom/google/android/gms/internal/iu;

    iget-object v7, p0, Lcom/google/android/gms/internal/iu$8;->c:Lcom/google/android/gms/internal/iu;

    invoke-static {v7}, Lcom/google/android/gms/internal/iu;->d(Lcom/google/android/gms/internal/iu;)Lcom/google/android/gms/internal/ju;

    move-result-object v7

    invoke-virtual {v7, v6, v0}, Lcom/google/android/gms/internal/ju;->a(Lcom/google/android/gms/internal/ij;Ljava/lang/Object;)Lcom/google/android/gms/internal/ju;

    move-result-object v7

    invoke-static {v5, v7}, Lcom/google/android/gms/internal/iu;->a(Lcom/google/android/gms/internal/iu;Lcom/google/android/gms/internal/ju;)Lcom/google/android/gms/internal/ju;

    move-object v11, v0

    move-object v0, v4

    move v4, v3

    move-object v3, v11

    :goto_5
    iget-object v5, p0, Lcom/google/android/gms/internal/iu$8;->c:Lcom/google/android/gms/internal/iu;

    invoke-static {v5}, Lcom/google/android/gms/internal/iu;->b(Lcom/google/android/gms/internal/iu;)Lcom/google/android/gms/internal/jp;

    move-result-object v5

    invoke-interface {v5, v8}, Lcom/google/android/gms/internal/jp;->b(Lcom/google/android/gms/internal/kg;)V

    if-eqz v0, :cond_9

    new-instance v5, Lcom/google/android/gms/internal/jy;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/kg;->c()Lcom/google/android/gms/internal/lb;

    move-result-object v7

    invoke-static {v0, v7}, Lcom/google/android/gms/internal/lc;->a(Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/lb;)Lcom/google/android/gms/internal/lc;

    move-result-object v0

    invoke-direct {v5, v0, v1, v2}, Lcom/google/android/gms/internal/jy;-><init>(Lcom/google/android/gms/internal/lc;ZZ)V

    move-object v0, v5

    :goto_6
    invoke-virtual {v3, v8}, Lcom/google/android/gms/internal/it;->b(Lcom/google/android/gms/internal/kg;)Z

    move-result v1

    if-nez v1, :cond_f

    invoke-virtual {v8}, Lcom/google/android/gms/internal/kg;->e()Z

    move-result v2

    if-nez v2, :cond_f

    sget-boolean v2, Lcom/google/android/gms/internal/iu$8;->a:Z

    if-nez v2, :cond_e

    iget-object v2, p0, Lcom/google/android/gms/internal/iu$8;->c:Lcom/google/android/gms/internal/iu;

    invoke-static {v2}, Lcom/google/android/gms/internal/iu;->e(Lcom/google/android/gms/internal/iu;)Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v8}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_e

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "View does not exist but we have a tag"

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_5
    if-nez v3, :cond_6

    invoke-virtual {v0}, Lcom/google/android/gms/internal/it;->c()Z

    move-result v3

    if-eqz v3, :cond_7

    :cond_6
    move v3, v1

    :goto_7
    if-eqz v4, :cond_8

    :goto_8
    move-object v11, v0

    move-object v0, v4

    move v4, v3

    move-object v3, v11

    goto :goto_5

    :cond_7
    move v3, v2

    goto :goto_7

    :cond_8
    invoke-static {}, Lcom/google/android/gms/internal/ij;->a()Lcom/google/android/gms/internal/ij;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/google/android/gms/internal/it;->a(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/lh;

    move-result-object v4

    goto :goto_8

    :cond_9
    iget-object v0, p0, Lcom/google/android/gms/internal/iu$8;->c:Lcom/google/android/gms/internal/iu;

    invoke-static {v0}, Lcom/google/android/gms/internal/iu;->b(Lcom/google/android/gms/internal/iu;)Lcom/google/android/gms/internal/jp;

    move-result-object v0

    invoke-interface {v0, v8}, Lcom/google/android/gms/internal/jp;->a(Lcom/google/android/gms/internal/kg;)Lcom/google/android/gms/internal/jy;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/android/gms/internal/jy;->a()Z

    move-result v0

    if-eqz v0, :cond_a

    move-object v0, v7

    goto :goto_6

    :cond_a
    invoke-static {}, Lcom/google/android/gms/internal/la;->j()Lcom/google/android/gms/internal/la;

    move-result-object v5

    iget-object v0, p0, Lcom/google/android/gms/internal/iu$8;->c:Lcom/google/android/gms/internal/iu;

    invoke-static {v0}, Lcom/google/android/gms/internal/iu;->d(Lcom/google/android/gms/internal/iu;)Lcom/google/android/gms/internal/ju;

    move-result-object v0

    invoke-virtual {v0, v6}, Lcom/google/android/gms/internal/ju;->c(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/ju;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ju;->c()Lcom/google/android/gms/internal/gz;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gz;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_9
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_b

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ju;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ju;->b()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/it;

    if-eqz v1, :cond_11

    invoke-static {}, Lcom/google/android/gms/internal/ij;->a()Lcom/google/android/gms/internal/ij;

    move-result-object v10

    invoke-virtual {v1, v10}, Lcom/google/android/gms/internal/it;->a(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/lh;

    move-result-object v1

    if-eqz v1, :cond_11

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/kv;

    invoke-interface {v5, v0, v1}, Lcom/google/android/gms/internal/lh;->a(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    :goto_a
    move-object v5, v0

    goto :goto_9

    :cond_b
    invoke-virtual {v7}, Lcom/google/android/gms/internal/jy;->c()Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/lh;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_c
    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/lg;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/lg;->c()Lcom/google/android/gms/internal/kv;

    move-result-object v7

    invoke-interface {v5, v7}, Lcom/google/android/gms/internal/lh;->a(Lcom/google/android/gms/internal/kv;)Z

    move-result v7

    if-nez v7, :cond_c

    invoke-virtual {v0}, Lcom/google/android/gms/internal/lg;->c()Lcom/google/android/gms/internal/kv;

    move-result-object v7

    invoke-virtual {v0}, Lcom/google/android/gms/internal/lg;->d()Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-interface {v5, v7, v0}, Lcom/google/android/gms/internal/lh;->a(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lh;

    move-result-object v5

    goto :goto_b

    :cond_d
    new-instance v0, Lcom/google/android/gms/internal/jy;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/kg;->c()Lcom/google/android/gms/internal/lb;

    move-result-object v1

    invoke-static {v5, v1}, Lcom/google/android/gms/internal/lc;->a(Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/lb;)Lcom/google/android/gms/internal/lc;

    move-result-object v1

    invoke-direct {v0, v1, v2, v2}, Lcom/google/android/gms/internal/jy;-><init>(Lcom/google/android/gms/internal/lc;ZZ)V

    goto/16 :goto_6

    :cond_e
    iget-object v2, p0, Lcom/google/android/gms/internal/iu$8;->c:Lcom/google/android/gms/internal/iu;

    invoke-static {v2}, Lcom/google/android/gms/internal/iu;->f(Lcom/google/android/gms/internal/iu;)Lcom/google/android/gms/internal/iv;

    move-result-object v2

    iget-object v5, p0, Lcom/google/android/gms/internal/iu$8;->c:Lcom/google/android/gms/internal/iu;

    invoke-static {v5}, Lcom/google/android/gms/internal/iu;->e(Lcom/google/android/gms/internal/iu;)Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v8, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v5, p0, Lcom/google/android/gms/internal/iu$8;->c:Lcom/google/android/gms/internal/iu;

    invoke-static {v5}, Lcom/google/android/gms/internal/iu;->g(Lcom/google/android/gms/internal/iu;)Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v2, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_f
    iget-object v2, p0, Lcom/google/android/gms/internal/iu$8;->c:Lcom/google/android/gms/internal/iu;

    invoke-static {v2}, Lcom/google/android/gms/internal/iu;->c(Lcom/google/android/gms/internal/iu;)Lcom/google/android/gms/internal/jb;

    move-result-object v2

    invoke-virtual {v2, v6}, Lcom/google/android/gms/internal/jb;->a(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/jc;

    move-result-object v2

    iget-object v5, p0, Lcom/google/android/gms/internal/iu$8;->b:Lcom/google/android/gms/internal/ie;

    invoke-virtual {v3, v5, v2, v0}, Lcom/google/android/gms/internal/it;->a(Lcom/google/android/gms/internal/ie;Lcom/google/android/gms/internal/jc;Lcom/google/android/gms/internal/jy;)Ljava/util/List;

    move-result-object v0

    if-nez v1, :cond_10

    if-nez v4, :cond_10

    invoke-virtual {v3, v8}, Lcom/google/android/gms/internal/it;->a(Lcom/google/android/gms/internal/kg;)Lcom/google/android/gms/internal/kh;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/iu$8;->c:Lcom/google/android/gms/internal/iu;

    invoke-static {v2, v8, v1}, Lcom/google/android/gms/internal/iu;->a(Lcom/google/android/gms/internal/iu;Lcom/google/android/gms/internal/kg;Lcom/google/android/gms/internal/kh;)V

    :cond_10
    return-object v0

    :cond_11
    move-object v0, v5

    goto :goto_a

    :cond_12
    move v0, v3

    move-object v3, v4

    goto/16 :goto_3
.end method

.method public synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/iu$8;->a()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
