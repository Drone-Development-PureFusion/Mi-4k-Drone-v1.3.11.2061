.class Lcom/google/android/gms/internal/aoi$d;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/search/b$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/aoi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/common/api/Status;

.field private final b:Lcom/google/android/gms/search/GoogleNowAuthState;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/search/GoogleNowAuthState;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/aoi$d;->a:Lcom/google/android/gms/common/api/Status;

    iput-object p2, p0, Lcom/google/android/gms/internal/aoi$d;->b:Lcom/google/android/gms/search/GoogleNowAuthState;

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/common/api/Status;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/aoi$d;->a:Lcom/google/android/gms/common/api/Status;

    return-object v0
.end method

.method public b()Lcom/google/android/gms/search/GoogleNowAuthState;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/aoi$d;->b:Lcom/google/android/gms/search/GoogleNowAuthState;

    return-object v0
.end method
