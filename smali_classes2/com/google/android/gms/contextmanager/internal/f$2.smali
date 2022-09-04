.class Lcom/google/android/gms/contextmanager/internal/f$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/contextmanager/internal/t;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/contextmanager/internal/f;->a(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/contextmanager/internal/WriteBatchImpl;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/common/api/Status;

.field final synthetic b:Lcom/google/android/gms/contextmanager/internal/WriteBatchImpl;

.field final synthetic c:Lcom/google/android/gms/contextmanager/internal/f;


# direct methods
.method constructor <init>(Lcom/google/android/gms/contextmanager/internal/f;Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/contextmanager/internal/WriteBatchImpl;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/contextmanager/internal/f$2;->c:Lcom/google/android/gms/contextmanager/internal/f;

    iput-object p2, p0, Lcom/google/android/gms/contextmanager/internal/f$2;->a:Lcom/google/android/gms/common/api/Status;

    iput-object p3, p0, Lcom/google/android/gms/contextmanager/internal/f$2;->b:Lcom/google/android/gms/contextmanager/internal/WriteBatchImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/internal/f$2;->a:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method
