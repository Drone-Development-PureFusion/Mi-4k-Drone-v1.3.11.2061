.class Lcom/google/android/gms/awareness/snapshot/internal/j$4;
.super Lcom/google/android/gms/internal/su;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/awareness/snapshot/internal/j;->d(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/su",
        "<",
        "Lcom/google/android/gms/awareness/snapshot/e;",
        "Lcom/google/android/gms/awareness/snapshot/internal/m;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/awareness/snapshot/internal/j;


# direct methods
.method constructor <init>(Lcom/google/android/gms/awareness/snapshot/internal/j;Lcom/google/android/gms/common/api/i;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/awareness/snapshot/internal/j$4;->a:Lcom/google/android/gms/awareness/snapshot/internal/j;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/su;-><init>(Lcom/google/android/gms/common/api/i;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/awareness/snapshot/internal/m;)Lcom/google/android/gms/awareness/snapshot/e;
    .locals 1

    new-instance v0, Lcom/google/android/gms/awareness/snapshot/internal/j$4$1;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/awareness/snapshot/internal/j$4$1;-><init>(Lcom/google/android/gms/awareness/snapshot/internal/j$4;Lcom/google/android/gms/awareness/snapshot/internal/m;)V

    return-object v0
.end method

.method protected synthetic a(Lcom/google/android/gms/common/api/m;)Lcom/google/android/gms/common/api/m;
    .locals 1

    check-cast p1, Lcom/google/android/gms/awareness/snapshot/internal/m;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/awareness/snapshot/internal/j$4;->a(Lcom/google/android/gms/awareness/snapshot/internal/m;)Lcom/google/android/gms/awareness/snapshot/e;

    move-result-object v0

    return-object v0
.end method
