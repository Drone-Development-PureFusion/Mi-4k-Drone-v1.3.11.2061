.class Lcom/google/android/gms/internal/zv$1$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/acz$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zv$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/acy;

.field final synthetic b:Lcom/google/android/gms/internal/zv$1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zv$1;Lcom/google/android/gms/internal/acy;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zv$1$1;->b:Lcom/google/android/gms/internal/zv$1;

    iput-object p2, p0, Lcom/google/android/gms/internal/zv$1$1;->a:Lcom/google/android/gms/internal/acy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/acy;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/zv$1$1;->a:Lcom/google/android/gms/internal/acy;

    const-string v1, "google.afma.nativeAds.renderVideo"

    iget-object v2, p0, Lcom/google/android/gms/internal/zv$1$1;->b:Lcom/google/android/gms/internal/zv$1;

    iget-object v2, v2, Lcom/google/android/gms/internal/zv$1;->a:Lorg/json/JSONObject;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/acy;->a(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method
