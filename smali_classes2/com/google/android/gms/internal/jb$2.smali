.class final Lcom/google/android/gms/internal/jb$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/jv;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/jb;
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
        "Lcom/google/android/gms/internal/iy;",
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
.method public a(Lcom/google/android/gms/internal/iy;)Z
    .locals 1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/iy;->f()Z

    move-result v0

    return v0
.end method

.method public synthetic a(Ljava/lang/Object;)Z
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/iy;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/jb$2;->a(Lcom/google/android/gms/internal/iy;)Z

    move-result v0

    return v0
.end method
