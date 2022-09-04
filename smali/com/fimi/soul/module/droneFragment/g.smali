.class public Lcom/fimi/soul/module/droneFragment/g;
.super Ljava/lang/Object;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x13
.end annotation


# static fields
.field private static d:Lcom/fimi/soul/module/droneFragment/g;


# instance fields
.field a:Lcom/google/android/gms/maps/model/g;

.field private b:Lcom/google/android/gms/maps/c;

.field private c:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/maps/model/g;",
            ">;"
        }
    .end annotation
.end field

.field private e:Lcom/google/android/gms/maps/model/g;

.field private f:Lcom/google/android/gms/maps/model/LatLng;

.field private g:Lcom/google/android/gms/maps/model/a;

.field private h:Lcom/google/android/gms/maps/model/a;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/g;->c:Ljava/util/HashMap;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/g;->c:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method

.method public static a()Lcom/fimi/soul/module/droneFragment/g;
    .locals 1

    sget-object v0, Lcom/fimi/soul/module/droneFragment/g;->d:Lcom/fimi/soul/module/droneFragment/g;

    if-nez v0, :cond_0

    new-instance v0, Lcom/fimi/soul/module/droneFragment/g;

    invoke-direct {v0}, Lcom/fimi/soul/module/droneFragment/g;-><init>()V

    sput-object v0, Lcom/fimi/soul/module/droneFragment/g;->d:Lcom/fimi/soul/module/droneFragment/g;

    :cond_0
    sget-object v0, Lcom/fimi/soul/module/droneFragment/g;->d:Lcom/fimi/soul/module/droneFragment/g;

    return-object v0
.end method

.method private d(Ljava/lang/String;)Lcom/google/android/gms/maps/model/MarkerOptions;
    .locals 2

    new-instance v0, Lcom/google/android/gms/maps/model/MarkerOptions;

    invoke-direct {v0}, Lcom/google/android/gms/maps/model/MarkerOptions;-><init>()V

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/g;->f:Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/MarkerOptions;->a(Lcom/google/android/gms/maps/model/LatLng;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v0

    invoke-virtual {p0, p1}, Lcom/fimi/soul/module/droneFragment/g;->c(Ljava/lang/String;)Lcom/google/android/gms/maps/model/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/MarkerOptions;->a(Lcom/google/android/gms/maps/model/a;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/maps/c;Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/module/droneFragment/g;->b:Lcom/google/android/gms/maps/c;

    iput-object p2, p0, Lcom/fimi/soul/module/droneFragment/g;->f:Lcom/google/android/gms/maps/model/LatLng;

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 3

    const/high16 v2, 0x3f000000    # 0.5f

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/g;->c:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/g;->b:Lcom/google/android/gms/maps/c;

    invoke-direct {p0, p1}, Lcom/fimi/soul/module/droneFragment/g;->d(Ljava/lang/String;)Lcom/google/android/gms/maps/model/MarkerOptions;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/model/MarkerOptions;)Lcom/google/android/gms/maps/model/g;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/g;->a:Lcom/google/android/gms/maps/model/g;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/g;->a:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/maps/model/g;->a(Ljava/lang/Object;)V

    const-string v0, "homename"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/g;->a:Lcom/google/android/gms/maps/model/g;

    const v1, 0x3e19999a    # 0.15f

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/maps/model/g;->a(FF)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/g;->a:Lcom/google/android/gms/maps/model/g;

    const/high16 v1, 0x42a00000    # 80.0f

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/g;->a(F)V

    :goto_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/g;->c:Ljava/util/HashMap;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/g;->a:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    return-void

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/g;->a:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0, v2, v2}, Lcom/google/android/gms/maps/model/g;->a(FF)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/g;->a:Lcom/google/android/gms/maps/model/g;

    const/high16 v1, 0x42c80000    # 100.0f

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/g;->a(F)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/g;->c:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/g;

    iget-object v1, p0, Lcom/fimi/soul/module/droneFragment/g;->f:Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/g;->a(Lcom/google/android/gms/maps/model/LatLng;)V

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/g;->c:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/g;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/maps/model/g;->b(Z)V

    goto :goto_1
.end method

.method public b()V
    .locals 3

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/g;->c:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/g;->c:Ljava/util/HashMap;

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->a()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/g;->c:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/g;->c:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/g;->c:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/g;

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/g;->e:Lcom/google/android/gms/maps/model/g;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/g;->c:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/g;->e:Lcom/google/android/gms/maps/model/g;

    invoke-virtual {v0}, Lcom/google/android/gms/maps/model/g;->a()V

    :cond_0
    return-void
.end method

.method protected c(Ljava/lang/String;)Lcom/google/android/gms/maps/model/a;
    .locals 1

    const-string v0, "dronename"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/g;->h:Lcom/google/android/gms/maps/model/a;

    if-nez v0, :cond_0

    const v0, 0x7f0201fb

    invoke-static {v0}, Lcom/google/android/gms/maps/model/b;->a(I)Lcom/google/android/gms/maps/model/a;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/g;->h:Lcom/google/android/gms/maps/model/a;

    :cond_0
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/g;->h:Lcom/google/android/gms/maps/model/a;

    :goto_0
    return-object v0

    :cond_1
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/g;->g:Lcom/google/android/gms/maps/model/a;

    if-nez v0, :cond_2

    const v0, 0x7f020213

    invoke-static {v0}, Lcom/google/android/gms/maps/model/b;->a(I)Lcom/google/android/gms/maps/model/a;

    move-result-object v0

    iput-object v0, p0, Lcom/fimi/soul/module/droneFragment/g;->g:Lcom/google/android/gms/maps/model/a;

    :cond_2
    iget-object v0, p0, Lcom/fimi/soul/module/droneFragment/g;->g:Lcom/google/android/gms/maps/model/a;

    goto :goto_0
.end method
