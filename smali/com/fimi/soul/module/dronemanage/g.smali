.class abstract Lcom/fimi/soul/module/dronemanage/g;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fimi/soul/module/dronemanage/g$a;
    }
.end annotation


# instance fields
.field public a:Lcom/google/android/gms/maps/model/PolylineOptions;

.field private b:Lcom/fimi/soul/module/dronemanage/g$a;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/fimi/soul/module/dronemanage/g$a;

    invoke-direct {v0, p0}, Lcom/fimi/soul/module/dronemanage/g$a;-><init>(Lcom/fimi/soul/module/dronemanage/g;)V

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/g;->b:Lcom/fimi/soul/module/dronemanage/g$a;

    new-instance v0, Lcom/google/android/gms/maps/model/PolylineOptions;

    invoke-direct {v0}, Lcom/google/android/gms/maps/model/PolylineOptions;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/g;->a:Lcom/google/android/gms/maps/model/PolylineOptions;

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/g;->a:Lcom/google/android/gms/maps/model/PolylineOptions;

    const/16 v1, -0x100

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/PolylineOptions;->a(I)Lcom/google/android/gms/maps/model/PolylineOptions;

    move-result-object v0

    const/high16 v1, 0x40a00000    # 5.0f

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/PolylineOptions;->a(F)Lcom/google/android/gms/maps/model/PolylineOptions;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/g;->a:Lcom/google/android/gms/maps/model/PolylineOptions;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/g;->a:Lcom/google/android/gms/maps/model/PolylineOptions;

    new-instance v0, Lcom/google/android/gms/maps/model/PolylineOptions;

    invoke-direct {v0}, Lcom/google/android/gms/maps/model/PolylineOptions;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/g;->a:Lcom/google/android/gms/maps/model/PolylineOptions;

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/g;->a:Lcom/google/android/gms/maps/model/PolylineOptions;

    const/16 v1, -0x100

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/PolylineOptions;->a(I)Lcom/google/android/gms/maps/model/PolylineOptions;

    move-result-object v0

    const/high16 v1, 0x40a00000    # 5.0f

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/PolylineOptions;->a(F)Lcom/google/android/gms/maps/model/PolylineOptions;

    :cond_0
    return-void
.end method

.method protected abstract a(Landroid/os/Message;)V
.end method

.method protected a(Ljava/lang/Runnable;)V
    .locals 0

    invoke-static {p1}, Lcom/fimi/kernel/utils/x;->a(Ljava/lang/Runnable;)V

    return-void
.end method

.method protected b()Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/g;->b:Lcom/fimi/soul/module/dronemanage/g$a;

    return-object v0
.end method
