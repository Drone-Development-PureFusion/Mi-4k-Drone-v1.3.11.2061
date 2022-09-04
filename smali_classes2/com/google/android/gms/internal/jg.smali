.class public Lcom/google/android/gms/internal/jg;
.super Lcom/google/android/gms/internal/jh;


# instance fields
.field private final a:Lcom/google/android/gms/internal/ia;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ji;Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/ia;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/jh$a;->b:Lcom/google/android/gms/internal/jh$a;

    invoke-direct {p0, v0, p1, p2}, Lcom/google/android/gms/internal/jh;-><init>(Lcom/google/android/gms/internal/jh$a;Lcom/google/android/gms/internal/ji;Lcom/google/android/gms/internal/ij;)V

    iput-object p3, p0, Lcom/google/android/gms/internal/jg;->a:Lcom/google/android/gms/internal/ia;

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/internal/ia;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/jg;->a:Lcom/google/android/gms/internal/ia;

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/kv;)Lcom/google/android/gms/internal/jh;
    .locals 5

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/google/android/gms/internal/jg;->d:Lcom/google/android/gms/internal/ij;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ij;->h()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/google/android/gms/internal/jg;->a:Lcom/google/android/gms/internal/ia;

    new-instance v2, Lcom/google/android/gms/internal/ij;

    const/4 v3, 0x1

    new-array v3, v3, [Lcom/google/android/gms/internal/kv;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    invoke-direct {v2, v3}, Lcom/google/android/gms/internal/ij;-><init>([Lcom/google/android/gms/internal/kv;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ia;->d(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/ia;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ia;->e()Z

    move-result v2

    if-eqz v2, :cond_1

    :cond_0
    :goto_0
    return-object v0

    :cond_1
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ia;->b()Lcom/google/android/gms/internal/lh;

    move-result-object v0

    if-eqz v0, :cond_2

    new-instance v0, Lcom/google/android/gms/internal/jj;

    iget-object v2, p0, Lcom/google/android/gms/internal/jg;->c:Lcom/google/android/gms/internal/ji;

    invoke-static {}, Lcom/google/android/gms/internal/ij;->a()Lcom/google/android/gms/internal/ij;

    move-result-object v3

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ia;->b()Lcom/google/android/gms/internal/lh;

    move-result-object v1

    invoke-direct {v0, v2, v3, v1}, Lcom/google/android/gms/internal/jj;-><init>(Lcom/google/android/gms/internal/ji;Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;)V

    goto :goto_0

    :cond_2
    new-instance v0, Lcom/google/android/gms/internal/jg;

    iget-object v2, p0, Lcom/google/android/gms/internal/jg;->c:Lcom/google/android/gms/internal/ji;

    invoke-static {}, Lcom/google/android/gms/internal/ij;->a()Lcom/google/android/gms/internal/ij;

    move-result-object v3

    invoke-direct {v0, v2, v3, v1}, Lcom/google/android/gms/internal/jg;-><init>(Lcom/google/android/gms/internal/ji;Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/ia;)V

    goto :goto_0

    :cond_3
    iget-object v1, p0, Lcom/google/android/gms/internal/jg;->d:Lcom/google/android/gms/internal/ij;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ij;->d()Lcom/google/android/gms/internal/kv;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/kv;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/jg;

    iget-object v1, p0, Lcom/google/android/gms/internal/jg;->c:Lcom/google/android/gms/internal/ji;

    iget-object v2, p0, Lcom/google/android/gms/internal/jg;->d:Lcom/google/android/gms/internal/ij;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ij;->e()Lcom/google/android/gms/internal/ij;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/jg;->a:Lcom/google/android/gms/internal/ia;

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/internal/jg;-><init>(Lcom/google/android/gms/internal/ji;Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/ia;)V

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    const-string v0, "Merge { path=%s, source=%s, children=%s }"

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/jg;->c()Lcom/google/android/gms/internal/ij;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/jg;->d()Lcom/google/android/gms/internal/ji;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/google/android/gms/internal/jg;->a:Lcom/google/android/gms/internal/ia;

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
