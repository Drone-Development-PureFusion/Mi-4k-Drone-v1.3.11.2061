.class Lcom/google/android/gms/internal/ww$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/ww;->a(Ljava/lang/String;Lorg/json/JSONObject;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lorg/json/JSONObject;

.field final synthetic c:Lcom/google/android/gms/internal/ww;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ww;Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ww$1;->c:Lcom/google/android/gms/internal/ww;

    iput-object p2, p0, Lcom/google/android/gms/internal/ww$1;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/ww$1;->b:Lorg/json/JSONObject;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ww$1;->c:Lcom/google/android/gms/internal/ww;

    invoke-static {v0}, Lcom/google/android/gms/internal/ww;->a(Lcom/google/android/gms/internal/ww;)Lcom/google/android/gms/internal/acy;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ww$1;->a:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/ww$1;->b:Lorg/json/JSONObject;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/acy;->a(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method
