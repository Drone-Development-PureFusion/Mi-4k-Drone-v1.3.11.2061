.class Lcom/google/android/gms/drive/internal/br$b;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/common/api/k;
.implements Lcom/google/android/gms/drive/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/drive/internal/br;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/common/api/Status;

.field private final b:Lcom/google/android/gms/drive/d;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/drive/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/drive/internal/br$b;->a:Lcom/google/android/gms/common/api/Status;

    iput-object p2, p0, Lcom/google/android/gms/drive/internal/br$b;->b:Lcom/google/android/gms/drive/d;

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/br$b;->a:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/br$b;->b:Lcom/google/android/gms/drive/d;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/br$b;->b:Lcom/google/android/gms/drive/d;

    invoke-interface {v0}, Lcom/google/android/gms/drive/d;->g()V

    :cond_0
    return-void
.end method

.method public c()Lcom/google/android/gms/drive/d;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/br$b;->b:Lcom/google/android/gms/drive/d;

    return-object v0
.end method
