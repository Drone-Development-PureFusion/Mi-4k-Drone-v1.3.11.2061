.class Lcom/google/android/gms/drive/internal/br$5$1;
.super Lcom/google/android/gms/drive/internal/bc;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/drive/internal/br$5;->a(Lcom/google/android/gms/drive/internal/bt;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/drive/internal/bs;

.field final synthetic b:Lcom/google/android/gms/drive/internal/br$5;


# direct methods
.method constructor <init>(Lcom/google/android/gms/drive/internal/br$5;Lcom/google/android/gms/drive/internal/bs;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/drive/internal/br$5$1;->b:Lcom/google/android/gms/drive/internal/br$5;

    iput-object p2, p0, Lcom/google/android/gms/drive/internal/br$5$1;->a:Lcom/google/android/gms/drive/internal/bs;

    invoke-direct {p0}, Lcom/google/android/gms/drive/internal/bc;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Z)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/br$5$1;->a:Lcom/google/android/gms/drive/internal/bs;

    new-instance v1, Lcom/google/android/gms/common/api/e;

    sget-object v2, Lcom/google/android/gms/common/api/Status;->a:Lcom/google/android/gms/common/api/Status;

    invoke-direct {v1, v2, p1}, Lcom/google/android/gms/common/api/e;-><init>(Lcom/google/android/gms/common/api/Status;Z)V

    invoke-virtual {v0, v1}, Lcom/google/android/gms/drive/internal/bs;->b(Lcom/google/android/gms/common/api/m;)V

    return-void
.end method
