.class Lcom/google/android/gms/internal/zs$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/zs;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/abi;

.field final synthetic b:Lcom/google/android/gms/internal/zs;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/zs;Lcom/google/android/gms/internal/abi;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/zs$1;->b:Lcom/google/android/gms/internal/zs;

    iput-object p2, p0, Lcom/google/android/gms/internal/zs$1;->a:Lcom/google/android/gms/internal/abi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/zs$1;->b:Lcom/google/android/gms/internal/zs;

    invoke-static {v0}, Lcom/google/android/gms/internal/zs;->a(Lcom/google/android/gms/internal/zs;)Lcom/google/android/gms/internal/zn$a;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zs$1;->a:Lcom/google/android/gms/internal/abi;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zn$a;->b(Lcom/google/android/gms/internal/abi;)V

    return-void
.end method
