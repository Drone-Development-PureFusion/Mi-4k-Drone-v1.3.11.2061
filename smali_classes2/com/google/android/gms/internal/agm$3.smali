.class Lcom/google/android/gms/internal/agm$3;
.super Lcom/google/android/gms/internal/agm$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/agm;->b(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lorg/json/JSONObject;

.field final synthetic c:Lcom/google/android/gms/internal/agm;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/agm;Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/agm$3;->c:Lcom/google/android/gms/internal/agm;

    iput-object p2, p0, Lcom/google/android/gms/internal/agm$3;->a:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/agm$3;->b:Lorg/json/JSONObject;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/agm$a;-><init>(Lcom/google/android/gms/internal/agm;)V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/agm$3;->c:Lcom/google/android/gms/internal/agm;

    iget-object v1, p0, Lcom/google/android/gms/internal/agm$3;->a:Ljava/lang/String;

    const/4 v2, 0x6

    iget-object v3, p0, Lcom/google/android/gms/internal/agm$3;->b:Lorg/json/JSONObject;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/agm$3;->c()Lcom/google/android/gms/cast/internal/p;

    move-result-object v4

    invoke-static {v0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/agm;->a(Lcom/google/android/gms/internal/agm;Ljava/lang/String;ILorg/json/JSONObject;Lcom/google/android/gms/cast/internal/p;)V

    return-void
.end method
