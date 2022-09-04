.class final Lcom/google/android/gms/internal/jt$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/jv;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/jt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/jv",
        "<",
        "Ljava/util/Map",
        "<",
        "Lcom/google/android/gms/internal/kf;",
        "Lcom/google/android/gms/internal/js;",
        ">;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Ljava/lang/Object;)Z
    .locals 1

    check-cast p1, Ljava/util/Map;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/jt$1;->a(Ljava/util/Map;)Z

    move-result v0

    return v0
.end method

.method public a(Ljava/util/Map;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Lcom/google/android/gms/internal/kf;",
            "Lcom/google/android/gms/internal/js;",
            ">;)Z"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/kf;->a:Lcom/google/android/gms/internal/kf;

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/js;

    if-eqz v0, :cond_0

    iget-boolean v0, v0, Lcom/google/android/gms/internal/js;->d:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
