.class Lcom/google/android/gms/location/internal/f$1;
.super Lcom/google/android/gms/location/internal/f$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/location/internal/f;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/location/GeofencingRequest;Landroid/app/PendingIntent;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/location/GeofencingRequest;

.field final synthetic b:Landroid/app/PendingIntent;

.field final synthetic c:Lcom/google/android/gms/location/internal/f;


# direct methods
.method constructor <init>(Lcom/google/android/gms/location/internal/f;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/location/GeofencingRequest;Landroid/app/PendingIntent;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/location/internal/f$1;->c:Lcom/google/android/gms/location/internal/f;

    iput-object p3, p0, Lcom/google/android/gms/location/internal/f$1;->a:Lcom/google/android/gms/location/GeofencingRequest;

    iput-object p4, p0, Lcom/google/android/gms/location/internal/f$1;->b:Landroid/app/PendingIntent;

    invoke-direct {p0, p2}, Lcom/google/android/gms/location/internal/f$a;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/location/internal/l;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/location/internal/f$1;->a(Lcom/google/android/gms/location/internal/l;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/location/internal/l;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/location/internal/f$1;->a:Lcom/google/android/gms/location/GeofencingRequest;

    iget-object v1, p0, Lcom/google/android/gms/location/internal/f$1;->b:Landroid/app/PendingIntent;

    invoke-virtual {p1, v0, v1, p0}, Lcom/google/android/gms/location/internal/l;->a(Lcom/google/android/gms/location/GeofencingRequest;Landroid/app/PendingIntent;Lcom/google/android/gms/internal/ahl$b;)V

    return-void
.end method
