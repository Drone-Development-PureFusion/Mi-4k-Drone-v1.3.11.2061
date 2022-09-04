.class Lcom/google/android/gms/maps/c$4$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/maps/d$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/maps/c$4;->a(Lcom/google/android/gms/maps/a/ak;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/maps/a/ak;

.field final synthetic b:Lcom/google/android/gms/maps/c$4;


# direct methods
.method constructor <init>(Lcom/google/android/gms/maps/c$4;Lcom/google/android/gms/maps/a/ak;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/maps/c$4$1;->b:Lcom/google/android/gms/maps/c$4;

    iput-object p2, p0, Lcom/google/android/gms/maps/c$4$1;->a:Lcom/google/android/gms/maps/a/ak;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/location/Location;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/maps/c$4$1;->a:Lcom/google/android/gms/maps/a/ak;

    invoke-interface {v0, p1}, Lcom/google/android/gms/maps/a/ak;->a(Landroid/location/Location;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/android/gms/maps/model/j;

    invoke-direct {v1, v0}, Lcom/google/android/gms/maps/model/j;-><init>(Landroid/os/RemoteException;)V

    throw v1
.end method
