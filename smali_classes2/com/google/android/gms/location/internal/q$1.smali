.class Lcom/google/android/gms/location/internal/q$1;
.super Lcom/google/android/gms/location/n$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/location/internal/q;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/location/LocationSettingsRequest;Ljava/lang/String;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/location/n$a",
        "<",
        "Lcom/google/android/gms/location/LocationSettingsResult;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/location/LocationSettingsRequest;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Lcom/google/android/gms/location/internal/q;


# direct methods
.method constructor <init>(Lcom/google/android/gms/location/internal/q;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/location/LocationSettingsRequest;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/location/internal/q$1;->c:Lcom/google/android/gms/location/internal/q;

    iput-object p3, p0, Lcom/google/android/gms/location/internal/q$1;->a:Lcom/google/android/gms/location/LocationSettingsRequest;

    iput-object p4, p0, Lcom/google/android/gms/location/internal/q$1;->b:Ljava/lang/String;

    invoke-direct {p0, p2}, Lcom/google/android/gms/location/n$a;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/location/LocationSettingsResult;
    .locals 1

    new-instance v0, Lcom/google/android/gms/location/LocationSettingsResult;

    invoke-direct {v0, p1}, Lcom/google/android/gms/location/LocationSettingsResult;-><init>(Lcom/google/android/gms/common/api/Status;)V

    return-object v0
.end method

.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/location/internal/l;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/location/internal/q$1;->a(Lcom/google/android/gms/location/internal/l;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/location/internal/l;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/location/internal/q$1;->a:Lcom/google/android/gms/location/LocationSettingsRequest;

    iget-object v1, p0, Lcom/google/android/gms/location/internal/q$1;->b:Ljava/lang/String;

    invoke-virtual {p1, v0, p0, v1}, Lcom/google/android/gms/location/internal/l;->a(Lcom/google/android/gms/location/LocationSettingsRequest;Lcom/google/android/gms/internal/ahl$b;Ljava/lang/String;)V

    return-void
.end method

.method public synthetic b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/location/internal/q$1;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/location/LocationSettingsResult;

    move-result-object v0

    return-object v0
.end method
