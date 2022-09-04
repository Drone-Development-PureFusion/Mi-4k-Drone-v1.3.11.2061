.class Lcom/google/android/gms/drive/internal/c$a;
.super Lcom/google/android/gms/drive/internal/bc;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/drive/internal/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/ahl$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/drive/c$c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ahl$b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/drive/c$c;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/drive/internal/bc;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/drive/internal/c$a;->a:Lcom/google/android/gms/internal/ahl$b;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/Status;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/c$a;->a:Lcom/google/android/gms/internal/ahl$b;

    new-instance v1, Lcom/google/android/gms/drive/internal/br$g;

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v1, p1, v2, v3}, Lcom/google/android/gms/drive/internal/br$g;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/drive/m;Z)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ahl$b;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/drive/internal/OnListParentsResponse;)V
    .locals 5

    new-instance v0, Lcom/google/android/gms/drive/m;

    invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/OnListParentsResponse;->b()Lcom/google/android/gms/common/data/DataHolder;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/drive/m;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    iget-object v1, p0, Lcom/google/android/gms/drive/internal/c$a;->a:Lcom/google/android/gms/internal/ahl$b;

    new-instance v2, Lcom/google/android/gms/drive/internal/br$g;

    sget-object v3, Lcom/google/android/gms/common/api/Status;->a:Lcom/google/android/gms/common/api/Status;

    const/4 v4, 0x0

    invoke-direct {v2, v3, v0, v4}, Lcom/google/android/gms/drive/internal/br$g;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/drive/m;Z)V

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ahl$b;->a(Ljava/lang/Object;)V

    return-void
.end method
