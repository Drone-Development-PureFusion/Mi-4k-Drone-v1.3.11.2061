.class Lcom/google/android/gms/internal/ama$5;
.super Lcom/google/android/gms/internal/akv$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/ama;->a(Lcom/google/android/gms/common/api/g;Landroid/app/PendingIntent;I)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/app/PendingIntent;

.field final synthetic b:I

.field final synthetic c:Lcom/google/android/gms/internal/ama;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ama;Lcom/google/android/gms/common/api/g;Landroid/app/PendingIntent;I)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ama$5;->c:Lcom/google/android/gms/internal/ama;

    iput-object p3, p0, Lcom/google/android/gms/internal/ama$5;->a:Landroid/app/PendingIntent;

    iput p4, p0, Lcom/google/android/gms/internal/ama$5;->b:I

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/akv$c;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/akv;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ama$5;->a(Lcom/google/android/gms/internal/akv;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/internal/akv;)V
    .locals 5

    new-instance v1, Lcom/google/android/gms/internal/amb;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/amb;-><init>(Lcom/google/android/gms/internal/ahl$b;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/akv;->G()Landroid/os/IInterface;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/alk;

    new-instance v2, Lcom/google/android/gms/fitness/request/SessionRegistrationRequest;

    iget-object v3, p0, Lcom/google/android/gms/internal/ama$5;->a:Landroid/app/PendingIntent;

    iget v4, p0, Lcom/google/android/gms/internal/ama$5;->b:I

    invoke-direct {v2, v3, v1, v4}, Lcom/google/android/gms/fitness/request/SessionRegistrationRequest;-><init>(Landroid/app/PendingIntent;Lcom/google/android/gms/internal/alq;I)V

    invoke-interface {v0, v2}, Lcom/google/android/gms/internal/alk;->a(Lcom/google/android/gms/fitness/request/SessionRegistrationRequest;)V

    return-void
.end method
