.class Lcom/google/android/gms/internal/ahm$a;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/ahm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ahm;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/ahm;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ahm$a;->a:Lcom/google/android/gms/internal/ahm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/ahm;Lcom/google/android/gms/internal/ahm$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ahm$a;-><init>(Lcom/google/android/gms/internal/ahm;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6
    .annotation build Landroid/support/annotation/MainThread;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ahm$a;->a:Lcom/google/android/gms/internal/ahm;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ahm;->a:Z

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ahm$a;->a:Lcom/google/android/gms/internal/ahm;

    invoke-static {v0}, Lcom/google/android/gms/internal/ahm;->a(Lcom/google/android/gms/internal/ahm;)Lcom/google/android/gms/common/ConnectionResult;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/ConnectionResult;->a()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/internal/ahm$a;->a:Lcom/google/android/gms/internal/ahm;

    iget-object v0, v0, Lcom/google/android/gms/internal/ahm;->d:Lcom/google/android/gms/internal/aik;

    iget-object v1, p0, Lcom/google/android/gms/internal/ahm$a;->a:Lcom/google/android/gms/internal/ahm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ahm;->e()Landroid/app/Activity;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ahm$a;->a:Lcom/google/android/gms/internal/ahm;

    invoke-static {v2}, Lcom/google/android/gms/internal/ahm;->a(Lcom/google/android/gms/internal/ahm;)Lcom/google/android/gms/common/ConnectionResult;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/common/ConnectionResult;->d()Landroid/app/PendingIntent;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/ahm$a;->a:Lcom/google/android/gms/internal/ahm;

    invoke-static {v3}, Lcom/google/android/gms/internal/ahm;->b(Lcom/google/android/gms/internal/ahm;)I

    move-result v3

    const/4 v4, 0x0

    invoke-static {v1, v2, v3, v4}, Lcom/google/android/gms/common/api/GoogleApiActivity;->b(Landroid/content/Context;Landroid/app/PendingIntent;IZ)Landroid/content/Intent;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/aik;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/ahm$a;->a:Lcom/google/android/gms/internal/ahm;

    iget-object v0, v0, Lcom/google/android/gms/internal/ahm;->c:Lcom/google/android/gms/common/b;

    iget-object v1, p0, Lcom/google/android/gms/internal/ahm$a;->a:Lcom/google/android/gms/internal/ahm;

    invoke-static {v1}, Lcom/google/android/gms/internal/ahm;->a(Lcom/google/android/gms/internal/ahm;)Lcom/google/android/gms/common/ConnectionResult;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/common/ConnectionResult;->c()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/b;->a(I)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ahm$a;->a:Lcom/google/android/gms/internal/ahm;

    iget-object v0, v0, Lcom/google/android/gms/internal/ahm;->c:Lcom/google/android/gms/common/b;

    iget-object v1, p0, Lcom/google/android/gms/internal/ahm$a;->a:Lcom/google/android/gms/internal/ahm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ahm;->e()Landroid/app/Activity;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ahm$a;->a:Lcom/google/android/gms/internal/ahm;

    iget-object v2, v2, Lcom/google/android/gms/internal/ahm;->d:Lcom/google/android/gms/internal/aik;

    iget-object v3, p0, Lcom/google/android/gms/internal/ahm$a;->a:Lcom/google/android/gms/internal/ahm;

    invoke-static {v3}, Lcom/google/android/gms/internal/ahm;->a(Lcom/google/android/gms/internal/ahm;)Lcom/google/android/gms/common/ConnectionResult;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/common/ConnectionResult;->c()I

    move-result v3

    const/4 v4, 0x2

    iget-object v5, p0, Lcom/google/android/gms/internal/ahm$a;->a:Lcom/google/android/gms/internal/ahm;

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/common/b;->a(Landroid/app/Activity;Lcom/google/android/gms/internal/aik;IILandroid/content/DialogInterface$OnCancelListener;)Z

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/google/android/gms/internal/ahm$a;->a:Lcom/google/android/gms/internal/ahm;

    invoke-static {v0}, Lcom/google/android/gms/internal/ahm;->a(Lcom/google/android/gms/internal/ahm;)Lcom/google/android/gms/common/ConnectionResult;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/ConnectionResult;->c()I

    move-result v0

    const/16 v1, 0x12

    if-ne v0, v1, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/internal/ahm$a;->a:Lcom/google/android/gms/internal/ahm;

    iget-object v0, v0, Lcom/google/android/gms/internal/ahm;->c:Lcom/google/android/gms/common/b;

    iget-object v1, p0, Lcom/google/android/gms/internal/ahm$a;->a:Lcom/google/android/gms/internal/ahm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ahm;->e()Landroid/app/Activity;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ahm$a;->a:Lcom/google/android/gms/internal/ahm;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/common/b;->a(Landroid/app/Activity;Landroid/content/DialogInterface$OnCancelListener;)Landroid/app/Dialog;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ahm$a;->a:Lcom/google/android/gms/internal/ahm;

    iget-object v1, v1, Lcom/google/android/gms/internal/ahm;->c:Lcom/google/android/gms/common/b;

    iget-object v2, p0, Lcom/google/android/gms/internal/ahm$a;->a:Lcom/google/android/gms/internal/ahm;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/ahm;->e()Landroid/app/Activity;

    move-result-object v2

    invoke-virtual {v2}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    new-instance v3, Lcom/google/android/gms/internal/ahm$a$1;

    invoke-direct {v3, p0, v0}, Lcom/google/android/gms/internal/ahm$a$1;-><init>(Lcom/google/android/gms/internal/ahm$a;Landroid/app/Dialog;)V

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/common/b;->a(Landroid/content/Context;Lcom/google/android/gms/internal/zzqv$a;)Lcom/google/android/gms/internal/zzqv;

    goto/16 :goto_0

    :cond_3
    iget-object v0, p0, Lcom/google/android/gms/internal/ahm$a;->a:Lcom/google/android/gms/internal/ahm;

    iget-object v1, p0, Lcom/google/android/gms/internal/ahm$a;->a:Lcom/google/android/gms/internal/ahm;

    invoke-static {v1}, Lcom/google/android/gms/internal/ahm;->a(Lcom/google/android/gms/internal/ahm;)Lcom/google/android/gms/common/ConnectionResult;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/ahm$a;->a:Lcom/google/android/gms/internal/ahm;

    invoke-static {v2}, Lcom/google/android/gms/internal/ahm;->b(Lcom/google/android/gms/internal/ahm;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/ahm;->a(Lcom/google/android/gms/common/ConnectionResult;I)V

    goto/16 :goto_0
.end method
