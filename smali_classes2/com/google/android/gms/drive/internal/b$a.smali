.class Lcom/google/android/gms/drive/internal/b$a;
.super Lcom/google/android/gms/drive/internal/bc;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/drive/internal/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/drive/internal/b;

.field private final b:Lcom/google/android/gms/internal/ahl$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/drive/g$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/google/android/gms/drive/internal/b;Lcom/google/android/gms/internal/ahl$b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ahl$b",
            "<",
            "Lcom/google/android/gms/drive/g$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/drive/internal/b$a;->a:Lcom/google/android/gms/drive/internal/b;

    invoke-direct {p0}, Lcom/google/android/gms/drive/internal/bc;-><init>()V

    iput-object p2, p0, Lcom/google/android/gms/drive/internal/b$a;->b:Lcom/google/android/gms/internal/ahl$b;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/drive/internal/b;Lcom/google/android/gms/internal/ahl$b;Lcom/google/android/gms/drive/internal/b$1;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/drive/internal/b$a;-><init>(Lcom/google/android/gms/drive/internal/b;Lcom/google/android/gms/internal/ahl$b;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/Status;)V
    .locals 4

    const/4 v3, 0x0

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/b$a;->b:Lcom/google/android/gms/internal/ahl$b;

    new-instance v1, Lcom/google/android/gms/drive/internal/b$b;

    iget-object v2, p0, Lcom/google/android/gms/drive/internal/b$a;->a:Lcom/google/android/gms/drive/internal/b;

    invoke-direct {v1, v2, p1, v3, v3}, Lcom/google/android/gms/drive/internal/b$b;-><init>(Lcom/google/android/gms/drive/internal/b;Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/drive/k;Lcom/google/android/gms/drive/internal/b$1;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ahl$b;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/drive/internal/OnDeviceUsagePreferenceResponse;)V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/drive/internal/b$a;->b:Lcom/google/android/gms/internal/ahl$b;

    new-instance v1, Lcom/google/android/gms/drive/internal/b$b;

    iget-object v2, p0, Lcom/google/android/gms/drive/internal/b$a;->a:Lcom/google/android/gms/drive/internal/b;

    sget-object v3, Lcom/google/android/gms/common/api/Status;->a:Lcom/google/android/gms/common/api/Status;

    invoke-virtual {p1}, Lcom/google/android/gms/drive/internal/OnDeviceUsagePreferenceResponse;->a()Lcom/google/android/gms/drive/internal/FileUploadPreferencesImpl;

    move-result-object v4

    const/4 v5, 0x0

    invoke-direct {v1, v2, v3, v4, v5}, Lcom/google/android/gms/drive/internal/b$b;-><init>(Lcom/google/android/gms/drive/internal/b;Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/drive/k;Lcom/google/android/gms/drive/internal/b$1;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ahl$b;->a(Ljava/lang/Object;)V

    return-void
.end method
