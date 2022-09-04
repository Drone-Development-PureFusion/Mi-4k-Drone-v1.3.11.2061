.class Lcom/google/android/gms/internal/aen$2$1;
.super Lcom/google/android/gms/internal/aen$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/aen$2;->a(Lcom/google/android/gms/internal/aeo;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/aen$2;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/aen$2;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/aen$2$1;->a:Lcom/google/android/gms/internal/aen$2;

    invoke-direct {p0}, Lcom/google/android/gms/internal/aen$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/accounts/Account;)V
    .locals 3

    iget-object v1, p0, Lcom/google/android/gms/internal/aen$2$1;->a:Lcom/google/android/gms/internal/aen$2;

    new-instance v2, Lcom/google/android/gms/internal/aen$b;

    if-eqz p1, :cond_0

    sget-object v0, Lcom/google/android/gms/common/api/Status;->a:Lcom/google/android/gms/common/api/Status;

    :goto_0
    invoke-direct {v2, v0, p1}, Lcom/google/android/gms/internal/aen$b;-><init>(Lcom/google/android/gms/common/api/Status;Landroid/accounts/Account;)V

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/aen$2;->b(Lcom/google/android/gms/common/api/m;)V

    return-void

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/aen;->a()Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    goto :goto_0
.end method
