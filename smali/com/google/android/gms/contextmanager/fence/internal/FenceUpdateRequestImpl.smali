.class public Lcom/google/android/gms/contextmanager/fence/internal/FenceUpdateRequestImpl;
.super Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;

# interfaces
.implements Lcom/google/android/gms/awareness/fence/e;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator",
            "<",
            "Lcom/google/android/gms/contextmanager/fence/internal/FenceUpdateRequestImpl;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:I

.field private final b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/contextmanager/fence/internal/UpdateFenceOperation;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/contextmanager/fence/internal/l;

    invoke-direct {v0}, Lcom/google/android/gms/contextmanager/fence/internal/l;-><init>()V

    sput-object v0, Lcom/google/android/gms/contextmanager/fence/internal/FenceUpdateRequestImpl;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {p0, v0}, Lcom/google/android/gms/contextmanager/fence/internal/FenceUpdateRequestImpl;-><init>(Ljava/util/ArrayList;)V

    return-void
.end method

.method constructor <init>(ILjava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/contextmanager/fence/internal/UpdateFenceOperation;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;-><init>()V

    iput p1, p0, Lcom/google/android/gms/contextmanager/fence/internal/FenceUpdateRequestImpl;->a:I

    iput-object p2, p0, Lcom/google/android/gms/contextmanager/fence/internal/FenceUpdateRequestImpl;->b:Ljava/util/ArrayList;

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/contextmanager/fence/internal/UpdateFenceOperation;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-direct {p0, v0, p1}, Lcom/google/android/gms/contextmanager/fence/internal/FenceUpdateRequestImpl;-><init>(ILjava/util/ArrayList;)V

    return-void
.end method


# virtual methods
.method a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/FenceUpdateRequestImpl;->a:I

    return v0
.end method

.method public a(Lcom/google/android/gms/internal/sx;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/sx",
            "<",
            "Lcom/google/android/gms/awareness/fence/i;",
            "Lcom/google/android/gms/contextmanager/fence/internal/e;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/FenceUpdateRequestImpl;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/contextmanager/fence/internal/UpdateFenceOperation;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/contextmanager/fence/internal/UpdateFenceOperation;->a(Lcom/google/android/gms/internal/sx;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public b()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/google/android/gms/contextmanager/fence/internal/UpdateFenceOperation;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/contextmanager/fence/internal/FenceUpdateRequestImpl;->b:Ljava/util/ArrayList;

    return-object v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/android/gms/contextmanager/fence/internal/l;->a(Lcom/google/android/gms/contextmanager/fence/internal/FenceUpdateRequestImpl;Landroid/os/Parcel;I)V

    return-void
.end method
