.class Lcom/google/android/gms/internal/ahw$b$2;
.super Lcom/google/android/gms/internal/aia$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/ahw$b;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/common/internal/p$f;

.field final synthetic b:Lcom/google/android/gms/internal/ahw$b;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ahw$b;Lcom/google/android/gms/internal/ahz;Lcom/google/android/gms/common/internal/p$f;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ahw$b$2;->b:Lcom/google/android/gms/internal/ahw$b;

    iput-object p3, p0, Lcom/google/android/gms/internal/ahw$b$2;->a:Lcom/google/android/gms/common/internal/p$f;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/aia$a;-><init>(Lcom/google/android/gms/internal/ahz;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ahw$b$2;->a:Lcom/google/android/gms/common/internal/p$f;

    new-instance v1, Lcom/google/android/gms/common/ConnectionResult;

    const/16 v2, 0x10

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/common/ConnectionResult;-><init>(ILandroid/app/PendingIntent;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/common/internal/p$f;->a(Lcom/google/android/gms/common/ConnectionResult;)V

    return-void
.end method
