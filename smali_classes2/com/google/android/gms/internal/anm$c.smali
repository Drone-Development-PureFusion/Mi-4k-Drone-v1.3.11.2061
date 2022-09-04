.class abstract Lcom/google/android/gms/internal/anm$c;
.super Lcom/google/android/gms/internal/ahl$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/anm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R::",
        "Lcom/google/android/gms/common/api/m;",
        ">",
        "Lcom/google/android/gms/internal/ahl$a",
        "<TR;",
        "Lcom/google/android/gms/internal/ann;",
        ">;"
    }
.end annotation


# direct methods
.method protected constructor <init>(Lcom/google/android/gms/common/api/g;)V
    .locals 1

    sget-object v0, Lcom/google/android/gms/e/a;->a:Lcom/google/android/gms/common/api/a$g;

    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/internal/ahl$a;-><init>(Lcom/google/android/gms/common/api/a$d;Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected abstract a(Landroid/content/Context;Lcom/google/android/gms/internal/anl;)V
.end method

.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/ann;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/anm$c;->a(Lcom/google/android/gms/internal/ann;)V

    return-void
.end method

.method protected final a(Lcom/google/android/gms/internal/ann;)V
    .locals 2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ann;->B()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ann;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/anl;

    invoke-virtual {p0, v1, v0}, Lcom/google/android/gms/internal/anm$c;->a(Landroid/content/Context;Lcom/google/android/gms/internal/anl;)V

    return-void
.end method
