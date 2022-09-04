.class public Lcom/google/android/gms/internal/jy;
.super Ljava/lang/Object;


# instance fields
.field private final a:Lcom/google/android/gms/internal/lc;

.field private final b:Z

.field private final c:Z


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/lc;ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/jy;->a:Lcom/google/android/gms/internal/lc;

    iput-boolean p2, p0, Lcom/google/android/gms/internal/jy;->b:Z

    iput-boolean p3, p0, Lcom/google/android/gms/internal/jy;->c:Z

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/jy;->b:Z

    return v0
.end method

.method public a(Lcom/google/android/gms/internal/ij;)Z
    .locals 1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ij;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/jy;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/internal/jy;->c:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/ij;->d()Lcom/google/android/gms/internal/kv;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/jy;->a(Lcom/google/android/gms/internal/kv;)Z

    move-result v0

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/internal/kv;)Z
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/jy;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/internal/jy;->c:Z

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/jy;->a:Lcom/google/android/gms/internal/lc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/lc;->a()Lcom/google/android/gms/internal/lh;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/lh;->a(Lcom/google/android/gms/internal/kv;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public b()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/jy;->c:Z

    return v0
.end method

.method public c()Lcom/google/android/gms/internal/lh;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/jy;->a:Lcom/google/android/gms/internal/lc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/lc;->a()Lcom/google/android/gms/internal/lh;

    move-result-object v0

    return-object v0
.end method

.method public d()Lcom/google/android/gms/internal/lc;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/jy;->a:Lcom/google/android/gms/internal/lc;

    return-object v0
.end method
