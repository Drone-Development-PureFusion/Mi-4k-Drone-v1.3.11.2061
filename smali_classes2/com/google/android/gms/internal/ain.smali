.class public Lcom/google/android/gms/internal/ain;
.super Lcom/google/android/gms/internal/ahm;


# instance fields
.field private e:Lcom/google/android/gms/g/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/g/g",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/aik;)V
    .locals 2

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ahm;-><init>(Lcom/google/android/gms/internal/aik;)V

    new-instance v0, Lcom/google/android/gms/g/g;

    invoke-direct {v0}, Lcom/google/android/gms/g/g;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ain;->e:Lcom/google/android/gms/g/g;

    iget-object v0, p0, Lcom/google/android/gms/internal/ain;->d:Lcom/google/android/gms/internal/aik;

    const-string v1, "GmsAvailabilityHelper"

    invoke-interface {v0, v1, p0}, Lcom/google/android/gms/internal/aik;->a(Ljava/lang/String;Lcom/google/android/gms/internal/aij;)V

    return-void
.end method

.method public static a(Landroid/app/Activity;)Lcom/google/android/gms/internal/ain;
    .locals 3

    invoke-static {p0}, Lcom/google/android/gms/internal/ain;->b(Landroid/app/Activity;)Lcom/google/android/gms/internal/aik;

    move-result-object v1

    const-string v0, "GmsAvailabilityHelper"

    const-class v2, Lcom/google/android/gms/internal/ain;

    invoke-interface {v1, v0, v2}, Lcom/google/android/gms/internal/aik;->a(Ljava/lang/String;Ljava/lang/Class;)Lcom/google/android/gms/internal/aij;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ain;

    if-eqz v0, :cond_1

    iget-object v1, v0, Lcom/google/android/gms/internal/ain;->e:Lcom/google/android/gms/g/g;

    invoke-virtual {v1}, Lcom/google/android/gms/g/g;->a()Lcom/google/android/gms/g/f;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/g/f;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Lcom/google/android/gms/g/g;

    invoke-direct {v1}, Lcom/google/android/gms/g/g;-><init>()V

    iput-object v1, v0, Lcom/google/android/gms/internal/ain;->e:Lcom/google/android/gms/g/g;

    :cond_0
    :goto_0
    return-object v0

    :cond_1
    new-instance v0, Lcom/google/android/gms/internal/ain;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/ain;-><init>(Lcom/google/android/gms/internal/aik;)V

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/internal/ain;->b(Lcom/google/android/gms/common/ConnectionResult;I)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/common/ConnectionResult;I)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ain;->e:Lcom/google/android/gms/g/g;

    invoke-static {p1}, Lcom/google/android/gms/common/internal/m;->a(Lcom/google/android/gms/common/ConnectionResult;)Lcom/google/android/gms/common/api/r;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/g/g;->a(Ljava/lang/Exception;)V

    return-void
.end method

.method protected c()V
    .locals 3

    const/4 v2, 0x0

    iget-object v0, p0, Lcom/google/android/gms/internal/ain;->c:Lcom/google/android/gms/common/b;

    iget-object v1, p0, Lcom/google/android/gms/internal/ain;->d:Lcom/google/android/gms/internal/aik;

    invoke-interface {v1}, Lcom/google/android/gms/internal/aik;->a()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/b;->a(Landroid/content/Context;)I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ain;->e:Lcom/google/android/gms/g/g;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/g/g;->a(Ljava/lang/Object;)V

    :goto_0
    return-void

    :cond_0
    new-instance v1, Lcom/google/android/gms/common/ConnectionResult;

    invoke-direct {v1, v0, v2}, Lcom/google/android/gms/common/ConnectionResult;-><init>(ILandroid/app/PendingIntent;)V

    invoke-virtual {p0, v1}, Lcom/google/android/gms/internal/ain;->a(Lcom/google/android/gms/common/ConnectionResult;)V

    goto :goto_0
.end method

.method public f()V
    .locals 3

    invoke-super {p0}, Lcom/google/android/gms/internal/ahm;->f()V

    iget-object v0, p0, Lcom/google/android/gms/internal/ain;->e:Lcom/google/android/gms/g/g;

    new-instance v1, Ljava/util/concurrent/CancellationException;

    const-string v2, "Host activity was destroyed before Google Play services could be made available."

    invoke-direct {v1, v2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/g/g;->a(Ljava/lang/Exception;)V

    return-void
.end method

.method public g()Lcom/google/android/gms/g/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/g/f",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ain;->e:Lcom/google/android/gms/g/g;

    invoke-virtual {v0}, Lcom/google/android/gms/g/g;->a()Lcom/google/android/gms/g/f;

    move-result-object v0

    return-object v0
.end method
