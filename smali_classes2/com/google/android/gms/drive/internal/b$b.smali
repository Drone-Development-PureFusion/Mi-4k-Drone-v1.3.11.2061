.class Lcom/google/android/gms/drive/internal/b$b;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/drive/g$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/drive/internal/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/drive/internal/b;

.field private final b:Lcom/google/android/gms/common/api/Status;

.field private final c:Lcom/google/android/gms/drive/k;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/drive/internal/b;Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/drive/k;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/drive/internal/b$b;->a:Lcom/google/android/gms/drive/internal/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/drive/internal/b$b;->b:Lcom/google/android/gms/common/api/Status;

    iput-object p3, p0, Lcom/google/android/gms/drive/internal/b$b;->c:Lcom/google/android/gms/drive/k;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/drive/internal/b;Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/drive/k;Lcom/google/android/gms/drive/internal/b$1;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/drive/internal/b$b;-><init>(Lcom/google/android/gms/drive/internal/b;Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/drive/k;)V

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/b$b;->b:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method

.method public b()Lcom/google/android/gms/drive/k;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/b$b;->c:Lcom/google/android/gms/drive/k;

    return-object v0
.end method
