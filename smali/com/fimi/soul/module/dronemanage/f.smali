.class public Lcom/fimi/soul/module/dronemanage/f;
.super Ljava/lang/Object;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lcom/fimi/soul/module/dronemanage/d;

.field private c:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/fimi/soul/drone/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/fimi/soul/drone/a;Landroid/support/v4/app/FragmentActivity;Lcom/fimi/soul/module/dronemanage/FlightMapFragment;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/f;->c:Ljava/lang/ref/WeakReference;

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/f;->d:Ljava/lang/ref/WeakReference;

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/f;->c:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/f;->a:Landroid/content/Context;

    iget-object v1, p0, Lcom/fimi/soul/module/dronemanage/f;->a:Landroid/content/Context;

    invoke-virtual {p1}, Lcom/fimi/soul/drone/a;->aj()Lcom/google/android/gms/maps/c;

    move-result-object v2

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/f;->d:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/fimi/soul/drone/a;

    invoke-direct {p0, v1, v2, v0, p3}, Lcom/fimi/soul/module/dronemanage/f;->a(Landroid/content/Context;Lcom/google/android/gms/maps/c;Lcom/fimi/soul/drone/a;Lcom/fimi/soul/module/dronemanage/FlightMapFragment;)V

    return-void
.end method

.method private a(Landroid/content/Context;Lcom/google/android/gms/maps/c;Lcom/fimi/soul/drone/a;Lcom/fimi/soul/module/dronemanage/FlightMapFragment;)V
    .locals 1

    new-instance v0, Lcom/fimi/soul/module/dronemanage/d;

    invoke-direct {v0, p2, p1, p3}, Lcom/fimi/soul/module/dronemanage/d;-><init>(Lcom/google/android/gms/maps/c;Landroid/content/Context;Lcom/fimi/soul/drone/a;)V

    iput-object v0, p0, Lcom/fimi/soul/module/dronemanage/f;->b:Lcom/fimi/soul/module/dronemanage/d;

    return-void
.end method


# virtual methods
.method public a()Lcom/fimi/soul/module/dronemanage/d;
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/f;->b:Lcom/fimi/soul/module/dronemanage/d;

    return-object v0
.end method

.method public a(I)V
    .locals 1

    invoke-virtual {p0}, Lcom/fimi/soul/module/dronemanage/f;->a()Lcom/fimi/soul/module/dronemanage/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/module/dronemanage/d;->a()V

    invoke-virtual {p0}, Lcom/fimi/soul/module/dronemanage/f;->a()Lcom/fimi/soul/module/dronemanage/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/fimi/soul/module/dronemanage/d;->d()V

    return-void
.end method

.method public a(ILcom/google/android/gms/maps/model/LatLng;)V
    .locals 1

    invoke-static {}, Lcom/fimi/soul/module/dronemanage/i;->a()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    :sswitch_0
    return-void

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_0
        0x6 -> :sswitch_0
    .end sparse-switch
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/fimi/soul/module/dronemanage/f;->b:Lcom/fimi/soul/module/dronemanage/d;

    invoke-virtual {v0}, Lcom/fimi/soul/module/dronemanage/d;->c()V

    return-void
.end method
