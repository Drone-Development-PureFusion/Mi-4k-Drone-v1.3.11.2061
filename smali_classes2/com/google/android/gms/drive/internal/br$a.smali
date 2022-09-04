.class Lcom/google/android/gms/drive/internal/br$a;
.super Lcom/google/android/gms/drive/internal/bc;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/drive/internal/br;
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
            "Lcom/google/android/gms/drive/c$a;",
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
            "Lcom/google/android/gms/drive/c$a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/drive/internal/bc;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/drive/internal/br$a;->a:Lcom/google/android/gms/internal/ahl$b;

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/Status;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/br$a;->a:Lcom/google/android/gms/internal/ahl$b;

    new-instance v1, Lcom/google/android/gms/drive/internal/br$b;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lcom/google/android/gms/drive/internal/br$b;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/drive/d;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ahl$b;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/drive/internal/OnContentsResponse;)V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/br$a;->a:Lcom/google/android/gms/internal/ahl$b;

    new-instance v1, Lcom/google/android/gms/drive/internal/br$b;

    sget-object v2, Lcom/google/android/gms/common/api/Status;->a:Lcom/google/android/gms/common/api/Status;

    new-instance v3, Lcom/google/android/gms/drive/internal/bu;

    invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/OnContentsResponse;->a()Lcom/google/android/gms/drive/Contents;

    move-result-object v4

    invoke-direct {v3, v4}, Lcom/google/android/gms/drive/internal/bu;-><init>(Lcom/google/android/gms/drive/Contents;)V

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/drive/internal/br$b;-><init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/drive/d;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ahl$b;->a(Ljava/lang/Object;)V

    return-void
.end method
