.class Lcom/google/android/gms/internal/aen$1;
.super Lcom/google/android/gms/internal/ahl$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/aen;->a(Lcom/google/android/gms/common/api/g;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ahl$a",
        "<",
        "Lcom/google/android/gms/common/api/m;",
        "Lcom/google/android/gms/internal/aeo;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lcom/google/android/gms/internal/aen;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/aen;Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/g;Z)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/aen$1;->b:Lcom/google/android/gms/internal/aen;

    iput-boolean p4, p0, Lcom/google/android/gms/internal/aen$1;->a:Z

    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/ahl$a;-><init>(Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/aeo;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/aen$1;->a(Lcom/google/android/gms/internal/aeo;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/internal/aeo;)V
    .locals 2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/aeo;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/auth/a/d;

    iget-boolean v1, p0, Lcom/google/android/gms/internal/aen$1;->a:Z

    invoke-interface {v0, v1}, Lcom/google/android/gms/auth/a/d;->a(Z)V

    return-void
.end method

.method protected b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
