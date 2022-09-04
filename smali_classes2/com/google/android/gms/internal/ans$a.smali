.class abstract Lcom/google/android/gms/internal/ans$a;
.super Lcom/google/android/gms/plus/c$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/ans;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/plus/c$b",
        "<",
        "Lcom/google/android/gms/plus/b$a;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>(Lcom/google/android/gms/common/api/g;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/plus/c$b;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/internal/ans$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/ans$a;-><init>(Lcom/google/android/gms/common/api/g;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/plus/b$a;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ans$a$1;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/ans$a$1;-><init>(Lcom/google/android/gms/internal/ans$a;Lcom/google/android/gms/common/api/Status;)V

    return-object v0
.end method

.method public synthetic b(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/common/api/m;
    .locals 1

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ans$a;->a(Lcom/google/android/gms/common/api/Status;)Lcom/google/android/gms/plus/b$a;

    move-result-object v0

    return-object v0
.end method
