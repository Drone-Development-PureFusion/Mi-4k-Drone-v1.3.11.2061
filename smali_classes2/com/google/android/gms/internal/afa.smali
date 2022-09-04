.class Lcom/google/android/gms/internal/afa;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/auth/api/proxy/b$a;


# instance fields
.field private a:Lcom/google/android/gms/common/api/Status;

.field private b:Lcom/google/android/gms/auth/api/proxy/ProxyResponse;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/auth/api/proxy/ProxyResponse;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/afa;->b:Lcom/google/android/gms/auth/api/proxy/ProxyResponse;

    sget-object v0, Lcom/google/android/gms/common/api/Status;->a:Lcom/google/android/gms/common/api/Status;

    iput-object v0, p0, Lcom/google/android/gms/internal/afa;->a:Lcom/google/android/gms/common/api/Status;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/common/api/Status;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/afa;->a:Lcom/google/android/gms/common/api/Status;

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/afa;->a:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method

.method public b()Lcom/google/android/gms/auth/api/proxy/ProxyResponse;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/afa;->b:Lcom/google/android/gms/auth/api/proxy/ProxyResponse;

    return-object v0
.end method
