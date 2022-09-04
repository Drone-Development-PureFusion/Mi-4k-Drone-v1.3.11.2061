.class Lcom/google/android/gms/location/internal/d$5;
.super Lcom/google/android/gms/location/internal/d$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/location/internal/d;->a(Lcom/google/android/gms/common/api/g;Landroid/location/Location;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/location/Location;

.field final synthetic b:Lcom/google/android/gms/location/internal/d;


# direct methods
.method constructor <init>(Lcom/google/android/gms/location/internal/d;Lcom/google/android/gms/common/api/g;Landroid/location/Location;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/location/internal/d$5;->b:Lcom/google/android/gms/location/internal/d;

    iput-object p3, p0, Lcom/google/android/gms/location/internal/d$5;->a:Landroid/location/Location;

    invoke-direct {p0, p2}, Lcom/google/android/gms/location/internal/d$a;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method protected bridge synthetic a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/location/internal/l;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/location/internal/d$5;->a(Lcom/google/android/gms/location/internal/l;)V

    return-void
.end method

.method protected a(Lcom/google/android/gms/location/internal/l;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/location/internal/d$5;->a:Landroid/location/Location;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/location/internal/l;->a(Landroid/location/Location;)V

    sget-object v0, Lcom/google/android/gms/common/api/Status;->a:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p0, v0}, Lcom/google/android/gms/location/internal/d$5;->b(Lcom/google/android/gms/common/api/m;)V

    return-void
.end method
