.class Lcom/google/android/gms/internal/aen$2;
.super Lcom/google/android/gms/internal/ahl$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/aen;->a(Lcom/google/android/gms/common/api/g;Ljava/lang/String;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/ahl$a",
        "<",
        "Lcom/google/android/gms/auth/a/b$a;",
        "Lcom/google/android/gms/internal/aeo;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/google/android/gms/internal/aen;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/aen;Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/g;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/aen$2;->b:Lcom/google/android/gms/internal/aen;

    iput-object p4, p0, Lcom/google/android/gms/internal/aen$2;->a:Ljava/lang/String;

    invoke-direct {p0, p2, p3}, Lcom/google/android/gms/internal/ahl$a;-><init>(Lcom/google/android/gms/common/api/a;Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/auth/a/b$a;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/aen$b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/google/android/gms/internal/aen$b;-><init>(Lcom/google/android/gms/common/api/Status;Landroid/accounts/Account;)V

    return-object v0
.end method

.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/aeo;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/aen$2;->a(Lcom/google/android/gms/internal/aeo;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/internal/aeo;)V
    .locals 3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/aeo;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/auth/a/d;

    new-instance v1, Lcom/google/android/gms/internal/aen$2$1;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/aen$2$1;-><init>(Lcom/google/android/gms/internal/aen$2;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/aen$2;->a:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/auth/a/d;->a(Lcom/google/android/gms/auth/a/c;Ljava/lang/String;)V

    return-void
.end method

.method protected synthetic b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/aen$2;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/auth/a/b$a;

    move-result-object v0

    return-object v0
.end method
