.class public Lcom/google/android/gms/internal/ki;
.super Ljava/lang/Object;


# instance fields
.field private final a:Lcom/google/android/gms/internal/jy;

.field private final b:Lcom/google/android/gms/internal/jy;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/jy;Lcom/google/android/gms/internal/jy;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ki;->a:Lcom/google/android/gms/internal/jy;

    iput-object p2, p0, Lcom/google/android/gms/internal/ki;->b:Lcom/google/android/gms/internal/jy;

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/internal/jy;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ki;->a:Lcom/google/android/gms/internal/jy;

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/lc;ZZ)Lcom/google/android/gms/internal/ki;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ki;

    new-instance v1, Lcom/google/android/gms/internal/jy;

    invoke-direct {v1, p1, p2, p3}, Lcom/google/android/gms/internal/jy;-><init>(Lcom/google/android/gms/internal/lc;ZZ)V

    iget-object v2, p0, Lcom/google/android/gms/internal/ki;->b:Lcom/google/android/gms/internal/jy;

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/ki;-><init>(Lcom/google/android/gms/internal/jy;Lcom/google/android/gms/internal/jy;)V

    return-object v0
.end method

.method public b(Lcom/google/android/gms/internal/lc;ZZ)Lcom/google/android/gms/internal/ki;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ki;

    iget-object v1, p0, Lcom/google/android/gms/internal/ki;->a:Lcom/google/android/gms/internal/jy;

    new-instance v2, Lcom/google/android/gms/internal/jy;

    invoke-direct {v2, p1, p2, p3}, Lcom/google/android/gms/internal/jy;-><init>(Lcom/google/android/gms/internal/lc;ZZ)V

    invoke-direct {v0, v1, v2}, Lcom/google/android/gms/internal/ki;-><init>(Lcom/google/android/gms/internal/jy;Lcom/google/android/gms/internal/jy;)V

    return-object v0
.end method

.method public b()Lcom/google/android/gms/internal/lh;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ki;->a:Lcom/google/android/gms/internal/jy;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/jy;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ki;->a:Lcom/google/android/gms/internal/jy;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/jy;->c()Lcom/google/android/gms/internal/lh;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c()Lcom/google/android/gms/internal/jy;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ki;->b:Lcom/google/android/gms/internal/jy;

    return-object v0
.end method

.method public d()Lcom/google/android/gms/internal/lh;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ki;->b:Lcom/google/android/gms/internal/jy;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/jy;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ki;->b:Lcom/google/android/gms/internal/jy;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/jy;->c()Lcom/google/android/gms/internal/lh;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
