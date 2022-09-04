.class Lcom/google/android/gms/contextmanager/internal/f$3;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/contextmanager/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/contextmanager/internal/f;->a(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/common/data/DataHolder;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/common/data/DataHolder;

.field final synthetic b:Lcom/google/android/gms/common/api/Status;

.field final synthetic c:Lcom/google/android/gms/contextmanager/internal/f;

.field private final d:Lcom/google/android/gms/contextmanager/a;


# direct methods
.method constructor <init>(Lcom/google/android/gms/contextmanager/internal/f;Lcom/google/android/gms/common/data/DataHolder;Lcom/google/android/gms/common/api/Status;)V
    .locals 2

    iput-object p1, p0, Lcom/google/android/gms/contextmanager/internal/f$3;->c:Lcom/google/android/gms/contextmanager/internal/f;

    iput-object p2, p0, Lcom/google/android/gms/contextmanager/internal/f$3;->a:Lcom/google/android/gms/common/data/DataHolder;

    iput-object p3, p0, Lcom/google/android/gms/contextmanager/internal/f$3;->b:Lcom/google/android/gms/common/api/Status;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/internal/f$3;->a:Lcom/google/android/gms/common/data/DataHolder;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Lcom/google/android/gms/contextmanager/internal/f$3;->d:Lcom/google/android/gms/contextmanager/a;

    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/contextmanager/a;

    iget-object v1, p0, Lcom/google/android/gms/contextmanager/internal/f$3;->a:Lcom/google/android/gms/common/data/DataHolder;

    invoke-direct {v0, v1}, Lcom/google/android/gms/contextmanager/a;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    goto :goto_0
.end method


# virtual methods
.method public a()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/internal/f$3;->b:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method
