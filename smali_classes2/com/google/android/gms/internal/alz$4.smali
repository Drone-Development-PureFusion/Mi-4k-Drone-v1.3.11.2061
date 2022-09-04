.class Lcom/google/android/gms/internal/alz$4;
.super Lcom/google/android/gms/internal/aku$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/alz;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/data/y;Landroid/app/PendingIntent;Lcom/google/android/gms/internal/alz$a;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/alz$a;

.field final synthetic b:Lcom/google/android/gms/fitness/data/y;

.field final synthetic c:Landroid/app/PendingIntent;

.field final synthetic d:Lcom/google/android/gms/internal/alz;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/alz;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/internal/alz$a;Lcom/google/android/gms/fitness/data/y;Landroid/app/PendingIntent;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/alz$4;->d:Lcom/google/android/gms/internal/alz;

    iput-object p3, p0, Lcom/google/android/gms/internal/alz$4;->a:Lcom/google/android/gms/internal/alz$a;

    iput-object p4, p0, Lcom/google/android/gms/internal/alz$4;->b:Lcom/google/android/gms/fitness/data/y;

    iput-object p5, p0, Lcom/google/android/gms/internal/alz$4;->c:Landroid/app/PendingIntent;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/aku$c;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Status;
    .locals 0

    return-object p1
.end method

.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/aku;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/alz$4;->a(Lcom/google/android/gms/internal/aku;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/internal/aku;)V
    .locals 5

    new-instance v1, Lcom/google/android/gms/internal/alz$c;

    iget-object v0, p0, Lcom/google/android/gms/internal/alz$4;->a:Lcom/google/android/gms/internal/alz$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v0, v2}, Lcom/google/android/gms/internal/alz$c;-><init>(Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/internal/alz$a;Lcom/google/android/gms/internal/alz$1;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/aku;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/alj;

    new-instance v2, Lcom/google/android/gms/fitness/request/SensorUnregistrationRequest;

    iget-object v3, p0, Lcom/google/android/gms/internal/alz$4;->b:Lcom/google/android/gms/fitness/data/y;

    iget-object v4, p0, Lcom/google/android/gms/internal/alz$4;->c:Landroid/app/PendingIntent;

    invoke-direct {v2, v3, v4, v1}, Lcom/google/android/gms/fitness/request/SensorUnregistrationRequest;-><init>(Lcom/google/android/gms/fitness/data/y;Landroid/app/PendingIntent;Lcom/google/android/gms/internal/alq;)V

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/alj;->a(Lcom/google/android/gms/fitness/request/SensorUnregistrationRequest;)V

    return-void
.end method

.method protected synthetic b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/alz$4;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/Status;

    move-result-object v0

    return-object v0
.end method
