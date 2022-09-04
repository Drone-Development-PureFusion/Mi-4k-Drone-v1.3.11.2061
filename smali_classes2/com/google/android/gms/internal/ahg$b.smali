.class public Lcom/google/android/gms/internal/ahg$b;
.super Lcom/google/android/gms/internal/ahg;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/ahg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<A:",
        "Lcom/google/android/gms/internal/ahl$a",
        "<+",
        "Lcom/google/android/gms/common/api/m;",
        "Lcom/google/android/gms/common/api/a$c;",
        ">;>",
        "Lcom/google/android/gms/internal/ahg;"
    }
.end annotation


# instance fields
.field protected final c:Lcom/google/android/gms/internal/ahl$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TA;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(IILcom/google/android/gms/internal/ahl$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IITA;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ahg;-><init>(II)V

    iput-object p3, p0, Lcom/google/android/gms/internal/ahg$b;->c:Lcom/google/android/gms/internal/ahl$a;

    return-void
.end method


# virtual methods
.method public a(Landroid/util/SparseArray;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/SparseArray",
            "<",
            "Lcom/google/android/gms/internal/aix;",
            ">;)V"
        }
    .end annotation

    iget v0, p0, Lcom/google/android/gms/internal/ahg$b;->a:I

    invoke-virtual {p1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/aix;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/internal/ahg$b;->c:Lcom/google/android/gms/internal/ahl$a;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/aix;->a(Lcom/google/android/gms/internal/ahn;)V

    :cond_0
    return-void
.end method

.method public a(Lcom/google/android/gms/common/api/Status;)V
    .locals 1
    .param p1    # Lcom/google/android/gms/common/api/Status;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    iget-object v0, p0, Lcom/google/android/gms/internal/ahg$b;->c:Lcom/google/android/gms/internal/ahl$a;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ahl$a;->c(Lcom/google/android/gms/common/api/Status;)V

    return-void
.end method

.method public a(Lcom/google/android/gms/common/api/a$c;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ahg$b;->c:Lcom/google/android/gms/internal/ahl$a;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ahl$a;->b(Lcom/google/android/gms/common/api/a$c;)V

    return-void
.end method

.method public a()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ahg$b;->c:Lcom/google/android/gms/internal/ahl$a;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ahl$a;->j()Z

    move-result v0

    return v0
.end method
