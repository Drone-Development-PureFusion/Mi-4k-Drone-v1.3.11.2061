.class Lcom/google/android/gms/internal/rw$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/rw;->m()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/rw;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/rw;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/rw$2;->a:Lcom/google/android/gms/internal/rw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/rw$2;->a:Lcom/google/android/gms/internal/rw;

    invoke-static {v0}, Lcom/google/android/gms/internal/rw;->b(Lcom/google/android/gms/internal/rw;)V

    return-void
.end method
