.class Lcom/google/android/gms/cast/framework/media/c$f$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/cast/internal/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/cast/framework/media/c$f;-><init>(Lcom/google/android/gms/common/api/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/cast/framework/media/c$f;


# direct methods
.method constructor <init>(Lcom/google/android/gms/cast/framework/media/c$f;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/framework/media/c$f$1;->a:Lcom/google/android/gms/cast/framework/media/c$f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(J)V
    .locals 4

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/c$f$1;->a:Lcom/google/android/gms/cast/framework/media/c$f;

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/c$f$1;->a:Lcom/google/android/gms/cast/framework/media/c$f;

    new-instance v2, Lcom/google/android/gms/common/api/Status;

    const/16 v3, 0x837

    invoke-direct {v2, v3}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-virtual {v0, v2}, Lcom/google/android/gms/cast/framework/media/c$f;->b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/cast/framework/media/c$b;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/cast/framework/media/c$f;->b(Lcom/google/android/gms/common/api/m;)V

    return-void
.end method

.method public a(JILjava/lang/Object;)V
    .locals 3

    const/4 v0, 0x0

    instance-of v1, p4, Lorg/json/JSONObject;

    if-eqz v1, :cond_0

    check-cast p4, Lorg/json/JSONObject;

    :goto_0
    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/c$f$1;->a:Lcom/google/android/gms/cast/framework/media/c$f;

    new-instance v1, Lcom/google/android/gms/cast/framework/media/c$g;

    new-instance v2, Lcom/google/android/gms/common/api/Status;

    invoke-direct {v2, p3}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-direct {v1, v2, p4}, Lcom/google/android/gms/cast/framework/media/c$g;-><init>(Lcom/google/android/gms/common/api/Status;Lorg/json/JSONObject;)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/cast/framework/media/c$f;->b(Lcom/google/android/gms/common/api/m;)V

    return-void

    :cond_0
    move-object p4, v0

    goto :goto_0
.end method
