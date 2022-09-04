.class public Lcom/google/android/gms/internal/ku;
.super Lcom/google/android/gms/internal/le;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/le",
        "<",
        "Lcom/google/android/gms/internal/ku;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Z


# direct methods
.method public constructor <init>(Ljava/lang/Boolean;Lcom/google/android/gms/internal/lh;)V
    .locals 1

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/le;-><init>(Lcom/google/android/gms/internal/lh;)V

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/ku;->a:Z

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/internal/ku;)I
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ku;->a:Z

    iget-boolean v1, p1, Lcom/google/android/gms/internal/ku;->a:Z

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ku;->a:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, -0x1

    goto :goto_0
.end method

.method protected bridge synthetic a(Lcom/google/android/gms/internal/le;)I
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/ku;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ku;->a(Lcom/google/android/gms/internal/ku;)I

    move-result v0

    return v0
.end method

.method public a(Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/ku;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ku;

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ku;->a:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/internal/ku;-><init>(Ljava/lang/Boolean;Lcom/google/android/gms/internal/lh;)V

    return-object v0
.end method

.method public a()Ljava/lang/Object;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ku;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/lh$a;)Ljava/lang/String;
    .locals 4

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ku;->b(Lcom/google/android/gms/internal/lh$a;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ku;->a:Z

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0xd

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "boolean:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b(Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lh;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ku;->a(Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/ku;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    instance-of v1, p1, Lcom/google/android/gms/internal/ku;

    if-nez v1, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    check-cast p1, Lcom/google/android/gms/internal/ku;

    iget-boolean v1, p0, Lcom/google/android/gms/internal/ku;->a:Z

    iget-boolean v2, p1, Lcom/google/android/gms/internal/ku;->a:Z

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ku;->b:Lcom/google/android/gms/internal/lh;

    iget-object v2, p1, Lcom/google/android/gms/internal/ku;->b:Lcom/google/android/gms/internal/lh;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ku;->a:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ku;->b:Lcom/google/android/gms/internal/lh;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected u_()Lcom/google/android/gms/internal/le$a;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/le$a;->b:Lcom/google/android/gms/internal/le$a;

    return-object v0
.end method
