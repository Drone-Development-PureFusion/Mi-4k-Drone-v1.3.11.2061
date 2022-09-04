.class public Lcom/google/android/gms/drive/internal/bv;
.super Lcom/google/android/gms/drive/internal/c;

# interfaces
.implements Lcom/google/android/gms/drive/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/drive/internal/bv$a;
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/google/android/gms/drive/DriveId;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/drive/internal/c;-><init>(Lcom/google/android/gms/drive/DriveId;)V

    return-void
.end method

.method private static a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/drive/e$a;)Lcom/google/android/gms/drive/e$a;
    .locals 2

    if-nez p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/android/gms/drive/internal/bv$a;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/common/api/g;->a(Ljava/lang/Object;)Lcom/google/android/gms/internal/ail;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/android/gms/drive/internal/bv$a;-><init>(Lcom/google/android/gms/internal/ail;)V

    goto :goto_0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/common/api/g;ILcom/google/android/gms/drive/e$a;)Lcom/google/android/gms/common/api/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/api/g;",
            "I",
            "Lcom/google/android/gms/drive/e$a;",
            ")",
            "Lcom/google/android/gms/common/api/i",
            "<",
            "Lcom/google/android/gms/drive/c$a;",
            ">;"
        }
    .end annotation

    const/high16 v0, 0x10000000

    if-eq p2, v0, :cond_0

    const/high16 v0, 0x20000000

    if-eq p2, v0, :cond_0

    const/high16 v0, 0x30000000

    if-eq p2, v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Invalid mode provided."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-static {p1, p3}, Lcom/google/android/gms/drive/internal/bv;->a(Lcom/google/android/gms/common/api/g;Lcom/google/android/gms/drive/e$a;)Lcom/google/android/gms/drive/e$a;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/drive/internal/bv$1;

    invoke-direct {v1, p0, p1, p2, v0}, Lcom/google/android/gms/drive/internal/bv$1;-><init>(Lcom/google/android/gms/drive/internal/bv;Lcom/google/android/gms/common/api/g;ILcom/google/android/gms/drive/e$a;)V

    invoke-virtual {p1, v1}, Lcom/google/android/gms/common/api/g;->a(Lcom/google/android/gms/internal/ahl$a;)Lcom/google/android/gms/internal/ahl$a;

    move-result-object v0

    return-object v0
.end method
