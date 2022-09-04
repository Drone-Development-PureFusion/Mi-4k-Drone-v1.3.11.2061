.class Lcom/google/android/gms/internal/aei$e$1;
.super Lcom/google/android/gms/internal/aei$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/aei$e;->a(Lcom/google/android/gms/internal/aej;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/aei$e;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/aei$e;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/aei$e$1;->a:Lcom/google/android/gms/internal/aei$e;

    invoke-direct {p0}, Lcom/google/android/gms/internal/aei$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/Status;Landroid/content/Intent;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/aei$e$1;->a:Lcom/google/android/gms/internal/aei$e;

    new-instance v1, Lcom/google/android/gms/internal/aek;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/internal/aek;-><init>(Lcom/google/android/gms/common/api/Status;Landroid/content/Intent;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/aei$e;->b(Lcom/google/android/gms/common/api/m;)V

    invoke-static {p2}, Lcom/google/android/gms/appinvite/e;->a(Landroid/content/Intent;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/aei$e$1;->a:Lcom/google/android/gms/internal/aei$e;

    invoke-static {v0}, Lcom/google/android/gms/internal/aei$e;->a(Lcom/google/android/gms/internal/aei$e;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/aei$e$1;->a:Lcom/google/android/gms/internal/aei$e;

    invoke-static {v0}, Lcom/google/android/gms/internal/aei$e;->b(Lcom/google/android/gms/internal/aei$e;)Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/aei$e$1;->a:Lcom/google/android/gms/internal/aei$e;

    invoke-static {v0}, Lcom/google/android/gms/internal/aei$e;->b(Lcom/google/android/gms/internal/aei$e;)Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    :cond_0
    return-void
.end method
