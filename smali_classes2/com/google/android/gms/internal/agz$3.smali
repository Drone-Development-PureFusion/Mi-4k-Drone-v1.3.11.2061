.class Lcom/google/android/gms/internal/agz$3;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/agz;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/internal/agz$c;)Lcom/google/android/gms/common/api/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/common/api/g;

.field final synthetic b:Lcom/google/android/gms/internal/agz$c;

.field final synthetic c:Lcom/google/android/gms/internal/agz;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/agz;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/internal/agz$c;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/agz$3;->c:Lcom/google/android/gms/internal/agz;

    iput-object p2, p0, Lcom/google/android/gms/internal/agz$3;->a:Lcom/google/android/gms/common/api/g;

    iput-object p3, p0, Lcom/google/android/gms/internal/agz$3;->b:Lcom/google/android/gms/internal/agz$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/agz$3;->a:Lcom/google/android/gms/common/api/g;

    iget-object v1, p0, Lcom/google/android/gms/internal/agz$3;->b:Lcom/google/android/gms/internal/agz$c;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    return-void
.end method
