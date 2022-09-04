.class public Lcom/google/android/gms/drive/internal/b;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/drive/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/drive/internal/b$b;,
        Lcom/google/android/gms/drive/internal/b$a;,
        Lcom/google/android/gms/drive/internal/b$c;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/g;)Lcom/google/android/gms/common/api/i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/drive/g$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/android/gms/drive/internal/b$1;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/drive/internal/b$1;-><init>(Lcom/google/android/gms/drive/internal/b;Lcom/google/android/gms/common/api/g;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/drive/k;)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "Lcom/google/android/gms/drive/k;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/common/api/Status;",
            ">;"
        }
    .end annotation

    instance-of v0, p2, Lcom/google/android/gms/drive/internal/FileUploadPreferencesImpl;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid preference value"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    check-cast p2, Lcom/google/android/gms/drive/internal/FileUploadPreferencesImpl;

    new-instance v0, Lcom/google/android/gms/drive/internal/b$2;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/drive/internal/b$2;-><init>(Lcom/google/android/gms/drive/internal/b;Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/drive/internal/FileUploadPreferencesImpl;)V

    invoke-virtual {p1, v0}, Lcom/google/android/gms/common/api/g;->b(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method
