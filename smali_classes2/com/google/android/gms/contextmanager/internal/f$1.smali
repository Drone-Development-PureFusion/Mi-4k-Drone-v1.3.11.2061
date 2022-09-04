.class Lcom/google/android/gms/contextmanager/internal/f$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/contextmanager/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/contextmanager/internal/f;->a(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/common/data/DataHolder;Lcom/google/android/gms/common/data/DataHolder;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/common/data/DataHolder;

.field final synthetic b:Lcom/google/android/gms/common/data/DataHolder;

.field final synthetic c:Lcom/google/android/gms/common/api/Status;

.field final synthetic d:Lcom/google/android/gms/contextmanager/internal/f;

.field private final e:Lcom/google/android/gms/contextmanager/a;

.field private final f:Lcom/google/android/gms/contextmanager/f;


# direct methods
.method constructor <init>(Lcom/google/android/gms/contextmanager/internal/f;Lcom/google/android/gms/common/data/DataHolder;Lcom/google/android/gms/common/data/DataHolder;Lcom/google/android/gms/common/api/Status;)V
    .locals 3

    const/4 v1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/contextmanager/internal/f$1;->d:Lcom/google/android/gms/contextmanager/internal/f;

    iput-object p2, p0, Lcom/google/android/gms/contextmanager/internal/f$1;->a:Lcom/google/android/gms/common/data/DataHolder;

    iput-object p3, p0, Lcom/google/android/gms/contextmanager/internal/f$1;->b:Lcom/google/android/gms/common/data/DataHolder;

    iput-object p4, p0, Lcom/google/android/gms/contextmanager/internal/f$1;->c:Lcom/google/android/gms/common/api/Status;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/internal/f$1;->a:Lcom/google/android/gms/common/data/DataHolder;

    if-nez v0, :cond_0

    move-object v0, v1

    :goto_0
    iput-object v0, p0, Lcom/google/android/gms/contextmanager/internal/f$1;->e:Lcom/google/android/gms/contextmanager/a;

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/internal/f$1;->b:Lcom/google/android/gms/common/data/DataHolder;

    if-nez v0, :cond_1

    :goto_1
    iput-object v1, p0, Lcom/google/android/gms/contextmanager/internal/f$1;->f:Lcom/google/android/gms/contextmanager/f;

    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/contextmanager/a;

    iget-object v2, p0, Lcom/google/android/gms/contextmanager/internal/f$1;->a:Lcom/google/android/gms/common/data/DataHolder;

    invoke-direct {v0, v2}, Lcom/google/android/gms/contextmanager/a;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    goto :goto_0

    :cond_1
    new-instance v1, Lcom/google/android/gms/contextmanager/f;

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/internal/f$1;->b:Lcom/google/android/gms/common/data/DataHolder;

    invoke-direct {v1, v0}, Lcom/google/android/gms/contextmanager/f;-><init>(Lcom/google/android/gms/common/data/DataHolder;)V

    goto :goto_1
.end method


# virtual methods
.method public a()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/internal/f$1;->c:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method
