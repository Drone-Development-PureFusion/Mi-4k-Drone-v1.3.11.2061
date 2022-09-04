.class final Lcom/google/android/gms/tagmanager/l$1;
.super Lcom/google/android/gms/tagmanager/aj$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/tagmanager/l;->e(Landroid/content/Context;)Lcom/google/android/gms/tagmanager/aj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/measurement/AppMeasurement;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/AppMeasurement;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/l$1;->a:Lcom/google/android/gms/measurement/AppMeasurement;

    invoke-direct {p0}, Lcom/google/android/gms/tagmanager/aj$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/l$1;->a:Lcom/google/android/gms/measurement/AppMeasurement;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/AppMeasurement;->b(Z)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/tagmanager/ag;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/l$1;->a:Lcom/google/android/gms/measurement/AppMeasurement;

    new-instance v1, Lcom/google/android/gms/tagmanager/l$1$2;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/tagmanager/l$1$2;-><init>(Lcom/google/android/gms/tagmanager/l$1;Lcom/google/android/gms/tagmanager/ag;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/AppMeasurement;->a(Lcom/google/android/gms/measurement/AppMeasurement$c;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/tagmanager/ai;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/l$1;->a:Lcom/google/android/gms/measurement/AppMeasurement;

    new-instance v1, Lcom/google/android/gms/tagmanager/l$1$1;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/tagmanager/l$1$1;-><init>(Lcom/google/android/gms/tagmanager/l$1;Lcom/google/android/gms/tagmanager/ai;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/measurement/AppMeasurement;->a(Lcom/google/android/gms/measurement/AppMeasurement$b;)V

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/l$1;->a:Lcom/google/android/gms/measurement/AppMeasurement;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-wide v4, p4

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/measurement/AppMeasurement;->a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V

    return-void
.end method
