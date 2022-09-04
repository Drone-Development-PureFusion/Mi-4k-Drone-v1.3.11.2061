.class final Lcom/google/android/gms/internal/jt$3;
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
        "Lcom/google/android/gms/internal/js;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/js;)Z
    .locals 1

    iget-boolean v0, p1, Lcom/google/android/gms/internal/js;->e:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public synthetic a(Ljava/lang/Object;)Z
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/js;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/jt$3;->a(Lcom/google/android/gms/internal/js;)Z

    move-result v0

    return v0
.end method
