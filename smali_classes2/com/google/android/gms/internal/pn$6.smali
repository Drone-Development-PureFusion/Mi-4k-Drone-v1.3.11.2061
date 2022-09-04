.class final Lcom/google/android/gms/internal/pn$6;
.super Lcom/google/android/gms/internal/oj;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/pn;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/oj",
        "<",
        "Ljava/util/UUID;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/oj;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/pp;)Ljava/util/UUID;
    .locals 2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->f()Lcom/google/android/gms/internal/pq;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/pq;->i:Lcom/google/android/gms/internal/pq;

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->j()V

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/pp;->h()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object v0

    goto :goto_0
.end method

.method public bridge synthetic a(Lcom/google/android/gms/internal/ps;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/util/UUID;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/gms/internal/pn$6;->a(Lcom/google/android/gms/internal/ps;Ljava/util/UUID;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/internal/ps;Ljava/util/UUID;)V
    .locals 1

    if-nez p2, :cond_0

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ps;->b(Ljava/lang/String;)Lcom/google/android/gms/internal/ps;

    return-void

    :cond_0
    invoke-virtual {p2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public synthetic b(Lcom/google/android/gms/internal/pp;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/pn$6;->a(Lcom/google/android/gms/internal/pp;)Ljava/util/UUID;

    move-result-object v0

    return-object v0
.end method
