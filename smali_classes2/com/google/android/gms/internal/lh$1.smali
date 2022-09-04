.class final Lcom/google/android/gms/internal/lh$1;
.super Lcom/google/android/gms/internal/kw;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/lh;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/kw;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/lh;)I
    .locals 1

    if-ne p1, p0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public a(Lcom/google/android/gms/internal/kv;)Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public b()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public c(Lcom/google/android/gms/internal/kv;)Lcom/google/android/gms/internal/lh;
    .locals 1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/kv;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/lh$1;->f()Lcom/google/android/gms/internal/lh;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/la;->j()Lcom/google/android/gms/internal/la;

    move-result-object v0

    goto :goto_0
.end method

.method public synthetic compareTo(Ljava/lang/Object;)I
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/lh;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/lh$1;->a(Lcom/google/android/gms/internal/lh;)I

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p1, p0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public f()Lcom/google/android/gms/internal/lh;
    .locals 0

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "<Max Node>"

    return-object v0
.end method
