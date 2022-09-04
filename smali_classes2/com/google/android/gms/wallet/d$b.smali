.class public abstract Lcom/google/android/gms/wallet/d$b;
.super Lcom/google/android/gms/internal/ahl$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/wallet/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R::",
        "Lcom/google/android/gms/common/api/m;",
        ">",
        "Lcom/google/android/gms/internal/ahl$a",
        "<TR;",
        "Lcom/google/android/gms/internal/fa;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/g;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/wallet/d;->a:Lcom/google/android/gms/common/api/a;

    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/internal/ahl$a;-><init>(Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation

    check-cast p1, Lcom/google/android/gms/internal/fa;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/wallet/d$b;->a(Lcom/google/android/gms/internal/fa;)V

    return-void
.end method

.method protected abstract a(Lcom/google/android/gms/internal/fa;)V
    .annotation build Landroid/support/annotation/VisibleForTesting;
    .end annotation
.end method
