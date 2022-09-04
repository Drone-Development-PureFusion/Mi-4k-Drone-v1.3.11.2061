.class public final Lcom/google/android/gms/internal/agq;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/cast/a/b;


# instance fields
.field private final a:I

.field private final b:I

.field private final c:Ljava/lang/String;

.field private final d:Lorg/json/JSONObject;

.field private final e:Ljava/lang/String;

.field private final f:I

.field private final g:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/cast/a/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(IILjava/lang/String;Lorg/json/JSONObject;Ljava/util/Collection;Ljava/lang/String;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/lang/String;",
            "Lorg/json/JSONObject;",
            "Ljava/util/Collection",
            "<",
            "Lcom/google/android/gms/cast/a/c;",
            ">;",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/agq;->a:I

    iput p2, p0, Lcom/google/android/gms/internal/agq;->b:I

    iput-object p3, p0, Lcom/google/android/gms/internal/agq;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/agq;->d:Lorg/json/JSONObject;

    iput-object p6, p0, Lcom/google/android/gms/internal/agq;->e:Ljava/lang/String;

    iput p7, p0, Lcom/google/android/gms/internal/agq;->f:I

    new-instance v0, Ljava/util/HashMap;

    invoke-interface {p5}, Ljava/util/Collection;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    iput-object v0, p0, Lcom/google/android/gms/internal/agq;->g:Ljava/util/Map;

    invoke-interface {p5}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/a/c;

    iget-object v2, p0, Lcom/google/android/gms/internal/agq;->g:Ljava/util/Map;

    invoke-interface {v0}, Lcom/google/android/gms/cast/a/c;->c()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/agq;->a:I

    return v0
.end method

.method public a(Ljava/lang/String;)Lcom/google/android/gms/cast/a/c;
    .locals 1

    if-nez p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/agq;->g:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/a/c;

    goto :goto_0
.end method

.method public a(I)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/cast/a/c;",
            ">;"
        }
    .end annotation

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/agq;->g()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/a/c;

    invoke-interface {v0}, Lcom/google/android/gms/cast/a/c;->a()I

    move-result v3

    if-ne v3, p1, :cond_0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public a(Lcom/google/android/gms/cast/a/b;)Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/agq;->a:I

    invoke-interface {p1}, Lcom/google/android/gms/cast/a/b;->a()I

    move-result v1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public a(Ljava/lang/String;Lcom/google/android/gms/cast/a/b;)Z
    .locals 2

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/agq;->a(Ljava/lang/String;)Lcom/google/android/gms/cast/a/c;

    move-result-object v0

    invoke-interface {p2, p1}, Lcom/google/android/gms/cast/a/b;->a(Ljava/lang/String;)Lcom/google/android/gms/cast/a/c;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/cast/internal/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/agq;->b:I

    return v0
.end method

.method public b(Lcom/google/android/gms/cast/a/b;)Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/agq;->b:I

    invoke-interface {p1}, Lcom/google/android/gms/cast/a/b;->b()I

    move-result v1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b(Ljava/lang/String;Lcom/google/android/gms/cast/a/b;)Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/agq;->a(Ljava/lang/String;)Lcom/google/android/gms/cast/a/c;

    move-result-object v2

    invoke-interface {p2, p1}, Lcom/google/android/gms/cast/a/b;->a(Ljava/lang/String;)Lcom/google/android/gms/cast/a/c;

    move-result-object v3

    if-nez v2, :cond_1

    if-nez v3, :cond_1

    move v0, v1

    :cond_0
    :goto_0
    return v0

    :cond_1
    if-eqz v2, :cond_0

    if-eqz v3, :cond_0

    invoke-interface {v2}, Lcom/google/android/gms/cast/a/c;->a()I

    move-result v2

    invoke-interface {v3}, Lcom/google/android/gms/cast/a/c;->a()I

    move-result v3

    if-ne v2, v3, :cond_0

    move v0, v1

    goto :goto_0
.end method

.method public c()Lorg/json/JSONObject;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/agq;->d:Lorg/json/JSONObject;

    return-object v0
.end method

.method public c(Lcom/google/android/gms/cast/a/b;)Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/agq;->d:Lorg/json/JSONObject;

    invoke-interface {p1}, Lcom/google/android/gms/cast/a/b;->c()Lorg/json/JSONObject;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/common/util/p;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c(Ljava/lang/String;Lcom/google/android/gms/cast/a/b;)Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/agq;->a(Ljava/lang/String;)Lcom/google/android/gms/cast/a/c;

    move-result-object v2

    invoke-interface {p2, p1}, Lcom/google/android/gms/cast/a/b;->a(Ljava/lang/String;)Lcom/google/android/gms/cast/a/c;

    move-result-object v3

    if-nez v2, :cond_1

    if-nez v3, :cond_1

    move v0, v1

    :cond_0
    :goto_0
    return v0

    :cond_1
    if-eqz v2, :cond_0

    if-eqz v3, :cond_0

    invoke-interface {v2}, Lcom/google/android/gms/cast/a/c;->b()Lorg/json/JSONObject;

    move-result-object v2

    invoke-interface {v3}, Lcom/google/android/gms/cast/a/c;->b()Lorg/json/JSONObject;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/google/android/gms/common/util/p;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v0, v1

    goto :goto_0
.end method

.method public d()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/agq;->c:Ljava/lang/String;

    return-object v0
.end method

.method public d(Lcom/google/android/gms/cast/a/b;)Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/agq;->c:Ljava/lang/String;

    invoke-interface {p1}, Lcom/google/android/gms/cast/a/b;->d()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/cast/internal/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public e()Ljava/lang/CharSequence;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/agq;->e:Ljava/lang/String;

    return-object v0
.end method

.method public e(Lcom/google/android/gms/cast/a/b;)Ljava/util/Collection;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/cast/a/b;",
            ")",
            "Ljava/util/Collection",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/agq;->g()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/a/c;

    invoke-interface {v0}, Lcom/google/android/gms/cast/a/c;->c()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, v3}, Lcom/google/android/gms/cast/a/b;->a(Ljava/lang/String;)Lcom/google/android/gms/cast/a/c;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    :cond_1
    invoke-interface {v0}, Lcom/google/android/gms/cast/a/c;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {p1}, Lcom/google/android/gms/cast/a/b;->g()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/a/c;

    invoke-interface {v0}, Lcom/google/android/gms/cast/a/c;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v3}, Lcom/google/android/gms/internal/agq;->a(Ljava/lang/String;)Lcom/google/android/gms/cast/a/c;

    move-result-object v3

    if-nez v3, :cond_3

    invoke-interface {v0}, Lcom/google/android/gms/cast/a/c;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 9

    const/4 v4, 0x1

    const/4 v3, 0x0

    if-eqz p1, :cond_0

    instance-of v0, p1, Lcom/google/android/gms/cast/a/b;

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return v3

    :cond_1
    check-cast p1, Lcom/google/android/gms/cast/a/b;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/agq;->g()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    invoke-interface {p1}, Lcom/google/android/gms/cast/a/b;->g()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/agq;->g()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/a/c;

    invoke-interface {p1}, Lcom/google/android/gms/cast/a/b;->g()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move v2, v3

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/cast/a/c;

    invoke-interface {v0}, Lcom/google/android/gms/cast/a/c;->c()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v1}, Lcom/google/android/gms/cast/a/c;->c()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Lcom/google/android/gms/cast/internal/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-static {v0, v1}, Lcom/google/android/gms/cast/internal/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move v1, v4

    :goto_2
    move v2, v1

    goto :goto_1

    :cond_3
    if-nez v2, :cond_2

    goto :goto_0

    :cond_4
    iget v0, p0, Lcom/google/android/gms/internal/agq;->a:I

    invoke-interface {p1}, Lcom/google/android/gms/cast/a/b;->a()I

    move-result v1

    if-ne v0, v1, :cond_5

    iget v0, p0, Lcom/google/android/gms/internal/agq;->b:I

    invoke-interface {p1}, Lcom/google/android/gms/cast/a/b;->b()I

    move-result v1

    if-ne v0, v1, :cond_5

    iget v0, p0, Lcom/google/android/gms/internal/agq;->f:I

    invoke-interface {p1}, Lcom/google/android/gms/cast/a/b;->f()I

    move-result v1

    if-ne v0, v1, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/internal/agq;->e:Ljava/lang/String;

    invoke-interface {p1}, Lcom/google/android/gms/cast/a/b;->e()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/cast/internal/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/internal/agq;->c:Ljava/lang/String;

    invoke-interface {p1}, Lcom/google/android/gms/cast/a/b;->d()Ljava/lang/CharSequence;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/cast/internal/f;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/internal/agq;->d:Lorg/json/JSONObject;

    invoke-interface {p1}, Lcom/google/android/gms/cast/a/b;->c()Lorg/json/JSONObject;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/common/util/p;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    :goto_3
    move v3, v4

    goto/16 :goto_0

    :cond_5
    move v4, v3

    goto :goto_3

    :cond_6
    move v1, v2

    goto :goto_2
.end method

.method public f()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/agq;->f:I

    return v0
.end method

.method public g()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection",
            "<",
            "Lcom/google/android/gms/cast/a/c;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/agq;->g:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableCollection(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public h()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/cast/a/c;",
            ">;"
        }
    .end annotation

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/agq;->g()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/a/c;

    invoke-interface {v0}, Lcom/google/android/gms/cast/a/c;->e()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x7

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    iget v2, p0, Lcom/google/android/gms/internal/agq;->a:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x1

    iget v2, p0, Lcom/google/android/gms/internal/agq;->b:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/google/android/gms/internal/agq;->g:Ljava/util/Map;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    iget-object v2, p0, Lcom/google/android/gms/internal/agq;->c:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    iget-object v2, p0, Lcom/google/android/gms/internal/agq;->d:Lorg/json/JSONObject;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    iget-object v2, p0, Lcom/google/android/gms/internal/agq;->e:Ljava/lang/String;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    iget v2, p0, Lcom/google/android/gms/internal/agq;->f:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v1

    invoke-static {v0}, Lcom/google/android/gms/common/internal/c;->a([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public i()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/cast/a/c;",
            ">;"
        }
    .end annotation

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/agq;->g()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/a/c;

    invoke-interface {v0}, Lcom/google/android/gms/cast/a/c;->d()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public j()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List",
            "<",
            "Lcom/google/android/gms/cast/a/c;",
            ">;"
        }
    .end annotation

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/agq;->g()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/a/c;

    invoke-interface {v0}, Lcom/google/android/gms/cast/a/c;->d()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/cast/a/c;->e()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v1
.end method
