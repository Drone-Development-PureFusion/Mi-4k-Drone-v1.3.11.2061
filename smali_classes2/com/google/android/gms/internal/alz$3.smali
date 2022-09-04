.class Lcom/google/android/gms/internal/alz$3;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/alz$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/alz;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/fitness/request/b;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/fitness/request/b;

.field final synthetic b:Lcom/google/android/gms/internal/alz;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/alz;Lcom/google/android/gms/fitness/request/b;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/alz$3;->b:Lcom/google/android/gms/internal/alz;

    iput-object p2, p0, Lcom/google/android/gms/internal/alz$3;->a:Lcom/google/android/gms/fitness/request/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    invoke-static {}, Lcom/google/android/gms/fitness/request/aj$a;->a()Lcom/google/android/gms/fitness/request/aj$a;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/alz$3;->a:Lcom/google/android/gms/fitness/request/b;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/fitness/request/aj$a;->c(Lcom/google/android/gms/fitness/request/b;)Lcom/google/android/gms/fitness/request/aj;

    return-void
.end method
