.class public Lcom/google/android/gms/internal/dl;
.super Ljava/lang/Object;


# instance fields
.field private a:Lcom/google/android/gms/internal/dd;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/internal/dd;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/dl;->a:Lcom/google/android/gms/internal/dd;

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/dd;)Lcom/google/android/gms/internal/dl;
    .locals 0

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/android/gms/internal/dl;->a:Lcom/google/android/gms/internal/dd;

    return-object p0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/dl;->a:Lcom/google/android/gms/internal/dd;

    if-nez v0, :cond_0

    const-string v0, ""

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/dl;->a:Lcom/google/android/gms/internal/dd;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/dd;->a()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method
