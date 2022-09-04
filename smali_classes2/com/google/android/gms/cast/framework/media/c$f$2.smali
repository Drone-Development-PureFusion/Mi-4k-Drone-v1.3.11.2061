.class Lcom/google/android/gms/cast/framework/media/c$f$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/cast/framework/media/c$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/cast/framework/media/c$f;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/cast/framework/media/c$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/common/api/Status;

.field final synthetic b:Lcom/google/android/gms/cast/framework/media/c$f;


# direct methods
.method constructor <init>(Lcom/google/android/gms/cast/framework/media/c$f;Lcom/google/android/gms/common/api/Status;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/framework/media/c$f$2;->b:Lcom/google/android/gms/cast/framework/media/c$f;

    iput-object p2, p0, Lcom/google/android/gms/cast/framework/media/c$f$2;->a:Lcom/google/android/gms/common/api/Status;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/c$f$2;->a:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method

.method public b()Lorg/json/JSONObject;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method
