.class public Lcom/google/android/gms/internal/lj;
.super Lcom/google/android/gms/internal/lb;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ij;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ij;)V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/lb;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ij;->i()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ij;->d()Lcom/google/android/gms/internal/kv;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/kv;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t create PathIndex with \'.priority\' as key. Please use PriorityIndex instead!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    iput-object p1, p0, Lcom/google/android/gms/internal/lj;->a:Lcom/google/android/gms/internal/ij;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/lg;Lcom/google/android/gms/internal/lg;)I
    .locals 3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/lg;->d()Lcom/google/android/gms/internal/lh;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/lj;->a:Lcom/google/android/gms/internal/ij;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/lh;->a(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-virtual {p2}, Lcom/google/android/gms/internal/lg;->d()Lcom/google/android/gms/internal/lh;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/lj;->a:Lcom/google/android/gms/internal/ij;

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/lh;->a(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/lh;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/lh;->compareTo(Ljava/lang/Object;)I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/lg;->c()Lcom/google/android/gms/internal/kv;

    move-result-object v0

    invoke-virtual {p2}, Lcom/google/android/gms/internal/lg;->c()Lcom/google/android/gms/internal/kv;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/kv;->a(Lcom/google/android/gms/internal/kv;)I

    move-result v0

    :cond_0
    return v0
.end method

.method public a(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lg;
    .locals 2

    invoke-static {}, Lcom/google/android/gms/internal/la;->j()Lcom/google/android/gms/internal/la;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/lj;->a:Lcom/google/android/gms/internal/ij;

    invoke-virtual {v0, v1, p2}, Lcom/google/android/gms/internal/la;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/lg;

    invoke-direct {v1, p1, v0}, Lcom/google/android/gms/internal/lg;-><init>(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;)V

    return-object v1
.end method

.method public a(Lcom/google/android/gms/internal/lh;)Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/lj;->a:Lcom/google/android/gms/internal/ij;

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/lh;->a(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/lh;->b()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()Lcom/google/android/gms/internal/lg;
    .locals 3

    invoke-static {}, Lcom/google/android/gms/internal/la;->j()Lcom/google/android/gms/internal/la;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/lj;->a:Lcom/google/android/gms/internal/ij;

    sget-object v2, Lcom/google/android/gms/internal/lh;->d:Lcom/google/android/gms/internal/kw;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/la;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/lg;

    invoke-static {}, Lcom/google/android/gms/internal/kv;->b()Lcom/google/android/gms/internal/kv;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lcom/google/android/gms/internal/lg;-><init>(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;)V

    return-object v1
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/lj;->a:Lcom/google/android/gms/internal/ij;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ij;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/lg;

    check-cast p2, Lcom/google/android/gms/internal/lg;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/lj;->a(Lcom/google/android/gms/internal/lg;Lcom/google/android/gms/internal/lg;)I

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-ne p0, p1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_3

    :cond_2
    move v0, v1

    goto :goto_0

    :cond_3
    check-cast p1, Lcom/google/android/gms/internal/lj;

    iget-object v2, p0, Lcom/google/android/gms/internal/lj;->a:Lcom/google/android/gms/internal/ij;

    iget-object v3, p1, Lcom/google/android/gms/internal/lj;->a:Lcom/google/android/gms/internal/ij;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/ij;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    move v0, v1

    goto :goto_0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/lj;->a:Lcom/google/android/gms/internal/ij;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ij;->hashCode()I

    move-result v0

    return v0
.end method
