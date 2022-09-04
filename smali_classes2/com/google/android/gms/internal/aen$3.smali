.class Lcom/google/android/gms/internal/aen$3;
.super Lcom/google/android/gms/internal/ahl$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/aen;->a(Lcom/google/android/gms/common/api/g;Landroid/accounts/Account;)Lcom/google/android/gms/common/api/i;
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
.field final synthetic a:Landroid/accounts/Account;

.field final synthetic b:Lcom/google/android/gms/internal/aen;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/aen;Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/g;Landroid/accounts/Account;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/aen$3;->b:Lcom/google/android/gms/internal/aen;

    iput-object p4, p0, Lcom/google/android/gms/internal/aen$3;->a:Landroid/accounts/Account;

    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/ahl$a;-><init>(Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/aeo;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/aen$3;->a(Lcom/google/android/gms/internal/aeo;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/internal/aeo;)V
    .locals 3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/aeo;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/auth/a/d;

    new-instance v1, Lcom/google/android/gms/internal/aen$3$1;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/aen$3$1;-><init>(Lcom/google/android/gms/internal/aen$3;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/aen$3;->a:Landroid/accounts/Account;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/auth/a/d;->a(Lcom/google/android/gms/auth/a/c;Landroid/accounts/Account;)V

    return-void
.end method

.method protected b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/aen$c;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/aen$c;-><init>(Lcom/google/android/gms/common/api/Status;)V

    return-object v0
.end method
