.class public abstract Lcom/google/android/gms/internal/qx;
.super Lcom/google/android/gms/internal/rd;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<M:",
        "Lcom/google/android/gms/internal/qx",
        "<TM;>;>",
        "Lcom/google/android/gms/internal/rd;"
    }
.end annotation


# instance fields
.field protected ag:Lcom/google/android/gms/internal/qz;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/rd;-><init>()V

    return-void
.end method


# virtual methods
.method protected a()I
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/google/android/gms/internal/qx;->ag:Lcom/google/android/gms/internal/qz;

    if-eqz v1, :cond_0

    move v1, v0

    :goto_0
    iget-object v2, p0, Lcom/google/android/gms/internal/qx;->ag:Lcom/google/android/gms/internal/qz;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/qz;->a()I

    move-result v2

    if-ge v0, v2, :cond_1

    iget-object v2, p0, Lcom/google/android/gms/internal/qx;->ag:Lcom/google/android/gms/internal/qz;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/internal/qz;->b(I)Lcom/google/android/gms/internal/ra;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ra;->a()I

    move-result v2

    add-int/2addr v1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    move v1, v0

    :cond_1
    return v1
.end method

.method public final a(Lcom/google/android/gms/internal/qy;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/qy",
            "<TM;TT;>;)TT;"
        }
    .end annotation

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/google/android/gms/internal/qx;->ag:Lcom/google/android/gms/internal/qz;

    if-nez v1, :cond_1

    :cond_0
    :goto_0
    return-object v0

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/qx;->ag:Lcom/google/android/gms/internal/qz;

    iget v2, p1, Lcom/google/android/gms/internal/qy;->c:I

    invoke-static {v2}, Lcom/google/android/gms/internal/rg;->b(I)I

    move-result v2

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/qz;->a(I)Lcom/google/android/gms/internal/ra;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ra;->a(Lcom/google/android/gms/internal/qy;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/internal/qw;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/qx;->ag:Lcom/google/android/gms/internal/qz;

    if-nez v0, :cond_1

    :cond_0
    return-void

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/qx;->ag:Lcom/google/android/gms/internal/qz;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/qz;->a()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/qx;->ag:Lcom/google/android/gms/internal/qz;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/qz;->b(I)Lcom/google/android/gms/internal/ra;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ra;->a(Lcom/google/android/gms/internal/qw;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method protected final a(Lcom/google/android/gms/internal/qv;I)Z
    .locals 4

    invoke-virtual {p1}, Lcom/google/android/gms/internal/qv;->t()I

    move-result v0

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/qv;->b(I)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    invoke-static {p2}, Lcom/google/android/gms/internal/rg;->b(I)I

    move-result v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/qv;->t()I

    move-result v2

    sub-int/2addr v2, v0

    invoke-virtual {p1, v0, v2}, Lcom/google/android/gms/internal/qv;->a(II)[B

    move-result-object v0

    new-instance v2, Lcom/google/android/gms/internal/rf;

    invoke-direct {v2, p2, v0}, Lcom/google/android/gms/internal/rf;-><init>(I[B)V

    const/4 v0, 0x0

    iget-object v3, p0, Lcom/google/android/gms/internal/qx;->ag:Lcom/google/android/gms/internal/qz;

    if-nez v3, :cond_2

    new-instance v3, Lcom/google/android/gms/internal/qz;

    invoke-direct {v3}, Lcom/google/android/gms/internal/qz;-><init>()V

    iput-object v3, p0, Lcom/google/android/gms/internal/qx;->ag:Lcom/google/android/gms/internal/qz;

    :goto_1
    if-nez v0, :cond_1

    new-instance v0, Lcom/google/android/gms/internal/ra;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ra;-><init>()V

    iget-object v3, p0, Lcom/google/android/gms/internal/qx;->ag:Lcom/google/android/gms/internal/qz;

    invoke-virtual {v3, v1, v0}, Lcom/google/android/gms/internal/qz;->a(ILcom/google/android/gms/internal/ra;)V

    :cond_1
    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/ra;->a(Lcom/google/android/gms/internal/rf;)V

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/qx;->ag:Lcom/google/android/gms/internal/qz;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/qz;->a(I)Lcom/google/android/gms/internal/ra;

    move-result-object v0

    goto :goto_1
.end method

.method public synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/qx;->d()Lcom/google/android/gms/internal/qx;

    move-result-object v0

    return-object v0
.end method

.method public d()Lcom/google/android/gms/internal/qx;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TM;"
        }
    .end annotation

    invoke-super {p0}, Lcom/google/android/gms/internal/rd;->e()Lcom/google/android/gms/internal/rd;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/qx;

    invoke-static {p0, v0}, Lcom/google/android/gms/internal/rb;->a(Lcom/google/android/gms/internal/qx;Lcom/google/android/gms/internal/qx;)V

    return-object v0
.end method

.method public synthetic e()Lcom/google/android/gms/internal/rd;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/qx;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/qx;

    return-object v0
.end method
