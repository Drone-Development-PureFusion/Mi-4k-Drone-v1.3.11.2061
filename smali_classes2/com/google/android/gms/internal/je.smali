.class public Lcom/google/android/gms/internal/je;
.super Lcom/google/android/gms/internal/jh;


# instance fields
.field private final a:Z

.field private final e:Lcom/google/android/gms/internal/ju;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ju",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/ju;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ij;",
            "Lcom/google/android/gms/internal/ju",
            "<",
            "Ljava/lang/Boolean;",
            ">;Z)V"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/jh$a;->c:Lcom/google/android/gms/internal/jh$a;

    sget-object v1, Lcom/google/android/gms/internal/ji;->a:Lcom/google/android/gms/internal/ji;

    invoke-direct {p0, v0, v1, p1}, Lcom/google/android/gms/internal/jh;-><init>(Lcom/google/android/gms/internal/jh$a;Lcom/google/android/gms/internal/ji;Lcom/google/android/gms/internal/ij;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/je;->e:Lcom/google/android/gms/internal/ju;

    iput-boolean p3, p0, Lcom/google/android/gms/internal/je;->a:Z

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/kv;)Lcom/google/android/gms/internal/jh;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/je;->d:Lcom/google/android/gms/internal/ij;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ij;->h()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/je;->d:Lcom/google/android/gms/internal/ij;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ij;->d()Lcom/google/android/gms/internal/kv;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/kv;->equals(Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "operationForChild called for unrelated child."

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/mk;->a(ZLjava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/internal/je;

    iget-object v1, p0, Lcom/google/android/gms/internal/je;->d:Lcom/google/android/gms/internal/ij;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ij;->e()Lcom/google/android/gms/internal/ij;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/je;->e:Lcom/google/android/gms/internal/ju;

    iget-boolean v3, p0, Lcom/google/android/gms/internal/je;->a:Z

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/internal/je;-><init>(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/ju;Z)V

    move-object p0, v0

    :goto_0
    return-object p0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/je;->e:Lcom/google/android/gms/internal/ju;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ju;->b()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/je;->e:Lcom/google/android/gms/internal/ju;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ju;->c()Lcom/google/android/gms/internal/gz;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/gz;->d()Z

    move-result v0

    const-string v1, "affectedTree should not have overlapping affected paths."

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/mk;->a(ZLjava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/je;->e:Lcom/google/android/gms/internal/ju;

    new-instance v1, Lcom/google/android/gms/internal/ij;

    const/4 v2, 0x1

    new-array v2, v2, [Lcom/google/android/gms/internal/kv;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/ij;-><init>([Lcom/google/android/gms/internal/kv;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ju;->c(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/ju;

    move-result-object v1

    new-instance v0, Lcom/google/android/gms/internal/je;

    invoke-static {}, Lcom/google/android/gms/internal/ij;->a()Lcom/google/android/gms/internal/ij;

    move-result-object v2

    iget-boolean v3, p0, Lcom/google/android/gms/internal/je;->a:Z

    invoke-direct {v0, v2, v1, v3}, Lcom/google/android/gms/internal/je;-><init>(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/ju;Z)V

    move-object p0, v0

    goto :goto_0
.end method

.method public a()Lcom/google/android/gms/internal/ju;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/internal/ju",
            "<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/je;->e:Lcom/google/android/gms/internal/ju;

    return-object v0
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/je;->a:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    const-string v0, "AckUserWrite { path=%s, revert=%s, affectedTree=%s }"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/je;->c()Lcom/google/android/gms/internal/ij;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    iget-boolean v3, p0, Lcom/google/android/gms/internal/je;->a:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/google/android/gms/internal/je;->e:Lcom/google/android/gms/internal/ju;

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
