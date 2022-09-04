.class Lcom/google/android/gms/tagmanager/l$1$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/measurement/AppMeasurement$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/tagmanager/l$1;->a(Lcom/google/android/gms/tagmanager/ag;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/tagmanager/ag;

.field final synthetic b:Lcom/google/android/gms/tagmanager/l$1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/tagmanager/l$1;Lcom/google/android/gms/tagmanager/ag;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/l$1$2;->b:Lcom/google/android/gms/tagmanager/l$1;

    iput-object p2, p0, Lcom/google/android/gms/tagmanager/l$1$2;->a:Lcom/google/android/gms/tagmanager/ag;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V
    .locals 6

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/tagmanager/l$1$2;->a:Lcom/google/android/gms/tagmanager/ag;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-wide v4, p4

    invoke-interface/range {v0 .. v5}, Lcom/google/android/gms/tagmanager/ag;->a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method
