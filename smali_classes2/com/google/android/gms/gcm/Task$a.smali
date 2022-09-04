.class public abstract Lcom/google/android/gms/gcm/Task$a;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/gcm/Task;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# instance fields
.field protected a:I

.field protected b:Ljava/lang/String;

.field protected c:Ljava/lang/String;

.field protected d:Z

.field protected e:Z

.field protected f:Z

.field protected g:Lcom/google/android/gms/gcm/g;

.field protected h:Landroid/os/Bundle;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/google/android/gms/gcm/g;->a:Lcom/google/android/gms/gcm/g;

    iput-object v0, p0, Lcom/google/android/gms/gcm/Task$a;->g:Lcom/google/android/gms/gcm/g;

    return-void
.end method


# virtual methods
.method protected a()V
    .locals 2
    .annotation build Landroid/support/annotation/CallSuper;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/gcm/Task$a;->b:Ljava/lang/String;

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    const-string v1, "Must provide an endpoint for this task by calling setService(ComponentName)."

    invoke-static {v0, v1}, Lcom/google/android/gms/common/internal/d;->b(ZLjava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/gcm/Task$a;->c:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/gcm/a;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/gcm/Task$a;->g:Lcom/google/android/gms/gcm/g;

    invoke-static {v0}, Lcom/google/android/gms/gcm/Task;->a(Lcom/google/android/gms/gcm/g;)V

    iget-boolean v0, p0, Lcom/google/android/gms/gcm/Task$a;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/gcm/Task$a;->h:Landroid/os/Bundle;

    invoke-static {v0}, Lcom/google/android/gms/gcm/Task;->b(Landroid/os/Bundle;)V

    :cond_0
    return-void

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public abstract b(I)Lcom/google/android/gms/gcm/Task$a;
.end method

.method public abstract b(Landroid/os/Bundle;)Lcom/google/android/gms/gcm/Task$a;
.end method

.method public abstract b(Ljava/lang/Class;)Lcom/google/android/gms/gcm/Task$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<+",
            "Lcom/google/android/gms/gcm/GcmTaskService;",
            ">;)",
            "Lcom/google/android/gms/gcm/Task$a;"
        }
    .end annotation
.end method

.method public abstract b(Ljava/lang/String;)Lcom/google/android/gms/gcm/Task$a;
.end method

.method public abstract c()Lcom/google/android/gms/gcm/Task;
.end method

.method public abstract d(Z)Lcom/google/android/gms/gcm/Task$a;
.end method

.method public abstract e(Z)Lcom/google/android/gms/gcm/Task$a;
.end method

.method public abstract f(Z)Lcom/google/android/gms/gcm/Task$a;
.end method
