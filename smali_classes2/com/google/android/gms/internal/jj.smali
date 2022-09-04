.class public Lcom/google/android/gms/internal/jj;
.super Lcom/google/android/gms/internal/jh;


# instance fields
.field private final a:Lcom/google/android/gms/internal/lh;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ji;Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/jh$a;->a:Lcom/google/android/gms/internal/jh$a;

    invoke-direct {p0, v0, p1, p2}, Lcom/google/android/gms/internal/jh;-><init>(Lcom/google/android/gms/internal/jh$a;Lcom/google/android/gms/internal/ji;Lcom/google/android/gms/internal/ij;)V

    iput-object p3, p0, Lcom/google/android/gms/internal/jj;->a:Lcom/google/android/gms/internal/lh;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/kv;)Lcom/google/android/gms/internal/jh;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/jj;->d:Lcom/google/android/gms/internal/ij;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ij;->h()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/jj;

    iget-object v1, p0, Lcom/google/android/gms/internal/jj;->c:Lcom/google/android/gms/internal/ji;

    invoke-static {}, Lcom/google/android/gms/internal/ij;->a()Lcom/google/android/gms/internal/ij;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/jj;->a:Lcom/google/android/gms/internal/lh;

    invoke-interface {v3, p1}, Lcom/google/android/gms/internal/lh;->c(Lcom/google/android/gms/internal/kv;)Lcom/google/android/gms/internal/lh;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/internal/jj;-><init>(Lcom/google/android/gms/internal/ji;Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;)V

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/jj;

    iget-object v1, p0, Lcom/google/android/gms/internal/jj;->c:Lcom/google/android/gms/internal/ji;

    iget-object v2, p0, Lcom/google/android/gms/internal/jj;->d:Lcom/google/android/gms/internal/ij;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ij;->e()Lcom/google/android/gms/internal/ij;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/jj;->a:Lcom/google/android/gms/internal/lh;

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/internal/jj;-><init>(Lcom/google/android/gms/internal/ji;Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;)V

    goto :goto_0
.end method

.method public a()Lcom/google/android/gms/internal/lh;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/jj;->a:Lcom/google/android/gms/internal/lh;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    const-string v0, "Overwrite { path=%s, source=%s, snapshot=%s }"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/jj;->c()Lcom/google/android/gms/internal/ij;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/jj;->d()Lcom/google/android/gms/internal/ji;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/google/android/gms/internal/jj;->a:Lcom/google/android/gms/internal/lh;

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
