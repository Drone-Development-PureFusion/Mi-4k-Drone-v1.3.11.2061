.class Lcom/google/android/gms/internal/ajf$1;
.super Lcom/google/android/gms/internal/ajh$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/ajf;->a(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ajf;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ajf;Lcom/google/android/gms/common/api/g;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ajf$1;->a:Lcom/google/android/gms/internal/ajf;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/ajh$a;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/aji;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ajf$1;->a(Lcom/google/android/gms/internal/aji;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/internal/aji;)V
    .locals 2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/aji;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ajk;

    new-instance v1, Lcom/google/android/gms/internal/ajf$a;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/ajf$a;-><init>(Lcom/google/android/gms/internal/ahl$b;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ajk;->a(Lcom/google/android/gms/internal/ajj;)V

    return-void
.end method
