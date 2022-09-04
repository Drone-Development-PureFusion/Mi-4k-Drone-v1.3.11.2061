.class public Lcom/fimi/soul/biz/manager/MyLocationManager;
.super Lcom/fimi/soul/receiver/NetworkStateReceiver;

# interfaces
.implements Lcom/google/android/gms/common/api/g$b;
.implements Lcom/google/android/gms/common/api/g$c;
.implements Lcom/google/android/gms/location/l;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fimi/soul/biz/manager/MyLocationManager$a;
    }
.end annotation


# static fields
.field private static d:Lcom/fimi/soul/biz/manager/MyLocationManager;


# instance fields
.field private e:Landroid/location/Location;

.field private f:Landroid/location/Location;

.field private g:Landroid/location/LocationManager;

.field private h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/fimi/soul/biz/manager/MyLocationManager$a;",
            ">;"
        }
    .end annotation
.end field

.field private i:Lcom/google/android/gms/common/api/g;

.field private j:I


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ServiceCast"
        }
    .end annotation

    invoke-direct {p0}, Lcom/fimi/soul/receiver/NetworkStateReceiver;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/fimi/soul/biz/manager/MyLocationManager;->e:Landroid/location/Location;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/biz/manager/MyLocationManager;->h:Ljava/util/List;

    const/16 v0, 0x3e8

    iput v0, p0, Lcom/fimi/soul/biz/manager/MyLocationManager;->j:I

    const-string v0, "location"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/location/LocationManager;

    iput-object v0, p0, Lcom/fimi/soul/biz/manager/MyLocationManager;->g:Landroid/location/LocationManager;

    new-instance v0, Lcom/google/android/gms/common/api/g$a;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/g$a;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, p0}, Lcom/google/android/gms/common/api/g$a;->a(Lcom/google/android/gms/common/api/g$b;)Lcom/google/android/gms/common/api/g$a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/common/api/g$a;->a(Lcom/google/android/gms/common/api/g$c;)Lcom/google/android/gms/common/api/g$a;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/location/n;->a:Lcom/google/android/gms/common/api/a;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/g$a;->a(Lcom/google/android/gms/common/api/a;)Lcom/google/android/gms/common/api/g$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/g$a;->c()Lcom/google/android/gms/common/api/g;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/biz/manager/MyLocationManager;->i:Lcom/google/android/gms/common/api/g;

    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/fimi/soul/biz/manager/MyLocationManager;
    .locals 1

    sget-object v0, Lcom/fimi/soul/biz/manager/MyLocationManager;->d:Lcom/fimi/soul/biz/manager/MyLocationManager;

    if-nez v0, :cond_0

    new-instance v0, Lcom/fimi/soul/biz/manager/MyLocationManager;

    invoke-direct {v0, p0}, Lcom/fimi/soul/biz/manager/MyLocationManager;-><init>(Landroid/content/Context;)V

    sput-object v0, Lcom/fimi/soul/biz/manager/MyLocationManager;->d:Lcom/fimi/soul/biz/manager/MyLocationManager;

    :cond_0
    sget-object v0, Lcom/fimi/soul/biz/manager/MyLocationManager;->d:Lcom/fimi/soul/biz/manager/MyLocationManager;

    return-object v0
.end method

.method private d()V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/manager/MyLocationManager;->i:Lcom/google/android/gms/common/api/g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/manager/MyLocationManager;->i:Lcom/google/android/gms/common/api/g;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/g;->j()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/manager/MyLocationManager;->i:Lcom/google/android/gms/common/api/g;

    invoke-virtual {v0}, Lcom/google/android/gms/common/api/g;->e()V

    :cond_0
    return-void
.end method


# virtual methods
.method public a()D
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/biz/manager/MyLocationManager;->f:Landroid/location/Location;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/manager/MyLocationManager;->f:Landroid/location/Location;

    invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_0
    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    goto :goto_0
.end method

.method public a(I)V
    .locals 0

    return-void
.end method

.method public a(Landroid/location/Location;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/biz/manager/MyLocationManager;->f:Landroid/location/Location;

    iput-object p1, p0, Lcom/fimi/soul/biz/manager/MyLocationManager;->e:Landroid/location/Location;

    return-void
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 4
    .param p1    # Landroid/os/Bundle;
        .annotation build Landroid/support/annotation/Nullable;
        .end annotation
    .end param

    new-instance v0, Lcom/google/android/gms/location/LocationRequest;

    invoke-direct {v0}, Lcom/google/android/gms/location/LocationRequest;-><init>()V

    iget v1, p0, Lcom/fimi/soul/biz/manager/MyLocationManager;->j:I

    int-to-long v2, v1

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/location/LocationRequest;->a(J)Lcom/google/android/gms/location/LocationRequest;

    iget v1, p0, Lcom/fimi/soul/biz/manager/MyLocationManager;->j:I

    int-to-long v2, v1

    invoke-virtual {v0, v2, v3}, Lcom/google/android/gms/location/LocationRequest;->c(J)Lcom/google/android/gms/location/LocationRequest;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Lcom/google/android/gms/location/LocationRequest;->a(I)Lcom/google/android/gms/location/LocationRequest;

    sget-object v1, Lcom/google/android/gms/location/n;->b:Lcom/google/android/gms/location/e;

    iget-object v2, p0, Lcom/fimi/soul/biz/manager/MyLocationManager;->i:Lcom/google/android/gms/common/api/g;

    invoke-interface {v1, v2, v0, p0}, Lcom/google/android/gms/location/e;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/location/LocationRequest;Lcom/google/android/gms/location/l;)Lcom/google/android/gms/common/api/i;

    return-void
.end method

.method public a(Lcom/fimi/soul/biz/manager/MyLocationManager$a;)V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/manager/MyLocationManager;->h:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/manager/MyLocationManager;->h:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-direct {p0}, Lcom/fimi/soul/biz/manager/MyLocationManager;->d()V

    return-void
.end method

.method public a(Lcom/fimi/soul/receiver/NetworkStateReceiver$a;Landroid/content/Context;)V
    .locals 1

    if-eqz p1, :cond_0

    sget-object v0, Lcom/fimi/soul/receiver/NetworkStateReceiver$a;->c:Lcom/fimi/soul/receiver/NetworkStateReceiver$a;

    if-eq p1, v0, :cond_0

    invoke-direct {p0}, Lcom/fimi/soul/biz/manager/MyLocationManager;->d()V

    :cond_0
    return-void
.end method

.method public a(Lcom/google/android/gms/common/ConnectionResult;)V
    .locals 0
    .param p1    # Lcom/google/android/gms/common/ConnectionResult;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    return-void
.end method

.method public b()D
    .locals 2

    iget-object v0, p0, Lcom/fimi/soul/biz/manager/MyLocationManager;->f:Landroid/location/Location;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/manager/MyLocationManager;->f:Landroid/location/Location;

    invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D

    move-result-wide v0

    :goto_0
    return-wide v0

    :cond_0
    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    goto :goto_0
.end method

.method public b(Landroid/location/Location;)V
    .locals 4

    invoke-static {}, Lcom/fimi/soul/biz/o/a;->a()Lcom/fimi/soul/biz/o/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/biz/o/a;->b()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v0

    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lcom/fimi/soul/utils/af;->a(DD)Lcom/fimi/soul/utils/al;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/utils/al;->a()D

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, Landroid/location/Location;->setLatitude(D)V

    invoke-virtual {v0}, Lcom/fimi/soul/utils/al;->b()D

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Landroid/location/Location;->setLongitude(D)V

    :goto_0
    invoke-virtual {p0, p1}, Lcom/fimi/soul/biz/manager/MyLocationManager;->a(Landroid/location/Location;)V

    iget-object v0, p0, Lcom/fimi/soul/biz/manager/MyLocationManager;->h:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/biz/manager/MyLocationManager$a;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/fimi/soul/biz/manager/MyLocationManager$a;->a(Landroid/location/Location;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Landroid/location/Location;->getLatitude()D

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Landroid/location/Location;->setLatitude(D)V

    invoke-virtual {p1}, Landroid/location/Location;->getLongitude()D

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Landroid/location/Location;->setLongitude(D)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public b(Lcom/fimi/soul/biz/manager/MyLocationManager$a;)V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/manager/MyLocationManager;->h:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/biz/manager/MyLocationManager;->h:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public c()Landroid/location/Location;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/biz/manager/MyLocationManager;->e:Landroid/location/Location;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/biz/manager/MyLocationManager;->e:Landroid/location/Location;

    goto :goto_0
.end method
