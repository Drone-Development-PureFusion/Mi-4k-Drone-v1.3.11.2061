.class public abstract Lcom/google/android/gms/internal/ahg;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/ahg$d;,
        Lcom/google/android/gms/internal/ahg$e;,
        Lcom/google/android/gms/internal/ahg$c;,
        Lcom/google/android/gms/internal/ahg$a;,
        Lcom/google/android/gms/internal/ahg$b;
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/ahg;->a:I

    iput p2, p0, Lcom/google/android/gms/internal/ahg;->b:I

    return-void
.end method


# virtual methods
.method public a(Landroid/util/SparseArray;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/SparseArray",
            "<",
            "Lcom/google/android/gms/internal/aix;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public abstract a(Lcom/google/android/gms/common/api/Status;)V
    .param p1    # Lcom/google/android/gms/common/api/Status;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract a(Lcom/google/android/gms/common/api/a$c;)V
.end method

.method public a()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
